
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

public class FileDef {

 Object filename = null;
 Object fileContent = null;

  public FileDef() { super(); }

 public void setfilename( String value ) {
   filename = value;
 }

 public void setfilename( Expression value ) {
   filename = value;
 }

 public Object getfilename() {
   return filename;
 }

 public void setfileContent( String value ) {
   fileContent = value;
 }

 public void setfileContent( Expression value ) {
   fileContent = value;
 }

 public Object getfileContent() {
   return fileContent;
 }

}