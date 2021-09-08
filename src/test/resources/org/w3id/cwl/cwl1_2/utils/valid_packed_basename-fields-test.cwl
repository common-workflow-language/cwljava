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
            "id": "#echo-file-tool.cwl",
            "outputs": [
                {
                    "type": "File",
                    "id": "#echo-file-tool.cwl/out",
                    "outputBinding": {
                        "glob": "out.txt"
                    }
                }
            ]
        },
        {
            "class": "Workflow",
            "requirements": [
                {
                    "class": "StepInputExpressionRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "id": "#main/tool"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/ext/out",
                    "id": "#main/extFile"
                },
                {
                    "type": "File",
                    "outputSource": "#main/root/out",
                    "id": "#main/rootFile"
                }
            ],
            "steps": [
                {
                    "run": "#echo-file-tool.cwl",
                    "in": [
                        {
                            "valueFrom": "$(inputs.tool.nameext)",
                            "id": "#main/ext/in"
                        },
                        {
                            "source": "#main/tool",
                            "id": "#main/ext/tool"
                        }
                    ],
                    "out": [
                        "#main/ext/out"
                    ],
                    "id": "#main/ext"
                },
                {
                    "run": "#echo-file-tool.cwl",
                    "in": [
                        {
                            "valueFrom": "$(inputs.tool.nameroot)",
                            "id": "#main/root/in"
                        },
                        {
                            "source": "#main/tool",
                            "id": "#main/root/tool"
                        }
                    ],
                    "out": [
                        "#main/root/out"
                    ],
                    "id": "#main/root"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}