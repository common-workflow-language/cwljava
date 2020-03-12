package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

public enum Directory_class {
  DIRECTORY("Directory");

  private static String[] symbols = new String[] {"Directory"};
  private String docVal;

  private Directory_class(final String docVal) {
    this.docVal = docVal;
  }

  public static Directory_class fromDocumentVal(final String docVal) {
    for (final Directory_class val : Directory_class.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format("Expected one of %s", Directory_class.symbols, docVal));
  }
}
