package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#ExpressionTool</I><br>
 * This interface is implemented by {@link ExpressionToolImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * An ExpressionTool is a type of Process object that can be run by itself or as a Workflow step. It
 * executes a pure Javascript expression that has access to the same input parameters as a workflow.
 * It is meant to be used sparingly as a way to isolate complex Javascript expressions that need to
 * operate on input data and produce some result; perhaps just a rearrangement of the inputs. No
 * Docker software container is required or allowed.
 *
 * </BLOCKQUOTE>
 */
public interface ExpressionTool extends Process, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Identified/id</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The unique identifier for this object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getId();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A short, human-readable label of this object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A documentation string for this object, or an array of strings which should be concatenated. *
   *
   * </BLOCKQUOTE>
   */
  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#inputs</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the input parameters of the process. The process is ready to run when all required
   * input parameters are associated with concrete values. Input parameters include a schema for
   * each parameter which is used to validate the input object. It may also be used to build a user
   * interface for constructing the input object.
   *
   * <p>When accepting an input object, all input parameters must have a value. If an input
   * parameter is missing from the input object, it must be assigned a value of `null` (or the value
   * of `default` for that parameter, if provided) for the purposes of validation and evaluation of
   * expressions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getInputs();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#outputs</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the parameters representing the output of the process. May be used to generate and/or
   * validate the output object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getOutputs();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#requirements</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares requirements that apply to either the runtime environment or the workflow engine that
   * must be met in order to execute this process. If an implementation cannot satisfy all
   * requirements, or a requirement is listed which is not recognized by the implementation, it is a
   * fatal error and the implementation must not attempt to run the process, unless overridden at
   * user option. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<java.util.List<Object>> getRequirements();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#hints</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares hints applying to either the runtime environment or the workflow engine that may be
   * helpful in executing this process. It is not an error if an implementation cannot satisfy all
   * hints, however the implementation may report a warning. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<java.util.List<Object>> getHints();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#cwlVersion</I><br>
   *
   * <BLOCKQUOTE>
   *
   * CWL document version. Always required at the document root. Not required for a Process embedded
   * inside another Process. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<CWLVersion> getCwlVersion();
  /** Getter for property <I>https://w3id.org/cwl/cwl#Process/intent</I><br> */
  java.util.Optional<java.util.List<Object>> getIntent();
  /** Getter for property <I>https://w3id.org/cwl/cwl#ExpressionTool/class</I><br> */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ExpressionTool/expression</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The expression to execute. The expression must return a JSON object which matches the output
   * parameters of the ExpressionTool. *
   *
   * </BLOCKQUOTE>
   */
  Expression getExpression();
}
