{
    "class": "ExpressionTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": {
                "type": "array",
                "items": "File"
            },
            "id": "#main/files"
        }
    ],
    "outputs": [
        {
            "type": "Directory",
            "id": "#main/dir"
        }
    ],
    "expression": "${\nreturn {\"dir\": {\"class\": \"Directory\", \"basename\": \"a_directory\", \"listing\": inputs.files}};\n}",
    "id": "#main",
    "cwlVersion": "v1.2"
}