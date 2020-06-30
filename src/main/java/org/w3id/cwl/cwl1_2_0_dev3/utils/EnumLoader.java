package org.w3id.cwl.cwl1_2_0_dev3.utils;

import java.lang.reflect.Method;

public class EnumLoader<T extends Enum> implements Loader<T> {
  private final Class<T> symbolEnumClass;

  public EnumLoader(final Class<T> symbolEnumClass) {
    this.symbolEnumClass = symbolEnumClass;
  }

  public T load(
      final Object doc,
      final String baseUri,
      final LoadingOptions loadingOptions,
      final String docRoot) {
    final String docString = Loader.validateOfJavaType(String.class, doc);
    try {
      final Method m = symbolEnumClass.getMethod("fromDocumentVal", String.class);
      final T val = (T) m.invoke(null, docString);
      return val;
    } catch (final ReflectiveOperationException e) {
      throw new RuntimeException(e);
    }
  }
}
