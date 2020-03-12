package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement</I><br>
 * This interface is implemented by {@link SubworkflowFeatureRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Indicates that the workflow platform must support nested workflows in the `run` field of
 * [WorkflowStep](#WorkflowStep).
 *
 * </BLOCKQUOTE>
 */
public interface SubworkflowFeatureRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'SubworkflowFeatureRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
}
