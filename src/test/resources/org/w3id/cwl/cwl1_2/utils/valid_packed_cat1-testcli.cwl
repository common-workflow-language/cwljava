{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container.",
    "hints": [
        {
            "class": "DockerRequirement",
            "dockerPull": "python:2-slim"
        }
    ],
    "inputs": [
        {
            "id": "#main/file1",
            "type": "File",
            "inputBinding": {
                "position": 1
            }
        },
        {
            "id": "#main/numbering",
            "type": [
                "null",
                "boolean"
            ],
            "inputBinding": {
                "position": 0,
                "prefix": "-n"
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
        "cat"
    ],
    "id": "#main",
    "outputs": [
        {
            "id": "#main/args",
            "type": {
                "type": "array",
                "items": "string"
            }
        }
    ],
    "cwlVersion": "v1.2"
}