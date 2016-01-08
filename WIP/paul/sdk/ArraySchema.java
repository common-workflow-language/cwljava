
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

public class ArraySchema {

 Object [] type = null;
 Object items = null;

  public ArraySchema() { super(); }

 public void settype( Object [] value ) {
   type = value;
 }

 public Object [] gettype() {
   return type;
 }

 public void setitems( PrimitiveType value ) {
   items = value;
 }

 public void setitems( RecordSchema value ) {
   items = value;
 }

 public void setitems( EnumSchema value ) {
   items = value;
 }

 public void setitems( ArraySchema value ) {
   items = value;
 }

 public void setitems( String value ) {
   items = value;
 }

 public void setitems( PrimitiveType [] value ) {
   items = value;
 }

 public void setitems( RecordSchema [] value ) {
   items = value;
 }

 public void setitems( EnumSchema [] value ) {
   items = value;
 }

 public void setitems( ArraySchema [] value ) {
   items = value;
 }

 public void setitems( String [] value ) {
   items = value;
 }

 public Object getitems() {
   return items;
 }

}