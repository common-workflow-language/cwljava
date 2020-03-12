package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#Process</I><br>
 *
 * <BLOCKQUOTE>
 *
 * The base executable type in CWL is the `Process` object defined by the document. Note that the
 * `Process` object is abstract and cannot be directly executed.
 *
 * </BLOCKQUOTE>
 */
public interface Process extends Identified, Labeled, Documented, Savable {
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
}
