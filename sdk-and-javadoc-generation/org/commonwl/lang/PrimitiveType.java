
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
* Salad data types are based on Avro schema declarations.  Refer to the
* [Avro schema declaration documentation](https://avro.apache.org/docs/current/spec.html#schemas) for
* detailed information.
* The types are: 1) null: no value,
* 2) boolean: a binary value,
* 3) int: 32-bit signed integer,
* 4) long: 64-bit signed integer,
* 5) float: single precision (32-bit) IEEE 754 floating-point number,
* 6) double: double precision (64-bit) IEEE 754 floating-point number, and
* 7) string: Unicode character sequence.
*
*/
public class PrimitiveType extends Object {

  Object value;

  public PrimitiveType( Object objectInstance ) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a Boolean type.
  *
  */
  public void set(Boolean objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a Integer type.
  *
  */
  public void set(Integer objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a Long type.
  *
  */
  public void set(Long objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a Float type.
  *
  */
  public void set(Float objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a Double type.
  *
  */
  public void set(Double objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of PrimitiveType.
  *
  *  @param   objectInstance sets the value of PrimitiveType, and is a String type.
  *
  */
  public void set(String objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of PrimitiveType.
  *
  *  @return   This method will return the value of PrimitiveType, which is an Object type.
  *
  */
  public Object get() {
    return (Object) value;
  }

}

