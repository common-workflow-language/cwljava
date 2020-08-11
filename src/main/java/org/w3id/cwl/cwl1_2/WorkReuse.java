package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#WorkReuse</I><BR>This interface is implemented by {@link WorkReuseImpl}<BR> <BLOCKQUOTE>
 For implementations that support reusing output from past work (on
 the assumption that same code and same input produce same
 results), control whether to enable or disable the reuse behavior
 for a particular tool or step (to accomodate situations where that
 assumption is incorrect).  A reused step is not executed but
 instead returns the same output as the original execution.
 
 If `WorkReuse` is not specified, correct tools should assume it
 is enabled by default.
  </BLOCKQUOTE>
 */
public interface WorkReuse extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#WorkReuse/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'WorkReuse'   * </BLOCKQUOTE>
   */

  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#WorkReuse/enableReuse</I><BR>

   */

  Object getEnableReuse();
}
