package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#MultipleInputFeatureRequirement</I><br>
 * This interface is implemented by {@link MultipleInputFeatureRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Indicates that the workflow platform must support multiple inbound data links listed in the
 * `source` field of [WorkflowStepInput](#WorkflowStepInput).
 *
 * </BLOCKQUOTE>
 */
public interface MultipleInputFeatureRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#MultipleInputFeatureRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'MultipleInputFeatureRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
}
