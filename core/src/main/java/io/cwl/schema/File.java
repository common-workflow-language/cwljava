
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class File {

 String path = null;
 Long size = null;
 String checksum = null;
 String format = null;
 File [] secondaryFiles = null;
 File class_value = null;

  public File() { super(); }

 public void setpath( String value ) {
   path = value;
 }

 public String getpath() {
   return path;
 }

 public void setsize( Long value ) {
   size = value;
 }

 public Long getsize() {
   return size;
 }

 public void setchecksum( String value ) {
   checksum = value;
 }

 public String getchecksum() {
   return checksum;
 }

 public void setformat( String value ) {
   format = value;
 }

 public String getformat() {
   return format;
 }

 public void setsecondaryFiles( File [] value ) {
   secondaryFiles = value;
 }

 public File [] getsecondaryFiles() {
   return secondaryFiles;
 }

 public void setclass( File value ) {
   class_value = value;
 }

 public File getclass() {
   return class_value;
 }

}