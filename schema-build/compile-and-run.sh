#!/bin/bash

WORKDIR="./target"
echo ""
echo "Downloading the cwl-avro.yml file..."
echo ""
curl -o ${WORKDIR}/CommandLineTool.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/CommandLineTool.yml
curl -o ${WORKDIR}/Process.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Process.yml
curl -o ${WORKDIR}/Workflow.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Workflow.yml

echo "Downloading the metaschema.yml file..."
echo ""
curl -o ${WORKDIR}/metaschema.yml https://raw.githubusercontent.com/common-workflow-language/schema_salad/master/schema_salad/metaschema.yml

echo "Fixing the cwl-avro.yml file for OutputRecordField..."
echo ""
sed "921s/  extends: \"sld:RecordSchema\"/  extends: \"sld:RecordField\"/" ${WORKDIR}/CommandLineTool.yml  ${WORKDIR}/Process.yml ${WORKDIR}/Workflow.yml > ${WORKDIR}/cwl-avro-fixed-OutputRecordField.yml

echo "Compiling the Builder tools..."
echo ""

mvn compile

echo "Creating the sdk folder..."
echo ""
rm -rf sdk
mkdir sdk

echo "Running the SDK creation process..."
echo ""
java -cp target/classes io.cwl.build.CreateCWLJavaSDK ${WORKDIR}/cwl-avro-fixed-OutputRecordField.yml ${WORKDIR}/metaschema.yml

cd sdk
echo ""
echo "Verifying the SDK compilation..."
echo ""

echo ""

cd ..

echo "Installing source"
rm ../core/src/main/java/io/cwl/schema/*.java
cp sdk/*.java ../core/src/main/java/io/cwl/schema/
echo "Finished! :)"
echo ""


