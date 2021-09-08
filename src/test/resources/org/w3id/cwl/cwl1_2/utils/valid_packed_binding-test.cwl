{
    "class": "CommandLineTool",
    "hints": [
        {
            "class": "DockerRequirement",
            "dockerPull": "python:2-slim"
        }
    ],
    "inputs": [
        {
            "id": "#main/reference",
            "type": "File",
            "inputBinding": {
                "position": 2
            }
        },
        {
            "id": "#main/reads",
            "type": {
                "type": "array",
                "items": "File",
                "inputBinding": {
                    "prefix": "-YYY"
                }
            },
            "inputBinding": {
                "position": 3,
                "prefix": "-XXX"
            }
        },
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
    "baseCommand": "python",
    "arguments": [
        "bwa",
        "mem"
    ],
    "id": "#main",
    "outputs": [
        {
            "type": {
                "type": "array",
                "items": "string"
            },
            "id": "#main/args"
        }
    ],
    "cwlVersion": "v1.2"
}