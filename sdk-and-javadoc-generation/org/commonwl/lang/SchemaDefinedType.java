
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
*   Abstract base for schema-defined types.
*/
public interface SchemaDefinedType extends DocType {

  /*****************************************************************************************************
  *
  *   If true, indicates that the type is a valid at the document root.  At least one type in a schema must be tagged with `documentRoot: true`.  
  */
  Boolean documentRoot = null;

  /*****************************************************************************************************
  *
  *   Annotate this type with linked data context.
  */
  Object jsonldPredicate = null;


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


  /*****************************************************************************************************
  *
  *  This method sets the value of documentRoot.
  *
  *  @param   value will update documentRoot, which is a Boolean type.
  *
  */
  public void setdocumentRoot( Boolean value );

  /*****************************************************************************************************
  *
  *  This method returns the value of documentRoot.
  *
  *  @return   This method will return the value of documentRoot, which is a Boolean type.
  *
  */
  public Boolean getdocumentRoot();
  /*****************************************************************************************************
  *
  *  This method sets the value of jsonldPredicate.
  *
  *  @param   value will update jsonldPredicate, which is a String type.
  *
  */
  public void setjsonldPredicate( String value );

  /*****************************************************************************************************
  *
  *  This method sets the value of jsonldPredicate.
  *
  *  @param   value will update jsonldPredicate, which is a JsonldPredicate type.
  *
  */
  public void setjsonldPredicate( JsonldPredicate value );

  /*****************************************************************************************************
  *
  *  This method returns the value of jsonldPredicate.
  *
  *  @return   This method will return the value of jsonldPredicate, which is a Object type.
  *
  */
  public Object getjsonldPredicate();
  /*****************************************************************************************************
  *
  *  This method sets the value of docParent.
  *
  *  @param   value will update docParent, which is a String type.
  *
  */
  public void setdocParent( String value );

  /*****************************************************************************************************
  *
  *  This method returns the value of docParent.
  *
  *  @return   This method will return the value of docParent, which is a String type.
  *
  */
  public String getdocParent();
  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String type.
  *
  */
  public void setdoc( String value );

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String array.
  *
  */
  public void setdoc( String [] value );

  /*****************************************************************************************************
  *
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a Object type.
  *
  */
  public Object getdoc();
  /*****************************************************************************************************
  *
  *  This method sets the value of docAfter.
  *
  *  @param   value will update docAfter, which is a String type.
  *
  */
  public void setdocAfter( String value );

  /*****************************************************************************************************
  *
  *  This method returns the value of docAfter.
  *
  *  @return   This method will return the value of docAfter, which is a String type.
  *
  */
  public String getdocAfter();
  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String type.
  *
  */
  public void setdocChild( String value );

  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String array.
  *
  */
  public void setdocChild( String [] value );

  /*****************************************************************************************************
  *
  *  This method returns the value of docChild.
  *
  *  @return   This method will return the value of docChild, which is a Object type.
  *
  */
  public Object getdocChild();
}