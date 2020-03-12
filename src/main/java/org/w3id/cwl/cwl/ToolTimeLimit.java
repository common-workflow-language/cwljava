package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#ToolTimeLimit</I><br>
 * This interface is implemented by {@link ToolTimeLimitImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Set an upper limit on the execution time of a CommandLineTool. A CommandLineTool whose execution
 * duration exceeds the time limit may be preemptively terminated and considered failed. May also be
 * used by batch systems to make scheduling decisions. The execution duration excludes external
 * operations, such as staging of files, pulling a docker image etc, and only counts wall-time for
 * the execution of the command line itself.
 *
 * </BLOCKQUOTE>
 */
public interface ToolTimeLimit extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ToolTimeLimit/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'ToolTimeLimit' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ToolTimeLimit/timelimit</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The time limit, in seconds. A time limit of zero means no time limit. Negative time limits are
   * an error. *
   *
   * </BLOCKQUOTE>
   */
  Object getTimelimit();
}
