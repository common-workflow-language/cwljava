package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum ResourceRequirement_class {
  RESOURCEREQUIREMENT("ResourceRequirement");

  private static String[] symbols = new String[] {"ResourceRequirement"};
  private String docVal;

  private ResourceRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static ResourceRequirement_class fromDocumentVal(final String docVal) {
    for(final ResourceRequirement_class val : ResourceRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", ResourceRequirement_class.symbols, docVal));
  }
}
