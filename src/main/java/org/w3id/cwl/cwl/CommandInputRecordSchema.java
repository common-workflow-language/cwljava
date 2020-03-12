package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandInputRecordSchema</I><br>
 * This interface is implemented by {@link CommandInputRecordSchemaImpl}<br>
 */
public interface CommandInputRecordSchema
    extends InputRecordSchema, CommandInputSchema, CommandLineBindable, Savable {
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
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Describes how to turn this object into command line arguments. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<CommandLineBinding> getInputBinding();
}
