
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

public class SchemaDefinedType extends DocType {

 Boolean documentRoot = null;
 Object jsonldPredicate = null;

 String docParent = null;
 Object doc = null;
 String docAfter = null;
 Object docChild = null;

  public SchemaDefinedType() { super(); }

 public void setdocumentRoot( Boolean value ) {
   documentRoot = value;
 }

 public Boolean getdocumentRoot() {
   return documentRoot;
 }

 public void setjsonldPredicate( String value ) {
   jsonldPredicate = value;
 }

 public void setjsonldPredicate( JsonldPredicate value ) {
   jsonldPredicate = value;
 }

 public Object getjsonldPredicate() {
   return jsonldPredicate;
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