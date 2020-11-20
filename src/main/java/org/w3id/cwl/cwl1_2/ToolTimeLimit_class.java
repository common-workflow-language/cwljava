package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum ToolTimeLimit_class {
  TOOLTIMELIMIT("ToolTimeLimit");

  private static String[] symbols = new String[] {"ToolTimeLimit"};
  private String docVal;

  private ToolTimeLimit_class(final String docVal) {
    this.docVal = docVal;
  }

  public static ToolTimeLimit_class fromDocumentVal(final String docVal) {
    for(final ToolTimeLimit_class val : ToolTimeLimit_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", ToolTimeLimit_class.symbols, docVal));
  }
}
