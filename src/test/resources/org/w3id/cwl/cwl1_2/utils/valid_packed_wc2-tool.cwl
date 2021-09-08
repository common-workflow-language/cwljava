{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "id": "#main/file1",
            "type": "File",
            "inputBinding": {}
        }
    ],
    "outputs": [
        {
            "id": "#main/output",
            "type": "int",
            "outputBinding": {
                "glob": "output.txt",
                "loadContents": true,
                "outputEval": "$(parseInt(self[0].contents))"
            }
        }
    ],
    "stdout": "output.txt",
    "baseCommand": "wc",
    "id": "#main",
    "cwlVersion": "v1.2"
}