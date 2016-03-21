
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InputEnumSchema extends InputSchema implements EnumSchema {

 InputBinding inputBinding = null;

 Enum type = null;
 String [] symbols = null;

  public InputEnumSchema() { super(); }

 public void setinputBinding( InputBinding value ) {
   inputBinding = value;
 }

 public InputBinding getinputBinding() {
   return inputBinding;
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