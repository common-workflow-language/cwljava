{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "inputs": [
        {
            "type": "int",
            "inputBinding": {
                "position": "$(self)"
            },
            "id": "#main/one"
        },
        {
            "type": "int",
            "inputBinding": {
                "valueFrom": "sensation!",
                "position": "${return self+1;}"
            },
            "id": "#main/two"
        }
    ],
    "arguments": [
        {
            "position": "${return 2;}",
            "valueFrom": "singular"
        },
        {
            "position": "${return null;}",
            "valueFrom": "\ud83d\udd7a"
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
    "baseCommand": "echo",
    "stdout": "out.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}