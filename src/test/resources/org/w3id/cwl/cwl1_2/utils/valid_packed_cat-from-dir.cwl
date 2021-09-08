{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "Directory",
            "id": "#main/dir1"
        }
    ],
    "baseCommand": [
        "cat"
    ],
    "stdin": "$(inputs.dir1.listing[0].path)",
    "id": "#main",
    "stdout": "c5bb9e8bd57b2f52978712195090d24225f6cf7d",
    "outputs": [
        {
            "type": "File",
            "id": "#main/output",
            "outputBinding": {
                "glob": "c5bb9e8bd57b2f52978712195090d24225f6cf7d"
            }
        }
    ],
    "cwlVersion": "v1.2"
}