

/*************************************************************************
*
*  Authors:
* 
*          * Paul Grosu <pgrosu@gmail.com>, Northeastern University
* 
*  Purpose: 
* 
*          To parse Yaml file with YAMLParser to gather the required data, 
*          for subsequently generating the CWL Java SDK through 
*          CWLSDKBuilder.
* 
*  Requirements:
* 
*          * Java SDK
*          * cwl-avro.yml
*          * metaschema.yml
*          * cwl-sdk-config.txt
*          * CreateCWLJavaSDK.java
*          * YAMLParser.java
*          * CWLSDKBuilder.java
*          * compile-and-run.sh
*          * Creating a directory called sdk, into which the
*            CWL Java SDK will be generated
*
*  Below is the command-line on how to compile and run the collection of 
*  programs:
*
*     To compile and run: 
* 
*       ./compile-and-run.sh
*
*     To compile:
*
*       javac CreateCWLJavaSDK.java
*       javac YAMLParser.java
*       javac CWLSDKBuilder.java
*
*     To run:
*
*       java CreateCWLJavaSDK cwl-avro.yml metaschema.yml
*
*     Note: The cwl-avro.xml file would need a fix for OutputFieldRecord,
*           which the compile-and-run.sh script performs automatically.
*
*   Output of the program:
*
*     The program will read Yaml files to gather the required data for 
*     generating the CWL Java SDK in the sdk folder.
*
* 
*************************************************************************/

package io.cwl.build;

// ******************** Load the appropriate packages ********************

import java.util.*;
import java.io.*;

public class YAMLParser {

  // *************** Initialize the required variables ***************

  String [] YAML_FILENAME;
    
  String OBJECT_START = "- ";
  String OBJECT_NAME = " name: ";
  String OBJECT_TYPE = " type: ";
  String OBJECT_SYMBOLS = " symbols:";
  String OBJECT_SPECIALIZE = " specialize:";
  String SPECIALIZE_FROM = " specializeFrom: ";
  String SPECIALIZE_TO = " specializeTo: ";
  String OBJECT_EXTENDS = " extends: ";
  Integer OBJECT_INDENT = 2;

  String FIELD_START = "    - name: ";
  String FIELDS_SECTION_START = " fields:";
  String FIELD_NAME = " - name:";
  String FIELD_TYPE = "type:";
  String FIELD_ITEMS = "items:";

  String FIELD_SYMBOLS = "symbols:";  
  String COLON = ":";
  String COMMA = ",";
  String ARRAY = "array";
  String ENUM = "enum";
  String DASH = "-";
  String NULL_STRING = "null";
  
  HashMap yamlFile;
  public Integer length = 0;
  public String currentLine = "";
  public Integer currentLineNumber = 0;
  public ArrayList processedObjectsIndex = new ArrayList();
  Boolean reachedEOF = false;

  Integer objectStartLine = 0;
  Integer currentFieldStartLine = 0;
  
  public String objectName = "";
  public String objectType = "";
  public String objectExtends = "";
  public Map <String,String> objectRenamedFields = new HashMap<String, String>();
  public ArrayList <String> objectSymbolsList = new ArrayList<String>();
  public Map <String,String> objectFields = new HashMap<String, String>();

  /*************************************************************************
  *
  *  Purpose: Read the YAML file and store each line with the associated 
  *           line-number in a HashMap<Integer, String> for the proper 
  *           creation of variables and methods during the SDK generation 
  *           process.
  *
  */
  public YAMLParser( String [] yamlFileNames ) {

    yamlFile = new HashMap<Integer, String>();

    try {
      String yamlLine;
      Integer Counter = 0;

      for( String filename : yamlFileNames ) {
        FileReader yamlFileDescriptor = new FileReader(new File(filename));
        BufferedReader bufferedReader = new BufferedReader(yamlFileDescriptor);

        while((yamlLine = bufferedReader.readLine()) != null) {
          yamlFile.put(Counter, new String(yamlLine) );
          Counter = Counter + 1;
        }

        bufferedReader.close();
        length = Counter;
      }
    } catch ( Exception e ) { print( "YAMLParser: " + e ); }
    
  }


