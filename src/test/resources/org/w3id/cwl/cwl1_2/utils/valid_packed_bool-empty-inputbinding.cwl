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
            "id": "#main/flag",
            "type": "boolean",
            "inputBinding": {}
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
    "arguments": [],
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