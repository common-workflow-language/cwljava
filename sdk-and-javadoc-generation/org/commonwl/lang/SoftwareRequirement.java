
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
*  A list of software packages that should be configured in the environment of the defined process.
*/
public class SoftwareRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  The list of software to be configured.
  */
  SoftwarePackage packages = null;

  /*****************************************************************************************************
  *
  *  Always 'SoftwareRequirement'
  */
  String class_value = null;


  public SoftwareRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of packages.
  *
  *  @param   value will update packages, which is a SoftwarePackage type.
  *
  */
  public void setpackages( SoftwarePackage value ) {
    packages = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of packages.
  *
  *  @return   This method will return the value of packages, which is a SoftwarePackage type.
  *
  */
  public SoftwarePackage getpackages() {
    return packages;
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