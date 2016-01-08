#!/bin/bash

rm cwl-avro.yml
echo ""
echo "Downloading the cwl-avro.yml file..."
echo ""
wget --quiet https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/cwl-avro.yml

rm metaschema.yml
echo "Downloading the metaschema.yml file..."
echo ""
wget --quiet https://raw.githubusercontent.com/common-workflow-language/schema_salad/master/schema_salad/metaschema.yml

echo "Fixing the cwl-avro.yml file for OutputRecordField..."
echo ""
sed "921s/  extends: \"sld:RecordSchema\"/  extends: \"sld:RecordField\"/" cwl-avro.yml > cwl-avro-fixed-OutputRecordField.yml

echo "Compiling the YAMLParser, CWLSDKBuilder and CreateCWLJavaSDK files..."
echo ""
javac YAMLParser.java
javac CWLSDKBuilder.java
javac CreateCWLJavaSDK.java

echo "Creating the sdk folder..."
echo ""
rm -rf sdk
mkdir sdk

echo "Running the SDK creation process..."
echo ""
java CreateCWLJavaSDK cwl-avro-fixed-OutputRecordField.yml metaschema.yml

cd sdk
echo ""
echo "Verifying the SDK compilation..."
echo ""

for JavaFile in *.java
do
  echo "Compiling: $JavaFile"
  javac $JavaFile
done

echo ""

cd ..

echo "Finished! :)"
echo ""


