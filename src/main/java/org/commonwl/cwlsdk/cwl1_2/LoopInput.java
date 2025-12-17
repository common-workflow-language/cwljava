// Copyright Common Workflow Language project contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.commonwl.cwlsdk.cwl1_2;

import org.commonwl.cwlsdk.cwl1_2.utils.LoadingOptions;
import org.commonwl.cwlsdk.cwl1_2.utils.Saveable;

/**
* Auto-generated interface for <I>http://commonwl.org/cwltool#LoopInput</I><BR>This interface is implemented by {@link LoopInputImpl}<BR>
 */
public interface LoopInput extends Saveable {

  java.util.Map<String, Object> getExtensionFields();
  LoadingOptions getLoadingOptions();

  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/id</I><BR>
   * <BLOCKQUOTE>
   * It must reference the `id` of one of the elements in the `in` field of the step.   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getId();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#default</I><BR>
   * <BLOCKQUOTE>
   * The default value for this parameter to use if either there is no
   * `source` field, or the value produced by the `source` is `null`.  The
   * default must be applied prior to scattering or evaluating `valueFrom`.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<Object> getDefault();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/linkMerge</I><BR>
   * <BLOCKQUOTE>
   * The method to use to merge multiple inbound links into a single array.
   * If not specified, the default method is &quot;merge_nested&quot;.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<LinkMergeMethod> getLinkMerge();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/loopSource</I><BR>
   * <BLOCKQUOTE>
   * Specifies one or more of the step output parameters that will
   * provide input to the loop iterations after the first one (inputs
   * of the first iteration are the step input parameters).
   *    * </BLOCKQUOTE>
   */

  Object getLoopSource();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/pickValue</I><BR>
   * <BLOCKQUOTE>
   * The method to use to choose non-null elements among multiple sources.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<PickValueMethod> getPickValue();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/valueFrom</I><BR>
   * <BLOCKQUOTE>
   * To use valueFrom, [StepInputExpressionRequirement](#StepInputExpressionRequirement) must
   * be specified in the workflow or workflow step requirements.
   * 
   * If `valueFrom` is a constant string value, use this as the value for
   * this input parameter.
   * 
   * If `valueFrom` is a parameter reference or expression, it must be
   * evaluated to yield the actual value to be assigned to the input field.
   * 
   * The `self` value in the parameter reference or expression must be
   * `null` if there is no `loopSource` field, or the value of the
   * parameter(s) specified in the `loopSource` field.
   * 
   * The value of `inputs` in the parameter reference or expression must be
   * the input object to the previous iteration of the workflow step (or the initial
   * inputs for the first iteration).
   *    * </BLOCKQUOTE>
   */

  Object getValueFrom();
}
