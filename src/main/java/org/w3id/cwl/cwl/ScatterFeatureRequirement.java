package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#ScatterFeatureRequirement</I><br>
 * This interface is implemented by {@link ScatterFeatureRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Indicates that the workflow platform must support the `scatter` and `scatterMethod` fields of
 * [WorkflowStep](#WorkflowStep).
 *
 * </BLOCKQUOTE>
 */
public interface ScatterFeatureRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ScatterFeatureRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'ScatterFeatureRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
}
