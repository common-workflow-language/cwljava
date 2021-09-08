{
    "$graph": [
        {
            "class": "Workflow",
            "requirements": [
                {
                    "class": "MultipleInputFeatureRequirement"
                }
            ],
            "inputs": [
                {
                    "type": [
                        {
                            "type": "array",
                            "items": "File"
                        }
                    ],
                    "id": "#main/file1"
                },
                {
                    "type": [
                        {
                            "type": "array",
                            "items": "File"
                        }
                    ],
                    "id": "#main/file2"
                }
            ],
            "steps": [
                {
                    "run": "#wc3-tool.cwl",
                    "in": [
                        {
                            "source": [
                                "#main/file1",
                                "#main/file2"
                            ],
                            "linkMerge": "merge_flattened",
                            "id": "#main/step1/file1"
                        }
                    ],
                    "out": [
                        "#main/step1/output"
                    ],
                    "id": "#main/step1"
                }
            ],
            "id": "#main",
            "outputs": [
                {
                    "type": "int",
                    "outputSource": "#main/step1/output",
                    "id": "#main/count_output"
                }
            ]
        },
        {
            "class": "CommandLineTool",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "inputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "inputBinding": {},
                    "id": "#wc3-tool.cwl/file1"
                }
            ],
            "outputs": [
                {
                    "type": "int",
                    "outputBinding": {
                        "glob": "output.txt",
                        "loadContents": true,
                        "outputEval": "${\n  var s = self[0].contents.split(/\\r?\\n/);\n  return parseInt(s[s.length-2]);\n}\n"
                    },
                    "id": "#wc3-tool.cwl/output"
                }
            ],
            "stdout": "output.txt",
            "baseCommand": "wc",
            "id": "#wc3-tool.cwl"
        }
    ],
    "cwlVersion": "v1.2"
}