
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
*   Define an enumerated type.
*/
public class EnumSchema {

  /*****************************************************************************************************
  *
  *  Must be `enum`
  */
  Enum type = null;

  /*****************************************************************************************************
  *
  *  Defines the set of valid symbols.
  */
  String [] symbols = null;


  public EnumSchema() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a Enum type.
  *
  */
  public void settype( Enum value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of type.
  *
  *  @return   This method will return the value of type, which is a Enum type.
  *
  */
  public Enum gettype() {
    return type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of symbols.
  *
  *  @param   value will update symbols, which is a String array.
  *
  */
  public void setsymbols( String [] value ) {
    symbols = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of symbols.
  *
  *  @return   This method will return the value of symbols, which is a String array.
  *
  */
  public String [] getsymbols() {
    return symbols;
  }

}