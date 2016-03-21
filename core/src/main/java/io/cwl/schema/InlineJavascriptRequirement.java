
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InlineJavascriptRequirement extends ProcessRequirement {

 String [] expressionLib = null;

 String class_value = null;

  public InlineJavascriptRequirement() { super(); }

 public void setexpressionLib( String [] value ) {
   expressionLib = value;
 }

 public String [] getexpressionLib() {
   return expressionLib;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}