
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

public class CommandLineBinding extends Binding {

 Boolean separate = null;
 String itemSeparator = null;
 String prefix = null;
 Boolean shellQuote = null;
 Integer position = null;
 Object valueFrom = null;

 Boolean loadContents = null;
 Object secondaryFiles = null;

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