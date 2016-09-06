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
import java.util.*;
import org.yaml.snakeyaml.*;
import org.commonwl.lang.*;

public class CWLJavaCodeGenerator {

	/*****************************************************************************************************
  *
  *   The String used for storing CWL filename.  
  */
	String CWL_FILE;

  /*****************************************************************************************************
  *
  *   The String used for storing CWL Java code-generated class name.  
  */
  String CWL_JAVA_CLASS_NAME;

  /*****************************************************************************************************
  *
  *   The String used for storing CWL Java code-generated filename.  
  */
  String CWL_JAVA_FILE;

  /*****************************************************************************************************
  *
  *   The String used for storing CWL Java code-generated filename.  
  */
  String CWL_OBJECT = "CWL";

  /*****************************************************************************************************
  *
  *   The String used for storing if the CWL file is a CommandLineTool or Workflow.  
  */
  String TOOL_TYPE = "";


	/*****************************************************************************************************
  *
  *   The CommandLineTool used for storing class in the CWL file.  
  */
	//CommandLineTool COMMAND_LINE_TOOL;
	
	/*****************************************************************************************************
  *
  *   The CommandInputParameter used for storing inputs in the CWL file.  
  */
	//CommandInputParameter [] INPUTS;

	/*****************************************************************************************************
  *
  *   The CommandOutputParameter used for storing outputs in the CWL file.  
  */
	//CommandOutputParameter [] OUTPUTS;

	public CWLJavaCodeGenerator( String cwlFile ) {
		this.CWL_FILE = cwlFile;
	}

  /*****************************************************************************************************
  *
  *  This method starts the processing of the CWL file for populating the contents in a CommandLineTool.
  *
  *  @throws   java.lang.Exception is thrown if there issues with reading the file.
  */
	public void processFile() throws Exception {
    
    CWL_JAVA_FILE = new String( CWL_FILE.trim() );
    CWL_JAVA_CLASS_NAME = new String( CWL_JAVA_FILE.substring( 0, CWL_JAVA_FILE.length() - 4 ) );
    CWL_JAVA_FILE = new String( CWL_JAVA_CLASS_NAME + ".java" );

    InputStream cwlFile = new FileInputStream( CWL_FILE );
    Yaml yaml = new Yaml();
    Map contents = (Map) yaml.load(cwlFile);
    processContents( contents );
    
	}

  /*****************************************************************************************************
  *
  *  This method adds a newline character to a string of text.
  *
  *  @param   text is a String of text.
  */
  private String addNewline( String text ) {
    return new String( text + "\n");
  }

  /*****************************************************************************************************
  *
  *  This method adds a newline character to a string of text.
  *
  *  @param   text is a String of text.
  */
  private String addIndentedNewline( String text ) {
    return new String( "    " + text + "\n");
  }

