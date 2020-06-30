package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

public enum PickValueMethod {
  FIRST_NON_NULL("first_non_null"),
  THE_ONLY_NON_NULL("the_only_non_null"),
  ALL_NON_NULL("all_non_null");

  private static String[] symbols =
      new String[] {"first_non_null", "the_only_non_null", "all_non_null"};
  private String docVal;

  private PickValueMethod(final String docVal) {
    this.docVal = docVal;
  }

  public static PickValueMethod fromDocumentVal(final String docVal) {
    for (final PickValueMethod val : PickValueMethod.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format("Expected one of %s", PickValueMethod.symbols, docVal));
  }
}
