package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/salad#RecordSchema</I><br>
 * This interface is implemented by {@link RecordSchemaImpl}<br>
 */
public interface RecordSchema extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#fields</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the fields of the record. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<java.util.List<Object>> getFields();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Must be `record` *
   *
   * </BLOCKQUOTE>
   */
  enum_d9cba076fca539106791a4f46d198c7fcfbdb779 getType();
}
