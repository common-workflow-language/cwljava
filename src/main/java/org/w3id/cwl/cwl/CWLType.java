package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.ValidationException;

public enum CWLType {
  FILE("File"),
  DIRECTORY("Directory");

  private static String[] symbols = new String[] {"File", "Directory"};
  private String docVal;

  private CWLType(final String docVal) {
    this.docVal = docVal;
  }

  public static CWLType fromDocumentVal(final String docVal) {
    for (final CWLType val : CWLType.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", CWLType.symbols, docVal));
  }
}
