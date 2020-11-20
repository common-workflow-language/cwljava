package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum InlineJavascriptRequirement_class {
  INLINEJAVASCRIPTREQUIREMENT("InlineJavascriptRequirement");

  private static String[] symbols = new String[] {"InlineJavascriptRequirement"};
  private String docVal;

  private InlineJavascriptRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static InlineJavascriptRequirement_class fromDocumentVal(final String docVal) {
    for(final InlineJavascriptRequirement_class val : InlineJavascriptRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", InlineJavascriptRequirement_class.symbols, docVal));
  }
}
