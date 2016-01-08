
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

public class SchemaDefRequirement extends ProcessRequirement {

 Object types = null;

 String class_value = null;

  public SchemaDefRequirement() { super(); }

 public void settypes( InputRecordSchema [] value ) {
   types = value;
 }

 public void settypes( InputEnumSchema [] value ) {
   types = value;
 }

 public void settypes( InputArraySchema [] value ) {
   types = value;
 }

 public void settypes( CommandInputRecordSchema [] value ) {
   types = value;
 }

 public void settypes( CommandInputEnumSchema [] value ) {
   types = value;
 }

 public void settypes( CommandInputArraySchema [] value ) {
   types = value;
 }

 public Object gettypes() {
   return types;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}