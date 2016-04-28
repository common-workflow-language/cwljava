

/*************************************************************************
*
*  Authors:
* 
*          * Paul Grosu <pgrosu@gmail.com>, Northeastern University
* 
*  Purpose: 
* 
*          To parse Yaml file with YAMLParser and to generate a Java SDK.
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

public class CreateCWLJavaSDK {

  public static void main(String[] args) {

  // *************** Initialize the required variables ***************

    YAMLParser yamlParser; 
    CWLSDKBuilder sdkBuilder;

    Map <String, Map> objects = new HashMap<String, Map>();
    Map <String, Object> objectInformation = new HashMap<String, Object>();

    /*************************************************************************
    *
    *  To determine if there no YAML files provided for processing.
    *
    */
    try {
      if( args[0].trim().length() == 0 ) {
        print( "" );
        print( "Please run the program by including Yaml files as arguments." );
          System.exit(0);
      }
    } catch (Exception e) {
      print( "" );
      print( "Please run the program by including Yaml files as arguments." );
        System.exit(0);
    }

    /*************************************************************************
    *
    *  Parse the YAML files and collect the relevant information for 
    *  subsequent SDK creation.
    *
    */
    try {
    
      yamlParser = new YAMLParser(args);

      print("");  
      print("Processing YAML file(s): " );  
      print("");  

      for( String yamlFileName : args ) {
        print( yamlFileName );
      }

      print("");

      while( !yamlParser.reachedEOF ) {
    
        yamlParser.processNextObjectType();
        if ( yamlParser.reachedEOF ) {
          break;
        } else {

          yamlParser.getObjectName();
          yamlParser.getObjectType();
          yamlParser.getObjectDocumentation();
          yamlParser.getObjectAbstract();
          yamlParser.getObjectInheritance();
          yamlParser.getObjectRenamedFields();
          yamlParser.getObjectFields(); 
          yamlParser.getObjectSymbols();

          if( yamlParser.objectName.trim().length() > 0 ) {

            objectInformation = new HashMap<String, Object>();
            
            objectInformation.put( "name", yamlParser.objectName );
            objectInformation.put( "type", yamlParser.objectType );
            objectInformation.put( "documentation", yamlParser.objectDocumentation );
            objectInformation.put( "abstract", yamlParser.objectAbstract );
            objectInformation.put( "extends", yamlParser.objectExtends );
            objectInformation.put( "specialize", yamlParser.objectRenamedFields );
            objectInformation.put( "symbols", yamlParser.objectSymbolsList );
            objectInformation.put( "fields", yamlParser.objectFields );
            objectInformation.put( "fieldsDocumentation", yamlParser.objectFieldsDocumentation );

            objects.put( yamlParser.objectName, objectInformation );

            yamlParser.print( "Name: " + yamlParser.objectName );
            yamlParser.print( "Type: " + yamlParser.objectType );
            yamlParser.print( "Documentation: " + yamlParser.objectDocumentation );
            yamlParser.print( "Abstract: " + yamlParser.objectAbstract );
            yamlParser.print( "Inheritance: " + yamlParser.objectExtends );
            print( "Rename fields From/To: " );
              yamlParser.printObjectRenamedFields( yamlParser.objectRenamedFields );
            print( "Symbols: " );
              yamlParser.printObjectSymbols( yamlParser.objectSymbolsList );
            print( "Fields: " );
              yamlParser.printObjectFields( yamlParser.objectFields );
            print( "Fields Documentation: " );
              yamlParser.printObjectFieldsDocumentation( yamlParser.objectFieldsDocumentation );
            print("--------------------------");  
          }
        }
      }

      print("");  
      print("Fix fields to first extension if they abstract..." );  
      print("");  

      /*************************************************************************
      *
      *  Purpose: Update the types in fields which are abstract.  
      *           Sometimes fields will point to types which are abstract, and
      *           the updateAbstractFields method will travel the dependency 
      *           path to the first concrete class implemenation and replace 
      *           the type with that of concrete class.
      *
      */
      objects = yamlParser.updateAbstractFields( objects );

      print("");  
      print("Finished processing YAML file(s)!" );  
      print("");  

      
      /*************************************************************************
      *
      *  Build the SDK.
      *
      */
      sdkBuilder = new CWLSDKBuilder( objects );
      sdkBuilder.generateSDK();

    } catch( Exception e ) { System.out.println("parser: " + e);  }

  }

  /*************************************************************************
  *
  *  Purpose: An alias method to print a String.
  *
  */
  public static void print( String text ) {
    System.out.println( text );
  }

}


