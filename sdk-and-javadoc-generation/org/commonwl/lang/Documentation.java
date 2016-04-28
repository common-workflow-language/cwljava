
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
*   A documentation section.  This type exists to facilitate self-documenting schemas but has no role in formal validation.
*/
public class Documentation implements NamedType, DocType {

  /*****************************************************************************************************
  *
  *  Must be `documentation`
  */
  Object type = null;


  /*****************************************************************************************************
  *
  *  The identifier for this type
  */
  String name = null;


  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for this type should appear in a subsection under `docParent`.
  */
  String docParent = null;

  /*****************************************************************************************************
  *
  *  A documentation string for this type, or an array of strings which should be concatenated.
  */
  Object doc = null;

  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for this type should appear after the `docAfter` section at the same level.
  */
  String docAfter = null;

  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for `docChild` should appear in a subsection under this type.
  */
  Object docChild = null;


  public Documentation() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a Object type.
  *
  */
  public void settype( Object value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of type.
  *
  *  @return   This method will return the value of type, which is a Object type.
  *
  */
  public Object gettype() {
    return type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of name.
  *
  *  @param   value will update name, which is a String type.
  *
  */
  public void setname( String value ) {
    name = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of name.
  *
  *  @return   This method will return the value of name, which is a String type.
  *
  */
  public String getname() {
    return name;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docParent.
  *
  *  @param   value will update docParent, which is a String type.
  *
  */
  public void setdocParent( String value ) {
    docParent = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docParent.
  *
  *  @return   This method will return the value of docParent, which is a String type.
  *
  */
  public String getdocParent() {
    return docParent;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String type.
  *
  */
  public void setdoc( String value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String array.
  *
  */
  public void setdoc( String [] value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a Object type.
  *
  */
  public Object getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docAfter.
  *
  *  @param   value will update docAfter, which is a String type.
  *
  */
  public void setdocAfter( String value ) {
    docAfter = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docAfter.
  *
  *  @return   This method will return the value of docAfter, which is a String type.
  *
  */
  public String getdocAfter() {
    return docAfter;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String type.
  *
  */
  public void setdocChild( String value ) {
    docChild = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String array.
  *
  */
  public void setdocChild( String [] value ) {
    docChild = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docChild.
  *
  *  @return   This method will return the value of docChild, which is a Object type.
  *
  */
  public Object getdocChild() {
    return docChild;
  }

}