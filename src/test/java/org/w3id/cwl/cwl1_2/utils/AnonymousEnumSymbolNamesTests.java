package org.w3id.cwl.cwl1_2.utils;

import org.w3id.cwl.cwl1_2.CommandInputEnumSchema;
import org.w3id.cwl.cwl1_2.CommandInputRecordField;
import org.w3id.cwl.cwl1_2.CommandInputRecordSchema;
import org.w3id.cwl.cwl1_2.CommandLineToolImpl;
import org.w3id.cwl.cwl1_2.SchemaDefRequirement;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AnonymousEnumSymbolNamesTests {
	CommandLineToolImpl tool;

	public AnonymousEnumSymbolNamesTests() throws URISyntaxException {
		super();
		this.tool = (CommandLineToolImpl) RootLoader.loadDocument(
				Paths.get(getClass().getResource("valid_anon_enum_inside_array_inside_schemadef.cwl").toURI()));
	}

	@Test
	public void className() {
		Assert.assertEquals("CommandLineToolImpl", tool.getClass().getSimpleName());
	}

	@Test
	public void symbolNames() {
		SchemaDefRequirement schemaDef = (SchemaDefRequirement) this.tool.getRequirements().get().get(0);
		CommandInputRecordSchema recordDef = (CommandInputRecordSchema) schemaDef.getTypes().get(0);
		String recordID = recordDef.getName().get();
		CommandInputRecordField ncbi_build_field = (CommandInputRecordField) recordDef.getFields().get().get(0);
		Assert.assertEquals(recordID + "/ncbi_build", ncbi_build_field.getName());
		@SuppressWarnings("unchecked")
		List<Object> ncbi_build_type = (List<Object>) ncbi_build_field.getType();
		CommandInputEnumSchema ncbi_build_enum = (CommandInputEnumSchema) ncbi_build_type.get(1);
		List<String> ncbi_build_symbols = ncbi_build_enum.getSymbols();
		Assert.assertEquals("GRCh37", ncbi_build_symbols.get(0));
	}

}
