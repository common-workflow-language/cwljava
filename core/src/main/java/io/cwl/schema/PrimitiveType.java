
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/
package io.cwl.schema;


public class PrimitiveType extends Object {

 Object value;

 public PrimitiveType( Object objectInstance ) {
   value = objectInstance;
 }

 public void set(Boolean objectInstance) {
   value = objectInstance;
 }

 public void set(Integer objectInstance) {
   value = objectInstance;
 }

 public void set(Long objectInstance) {
   value = objectInstance;
 }

 public void set(Float objectInstance) {
   value = objectInstance;
 }

 public void set(Double objectInstance) {
   value = objectInstance;
 }

 public void set(String objectInstance) {
   value = objectInstance;
 }

 public Object get(Object objectInstance) {
   return (Object) objectInstance;
 }

}

