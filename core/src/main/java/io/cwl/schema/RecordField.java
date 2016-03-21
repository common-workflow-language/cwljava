
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class RecordField {

 String name = null;
 String doc = null;
 Object type = null;

  public RecordField() { super(); }

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