{
    "$graph": [
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
                    "run": "#wc-tool.cwl",
                    "in": [
                        {
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