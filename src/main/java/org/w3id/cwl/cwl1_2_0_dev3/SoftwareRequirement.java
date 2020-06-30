package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#SoftwareRequirement</I><br>
 * This interface is implemented by {@link SoftwareRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * A list of software packages that should be configured in the environment of the defined process.
 *
 * </BLOCKQUOTE>
 */
public interface SoftwareRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SoftwareRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'SoftwareRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SoftwareRequirement/packages</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of software to be configured. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getPackages();
}
