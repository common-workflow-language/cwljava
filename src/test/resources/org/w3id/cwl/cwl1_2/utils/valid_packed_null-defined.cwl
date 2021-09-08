{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": [
                "null",
                "File"
            ],
            "id": "#main/file1"
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
    "stdout": "out.txt",
    "arguments": [
        "echo",
        "$(inputs.file1 === null ? \"t\" : \"f\")"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}