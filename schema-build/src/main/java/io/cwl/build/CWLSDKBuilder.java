
/*************************************************************************
*
*  Authors:
* 
*          * Paul Grosu <pgrosu@gmail.com>, Northeastern University
* 
*  Purpose: 
* 
*          To generate a Java SDK using the results of YAMLParser.
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
*     The program will generate the CWL Java SDK in the sdk folder.
*
* 
*************************************************************************/

package io.cwl.build;

// ******************** Load the appropriate packages ********************

import java.util.*;
import java.io.*;

public class CWLSDKBuilder {

  // *************** Initialize the required variables ***************

  public YAMLParser yamlParser;
  public Map<String, Map> objects;
  public Map<String, Object> objectInformation;
  public Map<String, String> config_override = new HashMap<String, String>();
  public Map<String, String> config_namespace = new HashMap<String, String>();
  public ArrayList <String> config_skip = new ArrayList<String>();
  public Map<String, String> variableTypes = new HashMap<String, String>();
  public ArrayList <String> authors = new ArrayList<String>();

  Map <String, String> fields;
  
  String SDK_DIRECTORY = "sdk/";
  String CONFIG_FILE = "cwl-sdk-config.txt";
  String AUTHORS_FILE = "AUTHORS.TXT";
  String PACKAGE_NAME = "io.cwl.schema";
  
  String NAME = "name";
  String TYPE = "type";
  String EXTENDS = "extends";
  String SPECIALIZE = "specialize";
  String SYMBOLS = "symbols";
  String FIELDS = "fields";
  String RECORD = "record";
  String ENUM = "enum";

  String COLON = ":";
  String COMMA = ",";

  String PUBLIC_CLASS = "public class ";
  String PUBLIC_INTERFACE = "public interface ";
  String CONSTRUCTOR = "  public ";
  String INTERFACE = "interface";


