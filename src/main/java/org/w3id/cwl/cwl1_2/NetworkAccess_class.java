package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum NetworkAccess_class {
  NETWORKACCESS("NetworkAccess");

  private static String[] symbols = new String[] {"NetworkAccess"};
  private String docVal;

  private NetworkAccess_class(final String docVal) {
    this.docVal = docVal;
  }

  public static NetworkAccess_class fromDocumentVal(final String docVal) {
    for(final NetworkAccess_class val : NetworkAccess_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", NetworkAccess_class.symbols, docVal));
  }
}
