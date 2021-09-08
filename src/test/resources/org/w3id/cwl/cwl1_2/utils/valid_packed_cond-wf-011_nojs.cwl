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
                    "default": [
                        1,
                        2
                    ],
                    "id": "#main/in1"
                },
                {
                    "type": {
                        "type": "array",
                        "items": "int"
                    },
                    "default": [
                        1,
                        2,
                        3
                    ],
                    "id": "#main/in2"
                },
                {
                    "type": "int",
                    "default": 23,
                    "id": "#main/in3"
                },
                {
                    "type": {
                        "type": "array",
                        "items": "boolean"
                    },
                    "default": [
                        false,
                        true,
                        false,
                        true
                    ],
                    "id": "#main/test"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/test",
                            "id": "#main/step1/another_input"
                        },
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
                    "when": "$(inputs.another_input)",
                    "out": [
                        "#main/step1/out1"
                    ],
                    "scatter": [
                        "#main/step1/in1",
                        "#main/step1/in2",
                        "#main/step1/another_input"
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
                    "class": "ScatterFeatureRequirement"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}