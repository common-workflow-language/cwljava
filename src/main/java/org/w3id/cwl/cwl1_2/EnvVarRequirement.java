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

package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#EnvVarRequirement</I><BR>This interface is implemented by {@link EnvVarRequirementImpl}<BR> <BLOCKQUOTE>
 Define a list of environment variables which will be set in the
 execution environment of the tool.  See `EnvironmentDef` for details.
  </BLOCKQUOTE>
 */
public interface EnvVarRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'EnvVarRequirement'   * </BLOCKQUOTE>
   */

  EnvVarRequirement_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/envDef</I><BR>
   * <BLOCKQUOTE>
   * The list of environment variables.   * </BLOCKQUOTE>
   */

  java.util.List<Object> getEnvDef();
}
