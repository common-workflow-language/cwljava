package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

public enum enum_d961d79c225752b9fadb617367615ab176b47d77 {
  ENUM("enum");

  private static String[] symbols = new String[] {"enum"};
  private String docVal;

  private enum_d961d79c225752b9fadb617367615ab176b47d77(final String docVal) {
    this.docVal = docVal;
  }

  public static enum_d961d79c225752b9fadb617367615ab176b47d77 fromDocumentVal(final String docVal) {
    for (final enum_d961d79c225752b9fadb617367615ab176b47d77 val :
        enum_d961d79c225752b9fadb617367615ab176b47d77.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format(
            "Expected one of %s", enum_d961d79c225752b9fadb617367615ab176b47d77.symbols, docVal));
  }
}
