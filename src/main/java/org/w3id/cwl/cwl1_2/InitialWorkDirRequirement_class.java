package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum InitialWorkDirRequirement_class {
  INITIALWORKDIRREQUIREMENT("InitialWorkDirRequirement");

  private static String[] symbols = new String[] {"InitialWorkDirRequirement"};
  private String docVal;

  private InitialWorkDirRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static InitialWorkDirRequirement_class fromDocumentVal(final String docVal) {
    for(final InitialWorkDirRequirement_class val : InitialWorkDirRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", InitialWorkDirRequirement_class.symbols, docVal));
  }
}
