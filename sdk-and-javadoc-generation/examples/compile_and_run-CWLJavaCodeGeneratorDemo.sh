#!/bin/bash

javac -cp ../lib/cwl.jar:../lib/json-simple-1.1.1.jar:../lib/snakeyaml-1.16.jar:. CWLJavaCodeGeneratorDemo.java
java  -cp ../lib/cwl.jar:../lib/json-simple-1.1.1.jar:../lib/snakeyaml-1.16.jar:. CWLJavaCodeGeneratorDemo $1
