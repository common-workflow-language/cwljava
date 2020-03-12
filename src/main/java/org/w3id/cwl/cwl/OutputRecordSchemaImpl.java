package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.LoaderInstances;
import org.w3id.cwl.cwl.utils.LoadingOptions;
import org.w3id.cwl.cwl.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl.utils.SavableImpl;
import org.w3id.cwl.cwl.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#OutputRecordSchema</I><br>
 */
public class OutputRecordSchemaImpl extends SavableImpl implements OutputRecordSchema {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private java.util.Optional<String> name;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#IOSchema/name</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The identifier for this type *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<String> getName() {
    return this.name;
  }

  private java.util.Optional<java.util.List<Object>> fields;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#fields</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the fields of the record. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<java.util.List<Object>> getFields() {
    return this.fields;
  }

  private enum_d9cba076fca539106791a4f46d198c7fcfbdb779 type;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Must be `record` *
   *
   * </BLOCKQUOTE>
   */
  public enum_d9cba076fca539106791a4f46d198c7fcfbdb779 getType() {
    return this.type;
  }

  private java.util.Optional<String> label;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A short, human-readable label of this object. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<String> getLabel() {
    return this.label;
  }

  private Object doc;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A documentation string for this object, or an array of strings which should be concatenated. *
   *
   * </BLOCKQUOTE>
   */
  public Object getDoc() {
    return this.doc;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl.utils.RootLoader} to construct instances of
   * OutputRecordSchemaImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public OutputRecordSchemaImpl(
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
      throw new ValidationException("OutputRecordSchemaImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    java.util.Optional<String> name;

    if (__doc.containsKey("name")) {
      try {
        name =
            LoaderInstances.uri_optional_StringInstance_True_False_None.loadField(
                __doc.get("name"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        name = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `name` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      name = null;
    }

    if (name == null) {
      if (__docRoot != null) {
        name = java.util.Optional.of(__docRoot);
      } else {
        name = java.util.Optional.of("_:" + java.util.UUID.randomUUID().toString());
      }
    }
    __baseUri = (String) name.orElse(null);
    java.util.Optional<java.util.List<Object>> fields;

    if (__doc.containsKey("fields")) {
      try {
        fields =
            LoaderInstances.idmap_fields_optional_array_of_OutputRecordField.loadField(
                __doc.get("fields"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        fields = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `fields` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      fields = null;
    }
    enum_d9cba076fca539106791a4f46d198c7fcfbdb779 type;
    try {
      type =
          LoaderInstances.typedsl_enum_d9cba076fca539106791a4f46d198c7fcfbdb779_2.loadField(
              __doc.get("type"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      type = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `type` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.Optional<String> label;

    if (__doc.containsKey("label")) {
      try {
        label =
            LoaderInstances.optional_StringInstance.loadField(
                __doc.get("label"), __baseUri, __loadingOptions);
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
            LoaderInstances.union_of_NullInstance_or_StringInstance_or_array_of_StringInstance
                .loadField(__doc.get("doc"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        doc = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `doc` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      doc = null;
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.fields = (java.util.Optional<java.util.List<Object>>) fields;
    this.type = (enum_d9cba076fca539106791a4f46d198c7fcfbdb779) type;
    this.label = (java.util.Optional<String>) label;
    this.doc = (Object) doc;
    this.name = (java.util.Optional<String>) name;
  }
}
