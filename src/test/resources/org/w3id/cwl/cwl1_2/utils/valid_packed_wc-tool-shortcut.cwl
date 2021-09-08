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
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output"
            },
            "id": "#main/output"
        }
    ],
    "baseCommand": [
        "wc"
    ],
    "stdout": "output",
    "id": "#main",
    "stdin": "$(inputs.file1.path)",
    "cwlVersion": "v1.2"
}