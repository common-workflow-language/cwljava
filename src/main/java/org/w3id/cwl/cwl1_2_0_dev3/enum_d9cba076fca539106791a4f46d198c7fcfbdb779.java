package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

public enum enum_d9cba076fca539106791a4f46d198c7fcfbdb779 {
  RECORD("record");

  private static String[] symbols = new String[] {"record"};
  private String docVal;

  private enum_d9cba076fca539106791a4f46d198c7fcfbdb779(final String docVal) {
    this.docVal = docVal;
  }

  public static enum_d9cba076fca539106791a4f46d198c7fcfbdb779 fromDocumentVal(final String docVal) {
    for (final enum_d9cba076fca539106791a4f46d198c7fcfbdb779 val :
        enum_d9cba076fca539106791a4f46d198c7fcfbdb779.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format(
            "Expected one of %s", enum_d9cba076fca539106791a4f46d198c7fcfbdb779.symbols, docVal));
  }
}
