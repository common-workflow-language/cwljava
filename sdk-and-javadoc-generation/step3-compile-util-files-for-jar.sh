#!/bin/bash

for JavaFile in org/commonwl/util/*.java; do
	echo "Compiling: $JavaFile";
	javac -cp .:./lib/json-simple-1.1.1.jar:./lib/snakeyaml-1.16.jar $JavaFile;
done

cd ../../..