{
    "class": "ExpressionTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "loadContents": true,
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": "int",
            "id": "#main/output"
        }
    ],
    "expression": "$({'output': parseInt(inputs.file1.contents)})",
    "id": "#main",
    "cwlVersion": "v1.2"
}