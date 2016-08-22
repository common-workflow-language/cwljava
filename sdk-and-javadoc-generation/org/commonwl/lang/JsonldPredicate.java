
/*****************************************************************************************************
*
*  Authors:
*          
*          <b> Java SDK for CWL </b>
*          
*            @author Paul Grosu (pgrosu@gmail.com), Northeastern University
*            @version 0.20
*            @since April 28, 2016
*          
*          <p> Alternate SDK (via Avro): 
*          
*            Denis Yuen (denis.yuen@gmail.com)
*          
*          CWL Draft:
*          
*            Peter Amstutz (peter.amstutz@curoverse.com), Curoverse
*            Nebojsa Tijanic (nebojsa.tijanic@sbgenomics.com), Seven Bridges Genomics
*          
*            Contributors:
*          
*            Luka Stojanovic (luka.stojanovic@sbgenomics.com), Seven Bridges Genomics
*            John Chilton (jmchilton@gmail.com), Galaxy Project, Pennsylvania State University
*            Michael R. Crusoe (crusoe@ucdavis.edu), University of California, Davis
*            Herve Menager (herve.menager@gmail.com), Institut Pasteur
*            Maxim Mikheev (mikhmv@biodatomics.com), BioDatomics
*            Stian Soiland-Reyes (soiland-reyes@cs.manchester.ac.uk), University of Manchester
*
*****************************************************************************************************/

package org.commonwl.lang;

/*****************************************************************************************************
*
*  Attached to a record field to define how the parent record field is handled for URI resolution and JSON-LD context generation.
*/
public class JsonldPredicate {

  /*****************************************************************************************************
  *
  *  Structure hint, corresponds to JSON-LD `@container` directive.
  */
  String _container = null;

  /*****************************************************************************************************
  *
  *  If true, this indicates that link validation traversal must stop at this field.  This field (it is is a URI) or any fields under it (if it is an object or array) are not subject to link checking.
  */
  Boolean noLinkCheck = null;

  /*****************************************************************************************************
  *
  *  Field must be expanded based on the the Schema Salad type DSL.
  */
  Boolean typeDSL = null;

  /*****************************************************************************************************
  *
  *  If true and `_type` is `@id` this indicates that the parent field must be resolved according to identity resolution rules instead of link resolution rules.  In addition, the field value is considered an assertion that the linked value exists; absence of an object in the loaded document with the URI is not an error.
  */
  Boolean identity = null;

  /*****************************************************************************************************
  *
  *  The context type hint, corresponds to JSON-LD `@type` directive. * If the value of this field is `@id` and `identity` is false or unspecified, the parent field must be resolved using the link resolution rules.  If `identity` is true, the parent field must be resolved using the identifier expansion rules. * If the value of this field is `@vocab`, the parent field must be resolved using the vocabulary resolution rules.
  */
  String _type = null;

  /*****************************************************************************************************
  *
  *  If the field contains a relative reference, it must be resolved by searching for valid document references in each successive parent scope in the document fragment.  For example, a reference of `foo` in the context `#foo/bar/baz` will first check for the existence of `#foo/bar/baz/foo`, followed by `#foo/bar/foo`, then `#foo/foo` and then finally `#foo`.  The first valid URI in the search order shall be used as the fully resolved value of the identifier.  The value of the refScope field is the specified number of levels from the containing identifer scope before starting the search, so if `refScope: 2` then baz and bar must be stripped to get the base `#foo` and search `#foo/foo` and the `#foo`.  The last scope searched must be the top level scope before determining if the identifier cannot be resolved.
  */
  Integer refScope = null;

  /*****************************************************************************************************
  *
  *  If the value of the field is a JSON object, it must be transformed into an array of JSON objects, where each key-value pair from the source JSON object is a list item, the list items must be JSON objects, and the key is assigned to the field specified by `mapSubject`.
  */
  String mapSubject = null;

  /*****************************************************************************************************
  *
  *  The predicate URI that this field corresponds to. Corresponds to JSON-LD `@id` directive.
  */
  String _id = null;

  /*****************************************************************************************************
  *
  *  Only applies if `mapSubject` is also provided.  If the value of the field is a JSON object, it is transformed as described in `mapSubject`, with the addition that when the value of a map item is not an object, the item is transformed to a JSON object with the key assigned to the field specified by `mapSubject` and the value assigned to the field specified by `mapPredicate`.
  */
  String mapPredicate = null;


  public JsonldPredicate() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of _container.
  *
  *  @param   value will update _container, which is a String type.
  *
  */
  public void set_container( String value ) {
    _container = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of _container.
  *
  *  @return   This method will return the value of _container, which is a String type.
  *
  */
  public String get_container() {
    return _container;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of noLinkCheck.
  *
  *  @param   value will update noLinkCheck, which is a Boolean type.
  *
  */
  public void setnoLinkCheck( Boolean value ) {
    noLinkCheck = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of noLinkCheck.
  *
  *  @return   This method will return the value of noLinkCheck, which is a Boolean type.
  *
  */
  public Boolean getnoLinkCheck() {
    return noLinkCheck;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of typeDSL.
  *
  *  @param   value will update typeDSL, which is a Boolean type.
  *
  */
  public void settypeDSL( Boolean value ) {
    typeDSL = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of typeDSL.
  *
  *  @return   This method will return the value of typeDSL, which is a Boolean type.
  *
  */
  public Boolean gettypeDSL() {
    return typeDSL;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of identity.
  *
  *  @param   value will update identity, which is a Boolean type.
  *
  */
  public void setidentity( Boolean value ) {
    identity = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of identity.
  *
  *  @return   This method will return the value of identity, which is a Boolean type.
  *
  */
  public Boolean getidentity() {
    return identity;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of _type.
  *
  *  @param   value will update _type, which is a String type.
  *
  */
  public void set_type( String value ) {
    _type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of _type.
  *
  *  @return   This method will return the value of _type, which is a String type.
  *
  */
  public String get_type() {
    return _type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of refScope.
  *
  *  @param   value will update refScope, which is a Integer type.
  *
  */
  public void setrefScope( Integer value ) {
    refScope = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of refScope.
  *
  *  @return   This method will return the value of refScope, which is a Integer type.
  *
  */
  public Integer getrefScope() {
    return refScope;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of mapSubject.
  *
  *  @param   value will update mapSubject, which is a String type.
  *
  */
  public void setmapSubject( String value ) {
    mapSubject = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of mapSubject.
  *
  *  @return   This method will return the value of mapSubject, which is a String type.
  *
  */
  public String getmapSubject() {
    return mapSubject;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of _id.
  *
  *  @param   value will update _id, which is a String type.
  *
  */
  public void set_id( String value ) {
    _id = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of _id.
  *
  *  @return   This method will return the value of _id, which is a String type.
  *
  */
  public String get_id() {
    return _id;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of mapPredicate.
  *
  *  @param   value will update mapPredicate, which is a String type.
  *
  */
  public void setmapPredicate( String value ) {
    mapPredicate = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of mapPredicate.
  *
  *  @return   This method will return the value of mapPredicate, which is a String type.
  *
  */
  public String getmapPredicate() {
    return mapPredicate;
  }

}