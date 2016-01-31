
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class EnvironmentDef {

 String envName = null;
 Object envValue = null;

  public EnvironmentDef() { super(); }

 public void setenvName( String value ) {
   envName = value;
 }

 public String getenvName() {
   return envName;
 }

 public void setenvValue( String value ) {
   envValue = value;
 }

 public void setenvValue( Expression value ) {
   envValue = value;
 }

 public Object getenvValue() {
   return envValue;
 }

}