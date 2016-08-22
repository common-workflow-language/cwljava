#!/bin/bash

curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/v1.0/Process.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/v1.0/Workflow.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/v1.0/CommandLineTool.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/v1.0/salad/schema_salad/metaschema/metaschema.yml
curl -O https://raw.githubusercontent.com/common-workflow-language/common-workflow-language/master/v1.0/salad/schema_salad/metaschema/metaschema_base.yml

mv *.yml cwl-yaml-specs