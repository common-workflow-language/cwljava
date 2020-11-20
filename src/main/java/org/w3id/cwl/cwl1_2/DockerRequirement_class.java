package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum DockerRequirement_class {
  DOCKERREQUIREMENT("DockerRequirement");

  private static String[] symbols = new String[] {"DockerRequirement"};
  private String docVal;

  private DockerRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static DockerRequirement_class fromDocumentVal(final String docVal) {
    for(final DockerRequirement_class val : DockerRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", DockerRequirement_class.symbols, docVal));
  }
}
