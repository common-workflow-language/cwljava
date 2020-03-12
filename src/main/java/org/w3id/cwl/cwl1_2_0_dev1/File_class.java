package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

public enum File_class {
  FILE("File");

  private static String[] symbols = new String[] {"File"};
  private String docVal;

  private File_class(final String docVal) {
    this.docVal = docVal;
  }

  public static File_class fromDocumentVal(final String docVal) {
    for (final File_class val : File_class.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", File_class.symbols, docVal));
  }
}
