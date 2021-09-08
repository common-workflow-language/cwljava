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
            "id": "#main/array",
            "type": {
                "type": "array",
                "items": "int"
            },
            "inputBinding": {
                "position": 1,
                "prefix": "-I",
                "itemSeparator": ","
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
    "id": "#main",
    "cwlVersion": "v1.2"
}