package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#StepInputExpressionRequirement</I><br>
 * This interface is implemented by {@link StepInputExpressionRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Indicate that the workflow platform must support the `valueFrom` field of
 * [WorkflowStepInput](#WorkflowStepInput).
 *
 * </BLOCKQUOTE>
 */
public interface StepInputExpressionRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#StepInputExpressionRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'StepInputExpressionRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
}