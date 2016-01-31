
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class Parameter extends SchemaBase {

 String description = null;
 String label = null;
 Object type = null;

 Boolean streamable = null;
 Object format = null;
 Object secondaryFiles = null;

  public Parameter() { super(); }

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

 public void settype( RecordSchema value ) {
   type = value;
 }

 public void settype( EnumSchema value ) {
   type = value;
 }

 public void settype( ArraySchema value ) {
   type = value;
 }

 public void settype( String value ) {
   type = value;
 }

 public void settype( CWLType [] value ) {
   type = value;
 }

 public void settype( RecordSchema [] value ) {
   type = value;
 }

 public void settype( EnumSchema [] value ) {
   type = value;
 }

 public void settype( ArraySchema [] value ) {
   type = value;
 }

 public void settype( String [] value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setstreamable( Boolean value ) {
   streamable = value;
 }

 public Boolean getstreamable() {
   return streamable;
 }

 public void setformat( String value ) {
   format = value;
 }

 public void setformat( String [] value ) {
   format = value;
 }

 public void setformat( Expression [] value ) {
   format = value;
 }

 public Object getformat() {
   return format;
 }

 public void setsecondaryFiles( String value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( Expression value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( String [] value ) {
   secondaryFiles = value;
 }

 public void setsecondaryFiles( Expression [] value ) {
   secondaryFiles = value;
 }

 public Object getsecondaryFiles() {
   return secondaryFiles;
 }

}