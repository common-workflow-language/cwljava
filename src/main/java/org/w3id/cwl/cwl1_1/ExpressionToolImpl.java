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

import org.w3id.cwl.cwl1_1.utils.LoaderInstances;
import org.w3id.cwl.cwl1_1.utils.LoadingOptions;
import org.w3id.cwl.cwl1_1.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_1.utils.SaveableImpl;
import org.w3id.cwl.cwl1_1.utils.ValidationException;

/**
* Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#ExpressionTool</I><BR> <BLOCKQUOTE>
 An ExpressionTool is a type of Process object that can be run by itself
 or as a Workflow step. It executes a pure Javascript expression that has
 access to the same input parameters as a workflow. It is meant to be used
 sparingly as a way to isolate complex Javascript expressions that need to
 operate on input data and produce some result; perhaps just a
 rearrangement of the inputs. No Docker software container is required
 or allowed.
  </BLOCKQUOTE>
 */
public class ExpressionToolImpl extends SaveableImpl implements ExpressionTool {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ =
      new java.util.HashMap<String, Object>();

  private java.util.Optional<String> id;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Identified/id</I><BR>
   * <BLOCKQUOTE>
   * The unique identifier for this object.   * </BLOCKQUOTE>
   */

  public java.util.Optional<String> getId() {
    return this.id;
  }

  private ExpressionTool_class class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ExpressionTool/class</I><BR>

   */

  public ExpressionTool_class getClass_() {
    return this.class_;
  }

  private java.util.Optional<String> label;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  public java.util.Optional<String> getLabel() {
    return this.label;
  }

  private Object doc;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  public Object getDoc() {
    return this.doc;
  }

  private java.util.List<Object> inputs;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#inputs</I><BR>
   * <BLOCKQUOTE>
   * Defines the input parameters of the process.  The process is ready to
   * run when all required input parameters are associated with concrete
   * values.  Input parameters include a schema for each parameter which is
   * used to validate the input object.  It may also be used to build a user
   * interface for constructing the input object.
   * 
   * When accepting an input object, all input parameters must have a value.
   * If an input parameter is missing from the input object, it must be
   * assigned a value of `null` (or the value of `default` for that
   * parameter, if provided) for the purposes of validation and evaluation
   * of expressions.
   *    * </BLOCKQUOTE>
   */

  public java.util.List<Object> getInputs() {
    return this.inputs;
  }

  private java.util.List<Object> outputs;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#outputs</I><BR>
   * <BLOCKQUOTE>
   * Defines the parameters representing the output of the process.  May be
   * used to generate and/or validate the output object.
   *    * </BLOCKQUOTE>
   */

  public java.util.List<Object> getOutputs() {
    return this.outputs;
  }

  private java.util.Optional<java.util.List<Object>> requirements;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#requirements</I><BR>
   * <BLOCKQUOTE>
   * Declares requirements that apply to either the runtime environment or the
   * workflow engine that must be met in order to execute this process.  If
   * an implementation cannot satisfy all requirements, or a requirement is
   * listed which is not recognized by the implementation, it is a fatal
   * error and the implementation must not attempt to run the process,
   * unless overridden at user option.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<java.util.List<Object>> getRequirements() {
    return this.requirements;
  }

  private java.util.Optional<java.util.List<Object>> hints;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#hints</I><BR>
   * <BLOCKQUOTE>
   * Declares hints applying to either the runtime environment or the
   * workflow engine that may be helpful in executing this process.  It is
   * not an error if an implementation cannot satisfy all hints, however
   * the implementation may report a warning.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<java.util.List<Object>> getHints() {
    return this.hints;
  }

  private java.util.Optional<CWLVersion> cwlVersion;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#cwlVersion</I><BR>
   * <BLOCKQUOTE>
   * CWL document version. Always required at the document root. Not
   * required for a Process embedded inside another Process.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<CWLVersion> getCwlVersion() {
    return this.cwlVersion;
  }

