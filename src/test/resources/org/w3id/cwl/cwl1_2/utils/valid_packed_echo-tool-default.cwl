{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "string",
            "default": "tool_default",
            "inputBinding": {
                "position": 1
            },
            "id": "#main/in"
        }
    ],
    "outputs": [
        {
            "type": "string",
            "outputBinding": {
                "glob": "out.txt",
                "loadContents": true,
                "outputEval": "$(self[0].contents)"
            },
            "id": "#main/out"
        }
    ],
    "baseCommand": [
        "echo",
        "-n"
    ],
    "stdout": "out.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}