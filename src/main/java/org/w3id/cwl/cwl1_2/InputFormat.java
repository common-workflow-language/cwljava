package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#InputFormat</I><BR>
 */
public interface InputFormat extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * This must be one or more IRIs of concept nodes
   * that represents file formats which are allowed as input to this
   * parameter, preferrably defined within an ontology.  If no ontology is
   * available, file formats may be tested by exact match.
   *    * </BLOCKQUOTE>
   */

  Object getFormat();
}
