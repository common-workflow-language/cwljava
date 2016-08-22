
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

public class SoftwarePackage {

  /*****************************************************************************************************
  *
  *  Must be one or more IRIs identifying resources for installing or enabling the software.  Implementations may provide resolvers which map well-known software spec IRIs to some configuration action. For example, an IRI `https://packages.debian.org/jessie/bowtie` could be resolved with `apt-get install bowtie`.  An IRI `https://anaconda.org/bioconda/bowtie` could be resolved with `conda install -c bioconda bowtie`. Tools may also provide IRIs to index entries such as [RRID](http://www.identifiers.org/rrid/), such as `http://identifiers.org/rrid/RRID:SCR_005476`
  */
  String specs = null;

  /*****************************************************************************************************
  *
  *  The common name of the software to be configured.
  */
  String package_value = null;

  /*****************************************************************************************************
  *
  *  The (optional) version of the software to configured.
  */
  String version = null;


  public SoftwarePackage() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of specs.
  *
  *  @param   value will update specs, which is a String type.
  *
  */
  public void setspecs( String value ) {
    specs = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of specs.
  *
  *  @return   This method will return the value of specs, which is a String type.
  *
  */
  public String getspecs() {
    return specs;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of package_value.
  *
  *  @param   value will update package_value, which is a String type.
  *
  */
  public void setpackage( String value ) {
    package_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of package_value.
  *
  *  @return   This method will return the value of package_value, which is a String type.
  *
  */
  public String getpackage() {
    return package_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of version.
  *
  *  @param   value will update version, which is a String type.
  *
  */
  public void setversion( String value ) {
    version = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of version.
  *
  *  @return   This method will return the value of version, which is a String type.
  *
  */
  public String getversion() {
    return version;
  }

}