package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#InputBinding</I><BR>This interface is implemented by {@link InputBindingImpl}<BR>
 */
public interface InputBinding extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InputBinding/loadContents</I><BR>
   * <BLOCKQUOTE>
   * Use of `loadContents` in `InputBinding` is deprecated.
   * Preserved for v1.0 backwards compatability.  Will be removed in
   * CWL v2.0.  Use `InputParameter.loadContents` instead.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<Boolean> getLoadContents();
}
