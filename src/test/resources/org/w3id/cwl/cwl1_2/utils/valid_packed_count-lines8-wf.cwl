{
    "$graph": [
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": "File",
                    "id": "#count-lines1-wf.cwl/file1"
                }
            ],
            "outputs": [
                {
                    "type": "int",
                    "outputSource": "#count-lines1-wf.cwl/step2/output",
                    "id": "#count-lines1-wf.cwl/count_output"
                }
            ],
            "steps": [
                {
                    "run": "#wc-tool.cwl",
                    "in": [
                        {
                            "source": "#count-lines1-wf.cwl/file1",
                            "id": "#count-lines1-wf.cwl/step1/file1"
                        }
                    ],
                    "out": [
                        "#count-lines1-wf.cwl/step1/output"
                    ],
                    "id": "#count-lines1-wf.cwl/step1"
                },
                {
                    "run": "#parseInt-tool.cwl",
                    "in": [
                        {
                            "source": "#count-lines1-wf.cwl/step1/output",
                            "id": "#count-lines1-wf.cwl/step2/file1"
                        }
                    ],
                    "out": [
                        "#count-lines1-wf.cwl/step2/output"
                    ],
                    "id": "#count-lines1-wf.cwl/step2"
                }
            ],
            "id": "#count-lines1-wf.cwl"
        },
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
            "outputs": [
                {
                    "type": "int",
                    "id": "#parseInt-tool.cwl/output"
                }
            ],
            "expression": "$({'output': parseInt(inputs.file1.contents)})",
            "id": "#parseInt-tool.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": "File",
                    "id": "#main/file1"
                }
            ],
            "outputs": [
                {
                    "type": "int",
                    "outputSource": "#main/step1/count_output",
                    "id": "#main/count_output"
                }
            ],
            "requirements": [
                {
                    "class": "SubworkflowFeatureRequirement"
                }
            ],
            "steps": [
                {
                    "run": "#count-lines1-wf.cwl",
                    "in": [
                        {
                            "source": "#main/file1",
                            "id": "#main/step1/file1"
                        }
                    ],
                    "out": [
                        "#main/step1/count_output"
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