
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class InputParameter extends Parameter {

 Any default_value = null;
 String id = null;
 InputBinding inputBinding = null;

 String description = null;
 String label = null;
 Object type = null;

  public InputParameter() { super(); }

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

 public void setinputBinding( InputBinding value ) {
   inputBinding = value;
 }

 public InputBinding getinputBinding() {
   return inputBinding;
 }

 public void setdescription( String value ) {
   description = value;
 }

 public String getdescription() {
   return description;
 }

 public void setlabel( String value ) {
   label = value;
 }

 public String getlabel() {
   return label;
 }

 public void settype( CWLType value ) {
   type = value;
 }

 public void settype( InputRecordSchema value ) {
   type = value;
 }

 public void settype( InputEnumSchema value ) {
   type = value;
 }

 public void settype( InputArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( CWLType [] value ) {
   type = value;
 }

 public void settype( InputRecordSchema [] value ) {
   type = value;
 }

 public void settype( InputEnumSchema [] value ) {
   type = value;
 }

 public void settype( InputArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

}