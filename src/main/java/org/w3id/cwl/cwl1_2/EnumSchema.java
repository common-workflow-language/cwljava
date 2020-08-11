package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/salad#EnumSchema</I><BR>This interface is implemented by {@link EnumSchemaImpl}<BR> <BLOCKQUOTE>
 Define an enumerated type.
  </BLOCKQUOTE>
 */
public interface EnumSchema extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#symbols</I><BR>
   * <BLOCKQUOTE>
   * Defines the set of valid symbols.   * </BLOCKQUOTE>
   */

  java.util.List<Object> getSymbols();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * Must be `enum`   * </BLOCKQUOTE>
   */

  enum_d961d79c225752b9fadb617367615ab176b47d77 getType();
}
