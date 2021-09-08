{
    "$graph": [
        {
            "class": "ExpressionTool",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "loadContents": true,
                    "id": "#parseInt-tool.cwl/file1"
                }
            ],
            "expression": "$({'output': parseInt(inputs.file1.contents)})",
            "id": "#parseInt-tool.cwl",
            "outputs": [
                {
                    "type": "int",
                    "id": "#parseInt-tool.cwl/output"
                }
            ]
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": [
                        "null",
                        "File"
                    ],
                    "id": "#main/file1"
                }
            ],
            "outputs": [
                {
                    "type": "int",
                    "outputSource": "#main/step2/output",
                    "id": "#main/count_output"
                }
            ],
            "steps": [
                {
                    "run": "#wc-tool.cwl",
                    "in": [
                        {
                            "source": "#main/file1",
                            "default": {
                                "class": "File",
                                "location": "whale.txt"
                            },
                            "id": "#main/step1/file1"
                        }
                    ],
                    "out": [
                        "#main/step1/output"
                    ],
                    "id": "#main/step1"
                },
                {
                    "run": "#parseInt-tool.cwl",
                    "in": [
                        {
                            "source": "#main/step1/output",
                            "id": "#main/step2/file1"
                        }
                    ],
                    "out": [
                        "#main/step2/output"
                    ],
                    "id": "#main/step2"
                }
            ],
            "id": "#main"
        },
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "File",
                    "id": "#wc-tool.cwl/file1"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "output"
                    },
                    "id": "#wc-tool.cwl/output"
                }
            ],
            "baseCommand": [
                "wc",
                "-l"
            ],
            "stdin": "$(inputs.file1.path)",
            "stdout": "output",
            "id": "#wc-tool.cwl"
        }
    ],
    "cwlVersion": "v1.2"
}