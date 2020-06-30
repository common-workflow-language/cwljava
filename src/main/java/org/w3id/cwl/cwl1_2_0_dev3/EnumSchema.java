package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/salad#EnumSchema</I><br>
 * This interface is implemented by {@link EnumSchemaImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Define an enumerated type.
 *
 * </BLOCKQUOTE>
 */
public interface EnumSchema extends Savable {
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
}
