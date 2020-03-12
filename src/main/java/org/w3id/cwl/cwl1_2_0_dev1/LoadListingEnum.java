package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.ValidationException;

public enum LoadListingEnum {
  NO_LISTING("no_listing"),
  SHALLOW_LISTING("shallow_listing"),
  DEEP_LISTING("deep_listing");

  private static String[] symbols = new String[] {"no_listing", "shallow_listing", "deep_listing"};
  private String docVal;

  private LoadListingEnum(final String docVal) {
    this.docVal = docVal;
  }

  public static LoadListingEnum fromDocumentVal(final String docVal) {
    for (final LoadListingEnum val : LoadListingEnum.values()) {
      if (val.docVal.equals(docVal)) {
        return val;
      }
    }
    throw new ValidationException(
        String.format("Expected one of %s", LoadListingEnum.symbols, docVal));
  }
}
