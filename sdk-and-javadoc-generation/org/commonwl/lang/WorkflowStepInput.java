
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
*   The input of a workflow step connects an upstream parameter (from the workflow inputs, or the outputs of other workflows steps) with the input parameters of the underlying process.
*/
public class WorkflowStepInput implements Sink {

  /*****************************************************************************************************
  *
  *   The default value for this parameter if there is no `source` field.
  */
  Any default_value = null;

  /*****************************************************************************************************
  *
  *  A unique identifier for this workflow input parameter.
  */
  String id = null;

  /*****************************************************************************************************
  *
  *   To use valueFrom, [StepInputExpressionRequirement](#StepInputExpressionRequirement) must be specified in the workflow or workflow step requirements.  If `valueFrom` is a constant string value, use this as the value for this input parameter.  If `valueFrom` is a parameter reference or expression, it must be evaluated to yield the actual value to be assiged to the input field.  The `self` value of in the parameter reference or expression must be the value of the parameter(s) specified in the `source` field, or null if there is no `source` field.  The value of `inputs` in the parameter reference or expression is the input object to the workflow step after assigning the `source` values, but before evaluating any step with `valueFrom`.  The order of evaluating `valueFrom` among step input parameters is undefined.  
  */
  Object valueFrom = null;


  /*****************************************************************************************************
  *
  *   The method to use to merge multiple inbound links into a single array. If not specified, the default method is merge_nested.  
  */
  LinkMergeMethod linkMerge = null;

  /*****************************************************************************************************
  *
  *   Specifies one or more workflow parameters that will provide input to the underlying process parameter.
  */
  Object source = null;


  public WorkflowStepInput() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of default_value.
  *
  *  @param   value will update default_value, which is a Any type.
  *
  */
  public void setdefault( Any value ) {
    default_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of default_value.
  *
  *  @return   This method will return the value of default_value, which is a Any type.
  *
  */
  public Any getdefault() {
    return default_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of id.
  *
  *  @param   value will update id, which is a String type.
  *
  */
  public void setid( String value ) {
    id = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of id.
  *
  *  @return   This method will return the value of id, which is a String type.
  *
  */
  public String getid() {
    return id;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of valueFrom.
  *
  *  @param   value will update valueFrom, which is a String type.
  *
  */
  public void setvalueFrom( String value ) {
    valueFrom = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of valueFrom.
  *
  *  @param   value will update valueFrom, which is a Expression type.
  *
  */
  public void setvalueFrom( Expression value ) {
    valueFrom = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of valueFrom.
  *
  *  @return   This method will return the value of valueFrom, which is a Object type.
  *
  */
  public Object getvalueFrom() {
    return valueFrom;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of linkMerge.
  *
  *  @param   value will update linkMerge, which is a LinkMergeMethod type.
  *
  */
  public void setlinkMerge( LinkMergeMethod value ) {
    linkMerge = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of linkMerge.
  *
  *  @return   This method will return the value of linkMerge, which is a LinkMergeMethod type.
  *
  */
  public LinkMergeMethod getlinkMerge() {
    return linkMerge;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of source.
  *
  *  @param   value will update source, which is a String type.
  *
  */
  public void setsource( String value ) {
    source = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of source.
  *
  *  @param   value will update source, which is a String array.
  *
  */
  public void setsource( String [] value ) {
    source = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of source.
  *
  *  @return   This method will return the value of source, which is a Object type.
  *
  */
  public Object getsource() {
    return source;
  }

}