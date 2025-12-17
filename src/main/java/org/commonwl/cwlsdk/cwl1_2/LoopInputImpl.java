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
* Auto-generated class implementation for <I>http://commonwl.org/cwltool#LoopInput</I><BR>
 */
public class LoopInputImpl extends SaveableImpl implements LoopInput {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ =
      new java.util.HashMap<String, Object>();
  public LoadingOptions getLoadingOptions() {
    return this.loadingOptions_;
  }
  public java.util.Map<String, Object> getExtensionFields() {
    return this.extensionFields_;
  }

  private java.util.Optional<String> id;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/id</I><BR>
   * <BLOCKQUOTE>
   * It must reference the `id` of one of the elements in the `in` field of the step.   * </BLOCKQUOTE>
   */

  public java.util.Optional<String> getId() {
    return this.id;
  }

  private java.util.Optional<Object> default_;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#default</I><BR>
   * <BLOCKQUOTE>
   * The default value for this parameter to use if either there is no
   * `source` field, or the value produced by the `source` is `null`.  The
   * default must be applied prior to scattering or evaluating `valueFrom`.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<Object> getDefault() {
    return this.default_;
  }

  private java.util.Optional<LinkMergeMethod> linkMerge;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/linkMerge</I><BR>
   * <BLOCKQUOTE>
   * The method to use to merge multiple inbound links into a single array.
   * If not specified, the default method is &quot;merge_nested&quot;.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<LinkMergeMethod> getLinkMerge() {
    return this.linkMerge;
  }

  private Object loopSource;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/loopSource</I><BR>
   * <BLOCKQUOTE>
   * Specifies one or more of the step output parameters that will
   * provide input to the loop iterations after the first one (inputs
   * of the first iteration are the step input parameters).
   *    * </BLOCKQUOTE>
   */

  public Object getLoopSource() {
    return this.loopSource;
  }

  private java.util.Optional<PickValueMethod> pickValue;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#LoopInput/pickValue</I><BR>
   * <BLOCKQUOTE>
   * The method to use to choose non-null elements among multiple sources.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<PickValueMethod> getPickValue() {
    return this.pickValue;
  }

  private Object valueFrom;

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

  public Object getValueFrom() {
    return this.valueFrom;
  }

  /**
   * Used by {@link org.commonwl.cwlsdk.cwl1_2.utils.RootLoader} to construct instances of LoopInputImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public LoopInputImpl(
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
      throw new ValidationException("LoopInputImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    java.util.Optional<String> id;

    if (__doc.containsKey("id")) {
      try {
        id =
            LoaderInstances
                .uri_optional_StringInstance_True_False_None_None
                .loadField(__doc.get("id"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        id = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `id` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      id = null;
    }

    Boolean __original_is_null = id == null;
    if (id == null) {
      if (__docRoot != null) {
        id = java.util.Optional.of(__docRoot);
      } else {
        id = java.util.Optional.of("_:" + java.util.UUID.randomUUID().toString());
      }
    }
    if (__original_is_null) {
        __baseUri = __baseUri_;
    } else {
        __baseUri = (String) id.orElse(null);
    }
    java.util.Optional<Object> default_;

    if (__doc.containsKey("default")) {
      try {
        default_ =
            LoaderInstances
                .optional_AnyInstance
                .loadField(__doc.get("default"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        default_ = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `default` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      default_ = null;
    }
    java.util.Optional<LinkMergeMethod> linkMerge;

    if (__doc.containsKey("linkMerge")) {
      try {
        linkMerge =
            LoaderInstances
                .optional_LinkMergeMethod
                .loadField(__doc.get("linkMerge"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        linkMerge = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `linkMerge` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      linkMerge = null;
    }
    Object loopSource;

    if (__doc.containsKey("loopSource")) {
      try {
        loopSource =
            LoaderInstances
                .uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_False_False_1_None
                .loadField(__doc.get("loopSource"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        loopSource = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `loopSource` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      loopSource = null;
    }
    java.util.Optional<PickValueMethod> pickValue;

    if (__doc.containsKey("pickValue")) {
      try {
        pickValue =
            LoaderInstances
                .optional_PickValueMethod
                .loadField(__doc.get("pickValue"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        pickValue = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `pickValue` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      pickValue = null;
    }
    Object valueFrom;

    if (__doc.containsKey("valueFrom")) {
      try {
        valueFrom =
            LoaderInstances
                .union_of_NullInstance_or_StringInstance_or_ExpressionLoader
                .loadField(__doc.get("valueFrom"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        valueFrom = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `valueFrom` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      valueFrom = null;
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.default_ = (java.util.Optional<Object>) default_;
    this.id = (java.util.Optional<String>) id;
    this.linkMerge = (java.util.Optional<LinkMergeMethod>) linkMerge;
    this.loopSource = (Object) loopSource;
    this.pickValue = (java.util.Optional<PickValueMethod>) pickValue;
    this.valueFrom = (Object) valueFrom;
    for (String field:__doc.keySet()) {
      if (!attrs.contains(field)) {
        if (field.contains(":")) {
          String expanded_field = __loadingOptions.expandUrl(field, "", false, false, null);
          extensionFields_.put(expanded_field, __doc.get(field));
        }
      }
    }
  }
  private java.util.List<String> attrs = java.util.Arrays.asList("default", "id", "linkMerge", "loopSource", "pickValue", "valueFrom");
}
