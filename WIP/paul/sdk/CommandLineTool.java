
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

public class CommandLineTool extends Process {

 Object stdin = null;
 Object stdout = null;
 Integer [] successCodes = null;
 Integer [] temporaryFailCodes = null;
 Object baseCommand = null;
 Object arguments = null;
 String class_value = null;
 Integer [] permanentFailCodes = null;

 CommandOutputParameter [] outputs = null;
 ProcessRequirement [] requirements = null;
 String cwlVersion = null;
 CommandInputParameter [] inputs = null;
 Any [] hints = null;
 String description = null;
 String id = null;
 String label = null;

  public CommandLineTool() { super(); }

 public void setstdin( String value ) {
   stdin = value;
 }

 public void setstdin( Expression value ) {
   stdin = value;
 }

 public Object getstdin() {
   return stdin;
 }

 public void setstdout( String value ) {
   stdout = value;
 }

 public void setstdout( Expression value ) {
   stdout = value;
 }

 public Object getstdout() {
   return stdout;
 }

 public void setsuccessCodes( Integer [] value ) {
   successCodes = value;
 }

 public Integer [] getsuccessCodes() {
   return successCodes;
 }

 public void settemporaryFailCodes( Integer [] value ) {
   temporaryFailCodes = value;
 }

 public Integer [] gettemporaryFailCodes() {
   return temporaryFailCodes;
 }

 public void setbaseCommand( String value ) {
   baseCommand = value;
 }

 public void setbaseCommand( String [] value ) {
   baseCommand = value;
 }

 public Object getbaseCommand() {
   return baseCommand;
 }

 public void setarguments( String [] value ) {
   arguments = value;
 }

 public void setarguments( CommandLineBinding [] value ) {
   arguments = value;
 }

 public Object getarguments() {
   return arguments;
 }

 public void setclass( String value ) {
   class_value = value;
 }

 public String getclass() {
   return class_value;
 }

 public void setpermanentFailCodes( Integer [] value ) {
   permanentFailCodes = value;
 }

 public Integer [] getpermanentFailCodes() {
   return permanentFailCodes;
 }

 public void setoutputs( CommandOutputParameter [] value ) {
   outputs = value;
 }

 public CommandOutputParameter [] getoutputs() {
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

 public void setinputs( CommandInputParameter [] value ) {
   inputs = value;
 }

 public CommandInputParameter [] getinputs() {
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