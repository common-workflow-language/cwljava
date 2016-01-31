
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class JsonldPredicate {

 String _container = null;
 Boolean noLinkCheck = null;
 Boolean identity = null;
 String _type = null;
 String _id = null;

  public JsonldPredicate() { super(); }

 public void set_container( String value ) {
   _container = value;
 }

 public String get_container() {
   return _container;
 }

 public void setnoLinkCheck( Boolean value ) {
   noLinkCheck = value;
 }

 public Boolean getnoLinkCheck() {
   return noLinkCheck;
 }

 public void setidentity( Boolean value ) {
   identity = value;
 }

 public Boolean getidentity() {
   return identity;
 }

 public void set_type( String value ) {
   _type = value;
 }

 public String get_type() {
   return _type;
 }

 public void set_id( String value ) {
   _id = value;
 }

 public String get_id() {
   return _id;
 }

}