
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

public class SaladRecordField extends RecordField {

 Object jsonldPredicate = null;

 String name = null;
 String doc = null;
 Object type = null;

  public SaladRecordField() { super(); }

 public void setjsonldPredicate( String value ) {
   jsonldPredicate = value;
 }

 public void setjsonldPredicate( JsonldPredicate value ) {
   jsonldPredicate = value;
 }

 public Object getjsonldPredicate() {
   return jsonldPredicate;
 }

 public void setname( String value ) {
   name = value;
 }

 public String getname() {
   return name;
 }

 public void setdoc( String value ) {
   doc = value;
 }

 public String getdoc() {
   return doc;
 }

 public void settype( PrimitiveType value ) {
   type = value;
 }

 public void settype( RecordSchema value ) {
   type = value;
 }

 public void settype( EnumSchema value ) {
   type = value;
 }

 public void settype( ArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( PrimitiveType [] value ) {
   type = value;
 }

 public void settype( RecordSchema [] value ) {
   type = value;
 }

 public void settype( EnumSchema [] value ) {
   type = value;
 }

 public void settype( ArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

}