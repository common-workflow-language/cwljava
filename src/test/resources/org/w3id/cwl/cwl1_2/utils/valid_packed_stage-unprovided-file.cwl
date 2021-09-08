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
            "id": "#main/infile",
            "type": [
                "null",
                "File"
            ],
            "inputBinding": {
                "prefix": "-cfg",
                "valueFrom": "$(self.basename)"
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
    "outputs": [
        {
            "id": "#main/args",
            "type": {
                "type": "array",
                "items": "string"
            }
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}