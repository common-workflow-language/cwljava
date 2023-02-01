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

import org.w3id.cwl.cwl1_2.utils.Saveable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement</I><BR>This interface is implemented by {@link InlineJavascriptRequirementImpl}<BR> <BLOCKQUOTE>
 Indicates that the workflow platform must support inline Javascript expressions.
 If this requirement is not present, the workflow platform must not perform expression
 interpolation.
  </BLOCKQUOTE>
 */
public interface InlineJavascriptRequirement extends ProcessRequirement, Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'InlineJavascriptRequirement'   * </BLOCKQUOTE>
   */

  InlineJavascriptRequirement_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InlineJavascriptRequirement/expressionLib</I><BR>
   * <BLOCKQUOTE>
   * Additional code fragments that will also be inserted
   * before executing the expression code.  Allows for function definitions that may
   * be called from CWL expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<String>> getExpressionLib();
}
