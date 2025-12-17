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
* Auto-generated interface for <I>http://commonwl.org/cwltool#CUDARequirement</I><BR>This interface is implemented by {@link CUDARequirementImpl}<BR> <BLOCKQUOTE>
 Require support for NVIDA CUDA (GPU hardware acceleration).
  </BLOCKQUOTE>
 */
public interface CUDARequirement extends ProcessRequirement, Saveable {

  java.util.Map<String, Object> getExtensionFields();
  LoadingOptions getLoadingOptions();

  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/class</I><BR>
   * <BLOCKQUOTE>
   * cwltool:CUDARequirement   * </BLOCKQUOTE>
   */

  String getClass_();
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

  Object getCudaComputeCapability();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaDeviceCountMax</I><BR>
   * <BLOCKQUOTE>
   * Maximum number of GPU devices to request.  If not specified,
   * same as `cudaDeviceCountMin`.
   *    * </BLOCKQUOTE>
   */

  Object getCudaDeviceCountMax();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#CUDARequirement/cudaDeviceCountMin</I><BR>
   * <BLOCKQUOTE>
   * Minimum number of GPU devices to request.  If not specified,
   * same as `cudaDeviceCountMax`.  If neither are specified,
   * default 1.
   *    * </BLOCKQUOTE>
   */

  Object getCudaDeviceCountMin();
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

  String getCudaVersionMin();
}
