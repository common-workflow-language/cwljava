{
    "class": "CommandLineTool",
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
            "inputBinding": {},
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": "int",
            "outputBinding": {
                "glob": "output.txt",
                "loadContents": true,
                "outputEval": "${\n  var s = self[0].contents.split(/\\r?\\n/);\n  return parseInt(s[s.length-2]);\n}\n"
            },
            "id": "#main/output"
        }
    ],
    "stdout": "output.txt",
    "baseCommand": "wc",
    "id": "#main",
    "cwlVersion": "v1.2"
}