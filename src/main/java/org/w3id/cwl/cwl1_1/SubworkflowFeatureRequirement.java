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

package org.w3id.cwl.cwl1_1;

import org.w3id.cwl.cwl1_1.utils.Saveable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement</I><BR>This interface is implemented by {@link SubworkflowFeatureRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that the workflow platform must support nested workflows in
 the `run` field of [WorkflowStep](#WorkflowStep).
  </BLOCKQUOTE>
 */
public interface SubworkflowFeatureRequirement extends ProcessRequirement, Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SubworkflowFeatureRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'SubworkflowFeatureRequirement'   * </BLOCKQUOTE>
   */

  SubworkflowFeatureRequirement_class getClass_();
}
