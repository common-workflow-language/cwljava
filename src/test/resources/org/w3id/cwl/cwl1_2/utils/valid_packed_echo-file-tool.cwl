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
            "id": "#main/in"
        },
        {
            "type": [
                "null",
                "string"
            ],
            "id": "#main/name"
        }
    ],
    "stdout": "out.txt",
    "outputs": [
        {
            "type": "File",
            "id": "#main/out",
            "outputBinding": {
                "glob": "out.txt"
            }
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}