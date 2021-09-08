{
    "class": "CommandLineTool",
    "id": "#main",
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
    "cwlVersion": "v1.2"
}