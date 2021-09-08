{
    "$graph": [
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
            "id": "#foo.cwl",
            "outputs": [
                {
                    "type": "string",
                    "outputBinding": {
                        "outputEval": "foo $(inputs.in1)"
                    },
                    "id": "#foo.cwl/out1"
                }
            ]
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
                    "when": "$(inputs.in1 < 1)",
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
                    "run": "#foo.cwl",
                    "when": "$(inputs.a_new_var > 2)",
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
                    "pickValue": "first_non_null",
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