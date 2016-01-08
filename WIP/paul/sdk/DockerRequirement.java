
/*****************************************************************************************************
*
*  Authors:
*          
*          CWL Java SDK:
*          
*            * Paul Grosu <pgrosu@gmail.com>, Northeastern University
*          
*          Alternate SDK (via Avro): 
*          
*            * Denis Yuen <denis.yuen@gmail.com>
*          
*          CWL Draft:
*          
*            * Peter Amstutz <peter.amstutz@curoverse.com>, Curoverse
*            * Nebojsa Tijanic <nebojsa.tijanic@sbgenomics.com>, Seven Bridges Genomics
*          
*            Contributors:
*          
*            * Luka Stojanovic <luka.stojanovic@sbgenomics.com>, Seven Bridges Genomics
*            * John Chilton <jmchilton@gmail.com>, Galaxy Project, Pennsylvania State University
*            * Michael R. Crusoe <crusoe@ucdavis.edu>, University of California, Davis
*            * Herve Menager <herve.menager@gmail.com>, Institut Pasteur
*            * Maxim Mikheev <mikhmv@biodatomics.com>, BioDatomics
*            * Stian Soiland-Reyes <soiland-reyes@cs.manchester.ac.uk>, University of Manchester
*
*****************************************************************************************************/

public class DockerRequirement extends ProcessRequirement {

 String dockerFile = null;
 String dockerPull = null;
 String dockerImport = null;
 String dockerOutputDirectory = null;
 String dockerLoad = null;
 String dockerImageId = null;

 String class_value = null;

  public DockerRequirement() { super(); }

 public void setdockerFile( String value ) {
   dockerFile = value;
 }

 public String getdockerFile() {
   return dockerFile;
 }

 public void setdockerPull( String value ) {
   dockerPull = value;
 }

 public String getdockerPull() {
   return dockerPull;
 }

 public void setdockerImport( String value ) {
   dockerImport = value;
 }

 public String getdockerImport() {
   return dockerImport;
 }

 public void setdockerOutputDirectory( String value ) {
   dockerOutputDirectory = value;
 }

 public String getdockerOutputDirectory() {
   return dockerOutputDirectory;
 }

 public void setdockerLoad( String value ) {
   dockerLoad = value;
 }

 public String getdockerLoad() {
   return dockerLoad;
 }

 public void setdockerImageId( String value ) {
   dockerImageId = value;
 }

 public String getdockerImageId() {
   return dockerImageId;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}