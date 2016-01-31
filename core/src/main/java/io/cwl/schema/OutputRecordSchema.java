
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class OutputRecordSchema extends OutputSchema {

 Object type = null;
 OutputRecordField [] fields = null;

  public OutputRecordSchema() { super(); }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setfields( OutputRecordField [] value ) {
   fields = value;
 }

 public OutputRecordField [] getfields() {
   return fields;
 }

}