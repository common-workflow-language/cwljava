
/*****************************************************************************************************
*
*  Authors:
*          
*          CWL Java SDK:
*          
*            * Paul Grosu <pgrosu@gmail.com>, Northeastern University
*          
*          Alternate SDK (via Avro): 
*          
*            * Denis Yuen <denis.yuen@gmail.com>
*          
*          CWL Draft:
*          
*            * Peter Amstutz <peter.amstutz@curoverse.com>, Curoverse
*            * Nebojsa Tijanic <nebojsa.tijanic@sbgenomics.com>, Seven Bridges Genomics
*          
*            Contributors:
*          
*            * Luka Stojanovic <luka.stojanovic@sbgenomics.com>, Seven Bridges Genomics
*            * John Chilton <jmchilton@gmail.com>, Galaxy Project, Pennsylvania State University
*            * Michael R. Crusoe <crusoe@ucdavis.edu>, University of California, Davis
*            * Herve Menager <herve.menager@gmail.com>, Institut Pasteur
*            * Maxim Mikheev <mikhmv@biodatomics.com>, BioDatomics
*            * Stian Soiland-Reyes <soiland-reyes@cs.manchester.ac.uk>, University of Manchester
*
*****************************************************************************************************/

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