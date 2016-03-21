
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class WorkflowOutputParameter extends OutputParameter implements Sink {

 OutputBinding outputBinding = null;
 String id = null;

 Object source = null;

  public WorkflowOutputParameter() { super(); }

 public void setoutputBinding( OutputBinding value ) {
   outputBinding = value;
 }

 public OutputBinding getoutputBinding() {
   return outputBinding;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
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