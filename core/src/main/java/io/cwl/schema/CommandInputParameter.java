
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandInputParameter extends InputParameter {

 Any default_value = null;
 String id = null;
 CommandLineBinding inputBinding = null;

  public CommandInputParameter() { super(); }

 public void setdefault( Any value ) {
   default_value = value;
 }

 public Any getdefault() {
   return default_value;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

 public void setinputBinding( CommandLineBinding value ) {
   inputBinding = value;
 }

 public CommandLineBinding getinputBinding() {
   return inputBinding;
 }

}