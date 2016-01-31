
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class Process {

 OutputParameter [] outputs = null;
 ProcessRequirement [] requirements = null;
 String cwlVersion = null;
 InputParameter [] inputs = null;
 Any [] hints = null;
 String description = null;
 String id = null;
 String label = null;

  public Process() { super(); }

 public void setoutputs( OutputParameter [] value ) {
   outputs = value;
 }

 public OutputParameter [] getoutputs() {
   return outputs;
 }

 public void setrequirements( ProcessRequirement [] value ) {
   requirements = value;
 }

 public ProcessRequirement [] getrequirements() {
   return requirements;
 }

 public void setcwlVersion( String value ) {
   cwlVersion = value;
 }

 public String getcwlVersion() {
   return cwlVersion;
 }

 public void setinputs( InputParameter [] value ) {
   inputs = value;
 }

 public InputParameter [] getinputs() {
   return inputs;
 }

 public void sethints( Any [] value ) {
   hints = value;
 }

 public Any [] gethints() {
   return hints;
 }

 public void setdescription( String value ) {
   description = value;
 }

 public String getdescription() {
   return description;
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