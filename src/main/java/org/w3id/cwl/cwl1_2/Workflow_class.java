package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum Workflow_class {
  WORKFLOW("Workflow");

  private static String[] symbols = new String[] {"Workflow"};
  private String docVal;

  private Workflow_class(final String docVal) {
    this.docVal = docVal;
  }

  public static Workflow_class fromDocumentVal(final String docVal) {
    for(final Workflow_class val : Workflow_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", Workflow_class.symbols, docVal));
  }
}
