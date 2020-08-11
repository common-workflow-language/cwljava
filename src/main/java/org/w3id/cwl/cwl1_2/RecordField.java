package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/salad#RecordField</I><BR>This interface is implemented by {@link RecordFieldImpl}<BR> <BLOCKQUOTE>
 A field of a record. </BLOCKQUOTE>
 */
public interface RecordField extends Documented, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#RecordField/name</I><BR>
   * <BLOCKQUOTE>
   * The name of the field
   *    * </BLOCKQUOTE>
   */

  String getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * The field type
   *    * </BLOCKQUOTE>
   */

  Object getType();
}
