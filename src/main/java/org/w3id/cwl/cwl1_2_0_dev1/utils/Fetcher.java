package org.w3id.cwl.cwl1_2_0_dev1.utils;

public interface Fetcher {

  public abstract String urlJoin(final String baseUrl, final String url);

  public abstract String fetchText(final String url);
}
