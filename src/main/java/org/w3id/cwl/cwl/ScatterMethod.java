package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.ValidationException;

public enum ScatterMethod {
  DOTPRODUCT("dotproduct"),
  NESTED_CROSSPRODUCT("nested_crossproduct"),
  FLAT_CROSSPRODUCT("flat_crossproduct");

  private static String[] symbols =
      new String[] {"dotproduct", "nested_crossproduct", "flat_crossproduct"};
  private String docVal;

  private ScatterMethod(final String docVal) {
    this.docVal = docVal;
  }

  public static ScatterMethod fromDocumentVal(final String docVal) {
    for (final ScatterMethod val : ScatterMethod.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format("Expected one of %s", ScatterMethod.symbols, docVal));
  }
}
