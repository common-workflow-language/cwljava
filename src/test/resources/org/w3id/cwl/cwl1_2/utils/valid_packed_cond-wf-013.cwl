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
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "id": "#main/in1"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/in1",
                            "id": "#main/step1/in1"
                        }
                    ],
                    "run": "#foo.cwl",
                    "when": "$(inputs.in1 % 2 == 0)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "scatter": "#main/step1/in1",
                    "id": "#main/step1"
                },
                {
                    "in": [
                        {
                            "source": "#main/in1",
                            "id": "#main/step2/in1"
                        }
                    ],
                    "run": "#bar.cwl",
                    "when": "$(inputs.in1 % 2 == 1)",
                    "out": [
                        "#main/step2/out1"
                    ],
                    "scatter": "#main/step2/in1",
                    "id": "#main/step2"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "string"
                    },
                    "outputSource": [
                        "#main/step1/out1",
                        "#main/step2/out1"
                    ],
                    "linkMerge": "merge_flattened",
                    "pickValue": "all_non_null",
                    "id": "#main/out1"
                }
            ],
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                },
                {
                    "class": "MultipleInputFeatureRequirement"
                },
                {
                    "class": "ScatterFeatureRequirement"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}