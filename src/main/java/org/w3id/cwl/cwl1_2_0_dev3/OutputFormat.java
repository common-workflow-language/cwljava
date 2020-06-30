package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/** Auto-generated interface for <I>https://w3id.org/cwl/cwl#OutputFormat</I><br> */
public interface OutputFormat extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>This is the file format that will be assigned to the output File object. *
   *
   * </BLOCKQUOTE>
   */
  Object getFormat();
}
