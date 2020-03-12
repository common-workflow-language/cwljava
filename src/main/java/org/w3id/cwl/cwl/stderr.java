package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.ValidationException;

public enum stderr {
  STDERR("stderr");

  private static String[] symbols = new String[] {"stderr"};
  private String docVal;

  private stderr(final String docVal) {
    this.docVal = docVal;
  }

  public static stderr fromDocumentVal(final String docVal) {
    for (final stderr val : stderr.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", stderr.symbols, docVal));
  }
}
