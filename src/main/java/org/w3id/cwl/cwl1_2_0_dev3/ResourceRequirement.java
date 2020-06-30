package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

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
   * Minimum reserved number of CPU cores (default is 1).
   *
   * <p>May be a fractional value to indicate to a scheduling algorithm that one core can be
   * allocated to multiple jobs. For example, a value of 0.25 indicates that up to 4 jobs may run in
   * parallel on 1 core. A value of 1.25 means that up to 3 jobs can run on a 4 core system (4/1.25
   * ≈ 3).
   *
   * <p>Processes can only share a core allocation if the sum of each of their `ramMax`,
   * `tmpdirMax`, and `outdirMax` requests also do not exceed the capacity of the node.
   *
   * <p>Processes sharing a core must have the same level of isolation (typically a container or VM)
   * that they would normally.
   *
   * <p>The reported number of CPU cores reserved for the process, which is available to expressions
   * on the CommandLineTool as `runtime.cores`, must be a non-zero integer, and may be calculated by
   * rounding up the cores request to the next whole number.
   *
   * <p>Scheduling systems may allocate fractional CPU resources by setting quotas or scheduling
   * weights. Scheduling systems that do not support fractional CPUs may round up the request to the
   * next whole number. *
   *
   * </BLOCKQUOTE>
   */
  Object getCoresMin();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/coresMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved number of CPU cores.
   *
   * <p>See `coresMin` for discussion about fractional CPU requests. *
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
