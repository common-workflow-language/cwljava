
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

public class ArraySchema {

  /*****************************************************************************************************
  *
  *  Must be `array`
  */
  Object [] type = null;

  /*****************************************************************************************************
  *
  *  Defines the type of the array elements.
  */
  Object items = null;


  public ArraySchema() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a Object array.
  *
  */
  public void settype( Object [] value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of type.
  *
  *  @return   This method will return the value of type, which is a Object array.
  *
  */
  public Object [] gettype() {
    return type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a RecordSchema type.
  *
  */
  public void setitems( RecordSchema value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a EnumSchema type.
  *
  */
  public void setitems( EnumSchema value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a ArraySchema type.
  *
  */
  public void setitems( ArraySchema value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a String array.
  *
  */
  public void setitems( String [] value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a PrimitiveType array.
  *
  */
  public void setitems( PrimitiveType [] value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a RecordSchema array.
  *
  */
  public void setitems( RecordSchema [] value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a PrimitiveType type.
  *
  */
  public void setitems( PrimitiveType value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a ArraySchema array.
  *
  */
  public void setitems( ArraySchema [] value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a String type.
  *
  */
  public void setitems( String value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of items.
  *
  *  @param   value will update items, which is a EnumSchema array.
  *
  */
  public void setitems( EnumSchema [] value ) {
    items = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of items.
  *
  *  @return   This method will return the value of items, which is a Object type.
  *
  */
  public Object getitems() {
    return items;
  }

}