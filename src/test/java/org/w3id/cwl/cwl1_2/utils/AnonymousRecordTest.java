package org.w3id.cwl.cwl1_2.utils;

import org.w3id.cwl.cwl1_2.utils.RootLoader;
import org.w3id.cwl.cwl1_2.utils.Uris;
import org.w3id.cwl.cwl1_2.utils.YamlUtils;

public class AnonymousRecordTest {

  @org.junit.Test
  public void test_record_with_anonymous_type_record() throws Exception {
    java.net.URL url = getClass().getResource("record-in-format.cwl.json");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }
  
}