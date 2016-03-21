
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class ScatterFeatureRequirement extends ProcessRequirement {

 String class_value = null;

  public ScatterFeatureRequirement() { super(); }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}