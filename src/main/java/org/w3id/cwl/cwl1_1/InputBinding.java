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
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#InputBinding</I><BR>This interface is implemented by {@link InputBindingImpl}<BR>
 */
public interface InputBinding extends Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InputBinding/loadContents</I><BR>
   * <BLOCKQUOTE>
   * Use of `loadContents` in `InputBinding` is deprecated.
   * Preserved for v1.0 backwards compatability.  Will be removed in
   * CWL v2.0.  Use `InputParameter.loadContents` instead.
   * 
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * Read up to the first 64 KiB of text from the file and place it in the
   * "contents" field of the file object for use by expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<Boolean> getLoadContents();
}
