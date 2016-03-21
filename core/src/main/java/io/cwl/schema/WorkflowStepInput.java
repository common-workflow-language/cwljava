
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class WorkflowStepInput implements Sink {

 Any default_value = null;
 String id = null;
 Object valueFrom = null;

 Object source = null;

  public WorkflowStepInput() { super(); }

 public void setdefault( Any value ) {
   default_value = value;
 }

 public Any getdefault() {
   return default_value;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

 public void setvalueFrom( String value ) {
   valueFrom = value;
 }

 public void setvalueFrom( Expression value ) {
   valueFrom = value;
 }

 public Object getvalueFrom() {
   return valueFrom;
 }

 public void setsource( String value ) {
   source = value;
 }

 public void setsource( String [] value ) {
   source = value;
 }

 public Object getsource() {
   return source;
 }

}