  private String expression;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ExpressionTool/expression</I><BR>
   * <BLOCKQUOTE>
   * The expression to execute.  The expression must return a JSON object which
   * matches the output parameters of the ExpressionTool.
   *    * </BLOCKQUOTE>
   */

  public String getExpression() {
    return this.expression;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_1.utils.RootLoader} to construct instances of ExpressionToolImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public ExpressionToolImpl(
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
      throw new ValidationException("ExpressionToolImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    java.util.Optional<String> id;

    if (__doc.containsKey("id")) {
      try {
        id =
            LoaderInstances
                .uri_optional_StringInstance_True_False_None
                .loadField(__doc.get("id"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        id = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `id` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      id = null;
    }

    Boolean __original_is_null = id == null;
    if (id == null) {
      if (__docRoot != null) {
        id = java.util.Optional.of(__docRoot);
      } else {
        id = java.util.Optional.of("_:" + java.util.UUID.randomUUID().toString());
      }
    }
    if (__original_is_null) {
        __baseUri = __baseUri_;
    } else {
        __baseUri = (String) id.orElse(null);
    }
    ExpressionTool_class class_;
    try {
      class_ =
          LoaderInstances
              .uri_ExpressionTool_class_False_True_None
              .loadField(__doc.get("class"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      class_ = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `class` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.Optional<String> label;

    if (__doc.containsKey("label")) {
      try {
        label =
            LoaderInstances
                .optional_StringInstance
                .loadField(__doc.get("label"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        label = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `label` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      label = null;
    }
    Object doc;

    if (__doc.containsKey("doc")) {
      try {
        doc =
            LoaderInstances
                .union_of_NullInstance_or_StringInstance_or_array_of_StringInstance
                .loadField(__doc.get("doc"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        doc = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `doc` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      doc = null;
    }
    java.util.List<Object> inputs;
    try {
      inputs =
          LoaderInstances
              .idmap_inputs_array_of_WorkflowInputParameter
              .loadField(__doc.get("inputs"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      inputs = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `inputs` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.List<Object> outputs;
    try {
      outputs =
          LoaderInstances
              .idmap_outputs_array_of_ExpressionToolOutputParameter
              .loadField(__doc.get("outputs"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      outputs = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `outputs` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.Optional<java.util.List<Object>> requirements;

    if (__doc.containsKey("requirements")) {
      try {
        requirements =
            LoaderInstances
                .idmap_requirements_optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement
                .loadField(__doc.get("requirements"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        requirements = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `requirements` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      requirements = null;
    }
    java.util.Optional<java.util.List<Object>> hints;

    if (__doc.containsKey("hints")) {
      try {
        hints =
            LoaderInstances
                .idmap_hints_optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement_or_AnyInstance
                .loadField(__doc.get("hints"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        hints = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `hints` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      hints = null;
    }
    java.util.Optional<CWLVersion> cwlVersion;

    if (__doc.containsKey("cwlVersion")) {
      try {
        cwlVersion =
            LoaderInstances
                .uri_optional_CWLVersion_False_True_None
                .loadField(__doc.get("cwlVersion"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        cwlVersion = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `cwlVersion` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      cwlVersion = null;
    }
    String expression;
    try {
      expression =
          LoaderInstances
              .ExpressionLoader
              .loadField(__doc.get("expression"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      expression = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `expression` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.id = (java.util.Optional<String>) id;
    this.label = (java.util.Optional<String>) label;
    this.doc = (Object) doc;
    this.inputs = (java.util.List<Object>) inputs;
    this.outputs = (java.util.List<Object>) outputs;
    this.requirements = (java.util.Optional<java.util.List<Object>>) requirements;
    this.hints = (java.util.Optional<java.util.List<Object>>) hints;
    this.cwlVersion = (java.util.Optional<CWLVersion>) cwlVersion;
    this.class_ = (ExpressionTool_class) class_;
    this.expression = (String) expression;
  }
}
