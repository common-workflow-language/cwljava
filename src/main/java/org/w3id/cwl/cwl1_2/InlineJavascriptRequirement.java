package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement</I><BR>This interface is implemented by {@link InlineJavascriptRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that the workflow platform must support inline Javascript expressions.
 If this requirement is not present, the workflow platform must not perform expression
 interpolatation.
  </BLOCKQUOTE>
 */
public interface InlineJavascriptRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'InlineJavascriptRequirement'   * </BLOCKQUOTE>
   */

  InlineJavascriptRequirement_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement/expressionLib</I><BR>
   * <BLOCKQUOTE>
   * Additional code fragments that will also be inserted
   * before executing the expression code.  Allows for function definitions that may
   * be called from CWL expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getExpressionLib();
}
