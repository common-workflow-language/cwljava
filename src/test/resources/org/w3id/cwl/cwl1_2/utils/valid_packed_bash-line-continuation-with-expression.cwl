{
    "class": "CommandLineTool",
    "requirements": [
        {
            "listing": [
                {
                    "entryname": "script.sh",
                    "entry": "echo \\\n  \"My country, 'tis of thee,\" \\\n  \"Sweet land of $(inputs.liberty)\"\n"
                }
            ],
            "class": "InitialWorkDirRequirement"
        }
    ],
    "baseCommand": [
        "bash",
        "script.sh"
    ],
    "inputs": [
        {
            "type": [
                "null",
                "string"
            ],
            "default": "liberty",
            "id": "#main/liberty"
        }
    ],
    "stdout": "out.txt",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "id": "#main/out",
            "outputBinding": {
                "glob": "out.txt"
            }
        }
    ],
    "cwlVersion": "v1.2"
}