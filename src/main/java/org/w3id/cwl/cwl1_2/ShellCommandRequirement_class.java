package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum ShellCommandRequirement_class {
  SHELLCOMMANDREQUIREMENT("ShellCommandRequirement");

  private static String[] symbols = new String[] {"ShellCommandRequirement"};
  private String docVal;

  private ShellCommandRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static ShellCommandRequirement_class fromDocumentVal(final String docVal) {
    for(final ShellCommandRequirement_class val : ShellCommandRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", ShellCommandRequirement_class.symbols, docVal));
  }
}
