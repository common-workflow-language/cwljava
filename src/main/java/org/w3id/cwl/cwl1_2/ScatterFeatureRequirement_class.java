package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum ScatterFeatureRequirement_class {
  SCATTERFEATUREREQUIREMENT("ScatterFeatureRequirement");

  private static String[] symbols = new String[] {"ScatterFeatureRequirement"};
  private String docVal;

  private ScatterFeatureRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static ScatterFeatureRequirement_class fromDocumentVal(final String docVal) {
    for(final ScatterFeatureRequirement_class val : ScatterFeatureRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", ScatterFeatureRequirement_class.symbols, docVal));
  }
}
