package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandOutputEnumSchema</I><br>
 * This interface is implemented by {@link CommandOutputEnumSchemaImpl}<br>
 */
public interface CommandOutputEnumSchema extends OutputEnumSchema, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#IOSchema/name</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The identifier for this type *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#symbols</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the set of valid symbols. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getSymbols();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Must be `enum` *
   *
   * </BLOCKQUOTE>
   */
  enum_d961d79c225752b9fadb617367615ab176b47d77 getType();
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
