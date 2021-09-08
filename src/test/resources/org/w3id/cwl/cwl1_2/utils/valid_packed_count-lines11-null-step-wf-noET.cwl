{
    "$graph": [
        {
            "class": "ExpressionTool",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "inputs": [],
            "expression": "$({'output': null })",
            "id": "#null-expression3-tool.cwl",
            "outputs": [
                {
                    "type": "Any",
                    "id": "#null-expression3-tool.cwl/output"
                }
            ]
        },
        {
            "class": "Workflow",
            "inputs": [],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/step1/output",
                    "id": "#main/wc_output"
                }
            ],
            "steps": [
                {
                    "run": "#null-expression3-tool.cwl",
                    "in": [],
                    "out": [
                        "#main/step0/output"
                    ],
                    "id": "#main/step0"
                },
                {
                    "run": "#wc-tool.cwl",
                    "in": [
                        {
                            "source": "#main/step0/output",
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