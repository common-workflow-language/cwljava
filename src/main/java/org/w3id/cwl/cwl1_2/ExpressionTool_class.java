package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum ExpressionTool_class {
  EXPRESSIONTOOL("ExpressionTool");

  private static String[] symbols = new String[] {"ExpressionTool"};
  private String docVal;

  private ExpressionTool_class(final String docVal) {
    this.docVal = docVal;
  }

  public static ExpressionTool_class fromDocumentVal(final String docVal) {
    for(final ExpressionTool_class val : ExpressionTool_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", ExpressionTool_class.symbols, docVal));
  }
}
