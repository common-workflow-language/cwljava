
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
* The Any type validates for any non-null value.
*
*/
public class Any extends Object {

  /*****************************************************************************************************
  *
  * This is the value of Any.
  *
  */
  Object value;

  public Any( Object objectInstance ) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of Any.
  *
  *  @param   objectInstance sets the value of Any, and is a Object type.
  *
  */
  public void set(Object objectInstance) {
    value = objectInstance;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of Any.
  *
  *  @return   This method will return the value of Any, which is an Any type.
  *
  */
  public Object get() {
    return (Object) value;
  }

}

