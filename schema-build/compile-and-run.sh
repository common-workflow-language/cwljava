#!/bin/bash

WORKDIR="./target"
echo ""
echo "Downloading the CWL Yaml Specification files..."
echo ""
curl -o ${WORKDIR}/CommandLineTool.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/CommandLineTool.yml
curl -o ${WORKDIR}/Process.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Process.yml
curl -o ${WORKDIR}/Workflow.yml https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Workflow.yml

echo "Downloading the metaschema.yml file..."
echo ""
curl -o ${WORKDIR}/metaschema.yml https://raw.githubusercontent.com/common-workflow-language/schema_salad/master/schema_salad/metaschema/metaschema.yml

echo "Fixing the Process.yml file for OutputRecordField..."
echo ""
#sed "286s/  extends: \"sld:RecordSchema\"/  extends: \"sld:RecordField\"/" ${WORKDIR}/CommandLineTool.yml  ${WORKDIR}/Process.yml ${WORKDIR}/Workflow.yml > ${WORKDIR}/Process-fixed-OutputRecordField.yml
cat ${WORKDIR}/CommandLineTool.yml  ${WORKDIR}/Process.yml ${WORKDIR}/Workflow.yml > ${WORKDIR}/Process-fixed-OutputRecordField.yml
echo "Compiling the Builder tools..."
echo ""

mvn compile

echo "Creating the sdk folder..."
echo ""
rm -rf sdk
mkdir sdk

cp ../AUTHORS.TXT .

echo "Running the SDK creation process..."
echo ""
java -cp target/classes io.cwl.build.CreateCWLJavaSDK ${WORKDIR}/Process-fixed-OutputRecordField.yml ${WORKDIR}/metaschema.yml
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


