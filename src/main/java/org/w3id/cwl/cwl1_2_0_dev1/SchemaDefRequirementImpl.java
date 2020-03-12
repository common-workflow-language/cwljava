package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2_0_dev1.utils.SavableImpl;
import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#SchemaDefRequirement</I><br>
 *
 * <BLOCKQUOTE>
 *
 * This field consists of an array of type definitions which must be used when interpreting the
 * `inputs` and `outputs` fields. When a `type` field contain a IRI, the implementation must check
 * if the type is defined in `schemaDefs` and use that definition. If the type is not found in
 * `schemaDefs`, it is an error. The entries in `schemaDefs` must be processed in the order listed
 * such that later schema definitions may refer to earlier schema definitions.
 *
 * </BLOCKQUOTE>
 */
public class SchemaDefRequirementImpl extends SavableImpl implements SchemaDefRequirement {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'SchemaDefRequirement' *
   *
   * </BLOCKQUOTE>
   */
  public String getClass_() {
    return this.class_;
  }

  private java.util.List<Object> types;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/types</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of type definitions. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.List<Object> getTypes() {
    return this.types;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2_0_dev1.utils.RootLoader} to construct instances of
   * SchemaDefRequirementImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public SchemaDefRequirementImpl(
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
      throw new ValidationException("SchemaDefRequirementImpl called on non-map");
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
          LoaderInstances.uri_StringInstance_False_True_None.loadField(
              __doc.get("class"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      class_ = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `class` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.List<Object> types;
    try {
      types =
          LoaderInstances
              .array_of_union_of_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema
              .loadField(__doc.get("types"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      types = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `types` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.types = (java.util.List<Object>) types;
  }
}
