package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum StepInputExpressionRequirement_class {
  STEPINPUTEXPRESSIONREQUIREMENT("StepInputExpressionRequirement");

  private static String[] symbols = new String[] {"StepInputExpressionRequirement"};
  private String docVal;

  private StepInputExpressionRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static StepInputExpressionRequirement_class fromDocumentVal(final String docVal) {
    for(final StepInputExpressionRequirement_class val : StepInputExpressionRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", StepInputExpressionRequirement_class.symbols, docVal));
  }
}
