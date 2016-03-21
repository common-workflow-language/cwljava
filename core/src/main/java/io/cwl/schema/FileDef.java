
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class FileDef {

 Object filename = null;
 Object fileContent = null;

  public FileDef() { super(); }

 public void setfilename( String value ) {
   filename = value;
 }

 public void setfilename( Expression value ) {
   filename = value;
 }

 public Object getfilename() {
   return filename;
 }

 public void setfileContent( String value ) {
   fileContent = value;
 }

 public void setfileContent( Expression value ) {
   fileContent = value;
 }

 public Object getfileContent() {
   return fileContent;
 }

}