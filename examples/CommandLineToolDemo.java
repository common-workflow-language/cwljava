
// Compile: ./compile-demo.sh wc-tool.cwl wc-job.json 
//
// Run:     ./run-demo.sh wc-tool.cwl wc-job.json 

import java.util.*;
import org.commonwl.lang.*;
import org.commonwl.util.*;

public class CommandLineToolDemo {
	
	public static void main( String [] args ) throws Exception {

		//CWLReader tool = new CWLReader("wc-tool.cwl");
		CWLReader tool = new CWLReader( args[0] );
		tool.processFile();
		CommandLineTool CommandLineTool_Instance = tool.getCommandLineToolInstance();

 	  //JSONReader job = new JSONReader("wc-job.json");
 	  JSONReader job = new JSONReader( args[1] );
 	  job.processFile();

 	  // Execute the job
 	  SystemCommandExecution engine = new SystemCommandExecution();

 	  // Initialize a new command to execute
	  engine.newExecutionCommand();

	  // Prepare the command to execute
 	  engine.extendExecutionCommand( CommandLineTool_Instance.getbaseCommand() );
 	  String stdinPath = (String) CommandLineTool_Instance.getstdin();
 	  stdinPath = stdinPath.replace( "inputs.", "" );
 	  engine.extendExecutionCommand( job.getValue( stdinPath ) );

 	  // Execute the command
 	  engine.executeCommand();

 	  // Return the result
 	  System.out.println( engine.getStandardOutput() );
		   	
	}

}
