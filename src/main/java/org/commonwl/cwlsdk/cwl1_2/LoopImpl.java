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

import org.commonwl.cwlsdk.cwl1_2.utils.LoaderInstances;
import org.commonwl.cwlsdk.cwl1_2.utils.LoadingOptions;
import org.commonwl.cwlsdk.cwl1_2.utils.LoadingOptionsBuilder;
import org.commonwl.cwlsdk.cwl1_2.utils.SaveableImpl;
import org.commonwl.cwlsdk.cwl1_2.utils.ValidationException;

/**
* Auto-generated class implementation for <I>http://commonwl.org/cwltool#Loop</I><BR> <BLOCKQUOTE>
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
public class LoopImpl extends SaveableImpl implements Loop {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ =
      new java.util.HashMap<String, Object>();
  public LoadingOptions getLoadingOptions() {
    return this.loadingOptions_;
  }
  public java.util.Map<String, Object> getExtensionFields() {
    return this.extensionFields_;
  }

  private String class_;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#Loop/class</I><BR>
   * <BLOCKQUOTE>
   * cwltool:Loop   * </BLOCKQUOTE>
   */

  public String getClass_() {
    return this.class_;
  }

  private java.util.List<Object> loop;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#loop</I><BR>
   * <BLOCKQUOTE>
   * Defines the input parameters of the loop iterations after the first one
   * (inputs of the first iteration are the step input parameters). If no
   * `loop` rule is specified for a given step `in` field, the initial value
   * is kept constant among all iterations.
   *    * </BLOCKQUOTE>
   */

  public java.util.List<Object> getLoop() {
    return this.loop;
  }

  private String loopWhen;

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

  public String getLoopWhen() {
    return this.loopWhen;
  }

  private LoopOutputModes outputMethod;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#Loop/outputMethod</I><BR>
   * <BLOCKQUOTE>
   * - Specify the desired method of dealing with loop outputs
   * - Default. Propagates only the last computed element to the subsequent steps when the loop terminates.
   * - Propagates a single array with all output values to the subsequent steps when the loop terminates.
   *    * </BLOCKQUOTE>
   */

  public LoopOutputModes getOutputMethod() {
    return this.outputMethod;
  }

  /**
   * Used by {@link org.commonwl.cwlsdk.cwl1_2.utils.RootLoader} to construct instances of LoopImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public LoopImpl(
      final Object __doc_,
      final String __baseUri_,
      LoadingOptions __loadingOptions,
      final String __docRoot_) {
    super(__doc_, __baseUri_, __loadingOptions, __docRoot_);
    // Prefix plumbing variables with '__' to reduce likelihood of collision with
    // generated names.
    String __baseUri = __baseUri_;
    String __docRoot = __docRoot_;
    if (!(__doc_ instanceof java.util.Map)) {
      throw new ValidationException("LoopImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    String class_;
    try {
      class_ =
          LoaderInstances
              .uri_StringInstance_False_True_None_None
              .loadField(__doc.get("class"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      class_ = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `class` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.List<Object> loop;
    try {
      loop =
          LoaderInstances
              .idmap_loop_array_of_LoopInput
              .loadField(__doc.get("loop"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      loop = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `loop` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    String loopWhen;
    try {
      loopWhen =
          LoaderInstances
              .ExpressionLoader
              .loadField(__doc.get("loopWhen"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      loopWhen = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `loopWhen` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    LoopOutputModes outputMethod;
    try {
      outputMethod =
          LoaderInstances
              .LoopOutputModes
              .loadField(__doc.get("outputMethod"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      outputMethod = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `outputMethod` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.loop = (java.util.List<Object>) loop;
    this.loopWhen = (String) loopWhen;
    this.outputMethod = (LoopOutputModes) outputMethod;
    for (String field:__doc.keySet()) {
      if (!attrs.contains(field)) {
        if (field.contains(":")) {
          String expanded_field = __loadingOptions.expandUrl(field, "", false, false, null);
          extensionFields_.put(expanded_field, __doc.get(field));
        }
      }
    }
  }
  private java.util.List<String> attrs = java.util.Arrays.asList("class", "loop", "loopWhen", "outputMethod");
}
