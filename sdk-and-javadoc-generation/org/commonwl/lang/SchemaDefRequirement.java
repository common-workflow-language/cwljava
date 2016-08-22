
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

/*****************************************************************************************************
*
*  This field consists of an array of type definitions which must be used when interpreting the `inputs` and `outputs` fields.  When a `type` field contain a IRI, the implementation must check if the type is defined in `schemaDefs` and use that definition.  If the type is not found in `schemaDefs`, it is an error.  The entries in `schemaDefs` must be processed in the order listed such that later schema definitions may refer to earlier schema definitions.
*/
public class SchemaDefRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  The list of type definitions.
  */
  Object types = null;

  /*****************************************************************************************************
  *
  *  Always 'SchemaDefRequirement'
  */
  String class_value = null;


  public SchemaDefRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of types.
  *
  *  @param   value will update types, which is a InputEnumSchema array.
  *
  */
  public void settypes( InputEnumSchema [] value ) {
    types = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of types.
  *
  *  @param   value will update types, which is a InputArraySchema array.
  *
  */
  public void settypes( InputArraySchema [] value ) {
    types = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of types.
  *
  *  @param   value will update types, which is a InputRecordSchema array.
  *
  */
  public void settypes( InputRecordSchema [] value ) {
    types = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of types.
  *
  *  @return   This method will return the value of types, which is a Object type.
  *
  */
  public Object gettypes() {
    return types;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of class_value.
  *
  *  @param   value will update class_value, which is a String type.
  *
  */
  public void setclass( String value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a String type.
  *
  */
  public String getclass() {
    return class_value;
  }

}