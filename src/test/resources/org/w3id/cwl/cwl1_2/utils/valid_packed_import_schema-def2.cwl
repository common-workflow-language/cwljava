{
    "$graph": [
        {
            "class": "CommandLineTool",
            "hints": [
                {
                    "dockerPull": "debian:stretch-slim",
                    "class": "DockerRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "string",
                    "inputBinding": {
                        "position": 0
                    },
                    "id": "#touch.cwl/name"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "$(inputs.name)"
                    },
                    "id": "#touch.cwl/empty_file"
                }
            ],
            "baseCommand": [
                "touch"
            ],
            "id": "#touch.cwl"
        },
        {
            "class": "Workflow",
            "requirements": [
                {
                    "types": [
                        {
                            "name": "#capture_kit.yml/capture_kit",
                            "type": "record",
                            "fields": [
                                {
                                    "name": "#capture_kit.yml/capture_kit/bait",
                                    "type": "string"
                                }
                            ]
                        }
                    ],
                    "class": "SchemaDefRequirement"
                }
            ],
            "inputs": [
                {
                    "type": "string",
                    "id": "#main/bam"
                },
                {
                    "type": "#capture_kit.yml/capture_kit",
                    "id": "#main/capture_kit[]"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/touch_bam/empty_file",
                    "id": "#main/output_bam"
                }
            ],
            "steps": [
                {
                    "run": "#touch.cwl",
                    "in": [
                        {
                            "source": "#main/bam",
                            "id": "#main/touch_bam/name"
                        }
                    ],
                    "out": [
                        "#main/touch_bam/empty_file"
                    ],
                    "id": "#main/touch_bam"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}