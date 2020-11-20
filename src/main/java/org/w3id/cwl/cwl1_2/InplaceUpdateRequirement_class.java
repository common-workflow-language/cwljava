package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum InplaceUpdateRequirement_class {
  INPLACEUPDATEREQUIREMENT("InplaceUpdateRequirement");

  private static String[] symbols = new String[] {"InplaceUpdateRequirement"};
  private String docVal;

  private InplaceUpdateRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static InplaceUpdateRequirement_class fromDocumentVal(final String docVal) {
    for(final InplaceUpdateRequirement_class val : InplaceUpdateRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", InplaceUpdateRequirement_class.symbols, docVal));
  }
}
