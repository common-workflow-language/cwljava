
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class MultipleInputFeatureRequirement extends ProcessRequirement {

 String class_value = null;

  public MultipleInputFeatureRequirement() { super(); }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}