
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class WorkflowStep {

 WorkflowStepOutput [] outputs = null;
 ProcessRequirement [] requirements = null;
 WorkflowStepInput [] inputs = null;
 Any [] hints = null;
 Object scatter = null;
 ScatterMethod scatterMethod = null;
 String description = null;
 Object run = null;
 String id = null;
 String label = null;

  public WorkflowStep() { super(); }

 public void setoutputs( WorkflowStepOutput [] value ) {
   outputs = value;
 }

 public WorkflowStepOutput [] getoutputs() {
   return outputs;
 }

 public void setrequirements( ProcessRequirement [] value ) {
   requirements = value;
 }

 public ProcessRequirement [] getrequirements() {
   return requirements;
 }

 public void setinputs( WorkflowStepInput [] value ) {
   inputs = value;
 }

 public WorkflowStepInput [] getinputs() {
   return inputs;
 }

 public void sethints( Any [] value ) {
   hints = value;
 }

 public Any [] gethints() {
   return hints;
 }

 public void setscatter( String value ) {
   scatter = value;
 }

 public void setscatter( String [] value ) {
   scatter = value;
 }

 public Object getscatter() {
   return scatter;
 }

 public void setscatterMethod( ScatterMethod value ) {
   scatterMethod = value;
 }

 public ScatterMethod getscatterMethod() {
   return scatterMethod;
 }

 public void setdescription( String value ) {
   description = value;
 }

 public String getdescription() {
   return description;
 }

 public void setrun( String value ) {
   run = value;
 }

 public void setrun( Process value ) {
   run = value;
 }

 public Object getrun() {
   return run;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

 public void setlabel( String value ) {
   label = value;
 }

 public String getlabel() {
   return label;
 }

}