package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#InputBinding</I><br>
 * This interface is implemented by {@link InputBindingImpl}<br>
 */
public interface InputBinding extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InputBinding/loadContents</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Use of `loadContents` in `InputBinding` is deprecated. Preserved for v1.0 backwards
   * compatability. Will be removed in CWL v2.0. Use `InputParameter.loadContents` instead.
   *
   * <p>Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Read up to the first 64 KiB of text from the file and place it in the "contents" field of
   * the file object for use by expressions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getLoadContents();
}