  /*************************************************************************
  *
  *  Purpose: To retrieve a line of text that was stored in the 
  *           HashMap<Integer, String> representing the YAML file.
  *
  */
  public void readLine( Integer lineNumber ) throws Exception {

    if( lineNumber >= 0 && lineNumber < length ) {
      currentLine = (String) yamlFile.get( lineNumber );
    }

    if( lineNumber >= length ) {
      reachedEOF = true;
    }

  }
  
  /*************************************************************************
  *
  *  Purpose: To retrieve the next line of text that was stored in the 
  *           HashMap<Integer, String> representing the YAML file.
  *
  */
  public void readNextLine() throws Exception {

    currentLineNumber = currentLineNumber + 1;
    readLine( currentLineNumber );

  }

  /*************************************************************************
  *
  *  Purpose: To retrieve the previous line of text that was stored in the 
  *           HashMap<Integer, String> representing the YAML file.
  *
  */
  public void readPreviousLine() throws Exception {

    currentLineNumber = currentLineNumber - 1;
    readLine( currentLineNumber );

  }

  /*************************************************************************
  *
  *  Purpose: To reset the object data before reading the next object
  *           the YAML file, with which to populate the variables with.
  *
  */
  void resetObjectInformation() {
    objectName = "";
    objectType = "";
    objectExtends = "";
    objectRenamedFields = new HashMap<String, String>();
  }

  /*************************************************************************
  *
  *  Purpose: To find and process the next object in the YAML file. 
  *
  */
  public void processNextObjectType() throws Exception {

    resetObjectInformation();

    while( currentLineNumber < length ) {

      readLine( currentLineNumber );
      
      if( currentLine.startsWith(OBJECT_START) && 
          !processedObjectsIndex.contains(currentLineNumber) ) {
        
        objectStartLine = currentLineNumber;
        processedObjectsIndex.add( objectStartLine );
        break;

      } else {
        
        currentLineNumber = currentLineNumber + 1;
        
        if( currentLineNumber >= length ) {
          reachedEOF = true;
          break;
        }

      }
    }
  }

  /*************************************************************************
  *
  *  Purpose: To print the current line being processed in the YAML file.
  *
  */
  public void printCurrentLine() {
    print( currentLine );
  }

  /*************************************************************************
  *
  *  Purpose: An alias method to print a String.
  *
  */
  public void print( String text ) {
    System.out.println( text );
  }

  /*************************************************************************
  *
  *  Purpose: To remove the object's label in a String, such as:
  *           (i.e. name:, type:, etc.)
  *
  */
  String removeLabel( String lineOfText ) {
    
    if( lineOfText.contains(COLON)) {
      return new String( lineOfText.substring( lineOfText.indexOf(COLON) + 1).trim() );
    } else { 
      return lineOfText;
    }

  }


  /*************************************************************************
  *
  *  Purpose: To remove the namespace in a String, since it already is
  *           stored in the cwl-sdk-config.txt file.
  *
  */
  public String removeNamespace( String lineOfText ) {
    
    if( lineOfText.contains(COLON)) {
      return new String( lineOfText.substring( lineOfText.indexOf(COLON) + 1).trim() );
    } else { 
      return lineOfText;
    }
  }

  /*************************************************************************
  *
  *  Purpose: To move the current line being read back to the start of the 
  *           current object being processed.
  *
  */
  void moveToStartOfObject() throws Exception {
    reachedEOF = false;
    currentLineNumber = objectStartLine;
    readLine( currentLineNumber );
  }

