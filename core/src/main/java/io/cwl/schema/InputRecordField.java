
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InputRecordField extends RecordField {

 InputBinding inputBinding = null;

 String name = null;
 String doc = null;
 Object type = null;

  public InputRecordField() { super(); }

 public void setinputBinding( InputBinding value ) {
   inputBinding = value;
 }

 public InputBinding getinputBinding() {
   return inputBinding;
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

 public void settype( InputRecordSchema value ) {
   type = value;
 }

 public void settype( InputEnumSchema value ) {
   type = value;
 }

 public void settype( InputArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( PrimitiveType [] value ) {
   type = value;
 }

 public void settype( InputRecordSchema [] value ) {
   type = value;
 }

 public void settype( InputEnumSchema [] value ) {
   type = value;
 }

 public void settype( InputArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

}