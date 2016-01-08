
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

public class File {

 String path = null;
 Long size = null;
 String checksum = null;
 String format = null;
 File [] secondaryFiles = null;
 File class_value = null;

  public File() { super(); }

 public void setpath( String value ) {
   path = value;
 }

 public String getpath() {
   return path;
 }

 public void setsize( Long value ) {
   size = value;
 }

 public Long getsize() {
   return size;
 }

 public void setchecksum( String value ) {
   checksum = value;
 }

 public String getchecksum() {
   return checksum;
 }

 public void setformat( String value ) {
   format = value;
 }

 public String getformat() {
   return format;
 }

 public void setsecondaryFiles( File [] value ) {
   secondaryFiles = value;
 }

 public File [] getsecondaryFiles() {
   return secondaryFiles;
 }

 public void setclass( File value ) {
   class_value = value;
 }

 public File getclass() {
   return class_value;
 }

}