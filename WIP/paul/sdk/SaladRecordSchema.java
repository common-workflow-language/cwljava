
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

public class SaladRecordSchema extends SchemaDefinedType implements NamedType {

 Object extends_value = null;
 Boolean abstract_value = null;
 Object specialize = null;

 String name = null;

 Object type = null;
 SaladRecordField [] fields = null;

 Boolean documentRoot = null;
 Object jsonldPredicate = null;

  public SaladRecordSchema() { super(); }

 public void setextends( String value ) {
   extends_value = value;
 }

 public void setextends( String [] value ) {
   extends_value = value;
 }

 public Object getextends() {
   return extends_value;
 }

 public void setabstract( Boolean value ) {
   abstract_value = value;
 }

 public Boolean getabstract() {
   return abstract_value;
 }

 public void setspecialize( SpecializeDef value ) {
   specialize = value;
 }

 public void setspecialize( SpecializeDef [] value ) {
   specialize = value;
 }

 public Object getspecialize() {
   return specialize;
 }

 public void setname( String value ) {
   name = value;
 }

 public String getname() {
   return name;
 }

 public void settype( Object value ) {
   type = value;
 }

 public Object gettype() {
   return type;
 }

 public void setfields( SaladRecordField [] value ) {
   fields = value;
 }

 public SaladRecordField [] getfields() {
   return fields;
 }

 public void setdocumentRoot( Boolean value ) {
   documentRoot = value;
 }

 public Boolean getdocumentRoot() {
   return documentRoot;
 }

 public void setjsonldPredicate( String value ) {
   jsonldPredicate = value;
 }

 public void setjsonldPredicate( JsonldPredicate value ) {
   jsonldPredicate = value;
 }

 public Object getjsonldPredicate() {
   return jsonldPredicate;
 }

}