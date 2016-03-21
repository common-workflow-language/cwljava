
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandInputRecordField extends InputRecordField {

 CommandLineBinding inputBinding = null;

  public CommandInputRecordField() { super(); }

 public void setinputBinding( CommandLineBinding value ) {
   inputBinding = value;
 }

 public CommandLineBinding getinputBinding() {
   return inputBinding;
 }

}