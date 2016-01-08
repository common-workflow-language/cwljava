
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

public class ExpressionTool extends Process {

 Object expression = null;
 String class_value = null;

 OutputParameter [] outputs = null;
 ProcessRequirement [] requirements = null;
 String cwlVersion = null;
 InputParameter [] inputs = null;
 Any [] hints = null;
 String description = null;
 String id = null;
 String label = null;

  public ExpressionTool() { super(); }

 public void setexpression( String value ) {
   expression = value;
 }

 public void setexpression( Expression value ) {
   expression = value;
 }

 public Object getexpression() {
   return expression;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

 public void setoutputs( OutputParameter [] value ) {
   outputs = value;
 }

 public OutputParameter [] getoutputs() {
   return outputs;
 }

 public void setrequirements( ProcessRequirement [] value ) {
   requirements = value;
 }

 public ProcessRequirement [] getrequirements() {
   return requirements;
 }

 public void setcwlVersion( String value ) {
   cwlVersion = value;
 }

 public String getcwlVersion() {
   return cwlVersion;
 }

 public void setinputs( InputParameter [] value ) {
   inputs = value;
 }

 public InputParameter [] getinputs() {
   return inputs;
 }

 public void sethints( Any [] value ) {
   hints = value;
 }

 public Any [] gethints() {
   return hints;
 }

 public void setdescription( String value ) {
   description = value;
 }

 public String getdescription() {
   return description;
 }

 public void setid( String value ) {
   id = value;
 }

 public String getid() {
   return id;
 }

 public void setlabel( String value ) {
   label = value;
 }

 public String getlabel() {
   return label;
 }

}