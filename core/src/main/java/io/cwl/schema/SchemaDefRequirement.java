
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SchemaDefRequirement extends ProcessRequirement {

 InputSchema [] types = null;

 String class_value = null;

  public SchemaDefRequirement() { super(); }

 public void settypes( InputSchema [] value ) {
   types = value;
 }

 public InputSchema [] gettypes() {
   return types;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}