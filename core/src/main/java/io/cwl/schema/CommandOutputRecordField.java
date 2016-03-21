
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandOutputRecordField extends OutputRecordField {

 CommandOutputBinding outputBinding = null;

  public CommandOutputRecordField() { super(); }

 public void setoutputBinding( CommandOutputBinding value ) {
   outputBinding = value;
 }

 public CommandOutputBinding getoutputBinding() {
   return outputBinding;
 }

}