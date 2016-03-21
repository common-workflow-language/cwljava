
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class OutputParameter extends Parameter {

 OutputBinding outputBinding = null;
 String id = null;

 String description = null;
 String label = null;
 Object type = null;

  public OutputParameter() { super(); }

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

 public void settype( OutputRecordSchema value ) {
   type = value;
 }

 public void settype( OutputEnumSchema value ) {
   type = value;
 }

 public void settype( OutputArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( CWLType [] value ) {
   type = value;
 }

 public void settype( OutputRecordSchema [] value ) {
   type = value;
 }

 public void settype( OutputEnumSchema [] value ) {
   type = value;
 }

 public void settype( OutputArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

}