  /*************************************************************************
  *
  *  Purpose: Get the processed YAML file as a Map<String, Map> for
  *           generating the SDK class files.
  *
  */
  public CWLSDKBuilder( Map<String, Map> objectsInstance ) {

    objects = objectsInstance;

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
  *  Purpose: This method intiates the generation of the SDK by calling
  *           other methods.
  *
  */
  public void generateSDK() throws Exception {
    
    print( "" );
    print( "Building SDK...");
    print( "" );
    print( "Reading config...");
    print( "" );

    readConfig();
    readAuthors();

    print( "Writing classes..." );
    print("");

    writeClasses();

    print("");
    print( "SDK creation complete!" );

  }

  /*************************************************************************
  *
  *  Purpose: Get the key portion of a line the cwl-sdk-config.txt file.
  *
  */
  String getConfigKey( String text ) {
    Integer indexOfColon = text.indexOf(COLON);
    return text.substring(0, indexOfColon - 1).trim();
  }

  /*************************************************************************
  *
  *  Purpose: Get the value portion of a line the cwl-sdk-config.txt file.
  *
  */
  String getConfigValue( String text ) {
    Integer indexOfColon = text.indexOf(COLON);
    return text.substring( indexOfColon + 1 ).trim();
  }

  /*************************************************************************
  *
  *  Purpose: Read the cwl-sdk-config.txt file and store the information
  *           as keys or key-value pairs in:
  *
  *      config_override  <String, String> : override definition
  *      config_namespace <String, String> : namespaces for variables
  *      config_skip      <String>         : class auto-generation to skip
  *
  */
  public void readConfig() throws Exception {

    FileReader configFileDescriptor = new FileReader(new File(CONFIG_FILE));
    BufferedReader bufferedReader = new BufferedReader(configFileDescriptor);
    
    String configLine;
    String configValue;

    while((configLine = bufferedReader.readLine()) != null) {
      
      if( getConfigKey( configLine ).equals("override") ) {
        configValue = castToString( getConfigValue(configLine) );
        config_override.put( getConfigKey( configValue ), getConfigValue(configValue) );
      } else if( getConfigKey( configLine ).equals("namespace") ) {
        configValue = castToString( getConfigValue(configLine) );
        config_namespace.put( getConfigKey( configValue ), getConfigValue(configValue) );
      } if( getConfigKey( configLine ).equals("skip") ) {
        configValue = castToString( getConfigValue(configLine) );
        config_skip.add( configValue );
      }

    }

    bufferedReader.close();
    
  }

  /*************************************************************************
  *
  *  Purpose: To generate the classes for the SDK.
  *
  */
  public void writeClasses() throws Exception {

    for(String name: objects.keySet()){

      if( !(config_skip.contains(name)) ) {

        // Write the start of class file
        openClass( name );

        // Clean the varible types for lookup in get Method return type
        variableTypes = new HashMap<String, String>();

        // Check that there is nothing to extend 
        String inheritance = castToString( objectInformation.get(EXTENDS) );

        // Write the Class' variables
        writeVariables( name , name , null );

        if( !isSpecializeEmpty( name ) || inheritance.length() != 0 ) {

          if( !(inheritance.contains(COMMA)) ) {
            writeVariables( inheritance, name , (Map <String, String>) objectInformation.get(SPECIALIZE) );
          } else {

            String [] restOfClassCollection = inheritance.split(COMMA);
            
            for( String className : restOfClassCollection ) {
              
              String trimmedClassName = className.trim();
              writeVariables( trimmedClassName, name , (Map <String, String>) objectInformation.get(SPECIALIZE) );

            }
          }
        }

        // Write the Class' constructor
        writeConstructor( name );

        // Write the Class' methods
        writeMethods( name , name , null );

        if( !isSpecializeEmpty( name ) || inheritance.length() != 0 ) {

          if( !(inheritance.contains(COMMA)) ) {
            writeMethods( inheritance, name , (Map <String, String>) objectInformation.get(SPECIALIZE) );
          } else {

            String [] restOfClassCollection = inheritance.split(COMMA);
            
            for( String className : restOfClassCollection ) {
              
              String trimmedClassName = className.trim();
              writeMethods( trimmedClassName, name , (Map <String, String>) objectInformation.get(SPECIALIZE) );

            }
          }
        }

        // To close the current class
        closeClass( name );
      }

    }

    // Create the Any.java class file
    writeAnyClass();

    // Create the PrimitiveType.java class file
    writePrimitiveTypeClass();

  }


  /*************************************************************************
  *
  *  Purpose: To read the AUTHORS.TXT file to fill out the Authors' section.
  *
  */
  public void readAuthors() throws Exception {

    FileReader configFileDescriptor = new FileReader(new File(AUTHORS_FILE));
    BufferedReader bufferedReader = new BufferedReader(configFileDescriptor);

    String authorsLine;
    
    authors.add("");
    authors.add("/*****************************************************************************************************");
    authors.add("*");
    authors.add("*  Authors:");
        
    while((authorsLine = bufferedReader.readLine()) != null) {
      
      authors.add( "*          " + authorsLine );
      
    }

    authors.add("*");
    authors.add("*****************************************************************************************************/");

    bufferedReader.close();
    
  }



  /*************************************************************************
  *
  *  Purpose: To generate the Any.java class.
  *
  */
  public void writeAnyClass() throws Exception {

    String class_name = "Any.java";

    FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + class_name );
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    // Any class code
    String [] Any_class = {
      "",
      "public class Any extends Object {",
      "",
      " Object value;",
      "",
      " public Any( Object objectInstance ) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Object objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public Object get(Object objectInstance) {",
      "   return (Object) objectInstance;",
      " }",
      "",
      "}",
      "" 
    };

    // Write Authors section
    for( String line : authors ) {
      bufferedWriter.write( line );
      bufferedWriter.newLine();
    }
    bufferedWriter.write("package " + PACKAGE_NAME + ";");
    bufferedWriter.newLine();
    bufferedWriter.newLine();

    // Write Any class
    for( String line : Any_class ) {
      bufferedWriter.write( line );
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

  }

  /*************************************************************************
  *
  *  Purpose: To generate the PrimitiveType.java class.
  *
  */
  public void writePrimitiveTypeClass() throws Exception {

    String class_name = "PrimitiveType.java";

    FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + class_name );
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    // PrimitiveType class code
    String [] PrimitiveType_class = {
      "",
      "public class PrimitiveType extends Object {",
      "",
      " Object value;",
      "",
      " public PrimitiveType( Object objectInstance ) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Boolean objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Integer objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Long objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Float objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(Double objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public void set(String objectInstance) {",
      "   value = objectInstance;",
      " }",
      "",
      " public Object get(Object objectInstance) {",
      "   return (Object) objectInstance;",
      " }",
      "",
      "}",
      ""
    };

    // Write Authors section
    for( String line : authors ) {
      bufferedWriter.write( line );
      bufferedWriter.newLine();
    }
    bufferedWriter.write("package " + PACKAGE_NAME + ";");
    bufferedWriter.newLine();
    bufferedWriter.newLine();

    // Write PrimitiveType class
    for( String line : PrimitiveType_class ) {
      bufferedWriter.write( line );
      bufferedWriter.newLine();
    }


    bufferedWriter.close();
  }

