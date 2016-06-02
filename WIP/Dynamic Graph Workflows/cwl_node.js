
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

var host = process.argv[2];
var port = parseInt(process.argv[3], 10);
var client = dgram.createSocket('udp4');
var id = process.argv[4];
var this_port = "";

var this_stdout = [];
var custom_stdout_placeholder = ""; 

// Timer for the queue
var tick = 1000;
var inReadyState = true;
var processQueue = new Queue();
var currentProcess = "";

// The queue of instructions to process that depended on other information to populate
runNextInQueue = function() {

  if ( inReadyState && !(processQueue.isEmpty()) ) {
    
    if ( currentProcess.length === 0 ) {
      currentProcess = processQueue.dequeue();
    }

    eval( currentProcess );

  }
}

// Launch the ticker to periodically check the queue
setInterval( runNextInQueue , tick );
    
process.stdin.resume();

process.stdin.on('data', function(data) {

  //All messages to the broker add the originating port as a prefix in the message
  var originating_port_with_data = new Buffer( this_port + " " + data);
  client.send(originating_port_with_data, 0, originating_port_with_data.length, port, '127.0.0.1');

});

// Process commands
client.on('message', function(message) {

	cmd = message.toString().trim();
	cmdArray = cmd.split( " " );
 
  verb = cmdArray[0].toString().trim();
  cmdArray.splice(0, 1); //remove the verb
  

  // Message back to all the nodes from a broadcast
  if ( verb === "hello from broker" ) {
    console.log(verb);
  }

  // Adding variables with values to current node
  if ( verb === "set" ) {
    eval( cmdArray.join(" ") );
  }

  // Store a result in this_stdout
  if ( verb === "stdout_store" ) {

    this_stdout = cmdArray.join(" ");
    inReadyState = true; // allow the queue to proceed

  }

  // Inspecting a node's variable to print
  if ( verb === "get_to_print" ) {
    
    data_node_port = cmdArray[0];
    cmdArray.splice(0, 1); // remove the data port

    destination_node_port = cmdArray[0];
    cmdArray.splice(0, 1); // remove the dest port

    data = new Buffer( "print " + eval(cmdArray.join(" ")) );
    client.send(data, 0, data.length, this_port, '127.0.0.1');
  }

  // Store a value at a destination node
  if ( verb === "get_to_store" ) {
        
    data_node_port = cmdArray[0];
    cmdArray.splice(0, 1); // remove the data port

    destination_node_port = cmdArray[0];
    cmdArray.splice(0, 1); //remove the dest port

    //data = new Buffer( "print_from " + id + " " + eval(cmdArray.join(" ")) );
    data = new Buffer( "stdout_store " + eval(cmdArray.join(" ")) );
    client.send(data, 0, data.length, destination_node_port, '127.0.0.1');

  }


  // Print information on the interactive node
  if ( verb === "print_to_interactive" ) {

    result = cmdArray.join(" ");
    console.log( result );

  } 

  // Print information to the broker
  if ( verb === "print" ) {

    result = cmdArray.join(" ");

    // Prepare the information to print to the broker
    full_message = new Buffer(this_port + " print_broker " + id + " " + result );
  	
    // Send to broker console
    client.send(full_message, 0, full_message.length, port, '127.0.0.1');


  } 

  // Run a command from this node using the input from another node and 
  // store it in specific variable on this node 
  if ( verb === "run_command_from" ) {

    cmdArray.splice(0, 1); //remove command_node_port
    cmdArray.splice(0, 1); //remove with_input_from 

    input_port = cmdArray[0];
    cmdArray.splice(0, 1); //remove the input_port
    
    cmdArray.splice(0, 1); //remove the "using"
    using_variable = cmdArray[0];
    cmdArray.splice(0, 1); //remove the input variable
		
    cmdArray.splice(0, 1); //remove the "store_stdout_in"
    custom_stdout_placeholder = cmdArray[0];
		  
    data_node_port = input_port;
    destination_node_port = this_port;
    information = using_variable;
    message = new Buffer( "get_to_store " + data_node_port + " " + destination_node_port + " " + information );
    
    // Set the node's state to false and queue the command to execute until all the information has
    // propagated properly
    inReadyState = false;
    processQueue.enqueue( "execute_command( command + ' ' + this_stdout, custom_stdout_placeholder )" );
    
    // Ask the port that contains the input for the input data
    client.send(message, 0, message.length, input_port, '127.0.0.1');

  }

});

client.on('listening', function () {

    var address = client.address();

    this_port = address.port.toString();

    // Request the node's port to be added to the broker's dictionary
    data = new Buffer(this_port + " add_node " + address.port.toString() + " " + id);
    client.send(data, 0, data.length, port, '127.0.0.1');

});


// Ensure that the client.on('listening',...) function executes so that the "add_node"
// portion is processed when the node is first launched
function start() { 
  var data = new Buffer("");
	client.send(data, 0, data.length, port, '127.0.0.1'); 
}
start();

console.log('');
console.log('Start sending commands to the broker...');
console.log('');

// The function to execute a command
execute_command = function( command_to_execute, store_stdout_in ) {
	var exec = require('child_process').exec;
  
  exec(command_to_execute, function(err, stdout, stderr) {
  
  // The command exited or the launching failed
  if (err) {
    // This is in case we get an error launching the process
    console.log('child process exited with error code', err.code);
    return;
  }
  // Store the results in the new variable created after the ("store_as") in the command-line
  eval(store_stdout_in + "=[]");
  eval(store_stdout_in + ".push(stdout.toString())");
  
  });
}

// Functions

// Request to get a variable's value from a node
get_from_node = function( node_port, information ) {
  message = new Buffer( "get " + information );
  server.send( message, 0, message.length, node_port, '127.0.0.1' );
}

// I did not want implement a Queue, so I copied the following from the web:

/* 
 *  The Queue portion was created by Stephen Morley - http://code.stephenmorley.org/ - and released under
 * the terms of the CC0 1.0 Universal legal code:
 * http://creativecommons.org/publicdomain/zero/1.0/legalcode
 * Creates a new queue. A queue is a first-in-first-out (FIFO) data structure -
 * items are added to the end of the queue and removed from the front.
 *
 */
function Queue(){

  // initialise the queue and offset
  var queue  = [];
  var offset = 0;

  // Returns the length of the queue.
  this.getLength = function(){
    return (queue.length - offset);
  }

  // Returns true if the queue is empty, and false otherwise.
  this.isEmpty = function(){
    return (queue.length == 0);
  }

  /* Enqueues the specified item. The parameter is:
   *
   * item - the item to enqueue
   */
  this.enqueue = function(item){
    queue.push(item);
  }

  /* Dequeues an item and returns it. If the queue is empty, the value
   * 'undefined' is returned.
   */
  this.dequeue = function(){

    // if the queue is empty, return immediately
    if (queue.length == 0) return undefined;

    // store the item at the front of the queue
    var item = queue[offset];

    // increment the offset and remove the free space if necessary
    if (++ offset * 2 >= queue.length){
      queue  = queue.slice(offset);
      offset = 0;
    }

    // return the dequeued item
    return item;

  }

  /* Returns the item at the front of the queue (without dequeuing it). If the
   * queue is empty then undefined is returned.
   */
  this.peek = function(){
    return (queue.length > 0 ? queue[offset] : undefined);
  }

}
