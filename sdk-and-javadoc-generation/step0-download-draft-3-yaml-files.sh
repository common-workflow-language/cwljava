#!/bin/bash

curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Process.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/Workflow.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/CommandLineTool.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/draft-3/salad/schema_salad/metaschema/metaschema.yml

mv *.yml cwl-yaml-specs