package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum Operation_class {
  OPERATION("Operation");

  private static String[] symbols = new String[] {"Operation"};
  private String docVal;

  private Operation_class(final String docVal) {
    this.docVal = docVal;
  }

  public static Operation_class fromDocumentVal(final String docVal) {
    for(final Operation_class val : Operation_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", Operation_class.symbols, docVal));
  }
}
