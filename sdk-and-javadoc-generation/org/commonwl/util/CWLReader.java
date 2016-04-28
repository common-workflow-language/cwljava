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

public class CWLReader {

	/*****************************************************************************************************
  *
  *   The String used for storing CWL filename.  
  */
	String CWL_FILE;

	/*****************************************************************************************************
  *
  *   The CommandLineTool used for storing class in the CWL file.  
  */
	CommandLineTool COMMAND_LINE_TOOL;
	
	/*****************************************************************************************************
  *
  *   The CommandInputParameter used for storing inputs in the CWL file.  
  */
	CommandInputParameter [] INPUTS;

	/*****************************************************************************************************
  *
  *   The CommandOutputParameter used for storing outputs in the CWL file.  
  */
	CommandOutputParameter [] OUTPUTS;


	public CWLReader( String cwlFile ) {
		this.CWL_FILE = cwlFile;
	}

  /*****************************************************************************************************
  *
  *  This method starts the processing of the CWL file for populating the contents in a CommandLineTool.
  *
  *  @throws   java.lang.Exception is thrown if there issues with reading the file.
  */
	public void processFile() throws Exception {
    InputStream cwlFile = new FileInputStream( CWL_FILE );
    Yaml yaml = new Yaml();
    Map contents = (Map) yaml.load(cwlFile);
    for( Object key : contents.keySet() ) {
    	processContents( (String) key, contents.get(key) );
    }
	}


  /*****************************************************************************************************
  *
  *  This method processing of the contents of a CWL file for populating a CommandLineTool instance.
  *
  *  @param   key is a String denoting the key of the element in the CWL file.
  *  @param   value is an Object denoting the value of the element in the CWL file.
  */
	private void processContents(String key, Object value ) {
		if ( key.equals("class") ) {
			processClass( (String) value );
		}

		if ( key.equals("inputs") ) {
			for( Object inputPairs : (ArrayList<String>) value ){
				processInputs( (Map) inputPairs );
				break;
			}
			COMMAND_LINE_TOOL.setinputs( INPUTS );
		}

		if ( key.equals("outputs") ) {
			for( Object outputPairs : (ArrayList<String>) value ){
				processOutputs( (Map) outputPairs );
				break;
			}
			COMMAND_LINE_TOOL.setoutputs( OUTPUTS );
		}

		if ( key.equals("baseCommand") ) {
			COMMAND_LINE_TOOL.setbaseCommand( removeBrackets( getFirstElementOfArrayList( (ArrayList) value ) ) );
		}

		if ( key.equals("stdin") ) {
			COMMAND_LINE_TOOL.setstdin( cleanStandardInput( (String) value ) );
		}

		if ( key.equals("stdout") ) {
			COMMAND_LINE_TOOL.setstdout( (String) value );
		}


	}


  /*****************************************************************************************************
  *
  *  This method processes the class in a CWL file, and updates the CommandLineTool contents.
  *
  *  @param   classType is a String of the type of the class (i.e. CommandLineTool).
  */
	private void processClass(String classType ) {
		if ( classType.equals("CommandLineTool") ) {
				COMMAND_LINE_TOOL = new CommandLineTool();
		}
	}

  /*****************************************************************************************************
  *
  *  This method processes the intputs in a CWL file, and updates the CommandLineTool contents.
  *
  *  @param   inputs is a key-value pair Map of the inputs.
  */
	private void processInputs( Map inputs ) {

		INPUTS = new CommandInputParameter[ inputs.size() ];

		int counter = 0;

		for( Object attribute : inputs.keySet() ){

			INPUTS[ counter ] = new CommandInputParameter();

			if ( attribute.equals("id") ) {
				INPUTS[counter].setid( (String) inputs.get( attribute ) );
			}

			if ( attribute.equals("type") ) {
				INPUTS[counter].settype( (String) inputs.get( attribute ) );
			}

		}
	}

  /*****************************************************************************************************
  *
  *  This method processes the outputs in a CWL file, and updates the CommandLineTool contents.
  *
  *  @param   outputs is a key-value pair Map of the outputs.
  */
	private void processOutputs( Map outputs ) {

		OUTPUTS = new CommandOutputParameter[ outputs.size() ];

		int counter = 0;

		for( Object attribute : outputs.keySet() ){

			OUTPUTS[ counter ] = new CommandOutputParameter();

			if ( attribute.equals("id") ) {
				OUTPUTS[counter].setid( (String) outputs.get( attribute ) );
			}

			if ( attribute.equals("type") ) {
				OUTPUTS[counter].settype( (String) outputs.get( attribute ) );
			}

			if ( attribute.equals("outputBinding") ) {
				Map outputBindingMap = (Map) outputs.get( attribute );
				CommandOutputBinding cob = new CommandOutputBinding();

				for( Object outputBindingAttribute : outputBindingMap.keySet() ) {
					if( outputBindingAttribute.equals("glob") ) {
						cob.setglob( new String( (String)outputBindingMap.get(outputBindingAttribute) )  );
					}
				}
				OUTPUTS[counter].setoutputBinding( cob );
			}
		}
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

	/*************************************************************************
  *
  *  Purpose: Returns the populated CommandLineTool instance.
  *
  *  @return   an CommandLineTool instance.
  *
  */
  public CommandLineTool getCommandLineToolInstance() {
  	return COMMAND_LINE_TOOL;
  }

}