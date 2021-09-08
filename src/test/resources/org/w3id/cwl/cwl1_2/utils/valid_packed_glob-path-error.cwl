{
    "requirements": [
        {
            "class": "DockerRequirement",
            "dockerPull": "debian:stretch-slim"
        }
    ],
    "class": "CommandLineTool",
    "inputs": [],
    "outputs": [
        {
            "id": "#main/OUTPUT",
            "type": "File",
            "outputBinding": {
                "glob": "/etc/passwd"
            }
        }
    ],
    "baseCommand": [
        "echo"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}