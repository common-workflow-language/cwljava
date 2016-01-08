
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

public class Documentation extends DocType implements NamedType {

 Object type = null;

 String name = null;

 String docParent = null;
 Object doc = null;
 String docAfter = null;
 Object docChild = null;

  public Documentation() { super(); }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setname( String value ) {
   name = value;
 }

 public String getname() {
   return name;
 }

 public void setdocParent( String value ) {
   docParent = value;
 }

 public String getdocParent() {
   return docParent;
 }

 public void setdoc( String value ) {
   doc = value;
 }

 public void setdoc( String [] value ) {
   doc = value;
 }

 public Object getdoc() {
   return doc;
 }

 public void setdocAfter( String value ) {
   docAfter = value;
 }

 public String getdocAfter() {
   return docAfter;
 }

 public void setdocChild( String value ) {
   docChild = value;
 }

 public void setdocChild( String [] value ) {
   docChild = value;
 }

 public Object getdocChild() {
   return docChild;
 }

}