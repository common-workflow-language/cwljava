
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandOutputEnumSchema extends OutputEnumSchema {

 CommandOutputBinding outputBinding = null;

  public CommandOutputEnumSchema() { super(); }

 public void setoutputBinding( CommandOutputBinding value ) {
   outputBinding = value;
 }

 public CommandOutputBinding getoutputBinding() {
   return outputBinding;
 }

}