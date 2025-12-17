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
* Auto-generated class implementation for <I>http://commonwl.org/cwltool#MPIRequirement</I><BR> <BLOCKQUOTE>
 Indicates that a process requires an MPI runtime.
  </BLOCKQUOTE>
 */
public class MPIRequirementImpl extends SaveableImpl implements MPIRequirement {
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
   * Getter for property <I>http://commonwl.org/cwltool#MPIRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always &#x27;MPIRequirement&#x27;   * </BLOCKQUOTE>
   */

  public String getClass_() {
    return this.class_;
  }

  private Object processes;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#MPIRequirement/processes</I><BR>
   * <BLOCKQUOTE>
   * The number of MPI processes to start. If you give a string,
   * this will be evaluated as a CWL Expression and it must
   * evaluate to an integer.
   *    * </BLOCKQUOTE>
   */

  public Object getProcesses() {
    return this.processes;
  }

  /**
   * Used by {@link org.commonwl.cwlsdk.cwl1_2.utils.RootLoader} to construct instances of MPIRequirementImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public MPIRequirementImpl(
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
      throw new ValidationException("MPIRequirementImpl called on non-map");
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
    Object processes;
    try {
      processes =
          LoaderInstances
              .union_of_IntegerInstance_or_ExpressionLoader
              .loadField(__doc.get("processes"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      processes = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `processes` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.processes = (Object) processes;
    for (String field:__doc.keySet()) {
      if (!attrs.contains(field)) {
        if (field.contains(":")) {
          String expanded_field = __loadingOptions.expandUrl(field, "", false, false, null);
          extensionFields_.put(expanded_field, __doc.get(field));
        }
      }
    }
  }
  private java.util.List<String> attrs = java.util.Arrays.asList("class", "processes");
}
