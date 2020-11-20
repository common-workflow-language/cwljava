package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement</I><BR>This interface is implemented by {@link SubworkflowFeatureRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that the workflow platform must support nested workflows in
 the `run` field of [WorkflowStep](#WorkflowStep).
  </BLOCKQUOTE>
 */
public interface SubworkflowFeatureRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'SubworkflowFeatureRequirement'   * </BLOCKQUOTE>
   */

  SubworkflowFeatureRequirement_class getClass_();
}
