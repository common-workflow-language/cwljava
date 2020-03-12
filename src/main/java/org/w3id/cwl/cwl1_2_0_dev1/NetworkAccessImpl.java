package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2_0_dev1.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2_0_dev1.utils.SavableImpl;
import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#NetworkAccess</I><br>
 *
 * <BLOCKQUOTE>
 *
 * Indicate whether a process requires outgoing IPv4/IPv6 network access. Choice of IPv4 or IPv6 is
 * implementation and site specific, correct tools must support both.
 *
 * <p>If `networkAccess` is false or not specified, tools must not assume network access, except for
 * localhost (the loopback device).
 *
 * <p>If `networkAccess` is true, the tool must be able to make outgoing connections to network
 * resources. Resources may be on a private subnet or the public Internet. However, implementations
 * and sites may apply their own security policies to restrict what is accessible by the tool.
 *
 * <p>Enabling network access does not imply a publically routable IP address or the ability to
 * accept inbound connections.
 *
 * </BLOCKQUOTE>
 */
public class NetworkAccessImpl extends SavableImpl implements NetworkAccess {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#NetworkAccess/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'NetworkAccess' *
   *
   * </BLOCKQUOTE>
   */
  public String getClass_() {
    return this.class_;
  }

  private Object networkAccess;

  /** Getter for property <I>https://w3id.org/cwl/cwl#NetworkAccess/networkAccess</I><br> */
  public Object getNetworkAccess() {
    return this.networkAccess;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2_0_dev1.utils.RootLoader} to construct instances of
   * NetworkAccessImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public NetworkAccessImpl(
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
      throw new ValidationException("NetworkAccessImpl called on non-map");
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
    Object networkAccess;
    try {
      networkAccess =
          LoaderInstances.union_of_BooleanInstance_or_Expression.loadField(
              __doc.get("networkAccess"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      networkAccess = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `networkAccess` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
    this.networkAccess = (Object) networkAccess;
  }
}
