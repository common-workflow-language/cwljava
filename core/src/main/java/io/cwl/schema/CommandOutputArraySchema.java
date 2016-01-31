
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandOutputArraySchema extends OutputArraySchema {

 CommandOutputBinding outputBinding = null;

  public CommandOutputArraySchema() { super(); }

 public void setoutputBinding( CommandOutputBinding value ) {
   outputBinding = value;
 }

 public CommandOutputBinding getoutputBinding() {
   return outputBinding;
 }

}