{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "baseCommand": "echo",
    "inputs": [
        {
            "type": [
                "null",
                "File"
            ],
            "inputBinding": {
                "valueFrom": "$(\"a \")$(\"string\")"
            },
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": "string",
            "outputBinding": {
                "glob": "output.txt",
                "loadContents": true,
                "outputEval": "$(self[0].contents)"
            },
            "id": "#main/out"
        }
    ],
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}