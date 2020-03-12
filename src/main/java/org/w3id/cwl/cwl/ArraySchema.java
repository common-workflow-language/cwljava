package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/salad#ArraySchema</I><br>
 * This interface is implemented by {@link ArraySchemaImpl}<br>
 */
public interface ArraySchema extends Savable {
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
}
