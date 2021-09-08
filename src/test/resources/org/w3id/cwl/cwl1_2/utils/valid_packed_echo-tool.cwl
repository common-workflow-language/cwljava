{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "Any",
            "inputBinding": {},
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
    "baseCommand": "echo",
    "stdout": "out.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}