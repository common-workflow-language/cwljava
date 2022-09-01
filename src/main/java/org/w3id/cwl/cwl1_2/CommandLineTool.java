// Copyright Common Workflow Language project contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Saveable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandLineTool</I><BR>This interface is implemented by {@link CommandLineToolImpl}<BR> <BLOCKQUOTE>
 This defines the schema of the CWL Command Line Tool Description document.
  </BLOCKQUOTE>
 */
public interface CommandLineTool extends Process, Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Process/id</I><BR>
   * <BLOCKQUOTE>
   * The unique identifier for this object.
   * 
   * Only useful for `$graph` at `Process` level. Should not be exposed
   * to users in graphical or terminal user interfaces.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getId();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/class</I><BR>

   */

  CommandLineTool_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#inputs</I><BR>
   * <BLOCKQUOTE>
   * Defines the input parameters of the process.  The process is ready to
   * run when all required input parameters are associated with concrete
   * values.  Input parameters include a schema for each parameter which is
   * used to validate the input object.  It may also be used to build a user
   * interface for constructing the input object.
   * 
   * When accepting an input object, all input parameters must have a value.
   * If an input parameter is missing from the input object, it must be
   * assigned a value of `null` (or the value of `default` for that
   * parameter, if provided) for the purposes of validation and evaluation
   * of expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.List<Object> getInputs();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#outputs</I><BR>
   * <BLOCKQUOTE>
   * Defines the parameters representing the output of the process.  May be
   * used to generate and/or validate the output object.
   *    * </BLOCKQUOTE>
   */

  java.util.List<Object> getOutputs();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#requirements</I><BR>
   * <BLOCKQUOTE>
   * Declares requirements that apply to either the runtime environment or the
   * workflow engine that must be met in order to execute this process.  If
   * an implementation cannot satisfy all requirements, or a requirement is
   * listed which is not recognized by the implementation, it is a fatal
   * error and the implementation must not attempt to run the process,
   * unless overridden at user option.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getRequirements();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#hints</I><BR>
   * <BLOCKQUOTE>
   * Declares hints applying to either the runtime environment or the
   * workflow engine that may be helpful in executing this process.  It is
   * not an error if an implementation cannot satisfy all hints, however
   * the implementation may report a warning.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getHints();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#cwlVersion</I><BR>
   * <BLOCKQUOTE>
   * CWL document version. Always required at the document root. Not
   * required for a Process embedded inside another Process.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<CWLVersion> getCwlVersion();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Process/intent</I><BR>
   * <BLOCKQUOTE>
   * An identifier for the type of computational operation, of this Process.
   * Especially useful for "class: Operation", but can also be used for
   * CommandLineTool, Workflow, or ExpressionTool.
   * 
   * If provided, then this must be an IRI of a concept node that
   * represents the type of operation, preferrably defined within an ontology.
   * 
   * For example, in the domain of bioinformatics, one can use an IRI from
   * the EDAM Ontology's [Operation concept nodes](http://edamontology.org/operation_0004),
   * like [Alignment](http://edamontology.org/operation_2928),
   * or [Clustering](http://edamontology.org/operation_3432); or a more
   * specific Operation concept like
   * [Split read mapping](http://edamontology.org/operation_3199).
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<String>> getIntent();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#baseCommand</I><BR>
   * <BLOCKQUOTE>
   * Specifies the program to execute.  If an array, the first element of
   * the array is the command to execute, and subsequent elements are
   * mandatory command line arguments.  The elements in `baseCommand` must
   * appear before any command line bindings from `inputBinding` or
   * `arguments`.
   * 
   * If `baseCommand` is not provided or is an empty array, the first
   * element of the command line produced after processing `inputBinding` or
   * `arguments` must be used as the program to execute.
   * 
   * If the program includes a path separator character it must
   * be an absolute path, otherwise it is an error.  If the program does not
   * include a path separator, search the `$PATH` variable in the runtime
   * environment of the workflow runner find the absolute path of the
   * executable.
   *    * </BLOCKQUOTE>
   */

  Object getBaseCommand();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#arguments</I><BR>
   * <BLOCKQUOTE>
   * Command line bindings which are not directly associated with input
   * parameters. If the value is a string, it is used as a string literal
   * argument. If it is an Expression, the result of the evaluation is used
   * as an argument.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getArguments();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/stdin</I><BR>
   * <BLOCKQUOTE>
   * A path to a file whose contents must be piped into the command's
   * standard input stream.
   *    * </BLOCKQUOTE>
   */

  Object getStdin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/stderr</I><BR>
   * <BLOCKQUOTE>
   * Capture the command's standard error stream to a file written to
   * the designated output directory.
   * 
   * If `stderr` is a string, it specifies the file name to use.
   * 
   * If `stderr` is an expression, the expression is evaluated and must
   * return a string with the file name to use to capture stderr.  If the
   * return value is not a string, or the resulting path contains illegal
   * characters (such as the path separator `/`) it is an error.
   *    * </BLOCKQUOTE>
   */

  Object getStderr();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/stdout</I><BR>
   * <BLOCKQUOTE>
   * Capture the command's standard output stream to a file written to
   * the designated output directory.
   * 
   * If the `CommandLineTool` contains logically chained commands
   * (e.g. `echo a && echo b`) `stdout` must include the output of
   * every command.
   * 
   * If `stdout` is a string, it specifies the file name to use.
   * 
   * If `stdout` is an expression, the expression is evaluated and must
   * return a string with the file name to use to capture stdout.  If the
   * return value is not a string, or the resulting path contains illegal
   * characters (such as the path separator `/`) it is an error.
   *    * </BLOCKQUOTE>
   */

  Object getStdout();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/successCodes</I><BR>
   * <BLOCKQUOTE>
   * Exit codes that indicate the process completed successfully.
   * 
   * If not specified, only exit code 0 is considered success.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getSuccessCodes();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/temporaryFailCodes</I><BR>
   * <BLOCKQUOTE>
   * Exit codes that indicate the process failed due to a possibly
   * temporary condition, where executing the process with the same
   * runtime environment and inputs may produce different results.
   * 
   * If not specified, no exit codes are considered temporary failure.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getTemporaryFailCodes();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineTool/permanentFailCodes</I><BR>
   * <BLOCKQUOTE>
   * Exit codes that indicate the process failed due to a permanent logic error, where executing the process with the same runtime environment and same inputs is expected to always fail.
   * If not specified, all exit codes except 0 are considered permanent failure.   * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getPermanentFailCodes();
}
