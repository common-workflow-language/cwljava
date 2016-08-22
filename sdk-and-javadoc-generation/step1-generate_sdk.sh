#!/bin/bash

echo "Compiling the YAMLParser, CWLSDKBuilder and CreateCWLJavaSDK files..."
echo ""
javac YAMLParser.java
javac CWLSDKBuilder.java
javac CreateCWLJavaSDK.java

echo "Creating the SDK folder..."
echo ""
rm -rf org/commonwl/lang
mkdir org
mkdir org/commonwl
mkdir org/commonwl/lang

echo "Running the SDK creation process..."
echo ""
java CreateCWLJavaSDK cwl-yaml-specs/CommandLineTool.yml cwl-yaml-specs/Process.yml cwl-yaml-specs/Workflow.yml cwl-yaml-specs/metaschema_base.yml cwl-yaml-specs/metaschema.yml