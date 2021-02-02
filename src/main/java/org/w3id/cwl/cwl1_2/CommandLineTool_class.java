package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum CommandLineTool_class {
  COMMANDLINETOOL("CommandLineTool");

  private static String[] symbols = new String[] {"CommandLineTool"};
  private String docVal;

  private CommandLineTool_class(final String docVal) {
    this.docVal = docVal;
  }

  public static CommandLineTool_class fromDocumentVal(final String docVal) {
    for(final CommandLineTool_class val : CommandLineTool_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", CommandLineTool_class.symbols, docVal));
  }
}
