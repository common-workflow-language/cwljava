{
    "$graph": [
        {
            "class": "CommandLineTool",
            "requirements": [
                {
                    "class": "ShellCommandRequirement"
                }
            ],
            "inputs": [
                {
                    "type": {
                        "name": "#record-output.cwl/irec/irec",
                        "type": "record",
                        "fields": [
                            {
                                "name": "#record-output.cwl/irec/irec/ifoo",
                                "type": "File",
                                "inputBinding": {
                                    "position": 2
                                }
                            },
                            {
                                "name": "#record-output.cwl/irec/irec/ibar",
                                "type": "File",
                                "inputBinding": {
                                    "position": 6
                                }
                            }
                        ]
                    },
                    "id": "#record-output.cwl/irec"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "name": "#record-output.cwl/orec/orec",
                        "type": "record",
                        "fields": [
                            {
                                "name": "#record-output.cwl/orec/orec/ofoo",
                                "type": "File",
                                "outputBinding": {
                                    "glob": "foo"
                                }
                            },
                            {
                                "name": "#record-output.cwl/orec/orec/obar",
                                "type": "File",
                                "outputBinding": {
                                    "glob": "bar"
                                }
                            }
                        ]
                    },
                    "id": "#record-output.cwl/orec"
                }
            ],
            "arguments": [
                {
                    "valueFrom": "cat",
                    "position": 1
                },
                {
                    "valueFrom": "> foo",
                    "position": 3,
                    "shellQuote": false
                },
                {
                    "valueFrom": "&&",
                    "position": 4,
                    "shellQuote": false
                },
                {
                    "valueFrom": "cat",
                    "position": 5
                },
                {
                    "valueFrom": "> bar",
                    "position": 7,
                    "shellQuote": false
                }
            ],
            "id": "#record-output.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [
                {
                    "type": {
                        "name": "#main/irec/irec",
                        "type": "record",
                        "fields": [
                            {
                                "name": "#main/irec/irec/ifoo",
                                "type": "File"
                            },
                            {
                                "name": "#main/irec/irec/ibar",
                                "type": "File"
                            }
                        ]
                    },
                    "id": "#main/irec"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "name": "#main/orec/orec",
                        "type": "record",
                        "fields": [
                            {
                                "name": "#main/orec/orec/ofoo",
                                "type": "File"
                            },
                            {
                                "name": "#main/orec/orec/obar",
                                "type": "File"
                            }
                        ]
                    },
                    "outputSource": "#main/step1/orec",
                    "id": "#main/orec"
                }
            ],
            "steps": [
                {
                    "run": "#record-output.cwl",
                    "in": [
                        {
                            "source": "#main/irec",
                            "id": "#main/step1/irec"
                        }
                    ],
                    "out": [
                        "#main/step1/orec"
                    ],
                    "id": "#main/step1"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}