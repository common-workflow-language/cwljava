
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandInputArraySchema extends InputArraySchema {

 CommandLineBinding inputBinding = null;

  public CommandInputArraySchema() { super(); }

 public void setinputBinding( CommandLineBinding value ) {
   inputBinding = value;
 }

 public CommandLineBinding getinputBinding() {
   return inputBinding;
 }

}