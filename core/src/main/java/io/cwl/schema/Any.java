
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/
package io.cwl.schema;


public class Any extends Object {

 Object value;

 public Any( Object objectInstance ) {
   value = objectInstance;
 }

 public void set(Object objectInstance) {
   value = objectInstance;
 }

 public Object get(Object objectInstance) {
   return (Object) objectInstance;
 }

}

