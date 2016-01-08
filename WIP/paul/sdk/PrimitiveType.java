
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

public class PrimitiveType extends Object {

 Object value;

 public PrimitiveType( Object objectInstance ) {
   value = objectInstance;
 }

 public void set(Boolean objectInstance) {
   value = objectInstance;
 }

 public void set(Integer objectInstance) {
   value = objectInstance;
 }

 public void set(Long objectInstance) {
   value = objectInstance;
 }

 public void set(Float objectInstance) {
   value = objectInstance;
 }

 public void set(Double objectInstance) {
   value = objectInstance;
 }

 public void set(String objectInstance) {
   value = objectInstance;
 }

 public Object get(Object objectInstance) {
   return (Object) objectInstance;
 }

}

