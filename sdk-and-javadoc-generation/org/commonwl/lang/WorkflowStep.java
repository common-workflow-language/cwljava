
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
*  A workflow step is an executable element of a workflow.  It specifies the underlying process implementation (such as `CommandLineTool` or another `Workflow`) in the `run` field and connects the input and output parameters of the underlying process to workflow parameters.
*/
public class WorkflowStep {

  /*****************************************************************************************************
  *
  *  Declares requirements that apply to either the runtime environment or the workflow engine that must be met in order to execute this workflow step.  If an implementation cannot satisfy all requirements, or a requirement is listed which is not recognized by the implementation, it is a fatal error and the implementation must not attempt to run the process, unless overridden at user option.
  */
  Object requirements = null;

  /*****************************************************************************************************
  *
  *  Defines the input parameters of the workflow step.  The process is ready to run when all required input parameters are associated with concrete values.  Input parameters include a schema for each parameter which is used to validate the input object.  It may also be used build a user interface for constructing the input object.
  */
  WorkflowStepInput in = null;

  /*****************************************************************************************************
  *
  *  Declares hints applying to either the runtime environment or the workflow engine that may be helpful in executing this workflow step.  It is not an error if an implementation cannot satisfy all hints, however the implementation may report a warning.
  */
  Any hints = null;

  Object scatter = null;

  /*****************************************************************************************************
  *
  *  Required if `scatter` is an array of more than one element.
  */
  ScatterMethod scatterMethod = null;

  /*****************************************************************************************************
  *
  *  A long, human-readable description of this process object.
  */
  String doc = null;

  /*****************************************************************************************************
  *
  *  Specifies the process to run.
  */
  Object run = null;

  /*****************************************************************************************************
  *
  *  The unique identifier for this workflow step.
  */
  String id = null;

  /*****************************************************************************************************
  *
  *  A short, human-readable label of this process object.
  */
  String label = null;

  /*****************************************************************************************************
  *
  *  Defines the parameters representing the output of the process.  May be used to generate and/or validate the output object.
  */
  Object out = null;


  public WorkflowStep() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a StepInputExpressionRequirement type.
  *
  */
  public void setrequirements( StepInputExpressionRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a MultipleInputFeatureRequirement type.
  *
  */
  public void setrequirements( MultipleInputFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SoftwareRequirement type.
  *
  */
  public void setrequirements( SoftwareRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SchemaDefRequirement type.
  *
  */
  public void setrequirements( SchemaDefRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a InitialWorkDirRequirement type.
  *
  */
  public void setrequirements( InitialWorkDirRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a EnvVarRequirement type.
  *
  */
  public void setrequirements( EnvVarRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a DockerRequirement type.
  *
  */
  public void setrequirements( DockerRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ResourceRequirement type.
  *
  */
  public void setrequirements( ResourceRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a InlineJavascriptRequirement type.
  *
  */
  public void setrequirements( InlineJavascriptRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ShellCommandRequirement type.
  *
  */
  public void setrequirements( ShellCommandRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ScatterFeatureRequirement type.
  *
  */
  public void setrequirements( ScatterFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SubworkflowFeatureRequirement type.
  *
  */
  public void setrequirements( SubworkflowFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of requirements.
  *
  *  @return   This method will return the value of requirements, which is a Object type.
  *
  */
  public Object getrequirements() {
    return requirements;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of in.
  *
  *  @param   value will update in, which is a WorkflowStepInput type.
  *
  */
  public void setin( WorkflowStepInput value ) {
    in = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of in.
  *
  *  @return   This method will return the value of in, which is a WorkflowStepInput type.
  *
  */
  public WorkflowStepInput getin() {
    return in;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of hints.
  *
  *  @param   value will update hints, which is a Any type.
  *
  */
  public void sethints( Any value ) {
    hints = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of hints.
  *
  *  @return   This method will return the value of hints, which is a Any type.
  *
  */
  public Any gethints() {
    return hints;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of scatter.
  *
  *  @param   value will update scatter, which is a String type.
  *
  */
  public void setscatter( String value ) {
    scatter = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of scatter.
  *
  *  @param   value will update scatter, which is a String array.
  *
  */
  public void setscatter( String [] value ) {
    scatter = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of scatter.
  *
  *  @return   This method will return the value of scatter, which is a Object type.
  *
  */
  public Object getscatter() {
    return scatter;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of scatterMethod.
  *
  *  @param   value will update scatterMethod, which is a ScatterMethod type.
  *
  */
  public void setscatterMethod( ScatterMethod value ) {
    scatterMethod = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of scatterMethod.
  *
  *  @return   This method will return the value of scatterMethod, which is a ScatterMethod type.
  *
  */
  public ScatterMethod getscatterMethod() {
    return scatterMethod;
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
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a String type.
  *
  */
  public String getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of run.
  *
  *  @param   value will update run, which is a CommandLineTool type.
  *
  */
  public void setrun( CommandLineTool value ) {
    run = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of run.
  *
  *  @param   value will update run, which is a String type.
  *
  */
  public void setrun( String value ) {
    run = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of run.
  *
  *  @param   value will update run, which is a Workflow type.
  *
  */
  public void setrun( Workflow value ) {
    run = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of run.
  *
  *  @param   value will update run, which is a ExpressionTool type.
  *
  */
  public void setrun( ExpressionTool value ) {
    run = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of run.
  *
  *  @return   This method will return the value of run, which is a Object type.
  *
  */
  public Object getrun() {
    return run;
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
  *  This method sets the value of label.
  *
  *  @param   value will update label, which is a String type.
  *
  */
  public void setlabel( String value ) {
    label = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of label.
  *
  *  @return   This method will return the value of label, which is a String type.
  *
  */
  public String getlabel() {
    return label;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of out.
  *
  *  @param   value will update out, which is a WorkflowStepOutput array.
  *
  */
  public void setout( WorkflowStepOutput [] value ) {
    out = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of out.
  *
  *  @param   value will update out, which is a String array.
  *
  */
  public void setout( String [] value ) {
    out = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of out.
  *
  *  @return   This method will return the value of out, which is a Object type.
  *
  */
  public Object getout() {
    return out;
  }

}