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
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandOutputRecordSchema</I><BR>This interface is implemented by {@link CommandOutputRecordSchemaImpl}<BR>
 */
public interface CommandOutputRecordSchema extends OutputRecordSchema, Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#IOSchema/name</I><BR>
   * <BLOCKQUOTE>
   * The identifier for this type   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#fields</I><BR>
   * <BLOCKQUOTE>
   * Defines the fields of the record.   * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getFields();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * Must be `record`   * </BLOCKQUOTE>
   */

  enum_d9cba076fca539106791a4f46d198c7fcfbdb779 getType();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  Object getDoc();
}
