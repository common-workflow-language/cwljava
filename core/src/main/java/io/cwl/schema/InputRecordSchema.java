
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InputRecordSchema extends InputSchema {

 Object type = null;
 InputRecordField [] fields = null;

  public InputRecordSchema() { super(); }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setfields( InputRecordField [] value ) {
   fields = value;
 }

 public InputRecordField [] getfields() {
   return fields;
 }

}