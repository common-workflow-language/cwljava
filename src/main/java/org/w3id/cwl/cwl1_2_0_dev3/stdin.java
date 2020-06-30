package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

public enum stdin {
  STDIN("stdin");

  private static String[] symbols = new String[] {"stdin"};
  private String docVal;

  private stdin(final String docVal) {
    this.docVal = docVal;
  }

  public static stdin fromDocumentVal(final String docVal) {
    for (final stdin val : stdin.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", stdin.symbols, docVal));
  }
}
