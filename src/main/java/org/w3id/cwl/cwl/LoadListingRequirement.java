package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#LoadListingRequirement</I><br>
 * This interface is implemented by {@link LoadListingRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Specify the desired behavior for loading the `listing` field of a Directory object for use by
 * expressions.
 *
 * </BLOCKQUOTE>
 */
public interface LoadListingRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadListingRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'LoadListingRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /** Getter for property <I>https://w3id.org/cwl/cwl#LoadListingRequirement/loadListing</I><br> */
  java.util.Optional<LoadListingEnum> getLoadListing();
}
