#!/bin/bash

for JavaFile in org/commonwl/lang/*.java; do
	echo "Compiling: $JavaFile";
	javac $JavaFile;
done

cd ../../..