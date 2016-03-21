
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class OutputRecordField extends RecordField {

 OutputBinding outputBinding = null;

 String name = null;
 String doc = null;
 Object type = null;

  public OutputRecordField() { super(); }

 public void setoutputBinding( OutputBinding value ) {
   outputBinding = value;
 }

 public OutputBinding getoutputBinding() {
   return outputBinding;
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

 public void settype( PrimitiveType [] value ) {
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