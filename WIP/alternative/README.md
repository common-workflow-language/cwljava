## Instantiate CWL documents as Java objects

Run the following command in an environment with Maven 3 and Java 8 to demonstrate how to instantiate and work with CWL documents as Java objects.

    mvn clean install

## Generate Avro Schema

The process for generating the Java classes in the first place from the CWL specification involves the following considerations. 

### Background:

The CWL specification is defined in something similar to but not entirely like Avro
Use the schema salad project to convert to an avro-ish schema document
Generate the Java classes for the schema
We cannot use these classes directly since CWL documents are not json or avro binaries, use cwl-tool to convert to json and then gson to convert from json due to some incompatibilities between CWL avro and normal avro.

### To regenerate:

1. Get schema salad from the common-workflow-language organization and run `python -mschema_salad --print-avro ~/common-workflow-language/draft-3/CommonWorkflowLanguage.yml > cwl.avsc`
2. Edit the allowed symbols for CWL versions. The draft3 specification generates symbols like "draft-3.dev1" which the avro parser will reject with the error "Exception in thread \"main\" org.apache.avro.SchemaParseException: Illegal character in: draft-3.dev1". You can safety delete all the symbols which are designated "draft" versions. 
3. Get the avro tools jar and CWL avsc and call `java -jar avro-tools-1.7.7.jar compile schema cwl.avsc cwl`
3. Copy them to the appropriate directory in dockstore-client (you will need to refactor to insert package names)

Since this is kinda involved, a travis-CI build is provided which demos the process at https://travis-ci.org/common-workflow-language/cwljava 
