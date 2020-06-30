package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#WorkflowStepInput</I><br>
 * This interface is implemented by {@link WorkflowStepInputImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * The input of a workflow step connects an upstream parameter (from the workflow inputs, or the
 * outputs of other workflows steps) with the input parameters of the process specified by the `run`
 * field. Only input parameters declared by the target process will be passed through at runtime to
 * the process though additonal parameters may be specified (for use within `valueFrom` expressions
 * for instance) - unconnected or unused parameters do not represent an error condition.
 *
 * <p># Input object
 *
 * <p>A WorkflowStepInput object must contain an `id` field in the form `#fieldname` or
 * `#prefix/fieldname`. When the `id` field contains a slash `/` the field name consists of the
 * characters following the final slash (the prefix portion may contain one or more slashes to
 * indicate scope). This defines a field of the workflow step input object with the value of the
 * `source` parameter(s).
 *
 * <p># Merging multiple inbound data links
 *
 * <p>To merge multiple inbound data links,
 * [MultipleInputFeatureRequirement](#MultipleInputFeatureRequirement) must be specified in the
 * workflow or workflow step requirements.
 *
 * <p>If the sink parameter is an array, or named in a [workflow scatter](#WorkflowStep) operation,
 * there may be multiple inbound data links listed in the `source` field. The values from the input
 * links are merged depending on the method specified in the `linkMerge` field. If not specified,
 * the default method is "merge_nested".
 *
 * <p>**merge_nested**
 *
 * <p>The input must be an array consisting of exactly one entry for each input link. If
 * "merge_nested" is specified with a single link, the value from the link must be wrapped in a
 * single-item list.
 *
 * <p>**merge_flattened**
 *
 * <p>1. The source and sink parameters must be compatible types, or the source type must be
 * compatible with single element from the "items" type of the destination array parameter. 2.
 * Source parameters which are arrays are concatenated. Source parameters which are single element
 * types are appended as single elements.
 *
 * <p># Picking non-null values among inbound data links
 *
 * <p>If present, `pickValue` specifies how to picking non-null values among inbound data links.
 *
 * <p>`pickValue` is evaluated 1. Once all source values from upstream step or parameters are
 * available. 2. After `linkMerge`. 3. Before `scatter` or `valueFrom`.
 *
 * <p>This is specifically intended to be useful in combination with [conditional
 * execution](#WorkflowStep), where several upstream steps may be connected to a single input
 * (`source` is a list), and skipped steps produce null values.
 *
 * <p>Static type checkers should check for type consistency after infering what the type will be
 * after `pickValue` is applied, just as they do currently for `linkMerge`.
 *
 * <p>**first_non_null**
 *
 * <p>For the first level of a list input, pick the first non-null element. The result is a scalar.
 * It is an error if there is no non-null element. Examples: `[null, x, null, y] -> x` `[null,
 * [null], null, y] -> [null]` `[null, null, null] -> Runtime Error`
 *
 * <p>Intended use case*: If-else pattern where the value comes either from a conditional step or
 * from a default or fallback value. The conditional step(s) should be placed first in the list.
 *
 * <p>**the_only_non_null**
 *
 * <p>For the first level of a list input, pick the single non-null element. The result is a scalar.
 * It is an error if there is more than one non-null element. Examples:
 *
 * <p>`[null, x, null] -> x` `[null, x, null, y] -> Runtime Error` `[null, [null], null] -> [null]`
 * `[null, null, null] -> Runtime Error`
 *
 * <p>Intended use case*: Switch type patterns where developer considers more than one active code
 * path as a workflow error (possibly indicating an error in writing `when` condition expressions).
 *
 * <p>**all_non_null**
 *
 * <p>For the first level of a list input, pick all non-null values. The result is a list, which may
 * be empty. Examples:
 *
 * <p>`[null, x, null] -> [x]` `[x, null, y] -> [x, y]` `[null, [x], [null]] -> [[x], [null]]`
 * `[null, null, null] -> []`
 *
 * <p>Intended use case*: It is valid to have more than one source, but sources are conditional, so
 * null sources (from skipped steps) should be filtered out.
 *
 * </BLOCKQUOTE>
 */
public interface WorkflowStepInput extends Identified, Sink, LoadContents, Labeled, Savable {
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
   * Getter for property <I>https://w3id.org/cwl/cwl#source</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Specifies one or more workflow parameters that will provide input to the underlying step
   * parameter. *
   *
   * </BLOCKQUOTE>
   */
  Object getSource();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Sink/linkMerge</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The method to use to merge multiple inbound links into a single array. If not specified, the
   * default method is "merge_nested". *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<LinkMergeMethod> getLinkMerge();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Sink/pickValue</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The method to use to choose non-null elements among multiple sources. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<PickValueMethod> getPickValue();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadContents</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Read up to the first 64 KiB of text from the file and place it in the "contents" field of
   * the file object for use by expressions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getLoadContents();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadListing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: Directory` or is an array of `items: Directory`.
   *
   * <p>Specify the desired behavior for loading the `listing` field of a Directory object for use
   * by expressions.
   *
   * <p>The order of precedence for loadListing is:
   *
   * <p>1. `loadListing` on an individual parameter 2. Inherited from `LoadListingRequirement` 3. By
   * default: `no_listing` *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<LoadListingEnum> getLoadListing();
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
   * Getter for property <I>https://w3id.org/cwl/salad#default</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The default value for this parameter to use if either there is no `source` field, or the value
   * produced by the `source` is `null`. The default must be applied prior to scattering or
   * evaluating `valueFrom`. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Object> getDefault();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#WorkflowStepInput/valueFrom</I><br>
   *
   * <BLOCKQUOTE>
   *
   * To use valueFrom, [StepInputExpressionRequirement](#StepInputExpressionRequirement) must be
   * specified in the workflow or workflow step requirements.
   *
   * <p>If `valueFrom` is a constant string value, use this as the value for this input parameter.
   *
   * <p>If `valueFrom` is a parameter reference or expression, it must be evaluated to yield the
   * actual value to be assiged to the input field.
   *
   * <p>The `self` value in the parameter reference or expression must be 1. `null` if there is no
   * `source` field 2. the value of the parameter(s) specified in the `source` field when this
   * workflow input parameter **is not** specified in this workflow step's `scatter` field. 3. an
   * element of the parameter specified in the `source` field when this workflow input parameter
   * **is** specified in this workflow step's `scatter` field.
   *
   * <p>The value of `inputs` in the parameter reference or expression must be the input object to
   * the workflow step after assigning the `source` values, applying `default`, and then scattering.
   * The order of evaluating `valueFrom` among step input parameters is undefined and the result of
   * evaluating `valueFrom` on a parameter must not be visible to evaluation of `valueFrom` on other
   * parameters. *
   *
   * </BLOCKQUOTE>
   */
  Object getValueFrom();
}
