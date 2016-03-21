
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class RecordSchema {

 Object type = null;
 RecordField [] fields = null;

  public RecordSchema() { super(); }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setfields( RecordField [] value ) {
   fields = value;
 }

 public RecordField [] getfields() {
   return fields;
 }

}