package org.w3id.cwl.cwl1_2.utils;

import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;
import org.w3id.cwl.cwl1_2.ExpressionTool;
import org.w3id.cwl.cwl1_2.ExpressionToolOutputParameter;

public class AnyTypeTest {
	ExpressionTool tool;

	public AnyTypeTest() throws URISyntaxException {
		super();
		this.tool = (ExpressionTool) RootLoader
				.loadDocument(Paths.get(getClass().getResource("null-expression3-tool.cwl").toURI()));
	}

	@Test
	public void className() {
		Assert.assertEquals("ExpressionToolImpl", tool.getClass().getSimpleName());
	}

	@Test
	public void anyTypeTest() {
		ExpressionToolOutputParameter first_output = (ExpressionToolOutputParameter) tool.getOutputs().get(0);
		Object first_output_type = first_output.getType();
		Assert.assertEquals("Any", first_output_type);

	}

}
