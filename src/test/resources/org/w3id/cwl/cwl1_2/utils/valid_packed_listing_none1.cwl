{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": "Directory",
            "id": "#main/d"
        }
    ],
    "outputs": [
        {
            "type": "boolean",
            "outputBinding": {
                "outputEval": "$(inputs.d.listing === undefined)"
            },
            "id": "#main/out"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}