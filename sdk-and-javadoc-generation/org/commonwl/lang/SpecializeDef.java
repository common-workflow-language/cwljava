
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

public class SpecializeDef {

  /*****************************************************************************************************
  *
  *  The data type to be replaced
  */
  String specializeFrom = null;

  /*****************************************************************************************************
  *
  *  The new data type to replace with
  */
  String specializeTo = null;


  public SpecializeDef() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of specializeFrom.
  *
  *  @param   value will update specializeFrom, which is a String type.
  *
  */
  public void setspecializeFrom( String value ) {
    specializeFrom = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of specializeFrom.
  *
  *  @return   This method will return the value of specializeFrom, which is a String type.
  *
  */
  public String getspecializeFrom() {
    return specializeFrom;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of specializeTo.
  *
  *  @param   value will update specializeTo, which is a String type.
  *
  */
  public void setspecializeTo( String value ) {
    specializeTo = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of specializeTo.
  *
  *  @return   This method will return the value of specializeTo, which is a String type.
  *
  */
  public String getspecializeTo() {
    return specializeTo;
  }

}