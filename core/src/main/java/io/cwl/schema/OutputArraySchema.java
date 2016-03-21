
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class OutputArraySchema extends OutputSchema {

 OutputBinding outputBinding = null;

 Object [] type = null;
 Object items = null;

  public OutputArraySchema() { super(); }

 public void setoutputBinding( OutputBinding value ) {
   outputBinding = value;
 }

 public OutputBinding getoutputBinding() {
   return outputBinding;
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

 public void setitems( OutputRecordSchema value ) {
   items = value;
 }

 public void setitems( OutputEnumSchema value ) {
   items = value;
 }

 public void setitems( OutputArraySchema value ) {
   items = value;
 }

 public void setitems( String value ) {
   items = value;
 }

 public void setitems( PrimitiveType [] value ) {
   items = value;
 }

 public void setitems( OutputRecordSchema [] value ) {
   items = value;
 }

 public void setitems( OutputEnumSchema [] value ) {
   items = value;
 }

 public void setitems( OutputArraySchema [] value ) {
   items = value;
 }

 public void setitems( String [] value ) {
   items = value;
 }

 public Object getitems() {
   return items;
 }

}