
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CreateFileRequirement extends ProcessRequirement {

 FileDef [] fileDef = null;

 String class_value = null;

  public CreateFileRequirement() { super(); }

 public void setfileDef( FileDef [] value ) {
   fileDef = value;
 }

 public FileDef [] getfileDef() {
   return fileDef;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}