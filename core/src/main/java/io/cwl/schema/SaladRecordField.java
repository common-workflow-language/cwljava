
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

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