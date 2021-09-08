{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "DockerRequirement",
            "dockerPull": "debian:stretch-slim"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/file1"
        }
    ],
    "baseCommand": [
        "cat"
    ],
    "stdout": "output",
    "id": "#main",
    "stdin": "$(inputs.file1.path)",
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output"
            },
            "id": "#main/output"
        }
    ],
    "cwlVersion": "v1.2"
}