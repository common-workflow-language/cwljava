package org.w3id.cwl.cwl1_2.utils;

public class ExamplesTest {

  @org.junit.Test
  public void testvalid_stage_unprovided_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_unprovided_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_unprovided_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_step_valuefrom3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_file_array_basenameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_array_basenameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_array_basenameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_missing_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_missing_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_missing_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_linkfileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_linkfileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_linkfileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_fileobjs1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_fileobjs1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_fileobjs1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wc_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wc_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wc_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_outputevalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_outputevalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_outputevalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_namerootByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_namerootByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_namerootByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_tool_dockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_dockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_dockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_output_arrays_int_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_output_arrays_int_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_output_arrays_int_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_013_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_013_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_013_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines15_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines15_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines15_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_pass_unconnectedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_pass_unconnectedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_pass_unconnectedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat5_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat5_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat5_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_catByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_catByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_catByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_output_arrays_intByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_output_arrays_intByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_output_arrays_intByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_initialworkdirrequirement_docker_outByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_initialworkdirrequirement_docker_outByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_initialworkdirrequirement_docker_outByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_writable_dir_dockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_writable_dir_dockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_writable_dir_dockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines7_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines7_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines7_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_formattestByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_formattestByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_formattestByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_passthrough3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_007ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_007ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_007ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_symlink_legalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_symlink_legalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_symlink_legalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines1_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines1_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines1_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_any_type_compatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_any_type_compatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_any_type_compatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_docker_output_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_docker_output_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_docker_output_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_011ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_011ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_011ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_output_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_output_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_output_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwdr_entryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_entryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_entryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wf_loadContents2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wf_loadContents2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wf_loadContents2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_anon_enum_inside_array_inside_schemadefByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_anon_enum_inside_array_inside_schemadefByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_anon_enum_inside_array_inside_schemadefByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_bool_empty_inputbindingByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_bool_empty_inputbindingByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_bool_empty_inputbindingByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_imported_hintByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_imported_hintByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_imported_hintByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wf_loadContents4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wf_loadContents4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wf_loadContents4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_with_defaultsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_with_defaultsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_with_defaultsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wf_loadContentsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContentsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContentsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_nested_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_nested_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_nested_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_in_formatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_in_formatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_in_formatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_tool_packed2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_packed2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_packed2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_docker_array_secondaryfilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_docker_array_secondaryfilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_docker_array_secondaryfilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wc2_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wc2_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wc2_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_synth_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_synth_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_synth_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_passthrough1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_output_arrays_int_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_int_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_int_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_revtoolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_revtoolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_revtoolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stderrByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stderrByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stderrByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_no_inputs_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_no_inputs_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_no_inputs_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines14_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines14_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines14_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_output_arrays_file_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_file_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_file_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wf_loadContents3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wf_loadContents3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wf_loadContents3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_fileobjs2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_fileobjs2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_fileobjs2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wc3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wc3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wc3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_tool_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_docker_run_cmdByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_docker_run_cmdByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_docker_run_cmdByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_schemadef_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_schemadef_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_schemadef_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stderr_mediumcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stderr_mediumcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stderr_mediumcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_size_expression_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_size_expression_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_size_expression_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_wf_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_wf_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_wf_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_int_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_int_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_int_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_any_type_compatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_any_type_compatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_any_type_compatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_any-type-compat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwdr_entryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwdr_entryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwdr_entryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr-entry.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines17_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines17_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines17_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_sum_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_sum_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_sum_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_004_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_004_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_004_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_updatedir_inplaceByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_updatedir_inplaceByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_updatedir_inplaceByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_null_definedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_null_definedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_null_definedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_writable_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_writable_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_writable_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_formattest2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_formattest2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_formattest2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_passthrough2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_storage_floatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_storage_floatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_storage_floatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_sum_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_sum_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_sum_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wc_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wc_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wc_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_shallow1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_shallow1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_shallow1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wf_renByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wf_renByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wf_renByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines14_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines14_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines14_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines14-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_binding_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_binding_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_binding_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_009_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_009_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_009_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_null_expression1_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_null_expression1_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_null_expression1_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_bash_line_continuation_with_expressionByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_bash_line_continuation_with_expressionByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_bash_line_continuation_with_expressionByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines6_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines6_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines6_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_007ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_007ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_007ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_vf_concatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_vf_concatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_vf_concatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_recursive_input_directoryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_recursive_input_directoryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_recursive_input_directoryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_002ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_002ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_002ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_deep1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_deep1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_deep1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_js_quoteByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_js_quoteByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_js_quoteByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_js_input_recordByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_js_input_recordByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_js_input_recordByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_recursive_input_directoryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_recursive_input_directoryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_recursive_input_directoryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_recursive-input-directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines9_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines9_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines9_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stderr_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stderr_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stderr_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_formattest3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_formattest3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_formattest3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_metadataByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_metadataByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_metadataByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_bash_dollar_quoteByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_bash_dollar_quoteByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_bash_dollar_quoteByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_vf_concatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_vf_concatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_vf_concatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_vf-concat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_storage_floatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_storage_floatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_storage_floatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_storage_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_002_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_002_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_002_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_synth_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_synth_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_synth_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_synth-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_tool1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_tool1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_tool1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_operationByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_operationByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_operationByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_deep2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_deep2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_deep2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_container_entryname1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_fooByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_fooByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_fooByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_inline_jsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_inline_jsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_inline_jsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cwloutput_nolimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cwloutput_nolimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cwloutput_nolimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_rename_inputsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_rename_inputsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_rename_inputsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_touchByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_touchByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_touchByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_js_quoteByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_js_quoteByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_js_quoteByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_tooldefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_tooldefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_tooldefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wc_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wc_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wc_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_writable_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_writable_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_writable_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_colon_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_colon_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_colon_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_null_expression2_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_null_expression2_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_null_expression2_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_no_outputs_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_no_outputs_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_no_outputs_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_envvar3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_envvar3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_envvar3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreqByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreqByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreqByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwdr_with_nested_dirsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwdr_with_nested_dirsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwdr_with_nested_dirsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines1_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines1_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines1_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_tool3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_tool3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_tool3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_tool_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_tool_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_tool_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines19_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines19_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines19_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_003_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_no_outputs_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_no_outputs_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_no_outputs_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_004_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_004_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_004_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_glob_path_errorByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_glob_path_errorByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_glob_path_errorByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_tmap_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_tmap_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_tmap_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat4_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat4_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat4_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_envvarByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_envvarByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_envvarByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_fail_unspecified_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_fail_unspecified_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_fail_unspecified_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines17_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines17_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines17_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines17-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_optional_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_optional_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_optional_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_inline_jsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_inline_jsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_inline_jsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_inline-js.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines16_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines16_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines16_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines1_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines1_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines1_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_schemadef_types_with_import_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_types_with_import_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_types_with_import_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wc_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wc_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wc_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_steplevel_resreqByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_steplevel_resreqByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_steplevel_resreqByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_passthrough4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump3_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump3_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump3_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_int_default_tool_and_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_int_default_tool_and_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_int_default_tool_and_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_nested_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_nested_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_nested_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_nested-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_no_inputs_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_no_inputs_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_no_inputs_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwdr_with_nested_dirsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_with_nested_dirsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_with_nested_dirsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_with_nested_dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stderr_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stderr_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stderr_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stderr-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_007_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_007_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_007_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_output_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_output_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_output_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-output-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_missing_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_missing_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_missing_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-missing-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_009ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_009ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_009ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_011_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_011_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_011_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_networkaccess2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_networkaccess2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_networkaccess2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_bash_line_continuation_with_expressionByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_bash_line_continuation_with_expressionByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_bash_line_continuation_with_expressionByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation-with-expression.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_mkdirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_mkdirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_mkdirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_valueFrom_constantByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_valueFrom_constantByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_valueFrom_constantByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_schemadef_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_test_cwl_out2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_test_cwl_out2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_test_cwl_out2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf6ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf6ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf6ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_metadataByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_metadataByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_metadataByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_metadata.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines9_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines9_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines9_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_fooByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_fooByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_fooByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_foo.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_params2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_params2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_params2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines9_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines9_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines9_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_multiple_input_feature_requirementByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_multiple_input_feature_requirementByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_multiple_input_feature_requirementByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_passthrough3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines7_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines7_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines7_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines7-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_any_wf_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_any_wf_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_any_wf_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_default_pathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_default_pathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_default_pathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_fail_unconnectedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_fail_unconnectedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_fail_unconnectedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_actionByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_actionByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_actionByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_file_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_file_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_file_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_empty_array_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_empty_array_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_empty_array_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_inpdir_update_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_inpdir_update_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_inpdir_update_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_tool_mediumcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_mediumcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_mediumcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wc3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wc3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wc3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir7ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir7ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir7ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_binding_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_binding_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_binding_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_binding-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_revsort_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_revsort_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_revsort_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_paramsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_paramsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_paramsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_orderByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_orderByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_orderByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines8_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines8_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines8_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_output_reference_workflow_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_output_reference_workflow_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_output_reference_workflow_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines5_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines5_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines5_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_pass_unconnectedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_pass_unconnectedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_pass_unconnectedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_pass-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_networkaccessByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_networkaccessByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_networkaccessByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines4_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines4_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines4_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_empty_array_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_empty_array_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_empty_array_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_empty-array-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_colon_test_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_colon_test_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_colon_test_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_tool_dockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_tool_dockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_tool_dockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_optional_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_optional_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_optional_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_in_secondaryFiles_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_array_inside_schemadefByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_array_inside_schemadefByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_array_inside_schemadefByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array_inside_schemadef.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines8_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines8_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines8_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_symlink_legalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_symlink_legalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_symlink_legalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-legal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_touchByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_touchByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_touchByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_touch.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_none3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_none3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_none3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat1_testcliByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat1_testcliByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat1_testcliByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_any_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_any_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_any_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_003_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_array_dirsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_array_dirsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_array_dirsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_rename_outputsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_rename_outputsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_rename_outputsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_revtoolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_revtoolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_revtoolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_revtool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_002_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_002_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_002_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-002_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_011ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_011ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_011ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_001ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_001ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_001ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines10_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines10_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines10_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_valid_schemadef_types_with_import_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_valid_schemadef_types_with_import_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_valid_schemadef_types_with_import_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_004ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_004ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_004ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_bool_empty_inputbindingByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_bool_empty_inputbindingByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_bool_empty_inputbindingByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bool-empty-inputbinding.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_tool1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_tool1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_tool1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_import_schema_defByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_defByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_defByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_any_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_any_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_any_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_anon_enum_inside_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_colon_test_outputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_colon_test_outputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_colon_test_outputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_colon_test_output.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_anon_enum_inside_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_anon_enum_inside_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_anon_enum_inside_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_anon_enum_inside_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_no_outputs_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_no_outputs_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_no_outputs_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-outputs-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_inp_update_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_inp_update_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_inp_update_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines12_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines12_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines12_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_tool2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_tool2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_tool2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_wf_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_wf_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_wf_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-wf-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir7ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir7ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir7ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir7.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_int_optional_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_int_optional_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_int_optional_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_001ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_001ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_001ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_sorttoolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_sorttoolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_sorttoolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_012_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_012_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_012_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_docker_array_secondaryfilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_docker_array_secondaryfilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_docker_array_secondaryfilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-array-secondaryfiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_013_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_013_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_013_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines9_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines9_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines9_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines9-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_shallow2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_shallow2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_shallow2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_002ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_002ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_002ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-002.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wf_loadContents2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_001_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_001_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_001_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_updatedir_inplaceByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_updatedir_inplaceByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_updatedir_inplaceByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updatedir_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_sum_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_sum_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_sum_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stage_file_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_file_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_file_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_checkByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_checkByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_checkByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wf_loadContents3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_003ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_003ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_003ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_initialworkdir_glob_fullpathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_initialworkdir_glob_fullpathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_initialworkdir_glob_fullpathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_null_step_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_null_step_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_null_step_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_container_entryname4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_position_exprByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_position_exprByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_position_exprByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_wf4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_wf4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_wf4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_shellchar2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_shellchar2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_shellchar2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_null_expression3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_null_expression3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_null_expression3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_no_inputs_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_no_inputs_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_no_inputs_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_001_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_001_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_001_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-001_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_no_inputs_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_no_inputs_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_no_inputs_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-inputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_wf2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_wf2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_wf2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_013ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_013ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_013ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_runtime_outdirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_runtime_outdirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_runtime_outdirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_003ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_010ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_010ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_010ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_tool_v12ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_tool_v12ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_tool_v12ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_glob_expr_listByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_glob_expr_listByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_glob_expr_listByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_runtime_paths_distinctByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_runtime_paths_distinctByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_runtime_paths_distinctByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_loadContents_limitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_loadContents_limitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_loadContents_limitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_inputs_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_inputs_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_inputs_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_007_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_007_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_007_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-007_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_wf4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines10_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines10_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines10_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines10-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_glob_directoryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_glob_directoryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_glob_directoryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_import_schema_defByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_import_schema_defByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_import_schema_defByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_import_schema_def2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_def2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_def2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_docker_run_cmdByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_docker_run_cmdByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_docker_run_cmdByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_docker-run-cmd.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_schemadef_types_with_import_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_schemadef_types_with_import_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_schemadef_types_with_import_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef_types_with_import-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_no_outputs_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_no_outputs_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_no_outputs_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_no-outputs-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_011_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_011_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_011_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-011_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_003_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_glob_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_glob_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_glob_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_bwa_mem_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_bwa_mem_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_bwa_mem_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_glob_expr_listByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_glob_expr_listByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_glob_expr_listByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-expr-list.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_file_array_basename_and_entrynameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_array_basename_and_entrynameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_array_basename_and_entrynameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_runtime_outdirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_runtime_outdirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_runtime_outdirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-outdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_operationByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_operationByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_operationByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_operation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_basename_fields_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_basename_fields_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_basename_fields_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump1_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_import_schema_def2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_import_schema_def2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_import_schema_def2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_tool_packed2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_tool_packed2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_tool_packed2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_output_arrays_intByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_intByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_output_arrays_intByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output-arrays-int.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_position_exprByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_position_exprByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_position_exprByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-position-expr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wf_loadContentsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wf_loadContentsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wf_loadContentsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wf-loadContents.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_in_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_writable_dir_dockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_writable_dir_dockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_writable_dir_dockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_writable-dir-docker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_tool2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_tool2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_tool2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_searchByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_searchByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_searchByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_params_input_length_non_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_params_input_length_non_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_params_input_length_non_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_tool_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_tool_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_tool_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_fail_unspecified_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_fail_unspecified_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_fail_unspecified_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_fail-unspecified-input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines8_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines8_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines8_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_null_step_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_null_step_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_null_step_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines1_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines1_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines1_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines1-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stage_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat1_testcliByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat1_testcliByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat1_testcliByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat1-testcli.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_params_input_length_non_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_params_input_length_non_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_params_input_length_non_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_params_input_length_non_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_step_valuefrom_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cwloutput_nolimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cwloutput_nolimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cwloutput_nolimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cwloutput-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_tool_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_tool_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_envvar3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_envvar3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_envvar3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_renameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_renameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_renameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_012_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_012_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_012_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines13_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines13_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines13_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_outputeval_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_outputeval_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_outputeval_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_barByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_barByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_barByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines12_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines12_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines12_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines12-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_extra_step_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_none1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_none1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_none1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_003_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-003.1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_union_input_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_union_input_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_union_input_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_nolimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_nolimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_nolimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_006ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_006ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_006ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines13_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines13_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines13_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines13-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_shallow1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_shallow1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_shallow1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_colon_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_colon_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_colon_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_colon:test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf6ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf6ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valuefrom_wf6ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valuefrom-wf6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreqByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreqByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreqByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat5_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat5_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat5_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat5-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_renameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_renameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_renameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_container_entryname2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_bash_line_continuationByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_bash_line_continuationByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_bash_line_continuationByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_revsort_abstractByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_revsort_abstractByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_revsort_abstractByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wc4_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wc4_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wc4_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_symlink_illegalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_symlink_illegalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_symlink_illegalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stderr_mediumcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stderr_mediumcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stderr_mediumcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cores_floatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cores_floatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cores_floatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_null_expression2_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_null_expression2_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_null_expression2_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_null-expression2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_container_entryname3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_container_entryname3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_bash_dollar_quoteByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_bash_dollar_quoteByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_bash_dollar_quoteByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-dollar-quote.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_none1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_none1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_none1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_none2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_none2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_none2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_passthrough2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_wf_noETByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_wf_noETByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_wf_noETByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-wf-noET.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stagefileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stagefileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stagefileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wc2_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wc2_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wc2_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wc2-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_basename_fields_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_basename_fields_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_basename_fields_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_basename-fields-test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stage_file_array_basename_and_entrynameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_file_array_basename_and_entrynameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_file_array_basename_and_entrynameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename_and_entryname.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_shellchar2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_shellchar2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_shellchar2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_out_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_out_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_out_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_networkaccess2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_networkaccess2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_networkaccess2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_test_cwl_outByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_test_cwl_outByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_test_cwl_outByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cores_floatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cores_floatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cores_floatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cores_float.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stderrByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stderrByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stderrByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stderr.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_glob_testByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_glob_testByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_glob_testByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_test.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_inp_update_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_inp_update_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_inp_update_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_inp_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_bwa_mem_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_bwa_mem_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_bwa_mem_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bwa-mem-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_tool_mediumcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_tool_mediumcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_tool_mediumcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-tool-mediumcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_glob_path_errorByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_glob_path_errorByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_glob_path_errorByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob-path-error.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_inputdefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_inputdefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_inputdefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_loadContents_limitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_loadContents_limitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_loadContents_limitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_loadContents-limit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_output_reference_workflow_inputByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_output_reference_workflow_inputByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_output_reference_workflow_inputByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_output_reference_workflow_input.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_tool3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_tool3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_tool3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_revsort_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_revsort_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_revsort_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_null_definedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_null_definedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_null_definedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-defined.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_initialworkdir_glob_fullpathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_initialworkdir_glob_fullpathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_initialworkdir_glob_fullpathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialworkdir-glob-fullpath.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_none3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_none3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_none3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_none3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wf_renByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wf_renByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wf_renByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf_ren.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_exitcodeByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_exitcodeByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_exitcodeByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_nodockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_nodockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_nodockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump1_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump1_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump1_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump2_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump2_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump2_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwdr_dir_literal_real_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwdr_dir_literal_real_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwdr_dir_literal_real_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_int_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_int_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_int_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_deep1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_deep1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_deep1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_deep1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_009_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_009_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_009_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-009_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_006_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_006_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_006_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_file_literal_exByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_file_literal_exByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_file_literal_exByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_revsortByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_revsortByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_revsortByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_tmap_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_tmap_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_tmap_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_tmap-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_outputevalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_outputevalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_outputevalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record_outputeval.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_012ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_012ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_012ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_010ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_010ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_010ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_out_formatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_out_formatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_out_formatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_union_input_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_union_input_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_union_input_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-union-input-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_env_tool4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_env_tool4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_env_tool4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stage_array_dirsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_array_dirsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_array_dirsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage-array-dirs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_inputs_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_inputs_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_inputs_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-inputs-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_step_valuefrom4_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom4_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom4_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dir6ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dir6ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dir6ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_shellcharByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_shellcharByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_shellcharByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_formattestByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_formattestByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_formattestByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stagefileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stagefileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stagefileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stagefile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_file_arrayByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_arrayByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_file_arrayByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage_file_array.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_workflow_stepdefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_stepdefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_stepdefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_int_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_int_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_int_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_size_expression_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_size_expression_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_size_expression_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_size-expression-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat4_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat4_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat4_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_out_formatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_out_formatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_out_formatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-out-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_revsort_abstractByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_revsort_abstractByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_revsort_abstractByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_revsort-abstract.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_009ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_009ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_009ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-009.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_nolimitByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_nolimitByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_nolimitByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-nolimit.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_wc4_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_wc4_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_wc4_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_wc4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_step_valuefrom5_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_step_valuefrom5_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_step_valuefrom5_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_file_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_file_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_file_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_step_valuefrom_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_step_valuefrom_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_step_valuefrom_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_output_arrays_file_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_output_arrays_file_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_output_arrays_file_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_output-arrays-file-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_fail_unconnectedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_fail_unconnectedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_fail_unconnectedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_fail-unconnected.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_symlink_illegalByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_symlink_illegalByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_symlink_illegalByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_symlink-illegal.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_actionByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_actionByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_actionByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_action.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_echo_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_echo_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_echo_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_echo-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_step_valuefrom2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_step_valuefrom2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_step_valuefrom2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_valueFrom_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_valueFrom_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_valueFrom_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines18_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines18_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines18_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_workflowByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflowByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflowByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_glob_directoryByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_glob_directoryByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_glob_directoryByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_glob_directory.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat_from_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat_from_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat_from_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-from-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_int_optional_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_int_optional_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_int_optional_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-optional-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_revsortByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_revsortByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_revsortByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_revsort.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_passthrough4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_passthrough4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-passthrough4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_initialworkdirrequirement_docker_outByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_initialworkdirrequirement_docker_outByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_initialworkdirrequirement_docker_outByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialworkdirrequirement-docker-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_sd_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_sd_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_sd_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_formattest2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_formattest2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_formattest2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_formattest2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_shallow2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_shallow2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_shallow2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_shallow2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_inpdir_update_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_inpdir_update_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_inpdir_update_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_inpdir_update_wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat4_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat4_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat4_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_004ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_004ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_004ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-004.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_in_secondaryFiles_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-secondaryFiles-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_shellcharByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_shellcharByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_shellcharByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_shellchar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_listing_none2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_listing_none2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_listing_none2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_listing_none2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_step_valuefrom4_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_step_valuefrom4_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_step_valuefrom4_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_exit_successByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_exit_successByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_exit_successByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_template_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_template_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_template_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_initialwork_pathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_initialwork_pathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_initialwork_pathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_valueFrom_constantByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_valueFrom_constantByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_valueFrom_constantByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_valueFrom-constant.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_010_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_010_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_010_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_with_defaultsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_with_defaultsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_with_defaultsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-with-defaults.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_networkaccessByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_networkaccessByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_networkaccessByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_networkaccess.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_schemadef_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_schemadef_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_schemadef_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_schemadef-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_workflowByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflowByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflowByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_workflow_inputdefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_inputdefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_inputdefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-inputdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines6_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines6_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines6_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines6-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_null_expression1_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_null_expression1_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_null_expression1_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression1-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_imported_hintByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_imported_hintByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_imported_hintByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_imported-hint.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_013ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_013ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_013ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-013.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_fileobjs1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-fileobjs1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_test_cwl_out2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_test_cwl_out2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_test_cwl_out2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_test-cwl-out2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines16_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines16_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines16_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines16-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_passthrough1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_passthrough1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-passthrough1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_envvar2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_envvar2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_envvar2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_step_valuefrom2_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom2_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom2_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom2-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_echo_file_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_echo_file_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_echo_file_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_echo-file-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_template_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_template_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_template_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_template-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stdout_chained_commandsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stdout_chained_commandsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stdout_chained_commandsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_formattest3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_formattest3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_formattest3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_formattest3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_js_input_recordByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_js_input_recordByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_js_input_recordByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_js-input-record.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_workflow_tooldefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_tooldefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_workflow_tooldefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-workflow-tooldefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_test_cwl_outByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_test_cwl_outByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_test_cwl_outByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_test-cwl-out.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_multiple_input_feature_requirementByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_multiple_input_feature_requirementByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_multiple_input_feature_requirementByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_multiple_input_feature_requirement.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_defaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_defaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_defaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-default.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_in_formatByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_in_formatByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_in_formatByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-in-format.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_import_schema_def_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_def_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_import_schema_def_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_exitcodeByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_exitcodeByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_exitcodeByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_exitcode.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_container_entryname3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-container-entryname3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_file_literal_exByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_file_literal_exByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_file_literal_exByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_file-literal-ex.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_sorttoolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_sorttoolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_sorttoolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_sorttool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_import_schema_def_packedByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_import_schema_def_packedByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_import_schema_def_packedByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_import_schema-def_packed.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_linkfileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_linkfileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_linkfileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_linkfile.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat3_tool_shortcutByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_shortcutByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat3_tool_shortcutByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat3-tool-shortcut.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines4_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines4_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines4_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines4-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_checkByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_checkByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_checkByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_check.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_updateval_inplaceByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_updateval_inplaceByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_updateval_inplaceByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir6ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir6ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir6ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir6.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dynresreq_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dynresreq_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dynresreq_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dynresreq-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines11_null_step_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines11-null-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_006ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_006ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_006ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_rename_inputsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_rename_inputsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_rename_inputsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_rename-inputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_step_valuefrom5_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom5_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_step_valuefrom5_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_step-valuefrom5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_barByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_barByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_barByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_bar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_int_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_int_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_int_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-int-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_count_lines5_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_count_lines5_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_count_lines5_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_count-lines5-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_outputeval_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_outputeval_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_outputeval_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record_outputeval_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valueFrom_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valueFrom_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valueFrom_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valueFrom-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines18_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines18_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines18_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines18-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2_nlByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2_nlByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwd_jsondump2_nlByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwd-jsondump2-nl.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_docker_output_dirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_docker_output_dirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_docker_output_dirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_docker-output-dir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines19_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines19_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines19_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines19-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cat_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cat_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cat_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cat-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat3_nodockerByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat3_nodockerByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat3_nodockerByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat3-nodocker.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_params2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_params2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_params2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_params2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_envvarByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_envvarByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_envvarByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_envvar.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_rename_outputsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_rename_outputsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_rename_outputsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_rename-outputs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_valuefrom_wf4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-valuefrom-wf4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines15_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines15_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines15_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines15-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_int_default_tool_and_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_int_default_tool_and_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_int_default_tool_and_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-int-default-tool-and-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_env_tool4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_env_tool4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_env_tool4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_env-tool4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_file_or_filesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_file_or_filesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_file_or_filesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_sum_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_sum_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_sum_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_sum-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_schemadef_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_schemadef_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_schemadef-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_bash_line_continuationByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_bash_line_continuationByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_bash_line_continuationByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_bash-line-continuation.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_steplevel_resreqByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_steplevel_resreqByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_steplevel_resreqByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_steplevel-resreq.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_stepdefaultByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_stepdefaultByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_dynresreq_workflow_stepdefaultByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_dynresreq-workflow-stepdefault.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines8_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines8_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines8_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines8-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_record_orderByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_record_orderByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_record_orderByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_record-order.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_catByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_catByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_catByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_wf_loadContents4ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents4ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_wf_loadContents4ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_wf-loadContents4.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_default_pathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_default_pathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_default_pathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_default_path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_io_file_or_filesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_io_file_or_filesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_io_file_or_filesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_io-file-or-files.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_paramsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_paramsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_paramsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_params.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_optional_numerical_output_0ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_optional_numerical_output_0ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_optional_numerical_output_0ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_initialwork_pathByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_initialwork_pathByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_initialwork_pathByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_initialwork-path.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_parseInt_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_parseInt_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_parseInt_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_010_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_010_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_010_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-010_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_step_valuefrom3_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_step_valuefrom3_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_step_valuefrom3_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_step-valuefrom3-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_namerootByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_namerootByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_namerootByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_nameroot.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_exit_successByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_exit_successByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_exit_successByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_exit-success.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_stage_file_array_basenameByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_stage_file_array_basenameByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_stage_file_array_basenameByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_stage_file_array_basename.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_sd_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_sd_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_sd_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-sd-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_tool_v12ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_tool_v12ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_tool_v12ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_tool-v12.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_scatter_wf3ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf3ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_scatter_wf3ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_scatter-wf3.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_scatter_wf1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_scatter_wf1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_scatter_wf1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_scatter-wf1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cat4_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cat4_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cat4_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cat4-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_parseInt_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_parseInt_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_parseInt_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_parseInt-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_record_out_secondaryFilesByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_record_out_secondaryFilesByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_record_out_secondaryFilesByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_record-out-secondaryFiles.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_null_expression3_toolByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_null_expression3_toolByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_null_expression3_toolByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_null-expression3-tool.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_timelimit2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_timelimit2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_timelimit2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_timelimit2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_mkdirByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_mkdirByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_mkdirByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_mkdir.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_timelimit5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_timelimit5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_timelimit5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_timelimit5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stage_unprovided_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stage_unprovided_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stage_unprovided_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stage-unprovided-file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_cond_wf_012ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_012ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_cond_wf_012ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_cond-wf-012.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_optional_numerical_output_0ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_optional_numerical_output_0ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_optional_numerical_output_0ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_optional-numerical-output-0.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_stdout_chained_commandsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_stdout_chained_commandsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_stdout_chained_commandsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_stdout_chained_commands.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_updateval_inplaceByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_updateval_inplaceByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_updateval_inplaceByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_updateval_inplace.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_006_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_006_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_006_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-006_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_searchByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_searchByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_searchByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_search.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_file_default_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_file_default_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_file_default_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-file-default-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wfByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wfByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_count_lines11_extra_step_wfByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_count-lines11-extra-step-wf.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_cond_wf_003_1_nojsByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_1_nojsByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_cond_wf_003_1_nojsByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_cond-wf-003.1_nojs.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_io_any_wf_1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_io_any_wf_1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_io_any_wf_1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_io-any-wf-1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_iwd_jsondump1ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump1ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_iwd_jsondump1ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_iwd-jsondump1.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_iwdr_dir_literal_real_fileByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_dir_literal_real_fileByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_iwdr_dir_literal_real_fileByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_iwdr_dir_literal_real_file.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_runtime_paths_distinctByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_runtime_paths_distinctByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_runtime_paths_distinctByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_runtime-paths-distinct.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_dir5ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_dir5ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_dir5ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_dir5.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_packed_envvar2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_packed_envvar2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_packed_envvar2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_packed_envvar2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
  @org.junit.Test
  public void testvalid_listing_deep2ByString() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    RootLoader.loadDocument(yaml, url.toString());
  }

  @org.junit.Test
  public void testvalid_listing_deep2ByPath() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    RootLoader.loadDocument(resPath);
  }

  @org.junit.Test
  public void testvalid_listing_deep2ByMap() throws Exception {
    java.net.URL url = getClass().getResource("valid_listing_deep2.cwl");
    java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
    String yaml = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    java.util.Map<String, Object> doc;
    doc = (java.util.Map<String, Object>) YamlUtils.mapFromString(yaml);
    RootLoader.loadDocument(doc, url.toString());
  }
}
