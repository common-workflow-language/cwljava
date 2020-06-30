package org.w3id.cwl.cwl1_2_0_dev3.utils;

public class NullLoader implements Loader<Object> {

  public Object load(
      final Object doc,
      final String baseUri,
      final LoadingOptions loadingOptions,
      final String docRoot) {
    if (doc != null) {
      throw new ValidationException("Expected null");
    }
    return doc;
  }
}
