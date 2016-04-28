
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
*   Define an environment variable that will be set in the runtime environment by the workflow platform when executing the command line tool.  May be the result of executing an expression, such as getting a parameter from input.
*/
public class EnvironmentDef {

  /*****************************************************************************************************
  *
  *  The environment variable name
  */
  String envName = null;

  /*****************************************************************************************************
  *
  *  The environment variable value
  */
  Object envValue = null;


  public EnvironmentDef() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of envName.
  *
  *  @param   value will update envName, which is a String type.
  *
  */
  public void setenvName( String value ) {
    envName = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of envName.
  *
  *  @return   This method will return the value of envName, which is a String type.
  *
  */
  public String getenvName() {
    return envName;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of envValue.
  *
  *  @param   value will update envValue, which is a String type.
  *
  */
  public void setenvValue( String value ) {
    envValue = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of envValue.
  *
  *  @param   value will update envValue, which is a Expression type.
  *
  */
  public void setenvValue( Expression value ) {
    envValue = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of envValue.
  *
  *  @return   This method will return the value of envValue, which is a Object type.
  *
  */
  public Object getenvValue() {
    return envValue;
  }

}