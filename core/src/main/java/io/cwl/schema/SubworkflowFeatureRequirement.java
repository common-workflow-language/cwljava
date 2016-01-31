
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SubworkflowFeatureRequirement extends ProcessRequirement {

 String class_value = null;

  public SubworkflowFeatureRequirement() { super(); }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}