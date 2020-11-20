package org.w3id.cwl.cwl1_2.utils;

import org.w3id.cwl.cwl1_2.Process;
import org.w3id.cwl.cwl1_2.SchemaDefRequirement;
import org.w3id.cwl.cwl1_2.CWLVersion;
import org.w3id.cwl.cwl1_2.InlineJavascriptRequirement;
import org.w3id.cwl.cwl1_2.InputRecordSchema;

import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RequirementsClassTest {
	Process doc;
	
	public RequirementsClassTest() throws URISyntaxException {
		super();
		this.doc = (Process) RootLoader
				.loadDocument(java.nio.file.Paths.get(getClass().getResource("valid_writable-dir-docker.cwl").toURI()));
	}

	@Test
	public void className() {
		Assert.assertEquals(doc.getClass().getSimpleName(), "CommandLineToolImpl");
	}

	@Test
	public void version() {
		java.util.Optional<CWLVersion> version = doc.getCwlVersion();
		Assert.assertTrue(version.isPresent());
		Assert.assertEquals(CWLVersion.V1_2, version.get());
	}

	@Test
	public void hints() {
		java.util.Optional<java.util.List<Object>> hints = doc.getHints();
		Assert.assertTrue(hints.isPresent());
		java.util.List<Object> hintList = hints.get();
		Assert.assertEquals(hintList.size(), 1);
	}

	@Test
	public void reqs() {
		java.util.Optional<java.util.List<Object>> reqs = doc.getRequirements();
		Assert.assertTrue(reqs.isPresent());
		java.util.List<Object> reqList = reqs.get();
		Assert.assertEquals(reqList.size(), 2);
		InlineJavascriptRequirement reqOne = (InlineJavascriptRequirement) reqList.get(0);
		Assert.assertEquals(reqOne.getClass().getSimpleName(), "InlineJavascriptRequirementImpl");
		Assert.assertNotEquals(reqList.get(1).getClass().getSimpleName(), "InlineJavascriptRequirementImpl");
	}

}
