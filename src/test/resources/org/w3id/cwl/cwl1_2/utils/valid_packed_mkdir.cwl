{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "string",
            "id": "#main/dirname"
        }
    ],
    "outputs": [
        {
            "type": "Directory",
            "outputBinding": {
                "glob": "$(inputs.dirname)"
            },
            "id": "#main/out"
        }
    ],
    "arguments": [
        "mkdir",
        "$(inputs.dirname)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}