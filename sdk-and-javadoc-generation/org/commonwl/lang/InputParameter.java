
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

package org.commonwl.lang;

public class InputParameter implements Parameter {

  /*****************************************************************************************************
  *
  *  The default value for this parameter if not provided in the input object.
  */
  Any default_value = null;

  /*****************************************************************************************************
  *
  *  The unique identifier for this parameter object.
  */
  String id = null;

  /*****************************************************************************************************
  *
  *  Describes how to handle the inputs of a process and convert them into a concrete form for execution, such as command line parameters.
  */
  CommandLineBinding inputBinding = null;

  /*****************************************************************************************************
  *
  *  Specify valid types of data that may be assigned to this parameter.
  */
  Object type = null;


  /*****************************************************************************************************
  *
  *  Only valid when `type: File` or is an array of `items: File`. A value of `true` indicates that the file is read or written sequentially without seeking.  An implementation may use this flag to indicate whether it is valid to stream file contents using a named pipe.  Default: `false`.
  */
  Boolean streamable = null;

  /*****************************************************************************************************
  *
  *  Only valid when `type: File` or is an array of `items: File`. For input parameters, this must be one or more IRIs of concept nodes that represents file formats which are allowed as input to this parameter, preferrably defined within an ontology.  If no ontology is available, file formats may be tested by exact match. For output parameters, this is the file format that will be assigned to the output parameter.
  */
  Object format = null;

  /*****************************************************************************************************
  *
  *  A documentation string for this type, or an array of strings which should be concatenated.
  */
  Object doc = null;

  /*****************************************************************************************************
  *
  *  Only valid when `type: File` or is an array of `items: File`. Describes files that must be included alongside the primary file(s). If the value is an expression, the value of `self` in the expression must be the primary input or output File to which this binding applies. If the value is a string, it specifies that the following pattern should be applied to the primary file: 1. If string begins with one or more caret `^` characters, for each caret, remove the last file extension from the path (the last period `.` and all following characters).  If there are no file extensions, the path is unchanged. 2. Append the remainder of the string to the end of the file path.
  */
  Object secondaryFiles = null;


  /*****************************************************************************************************
  *
  *  A short, human-readable label of this object.
  */
  String label = null;


  public InputParameter() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of default_value.
  *
  *  @param   value will update default_value, which is a Any type.
  *
  */
  public void setdefault( Any value ) {
    default_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of default_value.
  *
  *  @return   This method will return the value of default_value, which is a Any type.
  *
  */
  public Any getdefault() {
    return default_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of id.
  *
  *  @param   value will update id, which is a String type.
  *
  */
  public void setid( String value ) {
    id = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of id.
  *
  *  @return   This method will return the value of id, which is a String type.
  *
  */
  public String getid() {
    return id;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of inputBinding.
  *
  *  @param   value will update inputBinding, which is a CommandLineBinding type.
  *
  */
  public void setinputBinding( CommandLineBinding value ) {
    inputBinding = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of inputBinding.
  *
  *  @return   This method will return the value of inputBinding, which is a CommandLineBinding type.
  *
  */
  public CommandLineBinding getinputBinding() {
    return inputBinding;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputEnumSchema array.
  *
  */
  public void settype( InputEnumSchema [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputEnumSchema type.
  *
  */
  public void settype( InputEnumSchema value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a String array.
  *
  */
  public void settype( String [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputRecordSchema array.
  *
  */
  public void settype( InputRecordSchema [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputRecordSchema type.
  *
  */
  public void settype( InputRecordSchema value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a CWLType array.
  *
  */
  public void settype( CWLType [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a CWLType type.
  *
  */
  public void settype( CWLType value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a String type.
  *
  */
  public void settype( String value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputArraySchema type.
  *
  */
  public void settype( InputArraySchema value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a InputArraySchema array.
  *
  */
  public void settype( InputArraySchema [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of type.
  *
  *  @return   This method will return the value of type, which is a Object type.
  *
  */
  public Object gettype() {
    return type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of streamable.
  *
  *  @param   value will update streamable, which is a Boolean type.
  *
  */
  public void setstreamable( Boolean value ) {
    streamable = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of streamable.
  *
  *  @return   This method will return the value of streamable, which is a Boolean type.
  *
  */
  public Boolean getstreamable() {
    return streamable;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of format.
  *
  *  @param   value will update format, which is a Expression array.
  *
  */
  public void setformat( Expression [] value ) {
    format = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of format.
  *
  *  @param   value will update format, which is a String type.
  *
  */
  public void setformat( String value ) {
    format = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of format.
  *
  *  @param   value will update format, which is a String array.
  *
  */
  public void setformat( String [] value ) {
    format = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of format.
  *
  *  @return   This method will return the value of format, which is a Object type.
  *
  */
  public Object getformat() {
    return format;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String type.
  *
  */
  public void setdoc( String value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String array.
  *
  */
  public void setdoc( String [] value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a Object type.
  *
  */
  public Object getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of secondaryFiles.
  *
  *  @param   value will update secondaryFiles, which is a Expression array.
  *
  */
  public void setsecondaryFiles( Expression [] value ) {
    secondaryFiles = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of secondaryFiles.
  *
  *  @param   value will update secondaryFiles, which is a String type.
  *
  */
  public void setsecondaryFiles( String value ) {
    secondaryFiles = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of secondaryFiles.
  *
  *  @param   value will update secondaryFiles, which is a String array.
  *
  */
  public void setsecondaryFiles( String [] value ) {
    secondaryFiles = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of secondaryFiles.
  *
  *  @param   value will update secondaryFiles, which is a Expression type.
  *
  */
  public void setsecondaryFiles( Expression value ) {
    secondaryFiles = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of secondaryFiles.
  *
  *  @return   This method will return the value of secondaryFiles, which is a Object type.
  *
  */
  public Object getsecondaryFiles() {
    return secondaryFiles;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of label.
  *
  *  @param   value will update label, which is a String type.
  *
  */
  public void setlabel( String value ) {
    label = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of label.
  *
  *  @return   This method will return the value of label, which is a String type.
  *
  */
  public String getlabel() {
    return label;
  }

}