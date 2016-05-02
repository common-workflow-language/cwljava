CWL Java SDK
============

This is a work-in-progress implementation for creating a Java SDK for CWL.
Please read the "CWL Java SDK Manual.PDF" in the doc directory for how to generate the SDK.

The SDK is available as a JAR file in the lib directory as "cwl.jar".  The CWL specifications are defined as classes in "org.commonwl.lang" and JSONReader, CWLReader and SystemCommandExecution classes have been written under "org.commonwl.util"

Example Using The SDK
=====================

To run an example just proceed to tot he examples directory and run the following two commands:

./compile-demo.sh 

./run-demo.sh wc-tool.cwl wc-job.json

You should see the following result:

      16     198    1111 whale.txt

Generating The SDK
==================

To generate the SDK just proceed to the "sdk-and-javadoc-generation" folder and run the following commands:

./step0-download-draft-3-yaml-files.sh	
./step1-generate_sdk.sh			
./step2-compile-sdk-files-for-jar.sh	
./step3-compile-util-files-for-jar.sh	
./step4-generate-jar-files.sh

./step5-generate-javadoc.sh

The first one ("step0-download-draft-3-yaml-files.sh") is optional as the CWL specification YAML files are already provided in the "cwl-yaml-specs" directory.

All comments and recommendations are welcome.

Thank you,

Paul
