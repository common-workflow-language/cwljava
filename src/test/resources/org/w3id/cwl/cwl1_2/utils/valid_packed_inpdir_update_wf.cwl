{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "string",
                    "id": "#mkdir.cwl/dirname"
                }
            ],
            "outputs": [
                {
                    "type": "Directory",
                    "outputBinding": {
                        "glob": "$(inputs.dirname)"
                    },
                    "id": "#mkdir.cwl/out"
                }
            ],
            "arguments": [
                "mkdir",
                "$(inputs.dirname)"
            ],
            "id": "#mkdir.cwl"
        },
        {
            "class": "CommandLineTool",
            "requirements": [
                {
                    "listing": [
                        {
                            "entry": "$(inputs.r)",
                            "entryname": "inp",
                            "writable": true
                        }
                    ],
                    "class": "InitialWorkDirRequirement"
                },
                {
                    "inplaceUpdate": true,
                    "class": "InplaceUpdateRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "Directory",
                    "id": "#updatedir_inplace.cwl/r"
                }
            ],
            "outputs": [
                {
                    "type": "Directory",
                    "outputBinding": {
                        "glob": "inp"
                    },
                    "id": "#updatedir_inplace.cwl/out"
                }
            ],
            "arguments": [
                "touch",
                "inp/blurb"
            ],
            "id": "#updatedir_inplace.cwl"
        },
        {
            "class": "Workflow",
            "inputs": [],
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "outputSource": "#main/step3/d1out",
                    "id": "#main/a"
                },
                {
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "outputSource": "#main/step3/d2out",
                    "id": "#main/b"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "default": "step1dir",
                            "id": "#main/step1/dirname"
                        }
                    ],
                    "out": [
                        "#main/step1/out"
                    ],
                    "run": "#mkdir.cwl",
                    "id": "#main/step1"
                },
                {
                    "in": [
                        {
                            "source": "#main/step1/out",
                            "id": "#main/step2/r"
                        }
                    ],
                    "out": [
                        "#main/step2/out"
                    ],
                    "run": "#updatedir_inplace.cwl",
                    "id": "#main/step2"
                },
                {
                    "in": [
                        {
                            "source": "#main/step1/out",
                            "id": "#main/step3/d1"
                        },
                        {
                            "source": "#main/step2/out",
                            "id": "#main/step3/d2"
                        }
                    ],
                    "out": [
                        "#main/step3/d1out",
                        "#main/step3/d2out"
                    ],
                    "run": {
                        "class": "ExpressionTool",
                        "inputs": [
                            {
                                "type": "Directory",
                                "loadListing": "shallow_listing",
                                "id": "#main/step3/run/d1"
                            },
                            {
                                "type": "Directory",
                                "loadListing": "shallow_listing",
                                "id": "#main/step3/run/d2"
                            }
                        ],
                        "outputs": [
                            {
                                "type": {
                                    "type": "array",
                                    "items": "File"
                                },
                                "id": "#main/step3/run/d1out"
                            },
                            {
                                "type": {
                                    "type": "array",
                                    "items": "File"
                                },
                                "id": "#main/step3/run/d2out"
                            }
                        ],
                        "expression": "$({d1out: inputs.d1.listing, d2out: inputs.d2.listing})"
                    },
                    "id": "#main/step3"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}