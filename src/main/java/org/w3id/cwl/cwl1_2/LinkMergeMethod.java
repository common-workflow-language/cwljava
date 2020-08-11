package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum LinkMergeMethod {
  MERGE_NESTED("merge_nested"),
  MERGE_FLATTENED("merge_flattened");

  private static String[] symbols = new String[] {"merge_nested", "merge_flattened"};
  private String docVal;

  private LinkMergeMethod(final String docVal) {
    this.docVal = docVal;
  }

  public static LinkMergeMethod fromDocumentVal(final String docVal) {
    for(final LinkMergeMethod val : LinkMergeMethod.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", LinkMergeMethod.symbols, docVal));
  }
}
