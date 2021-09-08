{
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "class": "CommandLineTool",
    "inputs": [
        {
            "id": "#main/input",
            "type": [
                "null",
                "File",
                {
                    "type": "array",
                    "items": "File"
                }
            ]
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "id": "#main/output_file"
        }
    ],
    "arguments": [
        {
            "valueFrom": "${\n  var cmd = [];\n  if (inputs.input === null) {\n     cmd.push('echo');\n     cmd.push('no_inputs');\n  } else {\n    cmd.push('cat');\n    if (Array.isArray(inputs.input)) {\n        for (var i = 0; i < inputs.input.length; i++) {\n           cmd.push(inputs.input[i].path);\n        }\n    } else {\n      cmd.push(inputs.input.path);\n    }\n  }\n  return cmd;\n}\n"
        }
    ],
    "baseCommand": [],
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}