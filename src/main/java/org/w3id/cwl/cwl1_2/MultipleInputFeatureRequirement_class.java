package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum MultipleInputFeatureRequirement_class {
  MULTIPLEINPUTFEATUREREQUIREMENT("MultipleInputFeatureRequirement");

  private static String[] symbols = new String[] {"MultipleInputFeatureRequirement"};
  private String docVal;

  private MultipleInputFeatureRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static MultipleInputFeatureRequirement_class fromDocumentVal(final String docVal) {
    for(final MultipleInputFeatureRequirement_class val : MultipleInputFeatureRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", MultipleInputFeatureRequirement_class.symbols, docVal));
  }
}
