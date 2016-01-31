
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

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