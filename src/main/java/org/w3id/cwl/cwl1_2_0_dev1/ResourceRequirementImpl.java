package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2_0_dev1.utils.SavableImpl;
import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#ResourceRequirement</I><br>
 *
 * <BLOCKQUOTE>
 *
 * Specify basic hardware resource requirements.
 *
 * <p>"min" is the minimum amount of a resource that must be reserved to schedule a job. If "min"
 * cannot be satisfied, the job should not be run.
 *
 * <p>"max" is the maximum amount of a resource that the job shall be permitted to use. If a node
 * has sufficient resources, multiple jobs may be scheduled on a single node provided each job's
 * "max" resource requirements are met. If a job attempts to exceed its "max" resource allocation,
 * an implementation may deny additional resources, which may result in job failure.
 *
 * <p>If "min" is specified but "max" is not, then "max" == "min" If "max" is specified by "min" is
 * not, then "min" == "max".
 *
 * <p>It is an error if max < min.
 *
 * <p>It is an error if the value of any of these fields is negative.
 *
 * <p>If neither "min" nor "max" is specified for a resource, use the default values below.
 *
 * </BLOCKQUOTE>
 */
public class ResourceRequirementImpl extends SavableImpl implements ResourceRequirement {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'ResourceRequirement' *
   *
   * </BLOCKQUOTE>
   */
  public String getClass_() {
    return this.class_;
  }

  private Object coresMin;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/coresMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved number of CPU cores (default is 1) *
   *
   * </BLOCKQUOTE>
   */
  public Object getCoresMin() {
    return this.coresMin;
  }

  private Object coresMax;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/coresMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved number of CPU cores *
   *
   * </BLOCKQUOTE>
   */
  public Object getCoresMax() {
    return this.coresMax;
  }

  private Object ramMin;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/ramMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved RAM in mebibytes (2**20) (default is 256) *
   *
   * </BLOCKQUOTE>
   */
  public Object getRamMin() {
    return this.ramMin;
  }

  private Object ramMax;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/ramMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved RAM in mebibytes (2**20) *
   *
   * </BLOCKQUOTE>
   */
  public Object getRamMax() {
    return this.ramMax;
  }

  private Object tmpdirMin;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/tmpdirMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved filesystem based storage for the designated temporary directory, in mebibytes
   * (2**20) (default is 1024) *
   *
   * </BLOCKQUOTE>
   */
  public Object getTmpdirMin() {
    return this.tmpdirMin;
  }

  private Object tmpdirMax;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/tmpdirMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved filesystem based storage for the designated temporary directory, in mebibytes
   * (2**20) *
   *
   * </BLOCKQUOTE>
   */
  public Object getTmpdirMax() {
    return this.tmpdirMax;
  }

  private Object outdirMin;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/outdirMin</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Minimum reserved filesystem based storage for the designated output directory, in mebibytes
   * (2**20) (default is 1024) *
   *
   * </BLOCKQUOTE>
   */
  public Object getOutdirMin() {
    return this.outdirMin;
  }

  private Object outdirMax;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ResourceRequirement/outdirMax</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Maximum reserved filesystem based storage for the designated output directory, in mebibytes
   * (2**20) *
   *
   * </BLOCKQUOTE>
   */
  public Object getOutdirMax() {
    return this.outdirMax;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2_0_dev1.utils.RootLoader} to construct instances of
   * ResourceRequirementImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public ResourceRequirementImpl(
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
      throw new ValidationException("ResourceRequirementImpl called on non-map");
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
    Object coresMin;

    if (__doc.containsKey("coresMin")) {
      try {
        coresMin =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("coresMin"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        coresMin = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `coresMin` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      coresMin = null;
    }
    Object coresMax;

    if (__doc.containsKey("coresMax")) {
      try {
        coresMax =
            LoaderInstances.union_of_NullInstance_or_IntegerInstance_or_Expression.loadField(
                __doc.get("coresMax"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        coresMax = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `coresMax` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      coresMax = null;
    }
    Object ramMin;

    if (__doc.containsKey("ramMin")) {
      try {
        ramMin =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("ramMin"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        ramMin = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `ramMin` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      ramMin = null;
    }
    Object ramMax;

    if (__doc.containsKey("ramMax")) {
      try {
        ramMax =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("ramMax"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        ramMax = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `ramMax` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      ramMax = null;
    }
    Object tmpdirMin;

    if (__doc.containsKey("tmpdirMin")) {
      try {
        tmpdirMin =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("tmpdirMin"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        tmpdirMin = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `tmpdirMin` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      tmpdirMin = null;
    }
    Object tmpdirMax;

    if (__doc.containsKey("tmpdirMax")) {
      try {
        tmpdirMax =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("tmpdirMax"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        tmpdirMax = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `tmpdirMax` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      tmpdirMax = null;
    }
    Object outdirMin;

    if (__doc.containsKey("outdirMin")) {
      try {
        outdirMin =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("outdirMin"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        outdirMin = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `outdirMin` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      outdirMin = null;
    }
    Object outdirMax;

    if (__doc.containsKey("outdirMax")) {
      try {
        outdirMax =
            LoaderInstances.union_of_NullInstance_or_LongInstance_or_Expression.loadField(
                __doc.get("outdirMax"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        outdirMax = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `outdirMax` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      outdirMax = null;
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.coresMin = (Object) coresMin;
    this.coresMax = (Object) coresMax;
    this.ramMin = (Object) ramMin;
    this.ramMax = (Object) ramMax;
    this.tmpdirMin = (Object) tmpdirMin;
    this.tmpdirMax = (Object) tmpdirMax;
    this.outdirMin = (Object) outdirMin;
    this.outdirMax = (Object) outdirMax;
  }
}
