{
    "class": "Workflow",
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "outputSource": "#main/second/ya",
            "id": "#main/ya_empty"
        }
    ],
    "steps": [
        {
            "run": {
                "class": "CommandLineTool",
                "baseCommand": [
                    "mkdir",
                    "-p",
                    "deeply/nested/dir/structure"
                ],
                "inputs": [],
                "outputs": [
                    {
                        "type": "Directory",
                        "outputBinding": {
                            "glob": "deeply"
                        },
                        "id": "#main/first/run/deep_dir"
                    }
                ]
            },
            "in": [],
            "out": [
                "#main/first/deep_dir"
            ],
            "id": "#main/first"
        },
        {
            "run": {
                "class": "CommandLineTool",
                "baseCommand": [
                    "touch",
                    "deeply/nested/dir/structure/ya"
                ],
                "requirements": [
                    {
                        "listing": [
                            {
                                "entry": "$(inputs.dir)",
                                "writable": true
                            }
                        ],
                        "class": "InitialWorkDirRequirement"
                    }
                ],
                "inputs": [
                    {
                        "type": "Directory",
                        "id": "#main/second/run/dir"
                    }
                ],
                "outputs": [
                    {
                        "type": "File",
                        "outputBinding": {
                            "glob": "deeply/nested/dir/structure/ya"
                        },
                        "id": "#main/second/run/ya"
                    }
                ]
            },
            "in": [
                {
                    "source": "#main/first/deep_dir",
                    "id": "#main/second/dir"
                }
            ],
            "out": [
                "#main/second/ya"
            ],
            "id": "#main/second"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}