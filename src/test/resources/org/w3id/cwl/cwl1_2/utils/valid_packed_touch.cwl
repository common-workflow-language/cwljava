{
    "class": "CommandLineTool",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "string",
            "inputBinding": {
                "position": 0
            },
            "id": "#main/name"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "$(inputs.name)"
            },
            "id": "#main/empty_file"
        }
    ],
    "baseCommand": [
        "touch"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}