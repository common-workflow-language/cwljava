
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InputArraySchema extends InputSchema {

 InputBinding inputBinding = null;

 Object [] type = null;
 Object items = null;

  public InputArraySchema() { super(); }

 public void setinputBinding( InputBinding value ) {
   inputBinding = value;
 }

 public InputBinding getinputBinding() {
   return inputBinding;
 }

 public void settype( Object [] value ) {
   type = value;
 }

 public Object [] gettype() {
   return type;
 }

 public void setitems( PrimitiveType value ) {
   items = value;
 }

 public void setitems( InputRecordSchema value ) {
   items = value;
 }

 public void setitems( InputEnumSchema value ) {
   items = value;
 }

 public void setitems( InputArraySchema value ) {
   items = value;
 }

 public void setitems( String value ) {
   items = value;
 }

 public void setitems( PrimitiveType [] value ) {
   items = value;
 }

 public void setitems( InputRecordSchema [] value ) {
   items = value;
 }

 public void setitems( InputEnumSchema [] value ) {
   items = value;
 }

 public void setitems( InputArraySchema [] value ) {
   items = value;
 }

 public void setitems( String [] value ) {
   items = value;
 }

 public Object getitems() {
   return items;
 }

}