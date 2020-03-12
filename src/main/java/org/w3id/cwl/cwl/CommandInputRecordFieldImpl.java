package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.LoaderInstances;
import org.w3id.cwl.cwl.utils.LoadingOptions;
import org.w3id.cwl.cwl.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl.utils.SavableImpl;
import org.w3id.cwl.cwl.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#CommandInputRecordField</I>
 * <br>
 */
public class CommandInputRecordFieldImpl extends SavableImpl implements CommandInputRecordField {
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

  private Object secondaryFiles;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#secondaryFiles</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Provides a pattern or expression specifying files or directories that should be included
   * alongside the primary file. Secondary files may be required or optional. When not explicitly
   * specified, secondary files specified for `inputs` are required and `outputs` are optional. An
   * implementation must include matching Files and Directories in the `secondaryFiles` property of
   * the primary file. These Files and Directories must be transferred and staged alongside the
   * primary file. An implementation may fail workflow execution if a required secondary file does
   * not exist.
   *
   * <p>If the value is an expression, the value of `self` in the expression must be the primary
   * input or output File object to which this binding applies. The `basename`, `nameroot` and
   * `nameext` fields must be present in `self`. For `CommandLineTool` outputs the `path` field must
   * also be present. The expression must return a filename string relative to the path to the
   * primary File, a File or Directory object with either `path` or `location` and `basename` fields
   * set, or an array consisting of strings or File or Directory objects. It is legal to reference
   * an unchanged File or Directory object taken from input as a secondaryFile. The expression may
   * return "null" in which case there is no secondaryFile from that expression.
   *
   * <p>To work on non-filename-preserving storage systems, portable tool descriptions should avoid
   * constructing new values from `location`, but should construct relative references using
   * `basename` or `nameroot` instead.
   *
   * <p>If a value in `secondaryFiles` is a string that is not an expression, it specifies that the
   * following pattern should be applied to the path of the primary file to yield a filename
   * relative to the primary File:
   *
   * <p>1. If string ends with `?` character, remove the last `?` and mark the resulting secondary
   * file as optional. 2. If string begins with one or more caret `^` characters, for each caret,
   * remove the last file extension from the path (the last period `.` and all following
   * characters). If there are no file extensions, the path is unchanged. 3. Append the remainder of
   * the string to the end of the file path. *
   *
   * </BLOCKQUOTE>
   */
  public Object getSecondaryFiles() {
    return this.secondaryFiles;
  }

  private java.util.Optional<Boolean> streamable;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#FieldBase/streamable</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>A value of `true` indicates that the file is read or written sequentially without seeking.
   * An implementation may use this flag to indicate whether it is valid to stream file contents
   * using a named pipe. Default: `false`. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<Boolean> getStreamable() {
    return this.streamable;
  }

  private Object format;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>This must be one or more IRIs of concept nodes that represents file formats which are
   * allowed as input to this parameter, preferrably defined within an ontology. If no ontology is
   * available, file formats may be tested by exact match. *
   *
   * </BLOCKQUOTE>
   */
  public Object getFormat() {
    return this.format;
  }

  private java.util.Optional<Boolean> loadContents;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadContents</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Read up to the first 64 KiB of text from the file and place it in the "contents" field of
   * the file object for use by expressions. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<Boolean> getLoadContents() {
    return this.loadContents;
  }

  private java.util.Optional<LoadListingEnum> loadListing;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadListing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: Directory` or is an array of `items: Directory`.
   *
   * <p>Specify the desired behavior for loading the `listing` field of a Directory object for use
   * by expressions.
   *
   * <p>The order of precedence for loadListing is:
   *
   * <p>1. `loadListing` on an individual parameter 2. Inherited from `LoadListingRequirement` 3. By
   * default: `no_listing` *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<LoadListingEnum> getLoadListing() {
    return this.loadListing;
  }

  private java.util.Optional<CommandLineBinding> inputBinding;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Describes how to turn this object into command line arguments. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<CommandLineBinding> getInputBinding() {
    return this.inputBinding;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl.utils.RootLoader} to construct instances of
   * CommandInputRecordFieldImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public CommandInputRecordFieldImpl(
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
      throw new ValidationException("CommandInputRecordFieldImpl called on non-map");
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
              .typedsl_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_2
              .loadField(__doc.get("type"), __baseUri, __loadingOptions);
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
    Object secondaryFiles;

    if (__doc.containsKey("secondaryFiles")) {
      try {
        secondaryFiles =
            LoaderInstances
                .union_of_NullInstance_or_SecondaryFileSchema_or_array_of_SecondaryFileSchema
                .loadField(__doc.get("secondaryFiles"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        secondaryFiles = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `secondaryFiles` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      secondaryFiles = null;
    }
    java.util.Optional<Boolean> streamable;

    if (__doc.containsKey("streamable")) {
      try {
        streamable =
            LoaderInstances.optional_BooleanInstance.loadField(
                __doc.get("streamable"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        streamable = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `streamable` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      streamable = null;
    }
    Object format;

    if (__doc.containsKey("format")) {
      try {
        format =
            LoaderInstances
                .uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_or_Expression_True_False_None
                .loadField(__doc.get("format"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        format = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `format` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      format = null;
    }
    java.util.Optional<Boolean> loadContents;

    if (__doc.containsKey("loadContents")) {
      try {
        loadContents =
            LoaderInstances.optional_BooleanInstance.loadField(
                __doc.get("loadContents"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        loadContents = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `loadContents` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      loadContents = null;
    }
    java.util.Optional<LoadListingEnum> loadListing;

    if (__doc.containsKey("loadListing")) {
      try {
        loadListing =
            LoaderInstances.optional_LoadListingEnum.loadField(
                __doc.get("loadListing"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        loadListing = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `loadListing` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      loadListing = null;
    }
    java.util.Optional<CommandLineBinding> inputBinding;

    if (__doc.containsKey("inputBinding")) {
      try {
        inputBinding =
            LoaderInstances.optional_CommandLineBinding.loadField(
                __doc.get("inputBinding"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        inputBinding = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `inputBinding` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      inputBinding = null;
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.doc = (Object) doc;
    this.name = (String) name;
    this.type = (Object) type;
    this.label = (java.util.Optional<String>) label;
    this.secondaryFiles = (Object) secondaryFiles;
    this.streamable = (java.util.Optional<Boolean>) streamable;
    this.format = (Object) format;
    this.loadContents = (java.util.Optional<Boolean>) loadContents;
    this.loadListing = (java.util.Optional<LoadListingEnum>) loadListing;
    this.inputBinding = (java.util.Optional<CommandLineBinding>) inputBinding;
  }
}