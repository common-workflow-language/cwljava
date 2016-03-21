
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SaladEnumSchema extends SchemaDefinedType implements EnumSchema {

 Object extends_value = null;

 Enum type = null;
 String [] symbols = null;

 Boolean documentRoot = null;
 Object jsonldPredicate = null;

  public SaladEnumSchema() { super(); }

 public void setextends( String value ) {
   extends_value = value;
 }

 public void setextends( String [] value ) {
   extends_value = value;
 }

 public Object getextends() {
   return extends_value;
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

 public void setdocumentRoot( Boolean value ) {
   documentRoot = value;
 }

 public Boolean getdocumentRoot() {
   return documentRoot;
 }

 public void setjsonldPredicate( String value ) {
   jsonldPredicate = value;
 }

 public void setjsonldPredicate( JsonldPredicate value ) {
   jsonldPredicate = value;
 }

 public Object getjsonldPredicate() {
   return jsonldPredicate;
 }

}