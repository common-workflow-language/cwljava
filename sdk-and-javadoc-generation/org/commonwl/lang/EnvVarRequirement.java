
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
*  Define a list of environment variables which will be set in the execution environment of the tool.  See `EnvironmentDef` for details.
*/
public class EnvVarRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  The list of environment variables.
  */
  EnvironmentDef envDef = null;

  /*****************************************************************************************************
  *
  *  Always 'EnvVarRequirement'
  */
  String class_value = null;


  public EnvVarRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of envDef.
  *
  *  @param   value will update envDef, which is a EnvironmentDef type.
  *
  */
  public void setenvDef( EnvironmentDef value ) {
    envDef = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of envDef.
  *
  *  @return   This method will return the value of envDef, which is a EnvironmentDef type.
  *
  */
  public EnvironmentDef getenvDef() {
    return envDef;
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