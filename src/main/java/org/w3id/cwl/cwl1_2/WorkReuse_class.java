package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum WorkReuse_class {
  WORKREUSE("WorkReuse");

  private static String[] symbols = new String[] {"WorkReuse"};
  private String docVal;

  private WorkReuse_class(final String docVal) {
    this.docVal = docVal;
  }

  public static WorkReuse_class fromDocumentVal(final String docVal) {
    for(final WorkReuse_class val : WorkReuse_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", WorkReuse_class.symbols, docVal));
  }
}
