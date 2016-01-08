
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

public class InputEnumSchema implements EnumSchema {

 Binding inputBinding = null;

 Enum type = null;
 String [] symbols = null;

  public InputEnumSchema() { super(); }

 public void setinputBinding( Binding value ) {
   inputBinding = value;
 }

 public Binding getinputBinding() {
   return inputBinding;
 }

 public void settype( Enum value ) {
   type = value;
 }

 public Enum gettype() {
   return type;
 }

 public void setsymbols( String [] value ) {
   symbols = value;
 }

 public String [] getsymbols() {
   return symbols;
 }

}