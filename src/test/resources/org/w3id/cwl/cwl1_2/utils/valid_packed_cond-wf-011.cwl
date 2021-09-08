{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "int",
                    "id": "#cat.cwl/in1"
                },
                {
                    "type": "int",
                    "id": "#cat.cwl/in2"
                },
                {
                    "type": "int",
                    "id": "#cat.cwl/in3"
                }
            ],
            "baseCommand": [
                "echo"
            ],
            "id": "#cat.cwl",
            "outputs": [
                {
                    "type": "string",
                    "outputBinding": {
                        "outputEval": "$(inputs.in1)$(inputs.in2)$(inputs.in3)"
                    },
                    "id": "#cat.cwl/out1"
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
                    "id": "#main/in1"
                },
                {
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "id": "#main/in2"
                },
                {
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "id": "#main/in3"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/in1",
                            "id": "#main/step1/in1"
                        },
                        {
                            "source": "#main/in2",
                            "id": "#main/step1/in2"
                        },
                        {
                            "source": "#main/in3",
                            "id": "#main/step1/in3"
                        }
                    ],
                    "run": "#cat.cwl",
                    "when": "$(inputs.in3 % 2 == 0)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "scatter": [
                        "#main/step1/in1",
                        "#main/step1/in2",
                        "#main/step1/in3"
                    ],
                    "scatterMethod": "nested_crossproduct",
                    "id": "#main/step1"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": {
                            "type": "array",
                            "items": {
                                "type": "array",
                                "items": "string"
                            }
                        }
                    },
                    "outputSource": "#main/step1/out1",
                    "pickValue": "all_non_null",
                    "id": "#main/out1"
                }
            ],
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
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