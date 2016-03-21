
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class OutputEnumSchema extends OutputSchema implements EnumSchema {

 OutputBinding outputBinding = null;

 Enum type = null;
 String [] symbols = null;

  public OutputEnumSchema() { super(); }

 public void setoutputBinding( OutputBinding value ) {
   outputBinding = value;
 }

 public OutputBinding getoutputBinding() {
   return outputBinding;
 }

 public void settype( Enum value ) {
   type = value;
 }

 public Enum gettype() {
   return type;
 }

 public void setsymbols( String [] value ) {
   symbols = value;
 }

 public String [] getsymbols() {
   return symbols;
 }

}