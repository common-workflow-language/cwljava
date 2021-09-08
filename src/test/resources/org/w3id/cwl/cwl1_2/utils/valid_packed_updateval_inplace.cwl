{
    "class": "CommandLineTool",
    "requirements": [
        {
            "listing": [
                {
                    "entry": "$(inputs.r)",
                    "writable": true
                }
            ],
            "class": "InitialWorkDirRequirement"
        },
        {
            "inplaceUpdate": true,
            "class": "InplaceUpdateRequirement"
        }
    ],
    "hints": [
        {
            "dockerPull": "python:2.7.15-alpine3.7",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/r"
        },
        {
            "type": "File",
            "default": {
                "class": "File",
                "location": "updateval.py"
            },
            "id": "#main/script"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "$(inputs.r.basename)"
            },
            "id": "#main/out"
        }
    ],
    "arguments": [
        "python",
        "$(inputs.script)",
        "$(inputs.r.basename)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}