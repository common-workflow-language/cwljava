
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

public class ResourceRequirement extends ProcessRequirement {

 Object tmpdirMin = null;
 Object tmpdirMax = null;
 Object ramMax = null;
 Object coresMax = null;
 Object ramMin = null;
 Object outdirMin = null;
 Object coresMin = null;
 Object outdirMax = null;

 String class_value = null;

  public ResourceRequirement() { super(); }

 public void settmpdirMin( Long value ) {
   tmpdirMin = value;
 }

 public void settmpdirMin( String value ) {
   tmpdirMin = value;
 }

 public void settmpdirMin( Expression value ) {
   tmpdirMin = value;
 }

 public Object gettmpdirMin() {
   return tmpdirMin;
 }

 public void settmpdirMax( Long value ) {
   tmpdirMax = value;
 }

 public void settmpdirMax( String value ) {
   tmpdirMax = value;
 }

 public void settmpdirMax( Expression value ) {
   tmpdirMax = value;
 }

 public Object gettmpdirMax() {
   return tmpdirMax;
 }

 public void setramMax( Long value ) {
   ramMax = value;
 }

 public void setramMax( String value ) {
   ramMax = value;
 }

 public void setramMax( Expression value ) {
   ramMax = value;
 }

 public Object getramMax() {
   return ramMax;
 }

 public void setcoresMax( Integer value ) {
   coresMax = value;
 }

 public void setcoresMax( String value ) {
   coresMax = value;
 }

 public void setcoresMax( Expression value ) {
   coresMax = value;
 }

 public Object getcoresMax() {
   return coresMax;
 }

 public void setramMin( Long value ) {
   ramMin = value;
 }

 public void setramMin( String value ) {
   ramMin = value;
 }

 public void setramMin( Expression value ) {
   ramMin = value;
 }

 public Object getramMin() {
   return ramMin;
 }

 public void setoutdirMin( Long value ) {
   outdirMin = value;
 }

 public void setoutdirMin( String value ) {
   outdirMin = value;
 }

 public void setoutdirMin( Expression value ) {
   outdirMin = value;
 }

 public Object getoutdirMin() {
   return outdirMin;
 }

 public void setcoresMin( Long value ) {
   coresMin = value;
 }

 public void setcoresMin( String value ) {
   coresMin = value;
 }

 public void setcoresMin( Expression value ) {
   coresMin = value;
 }

 public Object getcoresMin() {
   return coresMin;
 }

 public void setoutdirMax( Long value ) {
   outdirMax = value;
 }

 public void setoutdirMax( String value ) {
   outdirMax = value;
 }

 public void setoutdirMax( Expression value ) {
   outdirMax = value;
 }

 public Object getoutdirMax() {
   return outdirMax;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

}