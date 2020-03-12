package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandOutputArraySchema</I><br>
 * This interface is implemented by {@link CommandOutputArraySchemaImpl}<br>
 */
public interface CommandOutputArraySchema extends OutputArraySchema, Savable {
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
   * Getter for property <I>https://w3id.org/cwl/salad#items</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the type of the array elements. *
   *
   * </BLOCKQUOTE>
   */
  Object getItems();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Must be `array` *
   *
   * </BLOCKQUOTE>
   */
  enum_d062602be0b4b8fd33e69e29a841317b6ab665bc getType();
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
