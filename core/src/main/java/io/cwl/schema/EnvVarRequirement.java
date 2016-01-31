
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class EnvVarRequirement extends ProcessRequirement {

 EnvironmentDef [] envDef = null;

 String class_value = null;

  public EnvVarRequirement() { super(); }

 public void setenvDef( EnvironmentDef [] value ) {
   envDef = value;
 }

 public EnvironmentDef [] getenvDef() {
   return envDef;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}