package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#ResourceRequirement</I><br>
 * This interface is implemented by {@link ResourceRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Specify basic hardware resource requirements.
 *
 * <p>"min" is the minimum amount of a resource that must be reserved to schedule a job. If "min"
 * cannot be satisfied, the job should not be run.
 *
 * <p>"max" is the maximum amount of a resource that the job shall be permitted to use. If a node
 * has sufficient resources, multiple jobs may be scheduled on a single node provided each job's
 * "max" resource requirements are met. If a job attempts to exceed its "max" resource allocation,
 * an implementation may deny additional resources, which may result in job failure.
 *
 * <p>If "min" is specified but "max" is not, then "max" == "min" If "max" is specified by "min" is
 * not, then "min" == "max".
 *
 * <p>It is an error if max < min.
 *
 * <p>It is an error if the value of any of these fields is negative.
 *
 * <p>If neither "min" nor "max" is specified for a resource, use the default values below.
 *
 * </BLOCKQUOTE>
 */
public interface ResourceRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'ResourceRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/coresMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved number of CPU cores (default is 1) *
   *
   * </BLOCKQUOTE>
   */
  Object getCoresMin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/coresMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved number of CPU cores *
   *
   * </BLOCKQUOTE>
   */
  Object getCoresMax();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/ramMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved RAM in mebibytes (2**20) (default is 256) *
   *
   * </BLOCKQUOTE>
   */
  Object getRamMin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/ramMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved RAM in mebibytes (2**20) *
   *
   * </BLOCKQUOTE>
   */
  Object getRamMax();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/tmpdirMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved filesystem based storage for the designated temporary directory, in mebibytes
   * (2**20) (default is 1024) *
   *
   * </BLOCKQUOTE>
   */
  Object getTmpdirMin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/tmpdirMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved filesystem based storage for the designated temporary directory, in mebibytes
   * (2**20) *
   *
   * </BLOCKQUOTE>
   */
  Object getTmpdirMax();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/outdirMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved filesystem based storage for the designated output directory, in mebibytes
   * (2**20) (default is 1024) *
   *
   * </BLOCKQUOTE>
   */
  Object getOutdirMin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/outdirMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved filesystem based storage for the designated output directory, in mebibytes
   * (2**20) *
   *
   * </BLOCKQUOTE>
   */
  Object getOutdirMax();
}
