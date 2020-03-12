package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#WorkReuse</I><br>
 * This interface is implemented by {@link WorkReuseImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * For implementations that support reusing output from past work (on the assumption that same code
 * and same input produce same results), control whether to enable or disable the reuse behavior for
 * a particular tool or step (to accomodate situations where that assumption is incorrect). A reused
 * step is not executed but instead returns the same output as the original execution.
 *
 * <p>If `enableReuse` is not specified, correct tools should assume it is enabled by default.
 *
 * </BLOCKQUOTE>
 */
public interface WorkReuse extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#WorkReuse/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'WorkReuse' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /** Getter for property <I>https://w3id.org/cwl/cwl#WorkReuse/enableReuse</I><br> */
  Object getEnableReuse();
}
