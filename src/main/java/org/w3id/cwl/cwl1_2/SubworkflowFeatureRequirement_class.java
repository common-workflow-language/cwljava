package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum SubworkflowFeatureRequirement_class {
  SUBWORKFLOWFEATUREREQUIREMENT("SubworkflowFeatureRequirement");

  private static String[] symbols = new String[] {"SubworkflowFeatureRequirement"};
  private String docVal;

  private SubworkflowFeatureRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static SubworkflowFeatureRequirement_class fromDocumentVal(final String docVal) {
    for(final SubworkflowFeatureRequirement_class val : SubworkflowFeatureRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", SubworkflowFeatureRequirement_class.symbols, docVal));
  }
}
