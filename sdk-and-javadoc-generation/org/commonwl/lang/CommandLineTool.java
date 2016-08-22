
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
*  This defines the schema of the CWL Command Line Tool Description document.
*/
public class CommandLineTool implements Process {

  /*****************************************************************************************************
  *
  *  A path to a file whose contents must be piped into the command's standard input stream.
  */
  Object stdin = null;

  /*****************************************************************************************************
  *
  *  Capture the command's standard output stream to a file written to the designated output directory. If `stdout` is a string, it specifies the file name to use. If `stdout` is an expression, the expression is evaluated and must return a string with the file name to use to capture stdout.  If the return value is not a string, or the resulting path contains illegal characters (such as the path separator `/`) it is an error.
  */
  Object stdout = null;

  /*****************************************************************************************************
  *
  *  Exit codes that indicate the process completed successfully.
  */
  Integer successCodes = null;

  /*****************************************************************************************************
  *
  *  Exit codes that indicate the process failed due to a possibly temporary condition, where executing the process with the same runtime environment and inputs may produce different results.
  */
  Integer temporaryFailCodes = null;

  /*****************************************************************************************************
  *
  *  Specifies the program to execute.  If an array, the first element of the array is the command to execute, and subsequent elements are mandatory command line arguments.  The elements in `baseCommand` must appear before any command line bindings from `inputBinding` or `arguments`. If `baseCommand` is not provided or is an empty array, the first element of the command line produced after processing `inputBinding` or `arguments` must be used as the program to execute. If the program includes a path separator character it must be an absolute path, otherwise it is an error.  If the program does not include a path separator, search the `$PATH` variable in the runtime environment of the workflow runner find the absolute path of the executable.
  */
  Object baseCommand = null;

  /*****************************************************************************************************
  *
  *  Command line bindings which are not directly associated with input parameters.
  */
  Object arguments = null;

  /*****************************************************************************************************
  *
  *  Capture the command's standard error stream to a file written to the designated output directory. If `stderr` is a string, it specifies the file name to use. If `stderr` is an expression, the expression is evaluated and must return a string with the file name to use to capture stderr.  If the return value is not a string, or the resulting path contains illegal characters (such as the path separator `/`) it is an error.
  */
  Object stderr = null;

  String class_value = null;

  /*****************************************************************************************************
  *
  *  Exit codes that indicate the process failed due to a permanent logic error, where executing the process with the same runtime environment and same inputs is expected to always fail.
  */
  Integer permanentFailCodes = null;


  /*****************************************************************************************************
  *
  *  Defines the parameters representing the output of the process.  May be used to generate and/or validate the output object.
  */
  CommandOutputParameter [] outputs = null;

  /*****************************************************************************************************
  *
  *  Declares requirements that apply to either the runtime environment or the workflow engine that must be met in order to execute this process.  If an implementation cannot satisfy all requirements, or a requirement is listed which is not recognized by the implementation, it is a fatal error and the implementation must not attempt to run the process, unless overridden at user option.
  */
  Object requirements = null;

  /*****************************************************************************************************
  *
  *  CWL document version. Always required at the document root. Not required for a Process embedded inside another Process.
  */
  CWLVersion cwlVersion = null;

  /*****************************************************************************************************
  *
  *  Defines the input parameters of the process.  The process is ready to run when all required input parameters are associated with concrete values.  Input parameters include a schema for each parameter which is used to validate the input object.  It may also be used to build a user interface for constructing the input object.
  */
  CommandInputParameter [] inputs = null;

  /*****************************************************************************************************
  *
  *  Declares hints applying to either the runtime environment or the workflow engine that may be helpful in executing this process.  It is not an error if an implementation cannot satisfy all hints, however the implementation may report a warning.
  */
  Any hints = null;

  /*****************************************************************************************************
  *
  *  A long, human-readable description of this process object.
  */
  String doc = null;

  /*****************************************************************************************************
  *
  *  The unique identifier for this process object.
  */
  String id = null;

  /*****************************************************************************************************
  *
  *  A short, human-readable label of this process object.
  */
  String label = null;


