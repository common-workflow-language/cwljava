{
    "$graph": [
        {
            "class": "CommandLineTool",
            "baseCommand": [
                "echo"
            ],
            "inputs": [
                {
                    "type": "string",
                    "inputBinding": {
                        "position": 1
                    },
                    "id": "#echo-file-tool.cwl/in"
                },
                {
                    "type": [
                        "null",
                        "string"
                    ],
                    "id": "#echo-file-tool.cwl/name"
                }
            ],
            "stdout": "out.txt",
            "outputs": [
                {
                    "type": "File",
                    "id": "#echo-file-tool.cwl/out",
                    "outputBinding": {
                        "glob": "out.txt"
                    }
                }
            ],
            "id": "#echo-file-tool.cwl"
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
            "class": "CommandLineTool",
            "requirements": [
                {
                    "listing": [
                        {
                            "entry": "$(inputs.r)",
                            "writable": true
                        }
                    ],
                    "class": "InitialWorkDirRequirement"
                },
                {
                    "inplaceUpdate": true,
                    "class": "InplaceUpdateRequirement"
                }
            ],
            "hints": [
                {
                    "dockerPull": "python:2.7.15-alpine3.7",
                    "class": "DockerRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "id": "#updateval_inplace.cwl/r"
                },
                {
                    "type": "File",
                    "default": {
                        "class": "File",
                        "location": "updateval.py"
                    },
                    "id": "#updateval_inplace.cwl/script"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "$(inputs.r.basename)"
                    },
                    "id": "#updateval_inplace.cwl/out"
                }
            ],
            "arguments": [
                "python",
                "$(inputs.script)",
                "$(inputs.r.basename)"
            ],
            "id": "#updateval_inplace.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [],
            "outputs": [
                {
                    "type": "int",
                    "outputSource": "#main/step3/output",
                    "id": "#main/a"
                },
                {
                    "type": "int",
                    "outputSource": "#main/step4/output",
                    "id": "#main/b"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "default": "3",
                            "id": "#main/step1/in"
                        }
                    ],
                    "out": [
                        "#main/step1/out"
                    ],
                    "run": "#echo-file-tool.cwl",
                    "id": "#main/step1"
                },
                {
                    "in": [
                        {
                            "source": "#main/step1/out",
                            "id": "#main/step2/r"
                        }
                    ],
                    "out": [
                        "#main/step2/out"
                    ],
                    "run": "#updateval_inplace.cwl",
                    "id": "#main/step2"
                },
                {
                    "in": [
                        {
                            "source": "#main/step1/out",
                            "id": "#main/step3/file1"
                        },
                        {
                            "source": "#main/step2/out",
                            "id": "#main/step3/wait"
                        }
                    ],
                    "out": [
                        "#main/step3/output"
                    ],
                    "run": "#parseInt-tool.cwl",
                    "id": "#main/step3"
                },
                {
                    "in": [
                        {
                            "source": "#main/step2/out",
                            "id": "#main/step4/file1"
                        }
                    ],
                    "out": [
                        "#main/step4/output"
                    ],
                    "run": "#parseInt-tool.cwl",
                    "id": "#main/step4"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}