  /*****************************************************************************************************
  *
  *  This method processing of the contents of a CWL file for populating a CommandLineTool instance.
  *
  *  @param   contents is a Map of the CWL YAML file.
  */
  private void processContents( Map contents ) throws Exception {

    FileWriter cwlJavaFile = new FileWriter( CWL_JAVA_FILE );
    BufferedWriter cwlJavaBW = new BufferedWriter( cwlJavaFile );
    
    cwlJavaBW.write( addNewline("import org.commonwl.lang.*;") );
    cwlJavaBW.write( addNewline("import org.commonwl.util.*;") );
    cwlJavaBW.write( addNewline("") );
    cwlJavaBW.write( addNewline( "  public class " + CWL_JAVA_CLASS_NAME + "() {") );
    cwlJavaBW.write( addNewline("") );
    cwlJavaBW.write( addNewline( "  public " + CWL_JAVA_CLASS_NAME + "() { }") );
    cwlJavaBW.write( addNewline("") );
    cwlJavaBW.write( addNewline( "  public Object build() {") );
    cwlJavaBW.write( addNewline("") );

    for( Object key : contents.keySet() ) {
      
      Object value = contents.get(key);

      if ( key.equals("class") ) {

        String class_type = (String) value;
        cwlJavaBW.write( addIndentedNewline( value + " " + CWL_OBJECT + " = new " + CWL_OBJECT + "();" ) );
        cwlJavaBW.write( addNewline("") );

        // Set the Tool type
        TOOL_TYPE = new String( (String) value );

      }

      if ( key.equals("inputs") ) {

        int numberOfInputs = ((ArrayList<String>) value).size();
        int inputIndex = 0;

        for( Object inputPairs : (ArrayList<String>) value ) {

          Map inputPairsValue = (Map) inputPairs;

          if (TOOL_TYPE.equals("CommandLineTool")) {
            cwlJavaBW.write( addIndentedNewline( "CommandInputParameter [] inputs = new CommandInputParameter[" + numberOfInputs + "];" ) );
          } else {
            cwlJavaBW.write( addIndentedNewline( "InputParameter [] inputs = new InputParameter[" + numberOfInputs + "];" ) );
          }

          for( Object attribute : inputPairsValue.keySet() ) {

            if ( attribute.equals("id") ) {
              if (TOOL_TYPE.equals("CommandLineTool")) {
                cwlJavaBW.write( addIndentedNewline( "inputs[" + inputIndex + "] = new CommandInputParameter();" ) );
              } else {
                cwlJavaBW.write( addIndentedNewline( "inputs[" + inputIndex + "] = new InputParameter();" ) );
              }
              cwlJavaBW.write( addIndentedNewline( "inputs[" + inputIndex + "].setid( \"" + (String) inputPairsValue.get( attribute ) + "\" );" ) );
            }

            if ( attribute.equals("type") ) {
              cwlJavaBW.write( addIndentedNewline( "inputs[" + inputIndex + "].settype( \"" + (String) inputPairsValue.get( attribute ) + "\" );" ) );
            }

          }

          // Increment the index of the input
          inputIndex = inputIndex + 1;
        }
        cwlJavaBW.write( addIndentedNewline( CWL_OBJECT + ".setinputs( inputs );" ) );
        cwlJavaBW.write( addNewline("") );  // Add a separator
      }  // end of inputs


      if ( key.equals("outputs") ) {

        int numberOfOutputs = ((ArrayList<String>) value).size();
        int outputIndex = 0;

        for( Object outputPairs : (ArrayList<String>) value ) {

          Map outputPairsValue = (Map) outputPairs;

          if (TOOL_TYPE.equals("CommandLineTool")) {
            cwlJavaBW.write( addIndentedNewline( "CommandOutputParameter [] outputs = new CommandOutputParameter[" + numberOfOutputs + "];" ) );
          } else {
            cwlJavaBW.write( addIndentedNewline( "WorkflowOutputParameter [] outputs = new WorkflowOutputParameter[" + numberOfOutputs + "];" ) );
          }

          for( Object attribute : outputPairsValue.keySet() ) {

            if ( attribute.equals("id") ) {
              if (TOOL_TYPE.equals("CommandLineTool")) {
                cwlJavaBW.write( addIndentedNewline( "outputs[" + outputIndex + "] = new CommandInputParameter();" ) );
              } else {
                cwlJavaBW.write( addIndentedNewline( "outputs[" + outputIndex + "] = new WorkflowOutputParameter();" ) );
              }
              cwlJavaBW.write( addIndentedNewline( "outputs[" + outputIndex + "].setid( \"" + (String) outputPairsValue.get( attribute ) + "\" );" ) );
            }

            if ( attribute.equals("type") ) {
              cwlJavaBW.write( addIndentedNewline( "outputs[" + outputIndex + "].settype( \"" + (String) outputPairsValue.get( attribute ) + "\" );" ) );
            }

          }

          // Increment the index of the input
          outputIndex = outputIndex + 1;
        }
        cwlJavaBW.write( addIndentedNewline( CWL_OBJECT + ".setoutputs( outputs );" ) );
        cwlJavaBW.write( addNewline("") );  // Add a separator
      }  // end of outputs

      if ( key.equals("stdin") ) {

        String stdin = (String) value;
        cwlJavaBW.write( addIndentedNewline( CWL_OBJECT + ".setstdin( \"" + stdin + "\" );" ) );
        cwlJavaBW.write( addNewline("") );

      }

      if ( key.equals("stdout") ) {

        String stdout = (String) value;
        cwlJavaBW.write( addIndentedNewline( CWL_OBJECT + ".setstdout( \"" + stdout + "\" );" ) );
        cwlJavaBW.write( addNewline("") );

      }

      if ( key.equals("baseCommand") ) {

        String baseCommand = (String) value.toString();
        cwlJavaBW.write( addIndentedNewline( CWL_OBJECT + ".setbaseCommand( \"" + baseCommand.toString() + "\" );" ) );
        cwlJavaBW.write( addNewline("") );

      }

    }
    cwlJavaBW.write( addNewline("    return " + CWL_OBJECT + ";") );

    cwlJavaBW.write( addNewline("  }") );
    cwlJavaBW.write( addNewline("") );
    cwlJavaBW.write( addNewline("}") );
    cwlJavaFile.flush();
    cwlJavaBW.close();

  }


	/*************************************************************************
  *
  *  Purpose: To remove the brackets ([]) in a baseCommand.
  *
  *  @param    reference a String to be updated.
  *  
  *  @return   an updated String.
  *
  */
  String removeBrackets( String reference ) {
    return new String( reference.replace("[", "").replace("]", "").trim() );
  }

	/*************************************************************************
  *
  *  Purpose: To remove the paranthesis "()" and dollar sign ($) 
  *           standard input.
  *
  *  @param    reference a String to be updated.
  *
  *  @return   an updated String.
  *
  */
  String cleanStandardInput( String reference ) {
    return new String( reference.replace("$", "").replace("(", "").replace(")", "").trim() );
  }


	/*************************************************************************
  *
  *  Purpose: Returns the first element of an ArrayList as a String.
  *
  *  @param    arrayList which is an ArrayList for retrieving its first element.
  *
  *  @return   an updated String.
  *
  */
  String getFirstElementOfArrayList( ArrayList arrayList ) {

  	String firstElement = new String("");
  	for ( Object e : arrayList ) {
  		firstElement = (String) e;
  		break;
  	}
  	return firstElement;
  }

}