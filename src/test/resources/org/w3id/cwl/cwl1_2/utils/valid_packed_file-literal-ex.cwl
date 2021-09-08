{
    "class": "ExpressionTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "id": "#main/lit"
        }
    ],
    "expression": "${\nreturn {\"lit\": {\"class\": \"File\", \"basename\": \"a_file\", \"contents\": \"Hello file literal.\"}};\n}",
    "id": "#main",
    "cwlVersion": "v1.2"
}