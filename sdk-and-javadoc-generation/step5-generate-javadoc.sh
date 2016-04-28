#!/bin/bash

rm -rf javadoc
mkdir javadoc
cd javadoc
javadoc -cp ./lib/cwl.jar:./lib/json-simple-1.1.1.jar:./lib/snakeyaml-1.16.jar:. -version -private ../org/commonwl/lang/*.java ../org/commonwl/util/*.java
cd ..

rm -rf ../javadoc
mkdir ../javadoc
cp -R javadoc ../