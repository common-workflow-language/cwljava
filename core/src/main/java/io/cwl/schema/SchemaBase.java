
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class SchemaBase {

 Boolean streamable = null;
 Object format = null;
 Object secondaryFiles = null;

  public SchemaBase() { super(); }

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