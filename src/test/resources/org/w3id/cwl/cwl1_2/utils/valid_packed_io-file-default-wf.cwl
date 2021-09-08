{
    "class": "Workflow",
    "inputs": [
        {
            "type": "File",
            "default": {
                "class": "File",
                "path": "whale.txt"
            },
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputSource": "#main/step1/o",
            "id": "#main/o"
        }
    ],
    "steps": [
        {
            "in": [
                {
                    "source": "#main/file1",
                    "id": "#main/step1/catfile1"
                }
            ],
            "out": [
                "#main/step1/o"
            ],
            "run": {
                "class": "CommandLineTool",
                "inputs": [
                    {
                        "type": "File",
                        "id": "#main/step1/run/catfile1"
                    }
                ],
                "outputs": [
                    {
                        "type": "File",
                        "outputBinding": {
                            "glob": "output"
                        },
                        "id": "#main/step1/run/o"
                    }
                ],
                "arguments": [
                    "cat",
                    "$(inputs.catfile1.path)"
                ],
                "stdout": "output"
            },
            "id": "#main/step1"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}