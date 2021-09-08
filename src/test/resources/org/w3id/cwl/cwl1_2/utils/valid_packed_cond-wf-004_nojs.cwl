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
                    "type": "string",
                    "default": "Direct",
                    "id": "#main/def"
                },
                {
                    "type": "boolean",
                    "id": "#main/test"
                },
                {
                    "type": "int",
                    "default": 23,
                    "id": "#main/val"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/test",
                            "id": "#main/step1/a_new_var"
                        },
                        {
                            "source": "#main/val",
                            "id": "#main/step1/in1"
                        }
                    ],
                    "run": "#foo.cwl",
                    "when": "$(inputs.a_new_var)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "id": "#main/step1"
                }
            ],
            "outputs": [
                {
                    "type": "string",
                    "outputSource": [
                        "#main/step1/out1",
                        "#main/def"
                    ],
                    "pickValue": "the_only_non_null",
                    "id": "#main/out1"
                }
            ],
            "requirements": [
                {
                    "class": "MultipleInputFeatureRequirement"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}