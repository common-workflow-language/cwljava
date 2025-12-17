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
* Auto-generated interface for <I>http://commonwl.org/cwltool#Loop</I><BR>This interface is implemented by {@link LoopImpl}<BR> <BLOCKQUOTE>
 Prototype to enable workflow-level looping of a step.
 
 Valid only under `requirements` of a https://www.commonwl.org/v1.2/Workflow.html#WorkflowStep.
 Unlike other CWL requirements, Loop requirement is not propagated to inner steps.
 
 `loopWhen` is an expansion of the CWL v1.2 `when` construct which controls
 conditional execution.
 
 Using `loopWhen` and `when` for the same step will produce an error.
 
 `loopWhen` is not compatible with `scatter` at this time and combining the
 two in the same step will produce an error.
  </BLOCKQUOTE>
 */
public interface Loop extends ProcessRequirement, Saveable {

  java.util.Map<String, Object> getExtensionFields();
  LoadingOptions getLoadingOptions();

  /**
   * Getter for property <I>http://commonwl.org/cwltool#Loop/class</I><BR>
   * <BLOCKQUOTE>
   * cwltool:Loop   * </BLOCKQUOTE>
   */

  String getClass_();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#loop</I><BR>
   * <BLOCKQUOTE>
   * Defines the input parameters of the loop iterations after the first one
   * (inputs of the first iteration are the step input parameters). If no
   * `loop` rule is specified for a given step `in` field, the initial value
   * is kept constant among all iterations.
   *    * </BLOCKQUOTE>
   */

  java.util.List<Object> getLoop();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#Loop/loopWhen</I><BR>
   * <BLOCKQUOTE>
   * Only run the step while the expression evaluates to `true`.
   * If `false` and no iteration has been performed, the step is skipped.
   * 
   * A skipped step produces a `null` on each output.
   * 
   * The `inputs` value in the expression must be the step input object.
   * 
   * It is an error if this expression returns a value other than `true` or `false`.
   *    * </BLOCKQUOTE>
   */

  String getLoopWhen();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#Loop/outputMethod</I><BR>
   * <BLOCKQUOTE>
   * - Specify the desired method of dealing with loop outputs
   * - Default. Propagates only the last computed element to the subsequent steps when the loop terminates.
   * - Propagates a single array with all output values to the subsequent steps when the loop terminates.
   *    * </BLOCKQUOTE>
   */

  LoopOutputModes getOutputMethod();
}
