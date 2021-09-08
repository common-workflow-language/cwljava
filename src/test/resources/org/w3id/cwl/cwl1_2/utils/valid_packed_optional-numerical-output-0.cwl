{
    "class": "CommandLineTool",
    "baseCommand": [
        "echo",
        "0"
    ],
    "stdout": "a.txt",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": [
                "null",
                "float"
            ],
            "outputBinding": {
                "glob": "a.txt",
                "loadContents": true,
                "outputEval": "${\n    return parseFloat(self[0].contents);\n}"
            },
            "id": "#main/out"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}