package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#ScatterFeatureRequirement</I><BR>This interface is implemented by {@link ScatterFeatureRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that the workflow platform must support the `scatter` and
 `scatterMethod` fields of [WorkflowStep](#WorkflowStep).
  </BLOCKQUOTE>
 */
public interface ScatterFeatureRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ScatterFeatureRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'ScatterFeatureRequirement'   * </BLOCKQUOTE>
   */

  String getClass_();
}
