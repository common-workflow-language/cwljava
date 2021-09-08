{
    "class": "CommandLineTool",
    "id": "#main",
    "arguments": [
        {
            "shellQuote": false,
            "valueFrom": "ls | grep -v lsout"
        }
    ],
    "inputs": [
        {
            "id": "#input_file",
            "type": "File"
        },
        {
            "id": "#optional_file",
            "type": [
                "null",
                "File"
            ]
        },
        {
            "id": "#input_list",
            "type": {
                "type": "array",
                "items": "File"
            },
            "secondaryFiles": [
                {
                    "pattern": "^.tar",
                    "required": null
                }
            ]
        }
    ],
    "stdout": "lsout",
    "outputs": [
        {
            "id": "#output",
            "type": [
                "null",
                "File"
            ],
            "outputBinding": {
                "glob": "lsout"
            }
        }
    ],
    "label": "stage-array.cwl",
    "requirements": [
        {
            "class": "InitialWorkDirRequirement",
            "listing": [
                "$(inputs.input_file)",
                "$(inputs.optional_file)",
                {
                    "entry": "$(inputs.input_list)"
                },
                {
                    "entry": "$(null)"
                },
                {
                    "entryname": "a",
                    "entry": "b"
                }
            ]
        },
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "cwlVersion": "v1.2"
}