
/*****************************************************************************************************
*
*  Authors:
*          
*          <b> Java SDK for CWL </b>
*          
*            @author Paul Grosu (pgrosu@gmail.com), Northeastern University
*            @version 0.20
*            @since April 28, 2016
*          
*          <p> Alternate SDK (via Avro): 
*          
*            Denis Yuen (denis.yuen@gmail.com)
*          
*          CWL Draft:
*          
*            Peter Amstutz (peter.amstutz@curoverse.com), Curoverse
*            Nebojsa Tijanic (nebojsa.tijanic@sbgenomics.com), Seven Bridges Genomics
*          
*            Contributors:
*          
*            Luka Stojanovic (luka.stojanovic@sbgenomics.com), Seven Bridges Genomics
*            John Chilton (jmchilton@gmail.com), Galaxy Project, Pennsylvania State University
*            Michael R. Crusoe (crusoe@ucdavis.edu), University of California, Davis
*            Herve Menager (herve.menager@gmail.com), Institut Pasteur
*            Maxim Mikheev (mikhmv@biodatomics.com), BioDatomics
*            Stian Soiland-Reyes (soiland-reyes@cs.manchester.ac.uk), University of Manchester
*
*****************************************************************************************************/

package org.commonwl.util;

import java.io.*;

/*****************************************************************************************************
*
*  This is used for executing commands on the system.
*/
public class SystemCommandExecution {
	
  /*****************************************************************************************************
  *
  *   The String used for storing the standard input.  
  */
	private String StandardInput;

  /*****************************************************************************************************
  *
  *   The String used for storing the standard error.  
  */
	private String StandardError;

  /*****************************************************************************************************
  *
  *   The String used for storing the standard output.  
  */  
	private String StandardOutput;

	public SystemCommandExecution() {
    this.StandardInput = new String("");
    this.StandardError = new String("");
    this.StandardOutput = new String("");
	}
	
  public SystemCommandExecution( String StandardInput ) {
    this.StandardInput = StandardInput;
  }

  /*****************************************************************************************************
  *
  *  This method executes the command and returns a String array of the standard input, 
  *  standard output, and standard error.
  *
  *  @return   a String array of the standard input, standard output, and standard error.
  *
  */
	public String [] executeCommand() {
		
		String stringStream = null;
    String [] InputErrorOutput = new String[3];
    InputErrorOutput[0] = new String("");
    InputErrorOutput[1] = new String("");
    InputErrorOutput[2] = new String("");

    StandardError = new String("");
    StandardOutput = new String("");
 
    try {
         
      java.lang.Process process = Runtime.getRuntime().exec( StandardInput );
      InputErrorOutput[0] = StandardInput;
       
      BufferedReader standardInputStream = new BufferedReader(new
           InputStreamReader(process.getInputStream()));

      BufferedReader standardErrorStream = new BufferedReader(new
           InputStreamReader(process.getErrorStream()));

      // Read the output from the command
      while (( stringStream = standardInputStream.readLine() ) != null) {
          if( StandardOutput.trim().length() == 0 ) {
            StandardOutput = new String( stringStream );
          } else {
            StandardOutput = new String( StandardOutput + "\n" + stringStream );
          }
      }
      InputErrorOutput[2] = StandardOutput;
       
      // Read any errors from the attempted command
      while (( stringStream = standardErrorStream.readLine() ) != null) {
        if( StandardError.trim().length() == 0 ) {
          StandardError = new String( StandardError + " " + stringStream );
        } else {
          StandardError = new String( StandardError + " " + stringStream );
        }
      }
      InputErrorOutput[1] = StandardError;
       
    }
    catch (IOException exception) {
        exception.printStackTrace();
        System.exit(-1);
    }

    return InputErrorOutput;
    
	}

  /*****************************************************************************************************
  *
  *  This method returns the last value of the standard input.
  *
  *  @return   a String of the standard input.
  *
  */
  public String getStandardInput() {
    return StandardInput;
  }

  /*****************************************************************************************************
  *
  *  This method returns the last value of the standard error.
  *
  *  @return   a String of the standard error.
  *
  */
  public String getStandardError() {
    return StandardError;
  }

  /*****************************************************************************************************
  *
  *  This method returns the last value of the standard output.
  *
  *  @return   a String of the standard output.
  *
  */
  public String getStandardOutput() {
    return StandardOutput;
  }

  /*****************************************************************************************************
  *
  *  This method removes the "class" string from the class name, produced by the getClass() method.
  *
  *  @param   className a String of the class name.
  *
  *  @return   an updated String of the class name.
  *
  */
  public String cleanupClassName( String className ) {
     return className.replace("class","").trim();
  }

  /*****************************************************************************************************
  *
  *  This method is a helper method to process any object being requested to be run, such as
  *  the ones returned by getbaseCommand() which are actually a String type.  The value is cast
  *  String and added to the standard input string.
  *
  *  @param   command a String of the standard input.
  *
  */
  public void extendExecutionCommand( Object command ) {
    if ( cleanupClassName( command.getClass().getName() ).equals("java.lang.String") ) {
      extendExecutionCommand( (String) command ) ;
    }
  }

  /*****************************************************************************************************
  *
  *  This method is a method to process a String command being requested to be run.  The value is 
  *  added to the standard input string.
  *
  *  @param   command a String of the standard input.
  *
  */
  public void extendExecutionCommand( String command ) {

    if( StandardInput.trim().length() == 0 ) {
      this.StandardInput = command;
    } else {
      this.StandardInput = this.StandardInput + " " + command;
    }
  }

  /*****************************************************************************************************
  *
  *  This method resets the standard input String.
  *
  */
  public void newExecutionCommand() {
    this.StandardInput = new String("");
  }


  /*****************************************************************************************************
  *
  *  This method sets the standard input String.
  *
  *  @param   inputText is a String of the standard input.
  *
  */
  public void setStandardInput( String inputText ) {
    this.StandardInput = inputText;
  }

	
}