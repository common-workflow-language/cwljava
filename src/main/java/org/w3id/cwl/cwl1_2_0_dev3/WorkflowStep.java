package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#WorkflowStep</I><br>
 * This interface is implemented by {@link WorkflowStepImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * A workflow step is an executable element of a workflow. It specifies the underlying process
 * implementation (such as `CommandLineTool` or another `Workflow`) in the `run` field and connects
 * the input and output parameters of the underlying process to workflow parameters.
 *
 * <p># Scatter/gather
 *
 * <p>To use scatter/gather, [ScatterFeatureRequirement](#ScatterFeatureRequirement) must be
 * specified in the workflow or workflow step requirements.
 *
 * <p>A "scatter" operation specifies that the associated workflow step or subworkflow should
 * execute separately over a list of input elements. Each job making up a scatter operation is
 * independent and may be executed concurrently.
 *
 * <p>The `scatter` field specifies one or more input parameters which will be scattered. An input
 * parameter may be listed more than once. The declared type of each input parameter is implicitly
 * becomes an array of items of the input parameter type. If a parameter is listed more than once,
 * it becomes a nested array. As a result, upstream parameters which are connected to scattered
 * parameters must be arrays.
 *
 * <p>All output parameter types are also implicitly wrapped in arrays. Each job in the scatter
 * results in an entry in the output array.
 *
 * <p>If any scattered parameter runtime value is an empty array, all outputs are set to empty
 * arrays and no work is done for the step, according to applicable scattering rules.
 *
 * <p>If `scatter` declares more than one input parameter, `scatterMethod` describes how to
 * decompose the input into a discrete set of jobs.
 *
 * <p>**dotproduct** specifies that each of the input arrays are aligned and one element taken from
 * each array to construct each job. It is an error if all input arrays are not the same length.
 *
 * <p>**nested_crossproduct** specifies the Cartesian product of the inputs, producing a job for
 * every combination of the scattered inputs. The output must be nested arrays for each level of
 * scattering, in the order that the input arrays are listed in the `scatter` field.
 *
 * <p>**flat_crossproduct** specifies the Cartesian product of the inputs, producing a job for every
 * combination of the scattered inputs. The output arrays must be flattened to a single level, but
 * otherwise listed in the order that the input arrays are listed in the `scatter` field.
 *
 * <p># Conditional execution
 *
 * <p>Conditional execution makes execution of a step conditional on an expression. A step that is
 * not executed is "skipped". A skipped step produces `null` for all output parameters.
 *
 * <p>The condition is evaluated after `scatter`, using the input object of each individual scatter
 * job. This means over a set of scatter jobs, some may be executed and some may be skipped. When
 * the results are gathered, skipped steps must be `null` in the output arrays.
 *
 * <p>The `when` field controls conditional execution. This is an expression that must be evaluated
 * with `inputs` bound to the step input object (or individual scatter job), and returns a boolean
 * value. It is an error if this expression returns a value other than `true` or `false`.
 *
 * <p># Subworkflows
 *
 * <p>To specify a nested workflow as part of a workflow step,
 * [SubworkflowFeatureRequirement](#SubworkflowFeatureRequirement) must be specified in the workflow
 * or workflow step requirements.
 *
 * <p>It is a fatal error if a workflow directly or indirectly invokes itself as a subworkflow
 * (recursive workflows are not allowed).
 *
 * </BLOCKQUOTE>
 */
public interface WorkflowStep extends Identified, Labeled, Documented, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Identified/id</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The unique identifier for this object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getId();
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
   * Getter for property <I>https://w3id.org/cwl/cwl#in</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the input parameters of the workflow step. The process is ready to run when all
   * required input parameters are associated with concrete values. Input parameters include a
   * schema for each parameter which is used to validate the input object. It may also be used build
   * a user interface for constructing the input object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getIn();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#out</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the parameters representing the output of the process. May be used to generate and/or
   * validate the output object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getOut();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#requirements</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares requirements that apply to either the runtime environment or the workflow engine that
   * must be met in order to execute this workflow step. If an implementation cannot satisfy all
   * requirements, or a requirement is listed which is not recognized by the implementation, it is a
   * fatal error and the implementation must not attempt to run the process, unless overridden at
   * user option. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<java.util.List<Object>> getRequirements();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#hints</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares hints applying to either the runtime environment or the workflow engine that may be
   * helpful in executing this workflow step. It is not an error if an implementation cannot satisfy
   * all hints, however the implementation may report a warning. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<java.util.List<Object>> getHints();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#run</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Specifies the process to run. *
   *
   * </BLOCKQUOTE>
   */
  Object getRun();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#WorkflowStep/when</I><br>
   *
   * <BLOCKQUOTE>
   *
   * If defined, only run the step when the expression evaluates to `true`. If `false` the step is
   * skipped. A skipped step produces a `null` on each output. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Expression> getWhen();
  /** Getter for property <I>https://w3id.org/cwl/cwl#scatter</I><br> */
  Object getScatter();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#scatterMethod</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Required if `scatter` is an array of more than one element. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<ScatterMethod> getScatterMethod();
}
