{
    "class": "CommandLineTool",
    "requirements": [
        {
            "listing": [
                "$(inputs.filelist)"
            ],
            "class": "InitialWorkDirRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/filelist"
        }
    ],
    "outputs": [
        {
            "$import": "#main/filelist"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}