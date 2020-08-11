package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandInputArraySchema</I><BR>This interface is implemented by {@link CommandInputArraySchemaImpl}<BR>
 */
public interface CommandInputArraySchema extends InputArraySchema, CommandInputSchema, CommandLineBindable, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#IOSchema/name</I><BR>
   * <BLOCKQUOTE>
   * The identifier for this type   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#items</I><BR>
   * <BLOCKQUOTE>
   * Defines the type of the array elements.   * </BLOCKQUOTE>
   */

  Object getItems();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * Must be `array`   * </BLOCKQUOTE>
   */

  enum_d062602be0b4b8fd33e69e29a841317b6ab665bc getType();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><BR>
   * <BLOCKQUOTE>
   * Describes how to turn this object into command line arguments.   * </BLOCKQUOTE>
   */

  java.util.Optional<CommandLineBinding> getInputBinding();
}
