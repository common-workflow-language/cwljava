
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

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