  /*************************************************************************
  *
  *  Purpose: To cast an Object to a String.
  *
  */
  public String castToString( Object object ) {
    return (String) object;
  }

  /*************************************************************************
  *
  *  Purpose: To get the first class from a list of classes.
  *
  */
  public String getFirstClass( String text, String DELIMITER ){
    Integer indexOfDelimiter = text.indexOf(DELIMITER);
    return text.substring(0, indexOfDelimiter).trim();
  }

  /*************************************************************************
  *
  *  Purpose: To get the rest of the classes from a list of classes,
  *           after the first one.
  *
  */
  public String [] getRestOfClasses( String text, String DELIMITER ){
    Integer indexOfDelimiter = text.indexOf(DELIMITER);
    return text.substring(indexOfDelimiter + 1).split(COMMA);
  }

  /*************************************************************************
  *
  *  Purpose: To get as a String the rest of the classes from a list of 
  *           classes, after the first one.
  *
  */
  public String getRestOfClassesAsString( String text, String DELIMITER ){
    Integer indexOfDelimiter = text.indexOf(DELIMITER);
    return text.substring(indexOfDelimiter + 1).trim();
  }


  /*************************************************************************
  *
  *  Purpose: To convert an ArrayList of classes to a String separated by 
  *           commas (,).
  *
  */
  public String convertArrayListToString( ArrayList <String> arrayList ) {

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

  /*************************************************************************
  *
  *  Purpose: To convert a list of synmbols to a String separated by 
  *           commas (,).
  *
  */
  public String printObjectSymbols( ArrayList <String> symbolsList ) {

    String concatenatedSymbols = new String();

    for (String symbol : symbolsList ) {
      
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
  *  Purpose: To convert an enumarated list to a String separated by 
  *           commas (,).
  *
  */
  public String printEnumObjectSymbols( ArrayList <String> symbolsList ) {

    String concatenatedSymbols = new String();

    for (String symbol : symbolsList ) {
      
      if( concatenatedSymbols.length() == 0 ) {
        // This is because periods in Java indicate subclasses
        concatenatedSymbols = new String( symbol.replace(".", "_")); 
      } else {
        // This is because periods in Java indicate subclasses
        concatenatedSymbols = new String(concatenatedSymbols + ", " +  symbol.replace(".", "_") );
      }
    }

    return concatenatedSymbols;

  }

  ArrayList<String> getImplementedClasses( String text ) {
    String [] textAsArray = text.split(COMMA);
    ArrayList<String> implementedClasses = new ArrayList<String>();
    for( String className : textAsArray ) {
      if( config_override.get(className.trim()) != null ) {
        if( castToString(config_override.get( className.trim() )).equals(INTERFACE) ) {
          implementedClasses.add( className.trim() );
        }
      } else {
        // Continue ...
      }
    }
    return implementedClasses;
  }

  String getExtendedClass( String text ) {
    
    String [] textAsArray = text.split(COMMA);
    String extendedClass = new String();

    for( String className : textAsArray ) {
      print( className.trim() );
      if( config_override.get(className.trim()) != null ) {
        // Continue ...
      } else {
        extendedClass = new String( className.trim() );
      }
    }
    return extendedClass;
  }

  /*************************************************************************
  *
  *  Purpose: To write out the start of the class file.
  *
  */
  public void openClass( String name ) throws Exception {

    objectInformation = objects.get(name);

    if ( castToString(objectInformation.get(TYPE)).contains(ENUM) ) {

      print( name ); 

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + name + ".java" );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      for( String line : authors ) {
        bufferedWriter.write( line );
        bufferedWriter.newLine();
      }

      bufferedWriter.newLine();
      bufferedWriter.write("package " + PACKAGE_NAME + ";");
      bufferedWriter.newLine();
      bufferedWriter.newLine();
      
      bufferedWriter.write( "public enum " + name + " {" );
      bufferedWriter.newLine();
      bufferedWriter.newLine();
      bufferedWriter.write("  " + printEnumObjectSymbols( ( ArrayList <String> ) objectInformation.get(SYMBOLS)));
      bufferedWriter.newLine();
      bufferedWriter.newLine();
      bufferedWriter.write( "}" );
      bufferedWriter.newLine();
      bufferedWriter.close();

    }

    if ( castToString(objectInformation.get(TYPE)).contains(RECORD) ) {
    
      print( name ); 

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + name + ".java" );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for( String line : authors ) {
        bufferedWriter.write( line );
        bufferedWriter.newLine();
      }
      
      bufferedWriter.newLine();
      bufferedWriter.write("package " + PACKAGE_NAME + ";");
      bufferedWriter.newLine();
      bufferedWriter.newLine();

      if ( castToString(objectInformation.get(EXTENDS)).length() != 0 ) {

        String classInheritanceCollection = castToString(objectInformation.get(EXTENDS));
        String extendedClass = getExtendedClass( classInheritanceCollection );
        String implementedClasses = convertArrayListToString( getImplementedClasses( classInheritanceCollection )).trim();
        
        if ( extendedClass.length() != 0 ) {
          if( implementedClasses.length() != 0 ) {
            bufferedWriter.write( PUBLIC_CLASS + name + " extends " + extendedClass + " implements " + implementedClasses + " {" ); 
            bufferedWriter.newLine();
          } else {
            bufferedWriter.write( PUBLIC_CLASS + name + " extends " + extendedClass + " {" ); 
            bufferedWriter.newLine();
          }
        } else {
          if( implementedClasses.length() != 0 ) {
            bufferedWriter.write( PUBLIC_CLASS + name + " implements " + implementedClasses + " {" );
            bufferedWriter.newLine();
          } else {
            bufferedWriter.write( PUBLIC_CLASS + name + " {" );
            bufferedWriter.newLine();
          }
        }

      } else {
        if( config_override.get(name) != null ) {
          if( castToString(config_override.get(name)).equals(INTERFACE) ) {
            bufferedWriter.write( PUBLIC_INTERFACE + name + " {" );
            bufferedWriter.newLine();           
          } else {
            // Continue ...
          }
        } else {
          bufferedWriter.write( PUBLIC_CLASS + name + " {" );
          bufferedWriter.newLine();
        }
      }

      bufferedWriter.close();
    }

  }

  /*************************************************************************
  *
  *  Purpose: To write out the class' variables.
  *
  */
  public void writeVariables( String name, String filename, Map <String, String> specialize ) throws Exception {

    if ( castToString(objectInformation.get(TYPE)).contains(RECORD) ) {

      // Since the class is recursive, this is in case of the need to extract the fields 
      // of an extended class/interface.
      fields = (Map <String, String>) objects.get(name).get(FIELDS);  

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + filename + ".java", true );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      Boolean areThereAnyFields = false;

      // Each field might have one or more defined types
      for(String field: fields.keySet()) {

        areThereAnyFields = true;

        if( getFieldElements( fields.get(field) ).length == 1 ) {
          
          bufferedWriter.newLine();
          
          // Only element as the length is == 1
          String firstElementOfField = getFirstElementOfField( fields.get(field) ).trim(); 

          if( specialize != null ) {
        
            if( specialize.containsKey( cleanArraySymbol( firstElementOfField ))) {
              
              bufferedWriter.write( " " + specializeTheType( reMapPrimitiveType( firstElementOfField ), specialize ) + " " + reMapFields( field.trim() ) + " = null;"  );
              
              //Don't remap to class_value or default_value, since the method is getclass or setclass
              variableTypes.put( field.trim() , specializeTheType( reMapPrimitiveType( firstElementOfField ), specialize ) );

            } else {
              
              bufferedWriter.write( " " + reMapPrimitiveType( firstElementOfField ) + " " + reMapFields( field.trim() ) + " = null;"  );
              
              variableTypes.put( field.trim() , reMapPrimitiveType( firstElementOfField ) );
              
            }

          } else {
            
            bufferedWriter.write( " " + reMapPrimitiveType( firstElementOfField ) + " " + reMapFields( field.trim() ) + " = null;"  );
            
            variableTypes.put( field.trim() , reMapPrimitiveType( firstElementOfField ) );

          }

        } else {
          
          bufferedWriter.newLine();

          // This is okay since if the object is an array, it can be cast via (Object [])
          bufferedWriter.write( " " + "Object" + " " + reMapFields( field.trim() ) + " = null;"  );
          variableTypes.put( field.trim() , "Object" );

        }
      }

      if ( areThereAnyFields ) {
        bufferedWriter.newLine();
      }

      bufferedWriter.close();

    }
  
  }

