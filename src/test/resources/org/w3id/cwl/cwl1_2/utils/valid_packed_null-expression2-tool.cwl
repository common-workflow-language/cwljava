{
    "class": "ExpressionTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": "Any",
            "id": "#main/i1"
        }
    ],
    "outputs": [
        {
            "type": "int",
            "id": "#main/output"
        }
    ],
    "expression": "$({'output': (inputs.i1 == 'the-default' ? 1 : 2)})",
    "id": "#main",
    "cwlVersion": "v1.2"
}