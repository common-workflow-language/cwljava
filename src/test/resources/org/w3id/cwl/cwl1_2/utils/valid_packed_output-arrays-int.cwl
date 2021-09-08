{
    "class": "ExpressionTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": "int",
            "id": "#main/i"
        }
    ],
    "outputs": [
        {
            "type": {
                "type": "array",
                "items": "int"
            },
            "id": "#main/o"
        }
    ],
    "expression": "${return {'o': Array.apply(null, {length: inputs.i}).map(Number.call, Number)};}\n",
    "id": "#main",
    "cwlVersion": "v1.2"
}