  public CommandLineTool() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of stdin.
  *
  *  @param   value will update stdin, which is a String type.
  *
  */
  public void setstdin( String value ) {
    stdin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of stdin.
  *
  *  @param   value will update stdin, which is a Expression type.
  *
  */
  public void setstdin( Expression value ) {
    stdin = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of stdin.
  *
  *  @return   This method will return the value of stdin, which is a Object type.
  *
  */
  public Object getstdin() {
    return stdin;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of stdout.
  *
  *  @param   value will update stdout, which is a String type.
  *
  */
  public void setstdout( String value ) {
    stdout = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of stdout.
  *
  *  @param   value will update stdout, which is a Expression type.
  *
  */
  public void setstdout( Expression value ) {
    stdout = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of stdout.
  *
  *  @return   This method will return the value of stdout, which is a Object type.
  *
  */
  public Object getstdout() {
    return stdout;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of successCodes.
  *
  *  @param   value will update successCodes, which is a Integer type.
  *
  */
  public void setsuccessCodes( Integer value ) {
    successCodes = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of successCodes.
  *
  *  @return   This method will return the value of successCodes, which is a Integer type.
  *
  */
  public Integer getsuccessCodes() {
    return successCodes;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of temporaryFailCodes.
  *
  *  @param   value will update temporaryFailCodes, which is a Integer type.
  *
  */
  public void settemporaryFailCodes( Integer value ) {
    temporaryFailCodes = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of temporaryFailCodes.
  *
  *  @return   This method will return the value of temporaryFailCodes, which is a Integer type.
  *
  */
  public Integer gettemporaryFailCodes() {
    return temporaryFailCodes;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of baseCommand.
  *
  *  @param   value will update baseCommand, which is a String type.
  *
  */
  public void setbaseCommand( String value ) {
    baseCommand = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of baseCommand.
  *
  *  @param   value will update baseCommand, which is a String array.
  *
  */
  public void setbaseCommand( String [] value ) {
    baseCommand = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of baseCommand.
  *
  *  @return   This method will return the value of baseCommand, which is a Object type.
  *
  */
  public Object getbaseCommand() {
    return baseCommand;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of arguments.
  *
  *  @param   value will update arguments, which is a Expression array.
  *
  */
  public void setarguments( Expression [] value ) {
    arguments = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of arguments.
  *
  *  @param   value will update arguments, which is a CommandLineBinding array.
  *
  */
  public void setarguments( CommandLineBinding [] value ) {
    arguments = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of arguments.
  *
  *  @param   value will update arguments, which is a String array.
  *
  */
  public void setarguments( String [] value ) {
    arguments = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of arguments.
  *
  *  @return   This method will return the value of arguments, which is a Object type.
  *
  */
  public Object getarguments() {
    return arguments;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of stderr.
  *
  *  @param   value will update stderr, which is a String type.
  *
  */
  public void setstderr( String value ) {
    stderr = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of stderr.
  *
  *  @param   value will update stderr, which is a Expression type.
  *
  */
  public void setstderr( Expression value ) {
    stderr = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of stderr.
  *
  *  @return   This method will return the value of stderr, which is a Object type.
  *
  */
  public Object getstderr() {
    return stderr;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of class_value.
  *
  *  @param   value will update class_value, which is a String type.
  *
  */
  public void setclass( String value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a String type.
  *
  */
  public String getclass() {
    return class_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of permanentFailCodes.
  *
  *  @param   value will update permanentFailCodes, which is a Integer type.
  *
  */
  public void setpermanentFailCodes( Integer value ) {
    permanentFailCodes = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of permanentFailCodes.
  *
  *  @return   This method will return the value of permanentFailCodes, which is a Integer type.
  *
  */
  public Integer getpermanentFailCodes() {
    return permanentFailCodes;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outputs.
  *
  *  @param   value will update outputs, which is a OutputParameter array.
  *
  */
  public void setoutputs( CommandOutputParameter [] value ) {
    outputs = value;
  }

  /*****************************************************************************************************
  *
  *  This is a dummy method which has no functionality, and is required 
  *  for implementing an interface method that was previously specialized.
  *
  *
  */
  public void setoutputs( OutputParameter [] value ) {

  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outputs.
  *
  *  @return   This method will return the value of outputs, which is a CommandOutputParameter array.
  *
  */
  public CommandOutputParameter [] getoutputs() {
    return outputs;
  }

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
  *  This method sets the value of cwlVersion.
  *
  *  @param   value will update cwlVersion, which is a CWLVersion type.
  *
  */
  public void setcwlVersion( CWLVersion value ) {
    cwlVersion = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of cwlVersion.
  *
  *  @return   This method will return the value of cwlVersion, which is a CWLVersion type.
  *
  */
  public CWLVersion getcwlVersion() {
    return cwlVersion;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of inputs.
  *
  *  @param   value will update inputs, which is a InputParameter array.
  *
  */
  public void setinputs( CommandInputParameter [] value ) {
    inputs = value;
  }

  /*****************************************************************************************************
  *
  *  This is a dummy method which has no functionality, and is required 
  *  for implementing an interface method that was previously specialized.
  *
  *
  */
  public void setinputs( InputParameter [] value ) {

  }

  /*****************************************************************************************************
  *
  *  This method returns the value of inputs.
  *
  *  @return   This method will return the value of inputs, which is a CommandInputParameter array.
  *
  */
  public CommandInputParameter [] getinputs() {
    return inputs;
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

}