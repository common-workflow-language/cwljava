package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.ValidationException;

public enum SchemaDefRequirement_class {
  SCHEMADEFREQUIREMENT("SchemaDefRequirement");

  private static String[] symbols = new String[] {"SchemaDefRequirement"};
  private String docVal;

  private SchemaDefRequirement_class(final String docVal) {
    this.docVal = docVal;
  }

  public static SchemaDefRequirement_class fromDocumentVal(final String docVal) {
    for(final SchemaDefRequirement_class val : SchemaDefRequirement_class.values()) {
      if(val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(String.format("Expected one of %s", SchemaDefRequirement_class.symbols, docVal));
  }
}
