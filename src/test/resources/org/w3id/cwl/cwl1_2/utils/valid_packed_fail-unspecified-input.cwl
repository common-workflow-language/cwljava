{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "string",
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
    "stdout": "out.txt",
    "arguments": [
        "echo",
        "$(inputs.in)",
        "$(inputs.in2)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}