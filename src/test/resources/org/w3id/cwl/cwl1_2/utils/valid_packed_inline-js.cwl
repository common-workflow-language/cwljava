{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "hints": [
        {
            "class": "DockerRequirement",
            "dockerPull": "python:2-slim"
        }
    ],
    "inputs": [
        {
            "id": "#main/args.py",
            "type": "File",
            "default": {
                "class": "File",
                "location": "args.py"
            },
            "inputBinding": {
                "position": -1
            }
        }
    ],
    "outputs": [
        {
            "id": "#main/args",
            "type": {
                "type": "array",
                "items": "string"
            }
        }
    ],
    "baseCommand": "python",
    "arguments": [
        {
            "prefix": "-A",
            "valueFrom": "$(1+1)"
        },
        {
            "prefix": "-B",
            "valueFrom": "$(\"/foo/bar/baz\".split('/').slice(-1)[0])"
        },
        {
            "prefix": "-C",
            "valueFrom": "${\n  var r = [];\n  for (var i = 10; i >= 1; i--) {\n    r.push(i);\n  }\n  return r;\n}\n"
        },
        {
            "prefix": "-D",
            "valueFrom": "$(true)"
        },
        {
            "prefix": "-E",
            "valueFrom": "$(false)"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}