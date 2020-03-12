package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.LoaderInstances;
import org.w3id.cwl.cwl.utils.LoadingOptions;
import org.w3id.cwl.cwl.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl.utils.SavableImpl;
import org.w3id.cwl.cwl.utils.ValidationException;

/** Auto-generated class implementation for <I>https://w3id.org/cwl/salad#ArraySchema</I><br> */
public class ArraySchemaImpl extends SavableImpl implements ArraySchema {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private Object items;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#items</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the type of the array elements. *
   *
   * </BLOCKQUOTE>
   */
  public Object getItems() {
    return this.items;
  }

  private enum_d062602be0b4b8fd33e69e29a841317b6ab665bc type;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Must be `array` *
   *
   * </BLOCKQUOTE>
   */
  public enum_d062602be0b4b8fd33e69e29a841317b6ab665bc getType() {
    return this.type;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl.utils.RootLoader} to construct instances of ArraySchemaImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public ArraySchemaImpl(
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
      throw new ValidationException("ArraySchemaImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    Object items;
    try {
      items =
          LoaderInstances
              .uri_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_False_True_2
              .loadField(__doc.get("items"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      items = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `items` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    enum_d062602be0b4b8fd33e69e29a841317b6ab665bc type;
    try {
      type =
          LoaderInstances.typedsl_enum_d062602be0b4b8fd33e69e29a841317b6ab665bc_2.loadField(
              __doc.get("type"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      type = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `type` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.items = (Object) items;
    this.type = (enum_d062602be0b4b8fd33e69e29a841317b6ab665bc) type;
  }
}
