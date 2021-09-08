{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "File",
                    "id": "#action.cwl/initial_file"
                },
                {
                    "type": "string",
                    "id": "#action.cwl/out_file_name"
                }
            ],
            "stdout": "$(inputs.out_file_name)",
            "arguments": [
                "echo",
                "$(inputs.initial_file.basename)"
            ],
            "id": "#action.cwl",
            "outputs": [
                {
                    "type": "File",
                    "id": "#action.cwl/processed_file",
                    "outputBinding": {
                        "glob": "$(inputs.out_file_name)"
                    }
                }
            ]
        },
        {
            "class": "Workflow",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                },
                {
                    "class": "MultipleInputFeatureRequirement"
                },
                {
                    "class": "ScatterFeatureRequirement"
                },
                {
                    "class": "StepInputExpressionRequirement"
                }
            ],
            "inputs": [
                {
                    "type": [
                        "null",
                        "File"
                    ],
                    "id": "#main/forward_reads"
                },
                {
                    "type": [
                        "null",
                        "File"
                    ],
                    "id": "#main/reverse_reads"
                },
                {
                    "type": [
                        "null",
                        "File"
                    ],
                    "id": "#main/single_reads"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "outputSource": [
                        "#main/step_paired/processed_file",
                        "#main/step_single/processed_file"
                    ],
                    "linkMerge": "merge_flattened",
                    "pickValue": "all_non_null",
                    "id": "#main/out_file"
                }
            ],
            "steps": [
                {
                    "run": "#action.cwl",
                    "when": "$(inputs.single === null)",
                    "scatter": [
                        "#main/step_paired/initial_file",
                        "#main/step_paired/suffix"
                    ],
                    "scatterMethod": "dotproduct",
                    "in": [
                        {
                            "source": [
                                "#main/forward_reads",
                                "#main/reverse_reads"
                            ],
                            "id": "#main/step_paired/initial_file"
                        },
                        {
                            "valueFrom": "filename_paired$(inputs.suffix)",
                            "id": "#main/step_paired/out_file_name"
                        },
                        {
                            "source": "#main/single_reads",
                            "id": "#main/step_paired/single"
                        },
                        {
                            "default": [
                                "1",
                                "2"
                            ],
                            "id": "#main/step_paired/suffix"
                        }
                    ],
                    "out": [
                        "#main/step_paired/processed_file"
                    ],
                    "id": "#main/step_paired"
                },
                {
                    "run": "#action.cwl",
                    "when": "$(inputs.single !== null)",
                    "in": [
                        {
                            "source": "#main/single_reads",
                            "id": "#main/step_single/initial_file"
                        },
                        {
                            "default": "filename_single",
                            "id": "#main/step_single/out_file_name"
                        },
                        {
                            "source": "#main/single_reads",
                            "id": "#main/step_single/single"
                        }
                    ],
                    "out": [
                        "#main/step_single/processed_file"
                    ],
                    "id": "#main/step_single"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}