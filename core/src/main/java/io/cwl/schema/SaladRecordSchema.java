
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SaladRecordSchema extends SchemaDefinedType implements NamedType {

 Object extends_value = null;
 Boolean abstract_value = null;
 Object specialize = null;

 String name = null;

 Object type = null;
 SaladRecordField [] fields = null;

 Boolean documentRoot = null;
 Object jsonldPredicate = null;

  public SaladRecordSchema() { super(); }

 public void setextends( String value ) {
   extends_value = value;
 }

 public void setextends( String [] value ) {
   extends_value = value;
 }

 public Object getextends() {
   return extends_value;
 }

 public void setabstract( Boolean value ) {
   abstract_value = value;
 }

 public Boolean getabstract() {
   return abstract_value;
 }

 public void setspecialize( SpecializeDef value ) {
   specialize = value;
 }

 public void setspecialize( SpecializeDef [] value ) {
   specialize = value;
 }

 public Object getspecialize() {
   return specialize;
 }

 public void setname( String value ) {
   name = value;
 }

 public String getname() {
   return name;
 }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setfields( SaladRecordField [] value ) {
   fields = value;
 }

 public SaladRecordField [] getfields() {
   return fields;
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