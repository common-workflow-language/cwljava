package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

public enum enum_d062602be0b4b8fd33e69e29a841317b6ab665bc {
  ARRAY("array");

  private static String[] symbols = new String[] {"array"};
  private String docVal;

  private enum_d062602be0b4b8fd33e69e29a841317b6ab665bc(final String docVal) {
    this.docVal = docVal;
  }

  public static enum_d062602be0b4b8fd33e69e29a841317b6ab665bc fromDocumentVal(final String docVal) {
    for (final enum_d062602be0b4b8fd33e69e29a841317b6ab665bc val :
        enum_d062602be0b4b8fd33e69e29a841317b6ab665bc.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format(
            "Expected one of %s", enum_d062602be0b4b8fd33e69e29a841317b6ab665bc.symbols, docVal));
  }
}
