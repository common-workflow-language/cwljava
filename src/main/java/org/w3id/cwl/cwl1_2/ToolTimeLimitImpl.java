package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2.utils.SavableImpl;
import org.w3id.cwl.cwl1_2.utils.ValidationException;

/**
* Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#ToolTimeLimit</I><BR> <BLOCKQUOTE>
 Set an upper limit on the execution time of a CommandLineTool.
 A CommandLineTool whose execution duration exceeds the time
 limit may be preemptively terminated and considered failed.
 May also be used by batch systems to make scheduling decisions.
 The execution duration excludes external operations, such as
 staging of files, pulling a docker image etc, and only counts
 wall-time for the execution of the command line itself.
  </BLOCKQUOTE>
 */
public class ToolTimeLimitImpl extends SavableImpl implements ToolTimeLimit {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ =
      new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ToolTimeLimit/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'ToolTimeLimit'   * </BLOCKQUOTE>
   */

  public String getClass_() {
    return this.class_;
  }

  private Object timelimit;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ToolTimeLimit/timelimit</I><BR>
   * <BLOCKQUOTE>
   * The time limit, in seconds.  A time limit of zero means no
   * time limit.  Negative time limits are an error.
   *    * </BLOCKQUOTE>
   */

  public Object getTimelimit() {
    return this.timelimit;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2.utils.RootLoader} to construct instances of ToolTimeLimitImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public ToolTimeLimitImpl(
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
      throw new ValidationException("ToolTimeLimitImpl called on non-map");
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
          LoaderInstances
              .uri_StringInstance_False_True_None
              .loadField(__doc.get("class"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      class_ = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `class` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    Object timelimit;
    try {
      timelimit =
          LoaderInstances
              .union_of_LongInstance_or_Expression
              .loadField(__doc.get("timelimit"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      timelimit = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `timelimit` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.timelimit = (Object) timelimit;
  }
}
