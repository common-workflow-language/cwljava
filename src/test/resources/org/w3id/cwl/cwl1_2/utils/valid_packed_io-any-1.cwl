{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "id": "#main/bar",
            "type": "Any"
        }
    ],
    "outputs": [
        {
            "id": "#main/t1",
            "type": "Any",
            "outputBinding": {
                "outputEval": "$(inputs.bar.class || inputs.bar)"
            }
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}