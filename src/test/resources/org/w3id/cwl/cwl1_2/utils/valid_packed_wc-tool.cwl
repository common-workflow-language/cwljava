{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "File",
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output"
            },
            "id": "#main/output"
        }
    ],
    "baseCommand": [
        "wc",
        "-l"
    ],
    "stdin": "$(inputs.file1.path)",
    "stdout": "output",
    "id": "#main",
    "cwlVersion": "v1.2"
}