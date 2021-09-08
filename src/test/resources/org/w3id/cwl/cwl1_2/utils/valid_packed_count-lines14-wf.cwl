{
    "$graph": [
        {
            "class": "ExpressionTool",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "loadContents": true,
                    "id": "#parseInt-tool.cwl/file1"
                }
            ],
            "expression": "$({'output': parseInt(inputs.file1.contents)})",
            "id": "#parseInt-tool.cwl",
            "outputs": [
                {
                    "type": "int",
                    "id": "#parseInt-tool.cwl/output"
                }
            ]
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": "File",
                    "id": "#main/file1"
                },
                {
                    "type": "File",
                    "id": "#main/file2"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "outputSource": "#main/step1/count_output",
                    "id": "#main/count_output"
                }
            ],
            "requirements": [
                {
                    "class": "MultipleInputFeatureRequirement"
                },
                {
                    "class": "ScatterFeatureRequirement"
                },
                {
                    "class": "SubworkflowFeatureRequirement"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": [
                                "#main/file1",
                                "#main/file2"
                            ],
                            "id": "#main/step1/file1"
                        }
                    ],
                    "out": [
                        "#main/step1/count_output"
                    ],
                    "scatter": "#main/step1/file1",
                    "run": {
                        "class": "Workflow",
                        "inputs": [
                            {
                                "type": "File",
                                "id": "#main/step1/run/file1"
                            }
                        ],
                        "outputs": [
                            {
                                "type": "int",
                                "outputSource": "#main/step1/run/step2/output",
                                "id": "#main/step1/run/count_output"
                            }
                        ],
                        "steps": [
                            {
                                "run": "#wc-tool.cwl",
                                "in": [
                                    {
                                        "source": "#main/step1/run/file1",
                                        "id": "#main/step1/run/step1/file1"
                                    }
                                ],
                                "out": [
                                    "#main/step1/run/step1/output"
                                ],
                                "id": "#main/step1/run/step1"
                            },
                            {
                                "run": "#parseInt-tool.cwl",
                                "in": [
                                    {
                                        "source": "#main/step1/run/step1/output",
                                        "id": "#main/step1/run/step2/file1"
                                    }
                                ],
                                "out": [
                                    "#main/step1/run/step2/output"
                                ],
                                "id": "#main/step1/run/step2"
                            }
                        ]
                    },
                    "id": "#main/step1"
                }
            ],
            "id": "#main"
        },
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "File",
                    "id": "#wc-tool.cwl/file1"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "output"
                    },
                    "id": "#wc-tool.cwl/output"
                }
            ],
            "baseCommand": [
                "wc",
                "-l"
            ],
            "stdin": "$(inputs.file1.path)",
            "stdout": "output",
            "id": "#wc-tool.cwl"
        }
    ],
    "cwlVersion": "v1.2"
}