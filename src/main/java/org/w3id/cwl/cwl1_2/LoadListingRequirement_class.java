package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum LoadListingRequirement_class {
  LOADLISTINGREQUIREMENT("LoadListingRequirement");

  private static String[] symbols = new String[] {"LoadListingRequirement"};
  private String docVal;

  private LoadListingRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static LoadListingRequirement_class fromDocumentVal(final String docVal) {
    for(final LoadListingRequirement_class val : LoadListingRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", LoadListingRequirement_class.symbols, docVal));
  }
}
