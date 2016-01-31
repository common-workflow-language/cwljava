
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandLineBinding extends InputBinding {

 Boolean separate = null;
 String itemSeparator = null;
 String prefix = null;
 Boolean shellQuote = null;
 Integer position = null;
 Object valueFrom = null;

 Boolean loadContents = null;

  public CommandLineBinding() { super(); }

 public void setseparate( Boolean value ) {
   separate = value;
 }

 public Boolean getseparate() {
   return separate;
 }

 public void setitemSeparator( String value ) {
   itemSeparator = value;
 }

 public String getitemSeparator() {
   return itemSeparator;
 }

 public void setprefix( String value ) {
   prefix = value;
 }

 public String getprefix() {
   return prefix;
 }

 public void setshellQuote( Boolean value ) {
   shellQuote = value;
 }

 public Boolean getshellQuote() {
   return shellQuote;
 }

 public void setposition( Integer value ) {
   position = value;
 }

 public Integer getposition() {
   return position;
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

 public void setloadContents( Boolean value ) {
   loadContents = value;
 }

 public Boolean getloadContents() {
   return loadContents;
 }

}