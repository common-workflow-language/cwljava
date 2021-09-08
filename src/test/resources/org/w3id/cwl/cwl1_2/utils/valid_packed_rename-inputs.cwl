{
    "id": "#main",
    "baseCommand": [
        "ls"
    ],
    "class": "CommandLineTool",
    "doc": "Simple test to confirm the implementation of expressions returning a File within a CommandInputParameter.secondaryFile field.\n\nUse GREP to filter the result from ls to ensure we only get the secondary files in there.\n\nRelated links:\n- Issue: https://github.com/common-workflow-language/cwltool/issues/1232\n- PR: https://github.com/common-workflow-language/cwltool/pull/1233\n- Discourse: https://cwl.discourse.group/t/ask-cwl-to-rename-a-secondary-file/72\n",
    "inputs": [
        {
            "id": "#inputWithSecondary",
            "type": "File",
            "doc": "This input will with a secondary file `.accessory`. You could create these files (and its accessory) with:\n```bash\ntouch secondary_file_test.txt\ntouch secondary_file_test.txt.accessory\n```\n",
            "secondaryFiles": [
                {
                    "pattern": ".accessory",
                    "required": null
                },
                {
                    "pattern": "${\n  function resolveSecondary(base, secPattern) {\n    if (secPattern[0] == '^') {\n      var spl = base.split('.');\n      var endIndex = spl.length > 1 ? spl.length - 1 : 1;\n      return resolveSecondary(spl.slice(undefined, endIndex).join(\".\"), secPattern.slice(1));\n    }\n    return base + secPattern;\n  }\n  return [{\n      \"class\": \"File\",\n      \"location\": self.secondaryFiles[0].location,\n      \"basename\": resolveSecondary(self.basename, '^.accessory')\n  }];\n}\n",
                    "required": null
                }
            ]
        }
    ],
    "arguments": [
        {
            "valueFrom": "|",
            "shellQuote": false,
            "position": 0
        },
        {
            "valueFrom": "grep",
            "position": 1
        },
        {
            "valueFrom": "secondary",
            "position": 2
        }
    ],
    "outputs": [
        {
            "id": "#output_file",
            "type": "File",
            "outputBinding": {
                "glob": "result"
            }
        }
    ],
    "stdout": "result",
    "requirements": [
        {
            "listing": [
                "$(inputs.inputWithSecondary)"
            ],
            "class": "InitialWorkDirRequirement"
        },
        {
            "class": "InlineJavascriptRequirement"
        },
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "cwlVersion": "v1.2"
}