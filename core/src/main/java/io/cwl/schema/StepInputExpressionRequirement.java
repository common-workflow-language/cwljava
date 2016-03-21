
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class StepInputExpressionRequirement extends ProcessRequirement {

 String class_value = null;

  public StepInputExpressionRequirement() { super(); }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}