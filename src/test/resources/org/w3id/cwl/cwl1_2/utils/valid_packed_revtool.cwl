{
    "class": "CommandLineTool",
    "doc": "Reverse each line using the `rev` command",
    "inputs": [
        {
            "type": "File",
            "inputBinding": {},
            "id": "#main/input"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "id": "#main/output"
        }
    ],
    "baseCommand": "rev",
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}