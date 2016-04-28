
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

public class OutputRecordField extends RecordField {

  CommandOutputBinding outputBinding = null;


  /*****************************************************************************************************
  *
  *   The name of the field 
  */
  String name = null;

  /*****************************************************************************************************
  *
  *   A documentation string for this field
  */
  String doc = null;

  /*****************************************************************************************************
  *
  *   The field type  
  */
  Object type = null;


  public OutputRecordField() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of outputBinding.
  *
  *  @param   value will update outputBinding, which is a CommandOutputBinding type.
  *
  */
  public void setoutputBinding( CommandOutputBinding value ) {
    outputBinding = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outputBinding.
  *
  *  @return   This method will return the value of outputBinding, which is a CommandOutputBinding type.
  *
  */
  public CommandOutputBinding getoutputBinding() {
    return outputBinding;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of name.
  *
  *  @param   value will update name, which is a String type.
  *
  */
  public void setname( String value ) {
    name = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of name.
  *
  *  @return   This method will return the value of name, which is a String type.
  *
  */
  public String getname() {
    return name;
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
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a String type.
  *
  */
  public String getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a RecordSchema type.
  *
  */
  public void settype( OutputRecordSchema value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a EnumSchema type.
  *
  */
  public void settype( OutputEnumSchema value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a ArraySchema type.
  *
  */
  public void settype( OutputArraySchema value ) {
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
  *  @param   value will update type, which is a PrimitiveType array.
  *
  */
  public void settype( PrimitiveType [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a RecordSchema array.
  *
  */
  public void settype( OutputRecordSchema [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a PrimitiveType type.
  *
  */
  public void settype( PrimitiveType value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a ArraySchema array.
  *
  */
  public void settype( OutputArraySchema [] value ) {
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
  *  @param   value will update type, which is a EnumSchema array.
  *
  */
  public void settype( OutputEnumSchema [] value ) {
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

}