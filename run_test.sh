#!/bin/bash

if [ ! -e common-workflow-language ]; then 
  git clone https://github.com/common-workflow-language/common-workflow-language.git
fi

mvn package

pushd ./common-workflow-language
./run_test.sh RUNNER=../tools/cwltool-java DRAFT=draft-3 2>&1 | tee ../report.txt
popd