  /*************************************************************************
  *
  *  Purpose: To determine the name of the current object being processed.
  *
  */
  public void getObjectName() throws Exception {

    moveToStartOfObject();
    
    if( currentLine.contains( OBJECT_NAME ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      objectName = removeLabel( currentLine );

    } else {

      readNextLine();

      while( !currentLine.contains( OBJECT_NAME ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }

      // Found the name line  
      if( currentLine.contains( OBJECT_NAME ) &&
          (currentLine.indexOf( OBJECT_NAME.trim() ) == OBJECT_INDENT) &&
          !currentLine.startsWith(OBJECT_START) ) {
        
        objectName = removeLabel( currentLine );

      }
    }
  }

  /*************************************************************************
  *
  *  Purpose: To determine the type of the current object being processed.
  *
  */
  public void getObjectType() throws Exception {

    moveToStartOfObject();
    
    if( currentLine.contains( OBJECT_TYPE ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      objectType = removeLabel( currentLine );

    } else {
    
      readNextLine();
    
      while( !currentLine.contains( OBJECT_TYPE ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }

      if( currentLine.contains( OBJECT_TYPE ) &&
        (currentLine.indexOf( OBJECT_TYPE.trim() ) == OBJECT_INDENT) &&
        !currentLine.startsWith(OBJECT_START) ) {
      
        objectType = removeLabel( currentLine );

      }
    }
  }

  /*************************************************************************
  *
  *  Purpose: To get a String representation of the symbols list.
  *
  */
  public String printObjectSymbols( ArrayList <String> symbolsList ) {

    String concatenatedSymbols = new String();

    for (String symbol : symbolsList ) {
      
      print( symbol );
      
      if( concatenatedSymbols.length() == 0 ) {
        concatenatedSymbols = new String(symbol);
      } else {
        concatenatedSymbols = new String(concatenatedSymbols + ", " + symbol);
      }
    }

    return concatenatedSymbols;

  }


  /*************************************************************************
  *
  *  Purpose: To determine the symbols of the current object being 
  *           processed.
  *
  */
  public void getObjectSymbols() throws Exception {

    moveToStartOfObject();
    objectSymbolsList = new ArrayList<String>();

    if( currentLine.contains( OBJECT_SYMBOLS ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue, since found the symbols start line.

    } else {

      readNextLine();
      
      while( !currentLine.contains( OBJECT_SYMBOLS ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }

    // Found the symbols line 
    if( currentLine.contains( OBJECT_SYMBOLS ) &&
        (currentLine.indexOf( OBJECT_SYMBOLS.trim() ) == OBJECT_INDENT) ) {
      
      Integer symbolsIndentation = -1;

      // Determine where the indentation of symbols is, for later checking if still
      // within the Symbols definition
      if ( currentLine.contains( OBJECT_SYMBOLS ) ) {
        symbolsIndentation = currentLine.indexOf( OBJECT_SYMBOLS.trim() );
      }

      Boolean isWithinSymbols = true;
    
      // Reached the end of the current Symbols section
      while( isWithinSymbols && 
             !currentLine.startsWith(OBJECT_START) && 
             !reachedEOF ) {

        // Continue to the next line
        readNextLine();

        if( currentLine.contains(DASH) ) {
          objectSymbolsList.add( removeNamespace( removeDash(currentLine) ) );
        }

        // Has moved beyond the Symbols section
        if( currentLine.trim().length() == 0 ) {
          isWithinSymbols = false;
        } else if( (currentLine.substring( symbolsIndentation, symbolsIndentation + 1 ).trim().length() > 0) ) {
          isWithinSymbols = false;
        }

        // Completed the symbols section
        if( !isWithinSymbols && 
            !currentLine.contains(FIELD_NAME) && 
            !currentLine.startsWith(OBJECT_START) && 
            !reachedEOF ) {
          break;
        }
      }
    }
  }

  /*************************************************************************
  *
  *  Purpose: To print the objects that the current object being processed
  *           extends.
  *
  */
  // Print the list of renamed (specialize) fields 
  public void printObjectRenamedFields( Map <String, String> map ) {

    for(String key: map.keySet()){

      print(key  + " -> " + map.get(key));

    }

  }

  /*************************************************************************
  *
  *  Purpose: To determine the objects that the current object being 
  *           processed extends.
  *
  */
  public void getObjectRenamedFields() throws Exception {

    moveToStartOfObject();

    if( currentLine.contains( OBJECT_SPECIALIZE ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue, since found the specialize start line.

    } else {
      readNextLine();
      while( !currentLine.contains( OBJECT_SPECIALIZE ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }

    // Found a current line 
    if( currentLine.contains( OBJECT_SPECIALIZE ) &&
        (currentLine.indexOf( OBJECT_SPECIALIZE.trim() ) == OBJECT_INDENT) ) {
      
      Integer specializeIndentation = -1;

      // Determine where the indentation of this type definition is, for later checking if still
      // within the Specialize definition
      if ( currentLine.contains( OBJECT_SPECIALIZE ) ) {
        specializeIndentation = currentLine.indexOf( OBJECT_SPECIALIZE.trim() );
      }

      Boolean isWithinSpecialize = true;
      String renameFrom, renameTo;
    
      // Reached the end of the current Specialize section
      while( isWithinSpecialize && 
             !currentLine.startsWith(OBJECT_START) && 
             !reachedEOF ) {

        // Continue to the next line
        readNextLine();

        if( currentLine.contains(SPECIALIZE_FROM) ) {

          // Get the specializeFrom
          renameFrom = cleanUpReference( removeLabel( currentLine ) );
          
          if( renameFrom.contains(COLON) ) {
            renameFrom = removeNamespace( renameFrom ) ;
          }
          
          readNextLine();
          
          // Get the specializeTo
          renameTo = cleanUpReference( removeLabel( currentLine ) );
          
          if( renameTo.contains(COLON) ) {
            renameTo = removeNamespace( renameTo ) ;
          }
          
          objectRenamedFields.put( renameFrom, renameTo );

        }

        // Has moved beyond the Specialize section
        if( currentLine.trim().length() == 0 ) {
          isWithinSpecialize = false;
        } else if( (currentLine.substring( specializeIndentation, specializeIndentation + 1 ).trim().length() > 0) ) {
          isWithinSpecialize = false;
        }

        // Completed the type definition section of this field
        if( !isWithinSpecialize && 
            !currentLine.contains(FIELD_NAME) && 
            !currentLine.startsWith(OBJECT_START) && 
            !reachedEOF ) {
          break;
        }

      }

    }

  }


  /*************************************************************************
  *
  *  Purpose: To remove the links (# sign) and array marking ([]) in a 
  *           String, in order to only list the element(s), which might be 
  *           separated by the comma (,) delimiter.
  *
  */
  String removeBrackets( String reference ) {
    return new String( reference.replace("[", "").replace("]", "") );
  }

  public void getObjectInheritance() throws Exception {

    moveToStartOfObject();
    
    if( currentLine.contains( OBJECT_EXTENDS ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue, since found the extends line.

    } else {

      readNextLine();
      
      while( !currentLine.contains( OBJECT_EXTENDS ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }
      
    // Found the extends line
    if( currentLine.contains( OBJECT_EXTENDS ) &&
        (currentLine.indexOf( OBJECT_EXTENDS.trim() ) == OBJECT_INDENT) ) {
      
      objectExtends = removeBrackets( removeNamespace( cleanUpReference( removeLabel( currentLine ) ) ) );

    }
  }

  /*************************************************************************
  *
  *  Purpose: To remove the links (# sign) and double-quote marking ("") in  
  *           a String, in order to only list the element(s), which might be 
  *           be separated by the comma (,) delimiter.
  *
  */
  String cleanUpReference( String reference ) {
    return new String( reference.replace("\"", "").replace("#", "") );
  }


  /*************************************************************************
  *
  *  Purpose: To determine the end of the "fields" section as has been
  *           reached in the current object being processed extends.
  *
  */
  Boolean reachedEndOfFieldsSection() {
    if( currentLine.trim().length() == 0 ) {
      
      return false;

    } else if ( currentLine.substring( OBJECT_INDENT, OBJECT_INDENT + 1 ).trim().length() == 0 ) {

      return false;

    } else {

      return true;

    }
  }

  /*************************************************************************
  *
  *  Purpose: To move the current line being read back to the start of the 
  *           "field" section of the current object being processed.
  *
  */
  void moveToStartOfField() throws Exception {
    currentLineNumber = currentFieldStartLine;
    readLine( currentLineNumber );
  }

  // Print the fields and their types
  public void printObjectFields( Map <String, String> map ) {

    for(String key: map.keySet()){

      print(key  +" -> "+ map.get(key));

    }

  }

  public void getObjectFields() throws Exception {

    moveToStartOfObject();
    currentFieldStartLine = -1;   
    objectFields = new HashMap<String, String>();

    if( currentLine.contains( FIELDS_SECTION_START ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue...

    } else {
      readNextLine();
      while( !currentLine.contains( FIELDS_SECTION_START ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }
      
    // Found a current line 
    if( currentLine.contains( FIELDS_SECTION_START ) &&
        (currentLine.indexOf( FIELDS_SECTION_START.trim() ) == OBJECT_INDENT) ) {
        
        // Skip the first line since it's never defined
        readNextLine(); 
      
        while( !reachedEndOfFieldsSection() &&
               !currentLine.startsWith(OBJECT_START) &&
               !reachedEOF ) {

            if( processNextField() ) {
              
              // Keep looking for the next field

            } else {
              break;
            }

      }
    }
  }


  /*************************************************************************
  *
  *  Purpose: Process the next field section.  If it is the last field then
  *           return false denoting there are no more fields in this object
  *           to process, otherwise return true.
  *
  */
  Boolean processNextField() throws Exception {
          
    // Note: Next version add an indent-check as well
    if ( currentLine.contains(FIELD_START) ) {

      currentFieldStartLine = currentLineNumber;      

    } else {

      while ( !currentLine.contains(FIELD_START) && 
              !currentLine.startsWith(OBJECT_START) && 
              !reachedEOF ) {
        readNextLine();
      }

      if( currentLine.contains(FIELD_START) && 
          !currentLine.startsWith(OBJECT_START) && 
          !reachedEOF ) {
        currentFieldStartLine = currentLineNumber;  
      }
    }

    // Process the first line in fields section
    if( currentFieldStartLine != -1 &&
        !currentLine.startsWith(OBJECT_START) ) {

      String fieldName = cleanUpReference(removeLabel( getFieldName() ));
      String fieldTypes = getFieldType();
      
      if( fieldName.length() != 0 && fieldTypes.length() != 0 ) {
        objectFields.put( fieldName, fieldTypes );
      }

      // Move forward (advance to not stay in a loop)
      readNextLine(); 

      return true;

    } else {

      return false;

    }

  }

  /*************************************************************************
  *
  *  Purpose: Determine the name of the current field being processed.
  *
  */
  String getFieldName() throws Exception {

    moveToStartOfField();

    while( !currentLine.contains(FIELD_NAME) && 
           !currentLine.startsWith(OBJECT_START) && 
           !reachedEOF ) {
      readNextLine();
    }

    if( currentLine.contains(FIELD_NAME) ) {
      return new String( currentLine );
    } else {
      return new String("");
    }

  }

  /*************************************************************************
  *
  *  Purpose: Get the list of types in the field being processed as an array.
  *           This is the case if they are listed only on one line.
  *
  */
  String [] cleanUpOneLineTypes( String lineOfText ) {
    String cleanedUpLine = new String( lineOfText.replace("\"", "").replace("#", "").replace("[", "").replace("]", "") );
    return cleanedUpLine.split(COMMA);
  }

  /*************************************************************************
  *
  *  Purpose: Determine if the current type in the field being processed is 
  *           multi-line.
  *
  */
  Boolean checkIfTypeIsMultiLine( String lineOfText ) {
      return ( removeLabel( lineOfText ).length() == 0);
  }

  String getFieldType() throws Exception {

    moveToStartOfField();

    // Get to start of type section
    while( !currentLine.contains(FIELD_TYPE) && 
           !currentLine.startsWith(OBJECT_START) && 
           !reachedEOF ) {
        
        readNextLine();
        
        if( currentLine.contains(FIELD_TYPE) && !currentLine.startsWith(OBJECT_START) && !reachedEOF ) {
          break;
        }
    }

    if( !currentLine.startsWith(OBJECT_START) ) {

      Integer typeIndentation = -1;

      // Determine where the indentation of this type definition is, for later checking if still
      // within the Type definition
      if ( currentLine.contains( FIELD_TYPE ) ) {
        typeIndentation = currentLine.indexOf( FIELD_TYPE );
      }

      Boolean isWithinType = true;
      Boolean isTypeMultiLine = checkIfTypeIsMultiLine( currentLine );
      ArrayList<String> typeDefinitions = new ArrayList<String>(); 

      // Reached the end of the current field's type
      while( isWithinType && 
             !currentLine.contains(FIELD_NAME) && 
             !currentLine.startsWith(OBJECT_START) && 
             !reachedEOF ) {

        // Process multiple lines if the check does pass (false)
        if( !isTypeMultiLine ) {
          for( String typeElement : cleanUpOneLineTypes( removeLabel(currentLine) ) ) {
            typeDefinitions.add( typeElement.trim() );
          }
          break;
        } else {
        
          if( currentLine.contains(COMMA) ) {
        
            for( String typeElement : cleanUpOneLineTypes( removeLabel(currentLine) ) ) {
              typeDefinitions.add( typeElement.trim() );
            }
          } else {

            typeDefinitions.add( currentLine.trim() ); 
          }
        }

        readNextLine();

        // Has moved beyond the Type definition of the field
        if( currentLine.trim().length() != 0 ) {
          if( (currentLine.substring( typeIndentation, typeIndentation + 1 ).trim().length() > 0) ) {
            isWithinType = false;
          }
        }

        // Completed the type definition section of this field
        if( !isWithinType && 
            !currentLine.contains(FIELD_NAME) && 
            !currentLine.startsWith(OBJECT_START) && 
            !reachedEOF ) {
          break;
        }
      }

      return processArrayListTypes(typeDefinitions);

    } else {
      return new String( "" );
    }

  }

  /*************************************************************************
  *
  *  Purpose: Remove the dash (-) in a String.
  *
  */
  String removeDash( String lineOfText ) {
    String cleanedUpLine = new String( lineOfText.replace(DASH, "").trim() );
    return cleanedUpLine;
  }


  /*************************************************************************
  *
  *  Purpose: Process and annotate the field types in the current object, 
  *           and return them as one String, with the types being
  *           comma-separated.  This is for the proper creation of variables 
  *           and methods during the SDK generation process.
  *
  */
  String processArrayListTypes( ArrayList <String> typesList ) {

    String processedString = new String();
    Boolean isArray = false;
    Boolean isSymbol = false;
    Boolean isEnum = false;

    for (String type : typesList ) {


      if( type.contains(FIELD_SYMBOLS) ) {
        isSymbol = true;
        continue;
      }

      // On the next loop to see if symbol section is complete
      if ( isSymbol && !(type.contains(FIELD_NAME) || type.contains(FIELD_TYPE)) ) {
        continue;
      } else {
        isSymbol = false;
      }

      if( type.contains(FIELD_TYPE) &&
          type.contains(ARRAY) ) {
        isArray = true;
        continue;
      }

       if( type.contains(FIELD_TYPE) &&
        type.contains(ENUM) ) {
        isEnum = true;
        continue;
      }

      if ( type.contains(FIELD_ITEMS) ) {

        //  Continue...

        type = removeDash( type.replace( FIELD_ITEMS, "" ) );
      }
      
      if( type.trim().length() != 0 && !type.contains(NULL_STRING)) {

        if( isArray ) {
          if( processedString.trim().length() != 0 ) {
            processedString = new String(processedString + ", " + 
                                  removeDash(cleanUpReference(removeLabel(type))) + " [] ");
          } else {
            processedString = new String(
                                  removeDash(cleanUpReference(removeLabel(type))) + " [] ");
          }
        } else if( isEnum ){
          if( processedString.trim().length() != 0 ) {
            processedString = new String(processedString + ", " + "{}" + 
                                  removeDash(cleanUpReference(removeLabel(type))) );
          } else {
            processedString = new String("{}" + 
                                  removeDash(cleanUpReference(removeLabel(type))) );
          }
        } else {
          if( processedString.trim().length() != 0 ) {
            processedString = new String(processedString + ", " + 
                                  removeDash(cleanUpReference(removeLabel(type))));
          } else {
            processedString = new String(
                                  removeDash(cleanUpReference(removeLabel(type))));
          }
        }
      }

    }
    return processedString;
  }


}