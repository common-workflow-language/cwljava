package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum stdout {
  STDOUT("stdout");

  private static String[] symbols = new String[] {"stdout"};
  private String docVal;

  private stdout(final String docVal) {
    this.docVal = docVal;
  }

  public static stdout fromDocumentVal(final String docVal) {
    for(final stdout val : stdout.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", stdout.symbols, docVal));
  }
}
