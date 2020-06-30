package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2_0_dev3.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2_0_dev3.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2_0_dev3.utils.SavableImpl;
import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/salad#RecordField</I><br>
 *
 * <BLOCKQUOTE>
 *
 * A field of a record.
 *
 * </BLOCKQUOTE>
 */
public class RecordFieldImpl extends SavableImpl implements RecordField {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String name;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#RecordField/name</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The name of the field *
   *
   * </BLOCKQUOTE>
   */
  public String getName() {
    return this.name;
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

  private Object type;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The field type *
   *
   * </BLOCKQUOTE>
   */
  public Object getType() {
    return this.type;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2_0_dev3.utils.RootLoader} to construct instances of
   * RecordFieldImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public RecordFieldImpl(
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
      throw new ValidationException("RecordFieldImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    String name;

    if (__doc.containsKey("name")) {
      try {
        name =
            LoaderInstances.uri_StringInstance_True_False_None.loadField(
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
        name = __docRoot;
      } else {
        throw new ValidationException("Missing name");
      }
    }
    __baseUri = (String) name;
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
    Object type;
    try {
      type =
          LoaderInstances
              .typedsl_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_2
              .loadField(__doc.get("type"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      type = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `type` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.doc = (Object) doc;
    this.name = (String) name;
    this.type = (Object) type;
  }
}
