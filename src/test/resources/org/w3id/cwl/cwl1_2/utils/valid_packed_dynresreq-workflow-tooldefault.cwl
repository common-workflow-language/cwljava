{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "File",
                    "id": "#cat-tool.cwl/file1"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "output"
                    },
                    "id": "#cat-tool.cwl/output"
                }
            ],
            "baseCommand": [
                "cat"
            ],
            "stdin": "$(inputs.file1.path)",
            "stdout": "output",
            "id": "#cat-tool.cwl"
        },
        {
            "class": "CommandLineTool",
            "requirements": [
                {
                    "coresMin": "$(inputs.special_file.size)",
                    "coresMax": "$(inputs.special_file.size)",
                    "class": "ResourceRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "default": {
                        "class": "File",
                        "location": "special_file"
                    },
                    "id": "#dynresreq-default.cwl/special_file"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "id": "#dynresreq-default.cwl/output",
                    "outputBinding": {
                        "glob": "cores.txt"
                    }
                }
            ],
            "baseCommand": "echo",
            "stdout": "cores.txt",
            "arguments": [
                "$(runtime.cores)"
            ],
            "id": "#dynresreq-default.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": [
                        "null",
                        "File"
                    ],
                    "id": "#main/special_file"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/report/output",
                    "id": "#main/cores"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/special_file",
                            "id": "#main/count/special_file"
                        }
                    ],
                    "out": [
                        "#main/count/output"
                    ],
                    "run": "#dynresreq-default.cwl",
                    "id": "#main/count"
                },
                {
                    "in": [
                        {
                            "source": "#main/count/output",
                            "id": "#main/report/file1"
                        }
                    ],
                    "out": [
                        "#main/report/output"
                    ],
                    "run": "#cat-tool.cwl",
                    "id": "#main/report"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}