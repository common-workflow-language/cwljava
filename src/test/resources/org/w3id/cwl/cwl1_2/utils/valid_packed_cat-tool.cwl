{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "File",
            "id": "#main/file1"
        }
    ],
    "baseCommand": [
        "cat"
    ],
    "stdin": "$(inputs.file1.path)",
    "stdout": "output",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output"
            },
            "id": "#main/output"
        }
    ],
    "cwlVersion": "v1.2"
}