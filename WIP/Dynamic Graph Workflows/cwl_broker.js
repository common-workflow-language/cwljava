
/*************************************************************************
*
*  Authors:
* 
*          * Paul Grosu <pgrosu@gmail.com>, Northeastern University
* 
*  Purpose: 
* 
*          To demonstrate a dynamic graph of running nodes for connecting them to run processes
* 
*  Requirements:
* 
*          * Node.js

*  Below is the command-line on how to run the collection of 
*  programs:
*
*     To run:
*
*       1) First launch the broker:
*
*          node cwl_broker.js
*
*       2) Then launch the interactive node:
*
*          node cwl_node.js 127.0.0.1 4000 interactive
*
*
*   Use the interactive node send commands and check the broker's console for information.:
*
*
* 
*************************************************************************/


var dgram = require('dgram');

var server = dgram.createSocket('udp4');

var node_port_by_id = {};
var node_id_by_port = {};

var client_port = 4000;

var port = 4000;

var this_stdout = [];


process.stdin.resume();

server.on('message', function(message, rinfo) {

  if ( message.length > 0 ) {

  	cmd = message.toString().trim();
  	cmdArray = cmd.split( " " );
    
    originating_port = cmdArray[0].toString().trim();
    cmdArray.splice(0, 1); //remove the originating port

    verb = cmdArray[0].toString().trim();
    cmdArray.splice(0, 1); //remove the verb
  }

  // Create a node
  if ( verb === "make_node" ) {

    var exec = require('child_process').exec;
    
    exec('node cwl_node.js 127.0.0.1 ' + client_port + " " + cmdArray.join( " " ), function(err, stdout, stderr) {
    
      // The node creation exited or the launching failed
      if (err) {

        // In case we had an error launching the process
        console.log('child process exited with error code', err.code);
        return;
      }

    });

  } 

  // Adding the new node's port information to the dictionary
  if ( verb === "add_node" ) {
    
    node_port = cmdArray[0];
    cmdArray.splice(0, 1); //remove the port

    node_id = cmdArray[0];
    cmdArray.splice(0, 1); //remove the node id
    if ( !(node_port === undefined) ) {
      console.log( "Adding node at port " + node_port + " for node id: " + node_id );
      
      node_port_by_id[  node_id  ] = node_port;
      node_id_by_port[ node_port ] = node_id;
    }
    
  } 


  // Adding variables to nodes
  if ( verb === "on" ) {
        
    node_id = cmdArray[0];
    node_port = node_port_by_id[node_id];
    cmdArray.splice(0, 1); //remove the node

    // set the value on a node
    set_on_node( node_port, cmdArray.join( " " ) );

  } 


  // Inspecting the value of a variable on a node
  if ( verb === "from" ) {
    
    node_id = cmdArray[0];
    data_node_port = node_port_by_id[node_id];
    
    node_id = cmdArray[0];
    destination_node_port = originating_port;
    
    node_id = cmdArray[0]; // this will not be needed and just removed
    cmdArray.splice(0, 1); //remove the node

    // get the value of a variable from a noe
    get_from_node_to_print( data_node_port, destination_node_port, cmdArray.join( " " ) );

  } 

  // Printing some information a node
  if ( verb === "print_from" ) {

    node_id = cmdArray[0];
    cmdArray.splice(0, 1); //remove the node

    node_port = node_port_by_id[ node_id ];

    print_from( node_port, cmdArray.join( " " ) );

  } 

  // Printing some information to the broker's console
  if ( verb === "print_broker" ) {

    node_id = cmdArray[0];
    cmdArray.splice(0, 1); //remove the node

    console.log( "Getting the value from node id: " + node_id );
    console.log( cmdArray.join( " " ) );

    // Broadcast information to interactive node
    interactive_node_port = node_port_by_id[ 'interactive' ];

    print_to_interactive( interactive_node_port, cmdArray.join( " " ) );
   
  } 

  // Run a command on a node using another node's input value
  if ( verb === "run" ) {

    command_node = cmdArray[0];
    cmdArray.splice(0, 1); //remove the command_node

    cmdArray.splice(0, 1); //remove the "with"

    input_node = cmdArray[0];
    cmdArray.splice(0, 1); //remove the input_node

    cmdArray.splice(0, 1); //remove the "using"
    using_variable = cmdArray[0];
    cmdArray.splice(0, 1); //remove the input variable

    cmdArray.splice(0, 1); //remove the "store_stdout_in"
    store_stdout_in = cmdArray[0];

    run_a_node( command_node, input_node, using_variable, store_stdout_in );

  }

  if ( verb === "hello" ) {
    // Broadcast hello to all
    for(var key in node_id_by_port) {
      message = new Buffer("hello from broker");
      server.send( message, 0, message.length, key, '127.0.0.1' );
    }
  }
	
});


server.on('listening', function() {
  var address = server.address();
  console.log("The broker is running...");
  console.log('');
});

server.bind(port);


// Functions of commands

// Get variable from to node to print it
get_from_node_to_print = function( data_node_port, destination_node_port, information ) {
  message = new Buffer( "get_to_print " + data_node_port + " " + destination_node_port + " " + information );
  server.send( message, 0, message.length, data_node_port, '127.0.0.1' );
}

// Set a value on a node
set_on_node = function( node_port, instruction ) {
  message = new Buffer( "set " + instruction );
  server.send( message, 0, message.length, node_port, '127.0.0.1' );
}

// Print a value from a node
print_from_node = function( node_port, instruction ) {
  message = new Buffer( "print " + instruction );
  server.send( message, 0, message.length, node_port, '127.0.0.1' );
}

// Print a value from a node
print_to_interactive = function( interactive_node_port, instruction ) {
  message = new Buffer( "print_to_interactive " + instruction );
  server.send( message, 0, message.length, interactive_node_port, '127.0.0.1' );
}

// The function that will launch an execution job on a node
run_a_node = function( command_node, input_node, using_variable, store_stdout_in ) {

  command_node_port = node_port_by_id[ command_node ];
  input_node_port = node_port_by_id[   input_node ];

  message = new Buffer( "run_command_from " + command_node_port + " with_input_from " + input_node_port + " using " + using_variable + " store_stdout_in " + store_stdout_in );
  server.send( message, 0, message.length, command_node_port, '127.0.0.1' );

}