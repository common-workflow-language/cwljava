
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

public class CommandOutputBinding extends Binding {

 Object outputEval = null;
 Object glob = null;

 Boolean loadContents = null;
 Object secondaryFiles = null;

  public CommandOutputBinding() { super(); }

 public void setoutputEval( String value ) {
   outputEval = value;
 }

 public void setoutputEval( Expression value ) {
   outputEval = value;
 }

 public Object getoutputEval() {
   return outputEval;
 }

 public void setglob( String value ) {
   glob = value;
 }

 public void setglob( Expression value ) {
   glob = value;
 }

 public void setglob( String [] value ) {
   glob = value;
 }

 public Object getglob() {
   return glob;
 }

 public void setloadContents( Boolean value ) {
   loadContents = value;
 }

 public Boolean getloadContents() {
   return loadContents;
 }

 public void setsecondaryFiles( String value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( Expression value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( String [] value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( Expression [] value ) {
   secondaryFiles = value;
 }

 public Object getsecondaryFiles() {
   return secondaryFiles;
 }

}