  /*************************************************************************
  *
  *  Purpose: To write out the class' constructor.
  *
  */
  public void writeConstructor( String name ) throws Exception {

    if ( castToString(objectInformation.get(TYPE)).contains(RECORD) ) {

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + name + ".java", true );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      if( config_override.get(name) != null ) {
        if( castToString(config_override.get(name)).equals(INTERFACE) ) {
          // Skip constructor construction for an interface
        } 
      } else {

        if ( castToString(objectInformation.get(EXTENDS)).length() != 0 ) {
          bufferedWriter.newLine();
          bufferedWriter.write( CONSTRUCTOR + name + "() { super(); }" );
          bufferedWriter.newLine(); 
        } else {
          bufferedWriter.newLine();
          bufferedWriter.write( CONSTRUCTOR + name + "() { super(); }" );
          bufferedWriter.newLine(); 
        }
      }

      bufferedWriter.close();

    }
  
  }


  /*************************************************************************
  *
  *  Purpose: To get an array of the field elements.
  *
  */
  public String [] getFieldElements( String fieldElements ) {
    return fieldElements.split( COMMA );
  }

  /*************************************************************************
  *
  *  Purpose: To remap types to Java types.
  *
  */
  String reMapPrimitiveType( String primitiveType ) {
    
    String primitiveTypeTrimmed = primitiveType.trim();

    if( primitiveTypeTrimmed.toLowerCase().equals("boolean") || 
        primitiveTypeTrimmed.toLowerCase().equals("boolean []") ) {
      return primitiveTypeTrimmed.replace( "boolean", "Boolean");
    } else if( primitiveTypeTrimmed.toLowerCase().equals("int") || 
               primitiveTypeTrimmed.toLowerCase().equals("int []") ) {
      return primitiveTypeTrimmed.replace( "int", "Integer");
    } else if( primitiveTypeTrimmed.toLowerCase().equals("long") || 
               primitiveTypeTrimmed.toLowerCase().equals("long []") ) {
      return primitiveTypeTrimmed.replace( "long", "Long");
    } else if( primitiveTypeTrimmed.toLowerCase().equals("float") ||
               primitiveTypeTrimmed.toLowerCase().equals("float []") ) {
      return primitiveTypeTrimmed.replace( "float", "Float");
    } else if( primitiveTypeTrimmed.toLowerCase().equals("double") || 
               primitiveTypeTrimmed.toLowerCase().equals("double []") ) {
      return primitiveTypeTrimmed.replace( "double", "Double");
    } else if( primitiveTypeTrimmed.toLowerCase().equals("string") || 
               primitiveTypeTrimmed.toLowerCase().equals("string []") ) {
      return primitiveTypeTrimmed.replace( "string", "String");
    } else if( primitiveTypeTrimmed.contains("{") || primitiveTypeTrimmed.contains("}") ) {
      // The recursion is in case other symbols exist such as [] and _class
      return reMapPrimitiveType( removeCurlyBrackets( getFirstElementOfField( primitiveTypeTrimmed ) ) );
    } else if( primitiveTypeTrimmed.toLowerCase().trim().equals("array_symbol") ) {
      return primitiveTypeTrimmed.toLowerCase().trim().replace( "array_symbol", "Object []");
    } else if( primitiveTypeTrimmed.toLowerCase().trim().equals("enum_symbol") ) {
      return primitiveTypeTrimmed.toLowerCase().trim().replace( "enum_symbol", "Enum");
    } else if( primitiveTypeTrimmed.toLowerCase().trim().equals("documentation_symbol") ) {
      return primitiveTypeTrimmed.toLowerCase().trim().replace( "documentation_symbol", "Object");
    } else if( primitiveTypeTrimmed.toLowerCase().trim().equals("record_symbol") ) {
      return primitiveTypeTrimmed.toLowerCase().trim().replace( "record_symbol", "Object");
    } else if( primitiveTypeTrimmed.toLowerCase().trim().equals("file_class") ) {
      return primitiveTypeTrimmed.toLowerCase().trim().replace( "file_class", "File");
    } else {
      return primitiveType.trim();
    }

  }

  /*************************************************************************
  *
  *  Purpose: To fix variable names in order to avoid collisions with Java
  *           keywords.
  *
  */
  public String reMapFields( String field ) {

    if( field.equals("class") ) {
      return new String( "class_value" );
    } else if( field.equals("default") ) {
      return new String( "default_value" );
    } else if( field.equals("abstract") ) {
      return new String( "abstract_value" );
    } else if( field.equals("extends") ) {
      return new String( "extends_value" );
    } else {
      return field;
    }

  }


  /*************************************************************************
  *
  *  Purpose: To get the first field from a list of fields.
  *
  */
  public String getFirstElementOfField( String text ) {
    return getFieldElements( text )[0];
  }

  /*************************************************************************
  *
  *  Purpose: To remove the curly brackets denoting enumerated type.
  *
  */
  public String removeCurlyBrackets( String text ){
    return text.replace( "{", "" ).replace( "}", "" ).trim();
  }


  /*************************************************************************
  *
  *  Purpose: To determine if there is a need to specialize types of the
  *           current class being processed.
  *
  */  
  public Boolean isSpecializeEmpty( String name ) {
  
    Map <String, String> specialize = (Map <String, String>) objectInformation.get(SPECIALIZE);
  
    if ( specialize.keySet().size() > 0 ) {
      return false;
    } else {
      return true;
    }
  }

  /*************************************************************************
  *
  *  Purpose: To remove the array symbols from the current type being
  *           processed.
  *
  */
  public String cleanArraySymbol( String text ) {
    return text.replace("[", "").replace("]", "").trim();
  }

  /*************************************************************************
  *
  *  Purpose: To specialize a particular type, by remapping to a new name.
  *
  */
  public String specializeTheType( String type , Map <String, String> specialize ) {
    
    String specializeFrom = cleanArraySymbol( type );
    String specializeTo = specialize.get( specializeFrom );
    return type.replace( specializeFrom, specializeTo );

  }

  /*************************************************************************
  *
  *  Purpose: To write out the class' methods.
  *
  */
  public void writeMethods( String name, String filename, Map <String, String> specialize ) throws Exception {

    if ( castToString(objectInformation.get(TYPE)).contains(RECORD) ) {

      // Since the class is recursive, this is in case of the need to extract the fields 
      // of an extended class/interface.
      fields = (Map <String, String>) objects.get(name).get(FIELDS);  

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + filename + ".java", true );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for(String field: fields.keySet()) {
        for( String element : getFieldElements( fields.get(field) ) ) {


          // Writing the Set methods
          if( config_override.get(name) != null ) {
            if( castToString(config_override.get(name)).equals(INTERFACE) && name.equals(filename) ) {
            
            bufferedWriter.newLine();
            bufferedWriter.write( " public void set" + field.trim()  + "( " + reMapPrimitiveType( element ) + " value " + ");"  );
            bufferedWriter.newLine();
            
            } else {
              
              bufferedWriter.newLine();
              
              if( specialize != null ) {
                if( specialize.containsKey( cleanArraySymbol( reMapPrimitiveType( element )) ) ) {

                  bufferedWriter.write( " public void set" + field.trim()  + "( " + specializeTheType( reMapPrimitiveType( element ), specialize ) + " value " + ") {"  );

                } else {

                  bufferedWriter.write( " public void set" + field.trim()  + "( " + reMapPrimitiveType( element ) + " value " + ") {"  );

                }
              } else {

                bufferedWriter.write( " public void set" + field.trim()  + "( " + reMapPrimitiveType( element ) + " value " + ") {"  );

              }
              
              bufferedWriter.newLine();
              bufferedWriter.write( "   " + reMapFields( field.trim() )  + " = " + "value;"  );
              bufferedWriter.newLine();
              bufferedWriter.write( " }");
              bufferedWriter.newLine();

            } 
          } else {
              
              bufferedWriter.newLine();
              
              if( specialize != null ) {
                if( specialize.containsKey( cleanArraySymbol( reMapPrimitiveType( element )) ) ) {
              
                  bufferedWriter.write( " public void set" + field.trim()  + "( " + specializeTheType( reMapPrimitiveType( element ), specialize ) + " value " + ") {"  );
              
                } else {
              
                  bufferedWriter.write( " public void set" + field.trim()  + "( " + reMapPrimitiveType( element ) + " value " + ") {"  );
              
                }
              } else {
              
                bufferedWriter.write( " public void set" + field.trim()  + "( " + reMapPrimitiveType( element ) + " value " + ") {"  );
              
              }
              
              bufferedWriter.newLine();
              bufferedWriter.write( "   " + reMapFields( field.trim() )  + " = " + "value;"  );
              bufferedWriter.newLine();
              bufferedWriter.write( " }");
              bufferedWriter.newLine();

          }
        }


        // Writing the Get methods
        if( config_override.get(name) != null ) {
          if( castToString(config_override.get(name)).equals(INTERFACE) && name.equals(filename) ) {

            bufferedWriter.newLine();
            bufferedWriter.write( " public " + variableTypes.get( field.trim() ) + " get" + field.trim() + "();"  );
            bufferedWriter.newLine();

          } else {

            bufferedWriter.newLine();
            bufferedWriter.write( " public " + variableTypes.get( field.trim() ) + " get" + field.trim() + "() {"  );
            bufferedWriter.newLine();
            bufferedWriter.write( "   return " + reMapFields( field.trim() )  + ";"  );
            bufferedWriter.newLine();
            bufferedWriter.write( " }");
            bufferedWriter.newLine();

          } 
        } else {

          bufferedWriter.newLine();
          bufferedWriter.write( " public " + variableTypes.get( field.trim() ) + " get" + field.trim() + "() {"  );
          bufferedWriter.newLine();
          bufferedWriter.write( "   return " + reMapFields( field.trim() )  + ";"  );
          bufferedWriter.newLine();
          bufferedWriter.write( " }");
          bufferedWriter.newLine();

        }

      }

      bufferedWriter.close();
    
    }
  }

  /*************************************************************************
  *
  *  Purpose: To close the current class.
  *
  */
  public void closeClass( String name ) throws Exception {
    
    if ( castToString(objectInformation.get(TYPE)).contains(RECORD) ) {

      FileWriter fileWriter = new FileWriter( SDK_DIRECTORY + name + ".java", true );

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
      bufferedWriter.newLine();
      
      bufferedWriter.write( "}" );
      bufferedWriter.close();

    }
    
  }

  /*************************************************************************
  *
  *  Purpose: To retrieve the namespace value for a specific variable.
  *
  */
  public String getNamespaceFor( String element ) {
    if ( config_namespace.get( element ) != null ) {
      return config_namespace.get( element );
    } else {
      return new String("");
    }
  }

}