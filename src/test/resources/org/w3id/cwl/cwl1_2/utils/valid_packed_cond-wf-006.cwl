{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "int",
                    "id": "#bar.cwl/in1"
                }
            ],
            "baseCommand": [
                "echo"
            ],
            "id": "#bar.cwl",
            "outputs": [
                {
                    "type": "string",
                    "outputBinding": {
                        "outputEval": "bar $(inputs.in1)"
                    },
                    "id": "#bar.cwl/out1"
                }
            ]
        },
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "int",
                    "id": "#foo.cwl/in1"
                }
            ],
            "baseCommand": [
                "echo"
            ],
            "outputs": [
                {
                    "type": "string",
                    "outputBinding": {
                        "outputEval": "foo $(inputs.in1)"
                    },
                    "id": "#foo.cwl/out1"
                }
            ],
            "id": "#foo.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": "int",
                    "id": "#main/val"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/val",
                            "id": "#main/step1/a_new_var"
                        },
                        {
                            "source": "#main/val",
                            "id": "#main/step1/in1"
                        }
                    ],
                    "run": "#foo.cwl",
                    "when": "$(inputs.a_new_var > 2)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "id": "#main/step1"
                },
                {
                    "in": [
                        {
                            "source": "#main/val",
                            "id": "#main/step2/a_new_var"
                        },
                        {
                            "source": "#main/val",
                            "id": "#main/step2/in1"
                        }
                    ],
                    "run": "#bar.cwl",
                    "when": "$(inputs.a_new_var > 0)",
                    "out": [
                        "#main/step2/out1"
                    ],
                    "id": "#main/step2"
                }
            ],
            "outputs": [
                {
                    "type": "string",
                    "outputSource": [
                        "#main/step1/out1",
                        "#main/step2/out1"
                    ],
                    "pickValue": "the_only_non_null",
                    "id": "#main/out1"
                }
            ],
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                },
                {
                    "class": "MultipleInputFeatureRequirement"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}