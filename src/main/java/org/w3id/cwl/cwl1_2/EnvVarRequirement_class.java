package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum EnvVarRequirement_class {
  ENVVARREQUIREMENT("EnvVarRequirement");

  private static String[] symbols = new String[] {"EnvVarRequirement"};
  private String docVal;

  private EnvVarRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static EnvVarRequirement_class fromDocumentVal(final String docVal) {
    for(final EnvVarRequirement_class val : EnvVarRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", EnvVarRequirement_class.symbols, docVal));
  }
}
