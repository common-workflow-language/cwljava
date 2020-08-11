package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandLineBindable</I><BR>This interface is implemented by {@link CommandLineBindableImpl}<BR>
 */
public interface CommandLineBindable extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><BR>
   * <BLOCKQUOTE>
   * Describes how to turn this object into command line arguments.   * </BLOCKQUOTE>
   */

  java.util.Optional<CommandLineBinding> getInputBinding();
}
