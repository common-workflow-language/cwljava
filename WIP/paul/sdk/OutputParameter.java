
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

public class OutputParameter extends Parameter {

 Binding outputBinding = null;
 String id = null;

 Any default_value = null;
 Boolean streamable = null;
 Object format = null;
 String description = null;
 String label = null;
 Object type = null;

  public OutputParameter() { super(); }

 public void setoutputBinding( Binding value ) {
   outputBinding = value;
 }

 public Binding getoutputBinding() {
   return outputBinding;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

 public void setdefault( Any value ) {
   default_value = value;
 }

 public Any getdefault() {
   return default_value;
 }

 public void setstreamable( Boolean value ) {
   streamable = value;
 }

 public Boolean getstreamable() {
   return streamable;
 }

 public void setformat( String value ) {
   format = value;
 }

 public void setformat( String [] value ) {
   format = value;
 }

 public void setformat( Expression [] value ) {
   format = value;
 }

 public Object getformat() {
   return format;
 }

 public void setdescription( String value ) {
   description = value;
 }

 public String getdescription() {
   return description;
 }

 public void setlabel( String value ) {
   label = value;
 }

 public String getlabel() {
   return label;
 }

 public void settype( CWLType value ) {
   type = value;
 }

 public void settype( OutputRecordSchema value ) {
   type = value;
 }

 public void settype( OutputEnumSchema value ) {
   type = value;
 }

 public void settype( OutputArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( CWLType [] value ) {
   type = value;
 }

 public void settype( OutputRecordSchema [] value ) {
   type = value;
 }

 public void settype( OutputEnumSchema [] value ) {
   type = value;
 }

 public void settype( OutputArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

}