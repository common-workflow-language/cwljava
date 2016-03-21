
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandOutputParameter extends OutputParameter {

 CommandOutputBinding outputBinding = null;
 String id = null;

  public CommandOutputParameter() { super(); }

 public void setoutputBinding( CommandOutputBinding value ) {
   outputBinding = value;
 }

 public CommandOutputBinding getoutputBinding() {
   return outputBinding;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

}