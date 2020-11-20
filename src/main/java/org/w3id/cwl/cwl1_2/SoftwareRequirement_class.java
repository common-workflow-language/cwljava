package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum SoftwareRequirement_class {
  SOFTWAREREQUIREMENT("SoftwareRequirement");

  private static String[] symbols = new String[] {"SoftwareRequirement"};
  private String docVal;

  private SoftwareRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static SoftwareRequirement_class fromDocumentVal(final String docVal) {
    for(final SoftwareRequirement_class val : SoftwareRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", SoftwareRequirement_class.symbols, docVal));
  }
}
