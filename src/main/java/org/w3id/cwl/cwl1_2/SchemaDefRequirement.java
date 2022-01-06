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
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#SchemaDefRequirement</I><BR>This interface is implemented by {@link SchemaDefRequirementImpl}<BR> <BLOCKQUOTE>
 This field consists of an array of type definitions which must be used when
 interpreting the `inputs` and `outputs` fields.  When a `type` field
 contains a IRI, the implementation must check if the type is defined in
 `schemaDefs` and use that definition.  If the type is not found in
 `schemaDefs`, it is an error.  The entries in `schemaDefs` must be
 processed in the order listed such that later schema definitions may refer
 to earlier schema definitions.
 
 - **Type definitions are allowed for `enum` and `record` types only.**
 - Type definitions may be shared by defining them in a file and then
   `$include`-ing them in the `types` field.
 - A file can contain a list of type definitions
  </BLOCKQUOTE>
 */
public interface SchemaDefRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'SchemaDefRequirement'   * </BLOCKQUOTE>
   */

  SchemaDefRequirement_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/types</I><BR>
   * <BLOCKQUOTE>
   * The list of type definitions.   * </BLOCKQUOTE>
   */

  java.util.List<Object> getTypes();
}
