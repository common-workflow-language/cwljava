
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class CommandOutputBinding extends OutputBinding {

 Boolean loadContents = null;
 Object outputEval = null;
 Object glob = null;

  public CommandOutputBinding() { super(); }

 public void setloadContents( Boolean value ) {
   loadContents = value;
 }

 public Boolean getloadContents() {
   return loadContents;
 }

 public void setoutputEval( String value ) {
   outputEval = value;
 }

 public void setoutputEval( Expression value ) {
   outputEval = value;
 }

 public Object getoutputEval() {
   return outputEval;
 }

 public void setglob( String value ) {
   glob = value;
 }

 public void setglob( Expression value ) {
   glob = value;
 }

 public void setglob( String [] value ) {
   glob = value;
 }

 public Object getglob() {
   return glob;
 }

}