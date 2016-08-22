
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
*  Indicates that a workflow component should be run in a [Docker](http://docker.com) container, and specifies how to fetch or build the image.
*/
public class DockerRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  Supply the contents of a Dockerfile which will be built using `docker build`.
  */
  String dockerFile = null;

  /*****************************************************************************************************
  *
  *  Specify a Docker image to retrieve using `docker pull`.
  */
  String dockerPull = null;

  /*****************************************************************************************************
  *
  *  Provide HTTP URL to download and gunzip a Docker images using `docker import.
  */
  String dockerImport = null;

  /*****************************************************************************************************
  *
  *  Set the designated output directory to a specific location inside the Docker container.
  */
  String dockerOutputDirectory = null;

  /*****************************************************************************************************
  *
  *  Specify a HTTP URL from which to download a Docker image using `docker load`.
  */
  String dockerLoad = null;

  /*****************************************************************************************************
  *
  *  The image id that will be used for `docker run`.  May be a human-readable image name or the image identifier hash.  May be skipped if `dockerPull` is specified, in which case the `dockerPull` image id must be used.
  */
  String dockerImageId = null;

  /*****************************************************************************************************
  *
  *  Always 'DockerRequirement'
  */
  String class_value = null;


  public DockerRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerFile.
  *
  *  @param   value will update dockerFile, which is a String type.
  *
  */
  public void setdockerFile( String value ) {
    dockerFile = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerFile.
  *
  *  @return   This method will return the value of dockerFile, which is a String type.
  *
  */
  public String getdockerFile() {
    return dockerFile;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerPull.
  *
  *  @param   value will update dockerPull, which is a String type.
  *
  */
  public void setdockerPull( String value ) {
    dockerPull = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerPull.
  *
  *  @return   This method will return the value of dockerPull, which is a String type.
  *
  */
  public String getdockerPull() {
    return dockerPull;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerImport.
  *
  *  @param   value will update dockerImport, which is a String type.
  *
  */
  public void setdockerImport( String value ) {
    dockerImport = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerImport.
  *
  *  @return   This method will return the value of dockerImport, which is a String type.
  *
  */
  public String getdockerImport() {
    return dockerImport;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerOutputDirectory.
  *
  *  @param   value will update dockerOutputDirectory, which is a String type.
  *
  */
  public void setdockerOutputDirectory( String value ) {
    dockerOutputDirectory = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerOutputDirectory.
  *
  *  @return   This method will return the value of dockerOutputDirectory, which is a String type.
  *
  */
  public String getdockerOutputDirectory() {
    return dockerOutputDirectory;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerLoad.
  *
  *  @param   value will update dockerLoad, which is a String type.
  *
  */
  public void setdockerLoad( String value ) {
    dockerLoad = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerLoad.
  *
  *  @return   This method will return the value of dockerLoad, which is a String type.
  *
  */
  public String getdockerLoad() {
    return dockerLoad;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of dockerImageId.
  *
  *  @param   value will update dockerImageId, which is a String type.
  *
  */
  public void setdockerImageId( String value ) {
    dockerImageId = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of dockerImageId.
  *
  *  @return   This method will return the value of dockerImageId, which is a String type.
  *
  */
  public String getdockerImageId() {
    return dockerImageId;
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