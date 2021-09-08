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
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "default": [
                        1,
                        2,
                        3,
                        4,
                        5,
                        6
                    ],
                    "id": "#main/data"
                },
                {
                    "type": "boolean",
                    "id": "#main/test"
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
                            "source": "#main/data",
                            "id": "#main/step1/in1"
                        }
                    ],
                    "run": "#foo.cwl",
                    "when": "$(inputs.a_new_var)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "scatter": "#main/step1/in1",
                    "id": "#main/step1"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "string"
                    },
                    "outputSource": "#main/step1/out1",
                    "pickValue": "all_non_null",
                    "id": "#main/out1"
                }
            ],
            "requirements": [
                {
                    "class": "ScatterFeatureRequirement"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}