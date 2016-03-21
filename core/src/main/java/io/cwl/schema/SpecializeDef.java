
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SpecializeDef {

 String specializeFrom = null;
 String specializeTo = null;

  public SpecializeDef() { super(); }

 public void setspecializeFrom( String value ) {
   specializeFrom = value;
 }

 public String getspecializeFrom() {
   return specializeFrom;
 }

 public void setspecializeTo( String value ) {
   specializeTo = value;
 }

 public String getspecializeTo() {
   return specializeTo;
 }

}