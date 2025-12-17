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
* Auto-generated interface for <I>http://commonwl.org/cwltool#MPIRequirement</I><BR>This interface is implemented by {@link MPIRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that a process requires an MPI runtime.
  </BLOCKQUOTE>
 */
public interface MPIRequirement extends ProcessRequirement, Saveable {

  java.util.Map<String, Object> getExtensionFields();
  LoadingOptions getLoadingOptions();

  /**
   * Getter for property <I>http://commonwl.org/cwltool#MPIRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always &#x27;MPIRequirement&#x27;   * </BLOCKQUOTE>
   */

  String getClass_();
  /**
   * Getter for property <I>http://commonwl.org/cwltool#MPIRequirement/processes</I><BR>
   * <BLOCKQUOTE>
   * The number of MPI processes to start. If you give a string,
   * this will be evaluated as a CWL Expression and it must
   * evaluate to an integer.
   *    * </BLOCKQUOTE>
   */

  Object getProcesses();
}
