{
    "class": "CommandLineTool",
    "requirements": [
        {
            "coresMin": 1.25,
            "coresMax": 1.75,
            "class": "ResourceRequirement"
        }
    ],
    "inputs": [],
    "baseCommand": "echo",
    "stdout": "cores.txt",
    "arguments": [
        "$(runtime.cores)"
    ],
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "id": "#main/output",
            "outputBinding": {
                "glob": "cores.txt"
            }
        }
    ],
    "cwlVersion": "v1.2"
}