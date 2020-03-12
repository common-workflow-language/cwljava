package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

public enum Expression {
  EXPRESSIONPLACEHOLDER("ExpressionPlaceholder");

  private static String[] symbols = new String[] {"ExpressionPlaceholder"};
  private String docVal;

  private Expression(final String docVal) {
    this.docVal = docVal;
  }

  public static Expression fromDocumentVal(final String docVal) {
    for (final Expression val : Expression.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", Expression.symbols, docVal));
  }
}
