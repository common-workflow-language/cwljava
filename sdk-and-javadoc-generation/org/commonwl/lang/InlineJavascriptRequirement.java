
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
*  Indicates that the workflow platform must support inline Javascript expressions. If this requirement is not present, the workflow platform must not perform expression interpolatation.
*/
public class InlineJavascriptRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  Additional code fragments that will also be inserted before executing the expression code.  Allows for function definitions that may be called from CWL expressions.
  */
  String expressionLib = null;

  /*****************************************************************************************************
  *
  *  Always 'InlineJavascriptRequirement'
  */
  String class_value = null;


  public InlineJavascriptRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of expressionLib.
  *
  *  @param   value will update expressionLib, which is a String type.
  *
  */
  public void setexpressionLib( String value ) {
    expressionLib = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of expressionLib.
  *
  *  @return   This method will return the value of expressionLib, which is a String type.
  *
  */
  public String getexpressionLib() {
    return expressionLib;
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