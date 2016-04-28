
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

public class RecordSchema {

  /*****************************************************************************************************
  *
  *  Must be `record`
  */
  Object type = null;

  /*****************************************************************************************************
  *
  *  Defines the fields of the record.
  */
  RecordField [] fields = null;


  public RecordSchema() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a Object type.
  *
  */
  public void settype( Object value ) {
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
  *  This method sets the value of fields.
  *
  *  @param   value will update fields, which is a RecordField array.
  *
  */
  public void setfields( RecordField [] value ) {
    fields = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of fields.
  *
  *  @return   This method will return the value of fields, which is a RecordField array.
  *
  */
  public RecordField [] getfields() {
    return fields;
  }

}