{
    "class": "CommandLineTool",
    "requirements": [
        {
            "listing": [
                {
                    "entry": "$(inputs.r)",
                    "entryname": "inp",
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
    "inputs": [
        {
            "type": "Directory",
            "id": "#main/r"
        }
    ],
    "outputs": [
        {
            "type": "Directory",
            "outputBinding": {
                "glob": "inp"
            },
            "id": "#main/out"
        }
    ],
    "arguments": [
        "touch",
        "inp/blurb"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}