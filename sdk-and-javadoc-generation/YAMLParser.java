

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
*          * CommandLineTool.yml 
*          * Process.yml   
*          * Workflow.yml    
*          * metaschema.yml
*          * cwl-sdk-config.txt
*          * CreateCWLJavaSDK.java
*          * YAMLParser.java
*          * CWLSDKBuilder.java
*          * Creating a directory called sdk, into which the
*            CWL Java SDK will be generated
*
*  Below is the command-line on how to compile and run the collection of 
*  programs:
*
*     To compile and run: 
* 
*       ./step1-generate_sdk.sh
*
*     To compile:
*
*       javac CreateCWLJavaSDK.java
*       javac YAMLParser.java
*       javac CWLSDKBuilder.java
*
*     To run:
*
*       java CreateCWLJavaSDK cwl-yaml-specs/CommandLineTool.yml cwl-yaml-specs/Process.yml cwl-yaml-specs/Workflow.yml cwl-yaml-specs/metaschema.yml
*
*
*   Output of the program:
*
*     The program will read Yaml files to gather the required data for 
*     generating the CWL Java SDK in the sdk folder.
*
* 
*************************************************************************/

// ******************** Load the appropriate packages ********************

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class YAMLParser {

  // *************** Initialize the required variables ***************

  String [] YAML_FILENAME;
    
  String OBJECT_START = "- ";
  String OBJECT_NAME = " name: ";
  String OBJECT_TYPE = " type: ";
  String OBJECT_DOCUMENTATION = "  doc:";
  String OBJECT_DOCUMENTATION_MULTILINE = "  doc: |";
  String OBJECT_SYMBOLS = " symbols:";
  String OBJECT_SPECIALIZE = " specialize:";
  String SPECIALIZE_FROM = " specializeFrom: ";
  String SPECIALIZE_TO = " specializeTo: ";
  String OBJECT_EXTENDS = " extends: ";
  String OBJECT_ABSTRACT = " abstract: ";
  Integer OBJECT_INDENT = 2;

  String FIELD_START = "    - name: ";
  String FIELDS_SECTION_START = " fields:";
  String FIELD_NAME = " - name:";
  String FIELD_DOCUMENTATION = "doc:";
  String FIELD_DOCUMENTATION_MULTILINE = "doc: |";
  String FIELD_TYPE = "type:";
  String FIELD_ITEMS = "items:";

  String FIELD_SYMBOLS = "symbols:";  
  String COLON = ":";
  String COMMA = ",";
  String ARRAY = "array";
  String ENUM = "enum";
  String DASH = "-";
  String NULL_STRING = "null";
  String QUESTION_MARK = "?";
  
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
  public Boolean objectAbstract = false;
  public String objectDocumentation = new String();
  public Map <String,String> objectRenamedFields = new HashMap<String, String>();
  public ArrayList <String> objectSymbolsList = new ArrayList<String>();
  public Map <String,String> objectFields = new HashMap<String, String>();
  public Map <String,String> objectFieldsDocumentation = new HashMap<String, String>();

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
    objectAbstract = false;
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
  *  Purpose: To remove the object's question-mark (?) in a String, such as:
  *           (i.e. name:, type:, etc.)
  *
  */
  String removeQuestionMark( String lineOfText ) {
    return new String( lineOfText.replace(QUESTION_MARK, "").trim() );
  }

  /*************************************************************************
  *
  *  Purpose: Add a space to an array-defined type (i.e. string[])
  *
  */
  String addSpacingToBrackets( String lineOfText ) {
    return new String( lineOfText.replace("[", " [").trim() );
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
  *  Purpose: Retreive the current description/documentation of this 
  *           object.
  *
  */
  public void getObjectDocumentation() throws Exception {

    moveToStartOfObject();
    objectDocumentation = "";

    if( currentLine.contains( OBJECT_DOCUMENTATION ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue, since found the specialize start line.

    } else {
      readNextLine();
      while( !currentLine.contains( OBJECT_DOCUMENTATION ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }


    // Found a current line 
    if( currentLine.contains( OBJECT_DOCUMENTATION ) &&
        (currentLine.indexOf( OBJECT_DOCUMENTATION.trim() ) == OBJECT_INDENT) ) {
      
      // Check if current documentation is not multiline
      // The second check is for CWLType where it is a multiline list
      if( !currentLine.contains( OBJECT_DOCUMENTATION_MULTILINE ) ) {  
        // For CWLType where it's a multiline list
        if ( currentLine.replace( OBJECT_DOCUMENTATION, "" ).trim().length() != 0 ) {
          objectDocumentation = new String( replaceAngleBrackets( removeDoubleQuotes( removeLabel(currentLine ) ) ) );
          objectDocumentation = new String( makeAmpersandLiteralForJavaDoc(objectDocumentation) );
          return;
        }
      } else {
        // Continue ...
      }

      Integer documentationIndentation = -1;

      // Determine where the indentation of this type definition is, for later checking if still
      // within the Documentation definition
      if ( currentLine.contains( OBJECT_DOCUMENTATION ) ) {
        documentationIndentation = currentLine.indexOf( OBJECT_DOCUMENTATION.trim() );
      }

      Boolean isWithinDocumentation = true;
    
      // Reached the end of the current Specialize section
      while( isWithinDocumentation && 
             !currentLine.startsWith(OBJECT_START) && 
             !reachedEOF ) {

        // Continue to the next line
        readNextLine();

        // Has moved beyond the Documentation section
        if( currentLine.trim().length() == 0 ) {
          isWithinDocumentation = false;
        } else if( (currentLine.substring( documentationIndentation, documentationIndentation + 1 ).trim().length() > 0) ) {
          isWithinDocumentation = false;
        }

        // Completed the type definition section of this field
        if( !isWithinDocumentation && 
            !currentLine.contains(FIELD_NAME) && 
            !currentLine.startsWith(OBJECT_START) && 
            !reachedEOF ) {
          break;
        }

        // Get the specializeFrom          
        objectDocumentation = new String( objectDocumentation + " " + replaceAngleBrackets( removeDoubleQuotes( currentLine ) ) );
        objectDocumentation = new String( makeAmpersandLiteralForJavaDoc(objectDocumentation) );

      }

    }

  }

  /*************************************************************************
  *
  *  Purpose: To get information if this object is abstract. 
  *
  */
	public void getObjectAbstract() throws Exception {

    moveToStartOfObject();
    
    if( currentLine.contains( OBJECT_ABSTRACT ) && 
        currentLine.startsWith(OBJECT_START) ) { 

      // Continue, since found the abstract line.

    } else {

      readNextLine();
      
      while( !currentLine.contains( OBJECT_ABSTRACT ) && 
             !currentLine.startsWith(OBJECT_START) &&
             !reachedEOF ) {
        readNextLine();
      }
    }
      
    // Found the extends line
    if( currentLine.contains( OBJECT_ABSTRACT ) &&
        (currentLine.indexOf( OBJECT_ABSTRACT.trim() ) == OBJECT_INDENT) ) {
    
      String abstractLine = removeBrackets( removeNamespace( cleanUpReference( removeLabel( currentLine ) ) ) );
    	if (abstractLine.equals("true") ) {
      	objectAbstract = true;
      } else {
      	objectAbstract = false;
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

  /*************************************************************************
  *
  *  Purpose: To remove the links (# sign) and array marking ([]) in a 
  *           String, in order to only list the element(s), which might be 
  *           separated by the comma (,) delimiter.
  *
  */
  String removeCurlyBrackets( String reference ) {
    return new String( reference.replace("{", "").replace("}", "") );
  }


  /*************************************************************************
  *
  *  Purpose: To get information regarding what objects are being inherited 
  *           by this object. 
  *
  */
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
  *  Purpose: To remove double-quotation marks ("") from document lines.
  *
  */
  String removeDoubleQuotes( String reference ) {
    return new String( reference.replace("\"", "").trim() );
  }

  /*************************************************************************
  *
  *  Purpose: To replace angle brackets <> from document lines, with 
  *           parantheses (), as they interfere with JavaDoc formatting.
  *
  */
  String replaceAngleBrackets( String reference ) {
    return new String( reference.replace("<", "(").replace(">", ")").trim() );
  }

  /*************************************************************************
  *
  *  Purpose: To replace `&` from document lines, with `{@literal &}`,
  *           as they interfere with JavaDoc formatting.
  *
  */
  String makeAmpersandLiteralForJavaDoc( String reference ) {
    return new String( reference.replace("`&`", "`{@literal &}`").trim() );
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


  /*************************************************************************
  *
  *  Purpose: To print the fields and their types. 
  *
  */
  public void printObjectFields( Map <String, String> map ) {

    for(String key: map.keySet()){

      print(key  +" -> "+ map.get(key));

    }

  }

  /*************************************************************************
  *
  *  Purpose: To print the fields and their documentation. 
  *
  */
  public void printObjectFieldsDocumentation( Map <String, String> map ) {

    for(String key: map.keySet()){

      print( "Field name: " + key  +" -doc-> "+ map.get(key));

    }

  }

  /*************************************************************************
  *
  *  Purpose: To initiate the processing of all fields for an object.  It
  *           will loop until it reaches the end of the object's fields. 
  *
  */
  public void getObjectFields() throws Exception {

    moveToStartOfObject();
    currentFieldStartLine = -1;   
    objectFields = new HashMap<String, String>();
    objectFieldsDocumentation = new HashMap<String, String>();

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
      String fieldDocumentation = getFieldDocumentation();

      if( fieldName.length() != 0 && fieldTypes.length() != 0 ) {
        objectFields.put( fieldName, fieldTypes );
        if ( fieldDocumentation.length() != 0 ) {
          objectFieldsDocumentation.put( fieldName, fieldDocumentation );
        }
      }

      // Move forward (advance to not stay in a loop)
      //readNextLine();  //not needed because documentation performs it already

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

  Boolean isFieldDocumentationMultiline( String text ) throws Exception {

    if( 
      text.contains( FIELD_DOCUMENTATION_MULTILINE ) ||
      text.replace( FIELD_DOCUMENTATION, "" ).trim().length() == 0 
      ) {
      // Continue to the next line
      readNextLine();
      return true;
    } else {
      return false;
    }

  }

  /*************************************************************************
  *
  *  Purpose: To get the documentation of a field for the object
  *           being processed.
  *
  */
  String getFieldDocumentation() throws Exception {

    moveToStartOfField();

    // Move from start of field
    if( currentLine.contains(FIELD_START) ) {
      readNextLine(); 
    }
  

    // Get to start of type section
    while( !currentLine.contains(FIELD_DOCUMENTATION) &&
           !currentLine.contains(FIELD_START) && 
           !currentLine.startsWith(OBJECT_START) && 
           !reachedEOF ) {
        
        readNextLine();

        // If found next field stop!
        if( currentLine.contains(FIELD_START) ) {
          break;
        }
        
        if( currentLine.contains(FIELD_DOCUMENTATION) &&
            !currentLine.contains(FIELD_START) && 
            !currentLine.startsWith(OBJECT_START) && !reachedEOF ) {
          break;
        }
    }

    // If found next field stop!
    if( currentLine.contains(FIELD_START) ) {
      return new String("");
    }

    if( !currentLine.startsWith(OBJECT_START) ) {

      Integer documentIndentation = -1;

      // Determine where the indentation of this type definition is, for later checking if still
      // within the Type definition
      if ( currentLine.contains( FIELD_DOCUMENTATION ) ) {
        documentIndentation = currentLine.indexOf( FIELD_DOCUMENTATION );
      }

      Boolean isWithinDocumentation = true;
      Boolean isDocumentationMultiLine = isFieldDocumentationMultiline( currentLine );

      String fieldDocumentation = new String(); 

      // Reached the end of the current field's type
      while( isWithinDocumentation && 
             !currentLine.contains(FIELD_NAME) && 
             !currentLine.startsWith(OBJECT_START) && 
             !reachedEOF ) {

        // Process multiple lines if the check does pass (false)
        if( !isDocumentationMultiLine ) {
          fieldDocumentation = new String( fieldDocumentation + replaceAngleBrackets(removeDoubleQuotes(removeLabel( currentLine)) ));
          fieldDocumentation = new String( makeAmpersandLiteralForJavaDoc(fieldDocumentation) );
          break;
        } else {
          fieldDocumentation = new String( fieldDocumentation + " " + replaceAngleBrackets(  removeDoubleQuotes( currentLine ) ) );
          fieldDocumentation = new String( makeAmpersandLiteralForJavaDoc(fieldDocumentation) );
        }

        readNextLine();

        // Has moved beyond the Type definition of the field
        if( currentLine.trim().length() != 0 ) {
          if( (currentLine.substring( documentIndentation, documentIndentation + 1 ).trim().length() > 0) ) {
            isWithinDocumentation = false;
          }
        }

        // Completed the type definition section of this field
        if( !isWithinDocumentation && 
            !currentLine.contains(FIELD_NAME) && 
            !currentLine.startsWith(OBJECT_START) && 
            !reachedEOF ) {
          break;
        }
      }

      //return processArrayListTypes(typeDefinitions);
      return fieldDocumentation;

    } else {
      return new String( "" );
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

      //System.out.println("TYPE =--------------------------> " + type);
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
          
          // Remove question mark, and might need to remove them above as well
          // Ref: https://github.com/common-workflow-language/cwljava/issues/20
          // Ref: http://www.commonwl.org/v1.0/CommandLineTool.html#Document_preprocessing
          
          if( processedString.trim().length() != 0 ) {
            processedString = new String(processedString + ", " + 
                                  removeDash(cleanUpReference(removeLabel(removeQuestionMark(type)))));

            // Ensure there is a spacing in between the type and the brackets (i.e. string[]) and an array
            processedString = new String( addSpacingToBrackets(processedString) );
            //System.out.println( "BRACKETS -------------> " + processedString);

          } else {
            processedString = new String(
                                  removeDash(cleanUpReference(removeLabel(removeQuestionMark(type)))));

            // Ensure there is a spacing in between the type and the brackets (i.e. string[]) and an array
            processedString = new String( addSpacingToBrackets(processedString) );
            //System.out.println( "BRACKETS -------------> " + processedString);
            
          }
        }
      }

    }
    return processedString;
  }

  /*************************************************************************
  *
  *  Purpose: Update the types in fields which are abstract.  
  *           Sometimes fields will point to types which are abstract, and
  *           this method will travel the dependency path to the first 
  *           concrete class implemenation and replace the type with that 
  *           of concrete class.
  *
  */
  public Map <String, Map> updateAbstractFields(Map <String, Map> objects) {

    String objectName;
    Map <String, Object> objectInformation;
    Map <String, String> extendsInformation = new HashMap<String, String>();
    Set<String> extendedFieldTypes = new HashSet<String>();

    String FIELDS = "fields";
    String ABSTRACT = "abstract";
    String EXTENDS = "extends";
    Map <String, String> fields;
    String [] fieldTypes;
    String fieldElement;
    String updatedFieldType;


    // Build the list of class which extend classes
    for(String nameOfObject: objects.keySet()) {
      String extendsClasses = (String) objects.get(nameOfObject).get(EXTENDS);
      String [] extendedClassList = ((String) objects.get(nameOfObject).get(EXTENDS)).split(COMMA);
      for( String className : extendedClassList ) {
        extendsInformation.put( nameOfObject.trim(), className.trim() );
      }
    }

    for( String nameOfObject: objects.keySet() ) {
      print(nameOfObject);
      objectInformation = objects.get(nameOfObject);
      fields = (Map <String, String>) objects.get(nameOfObject).get(FIELDS);  

      if( fields.keySet().size() > 0 ) { 
        for( String fieldName : fields.keySet() ) {

          //Get the types for the specific fieldName
          fieldTypes = fields.get( fieldName ).split(COMMA);
          extendedFieldTypes = new HashSet<String>();

          // Process all the types for that fieldName
          for( String fieldType : fieldTypes ) {

            fieldElement = removeCurlyBrackets( removeBrackets(fieldType) ).trim();

            //i.e. string, etc.
            if( objects.get(fieldElement) != null  ) {

              // Check if it is abstract
              if ( (Boolean) objects.get(fieldElement).get(ABSTRACT) ) {
                for( String className : extendsInformation.keySet() ) {

                  // See if it extends an abstract object
                  if( extendsInformation.get(className).equals(fieldElement) ) {
                    updatedFieldType = new String( fieldType );
                    print( className + " => " + fieldElement + " to " + updatedFieldType);
                    updatedFieldType = updatedFieldType.replace( fieldElement, className );
                    extendedFieldTypes.add( updatedFieldType );
                  }
                }
              } else {
                //extendedFieldTypes.add( fieldElement );
                extendedFieldTypes.add( fieldType );
              }

            } else { //for string, etc.
                extendedFieldTypes.add( fieldType );
            }

          }

          Map <String, Object> updatedObjectInformation = new HashMap<String, Object>();

          updatedObjectInformation = objects.get( nameOfObject );
          fields = (Map <String, String>) objects.get(nameOfObject).get(FIELDS); 
          fields.put( fieldName, convertSetToString( extendedFieldTypes ) );

          updatedObjectInformation.put( FIELDS, fields );
          objects.put( nameOfObject, updatedObjectInformation );
      
        }
      } // otherwise nothing is changed
    }

    return objects;
  }

  /*************************************************************************
  *
  *  Purpose: To convert an ArrayList of classes to a String separated by 
  *           commas (,).
  *
  */
  public String convertSetToString( Set<String> arrayList ) {

    String concatenatedStrings = new String();

    for (String element : arrayList ) {
      
      if( concatenatedStrings.length() == 0 ) {
        concatenatedStrings = new String( element.trim() );
      } else {
        concatenatedStrings = new String( concatenatedStrings + ", " + element.trim() );
      }
    }

    return concatenatedStrings;

  }


}