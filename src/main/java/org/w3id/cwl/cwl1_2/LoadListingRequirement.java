package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#LoadListingRequirement</I><BR>This interface is implemented by {@link LoadListingRequirementImpl}<BR> <BLOCKQUOTE>
 Specify the desired behavior for loading the `listing` field of
 a Directory object for use by expressions.
  </BLOCKQUOTE>
 */
public interface LoadListingRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadListingRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'LoadListingRequirement'   * </BLOCKQUOTE>
   */

  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadListingRequirement/loadListing</I><BR>

   */

  java.util.Optional<LoadListingEnum> getLoadListing();
}
