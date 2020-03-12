package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/** Auto-generated interface for <I>https://w3id.org/cwl/cwl#OutputSchema</I><br> */
public interface OutputSchema extends IOSchema, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A short, human-readable label of this object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A documentation string for this object, or an array of strings which should be concatenated. *
   *
   * </BLOCKQUOTE>
   */
  Object getDoc();
}
