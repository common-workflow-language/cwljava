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
* Auto-generated class implementation for <I>http://commonwl.org/cwltool#CUDARequirement</I><BR> <BLOCKQUOTE>
 Require support for NVIDA CUDA (GPU hardware acceleration).
  </BLOCKQUOTE>
 */
public class CUDARequirementImpl extends SaveableImpl implements CUDARequirement {
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
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/class</I><BR>
   * <BLOCKQUOTE>
   * cwltool:CUDARequirement   * </BLOCKQUOTE>
   */

  public String getClass_() {
    return this.class_;
  }

  private Object cudaComputeCapability;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaComputeCapability</I><BR>
   * <BLOCKQUOTE>
   * CUDA hardware capability required to run the software, in X.Y
   * format.
   * 
   * * If this is a single value, it defines only the minimum
   *   compute capability.  GPUs with higher capability are also
   *   accepted.
   * 
   * * If it is an array value, then only select GPUs with compute
   *   capabilities that explicitly appear in the array.
   *    * </BLOCKQUOTE>
   */

  public Object getCudaComputeCapability() {
    return this.cudaComputeCapability;
  }

  private Object cudaDeviceCountMax;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaDeviceCountMax</I><BR>
   * <BLOCKQUOTE>
   * Maximum number of GPU devices to request.  If not specified,
   * same as `cudaDeviceCountMin`.
   *    * </BLOCKQUOTE>
   */

  public Object getCudaDeviceCountMax() {
    return this.cudaDeviceCountMax;
  }

  private Object cudaDeviceCountMin;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaDeviceCountMin</I><BR>
   * <BLOCKQUOTE>
   * Minimum number of GPU devices to request.  If not specified,
   * same as `cudaDeviceCountMax`.  If neither are specified,
   * default 1.
   *    * </BLOCKQUOTE>
   */

  public Object getCudaDeviceCountMin() {
    return this.cudaDeviceCountMin;
  }

  private String cudaVersionMin;

  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaVersionMin</I><BR>
   * <BLOCKQUOTE>
   * Minimum CUDA version to run the software, in X.Y format.  This
   * corresponds to a CUDA SDK release.  When running directly on
   * the host (not in a container) the host must have a compatible
   * CUDA SDK (matching the exact version, or, starting with CUDA
   * 11.3, matching major version).  When run in a container, the
   * container image should provide the CUDA runtime, and the host
   * driver is injected into the container.  In this case, because
   * CUDA drivers are backwards compatible, it is possible to
   * use an older SDK with a newer driver across major versions.
   * 
   * See https://docs.nvidia.com/deploy/cuda-compatibility/ for
   * details.
   *    * </BLOCKQUOTE>
   */

  public String getCudaVersionMin() {
    return this.cudaVersionMin;
  }

  /**
   * Used by {@link org.commonwl.cwlsdk.cwl1_2.utils.RootLoader} to construct instances of CUDARequirementImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public CUDARequirementImpl(
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
      throw new ValidationException("CUDARequirementImpl called on non-map");
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
    Object cudaComputeCapability;
    try {
      cudaComputeCapability =
          LoaderInstances
              .union_of_StringInstance_or_array_of_StringInstance
              .loadField(__doc.get("cudaComputeCapability"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      cudaComputeCapability = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `cudaComputeCapability` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    Object cudaDeviceCountMax;

    if (__doc.containsKey("cudaDeviceCountMax")) {
      try {
        cudaDeviceCountMax =
            LoaderInstances
                .union_of_NullInstance_or_IntegerInstance_or_ExpressionLoader
                .loadField(__doc.get("cudaDeviceCountMax"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        cudaDeviceCountMax = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `cudaDeviceCountMax` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      cudaDeviceCountMax = null;
    }
    Object cudaDeviceCountMin;

    if (__doc.containsKey("cudaDeviceCountMin")) {
      try {
        cudaDeviceCountMin =
            LoaderInstances
                .union_of_NullInstance_or_IntegerInstance_or_ExpressionLoader
                .loadField(__doc.get("cudaDeviceCountMin"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        cudaDeviceCountMin = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `cudaDeviceCountMin` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      cudaDeviceCountMin = null;
    }
    String cudaVersionMin;
    try {
      cudaVersionMin =
          LoaderInstances
              .StringInstance
              .loadField(__doc.get("cudaVersionMin"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      cudaVersionMin = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `cudaVersionMin` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.cudaComputeCapability = (Object) cudaComputeCapability;
    this.cudaDeviceCountMax = (Object) cudaDeviceCountMax;
    this.cudaDeviceCountMin = (Object) cudaDeviceCountMin;
    this.cudaVersionMin = (String) cudaVersionMin;
    for (String field:__doc.keySet()) {
      if (!attrs.contains(field)) {
        if (field.contains(":")) {
          String expanded_field = __loadingOptions.expandUrl(field, "", false, false, null);
          extensionFields_.put(expanded_field, __doc.get(field));
        }
      }
    }
  }
  private java.util.List<String> attrs = java.util.Arrays.asList("class", "cudaComputeCapability", "cudaDeviceCountMax", "cudaDeviceCountMin", "cudaVersionMin");
}
