package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.LoaderInstances;
import org.w3id.cwl.cwl.utils.LoadingOptions;
import org.w3id.cwl.cwl.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl.utils.SavableImpl;
import org.w3id.cwl.cwl.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#InitialWorkDirRequirement</I>
 * <br>
 *
 * <BLOCKQUOTE>
 *
 * Define a list of files and subdirectories that must be created by the workflow platform in the
 * designated output directory prior to executing the command line tool.
 *
 * </BLOCKQUOTE>
 */
public class InitialWorkDirRequirementImpl extends SavableImpl
    implements InitialWorkDirRequirement {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InitialWorkDirRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * InitialWorkDirRequirement *
   *
   * </BLOCKQUOTE>
   */
  public String getClass_() {
    return this.class_;
  }

  private Object listing;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#listing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of files or subdirectories that must be placed in the designated output directory
   * prior to executing the command line tool.
   *
   * <p>May be an expression. If so, the expression return value must validate as `{type: array,
   * items: ["null", File, File[], Directory, Directory[], Dirent]}`.
   *
   * <p>Files or Directories which are listed in the input parameters and appear in the
   * `InitialWorkDirRequirement` listing must have their `path` set to their staged location in the
   * designated output directory. If the same File or Directory appears more than once in the
   * `InitialWorkDirRequirement` listing, the implementation must choose exactly one value for
   * `path`; how this value is chosen is undefined. *
   *
   * </BLOCKQUOTE>
   */
  public Object getListing() {
    return this.listing;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl.utils.RootLoader} to construct instances of
   * InitialWorkDirRequirementImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public InitialWorkDirRequirementImpl(
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
      throw new ValidationException("InitialWorkDirRequirementImpl called on non-map");
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
    Object listing;
    try {
      listing =
          LoaderInstances
              .union_of_array_of_union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression_or_Expression
              .loadField(__doc.get("listing"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      listing = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `listing` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.listing = (Object) listing;
  }
}
