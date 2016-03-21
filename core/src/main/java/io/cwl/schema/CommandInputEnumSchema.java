
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandInputEnumSchema extends InputEnumSchema {

 CommandLineBinding inputBinding = null;

  public CommandInputEnumSchema() { super(); }

 public void setinputBinding( CommandLineBinding value ) {
   inputBinding = value;
 }

 public CommandLineBinding getinputBinding() {
   return inputBinding;
 }

}