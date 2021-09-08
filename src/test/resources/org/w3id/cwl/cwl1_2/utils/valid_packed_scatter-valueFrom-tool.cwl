{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "string",
            "inputBinding": {
                "position": 1
            },
            "id": "#main/message"
        },
        {
            "type": "string",
            "inputBinding": {
                "position": 2
            },
            "id": "#main/scattered_message"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "id": "#main/out_message",
            "outputBinding": {
                "glob": "068d5594cd93cab4d89f732168d8d59a4e15a32c"
            }
        }
    ],
    "baseCommand": "echo",
    "id": "#main",
    "stdout": "068d5594cd93cab4d89f732168d8d59a4e15a32c",
    "cwlVersion": "v1.2"
}