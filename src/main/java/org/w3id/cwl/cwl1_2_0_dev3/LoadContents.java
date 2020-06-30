package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/** Auto-generated interface for <I>https://w3id.org/cwl/cwl#LoadContents</I><br> */
public interface LoadContents extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadContents</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Read up to the first 64 KiB of text from the file and place it in the "contents" field of
   * the file object for use by expressions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getLoadContents();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadListing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: Directory` or is an array of `items: Directory`.
   *
   * <p>Specify the desired behavior for loading the `listing` field of a Directory object for use
   * by expressions.
   *
   * <p>The order of precedence for loadListing is:
   *
   * <p>1. `loadListing` on an individual parameter 2. Inherited from `LoadListingRequirement` 3. By
   * default: `no_listing` *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<LoadListingEnum> getLoadListing();
}
