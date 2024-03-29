{
    "cwlVersion": "v1.1",
    "$graph": [
        {
            "id": "main",
            "class": "Workflow",
            "inputs": [
                {
                    "id": "command",
                    "type": "string"
                },
                {
                    "id": "wf_file_input",
                    "type": "File",
                    "secondaryFiles": [
                        {
                            "pattern": ".also",
                            "required": true
                        }
                    ]
                },
                {
                    "id": "wf_file_input_array",
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "secondaryFiles": [
                        {
                            "pattern": ".also",
                            "required": true
                        }
                    ]
                }
            ],
            "outputs": [
                {
                    "id": "the_answer",
                    "type": "string",
                    "outputSource": "run_tool/the_answer"
                }
            ],
            "steps": [
                {
                    "id": "run_tool",
                    "run": "#cwl_secondary_files_workflow_tool",
                    "in": {
                        "command": "command",
                        "f": "wf_file_input",
                        "fs": "wf_file_input_array"
                    },
                    "out": [
                        {
                            "id": "the_answer"
                        }
                    ]
                }
            ]
        },
        {
            "id": "cwl_secondary_files_workflow_tool",
            "class": "CommandLineTool",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "hints": {
                "DockerRequirement": {
                    "dockerPull": "debian:stretch-slim"
                },
                "NetworkAccess": {
                    "networkAccess": true
                },
                "LoadListingRequirement": {
                    "loadListing": "deep_listing"
                }
            },
            "inputs": [
                {
                    "id": "command",
                    "type": "string"
                },
                {
                    "id": "f",
                    "type": "File",
                    "inputBinding": {
                        "position": 2
                    }
                },
                {
                    "id": "fs",
                    "type": {
                        "type": "array",
                        "items": "File",
                        "inputBinding": {
                            "position": 3
                        }
                    }
                }
            ],
            "outputs": {
                "the_answer": {
                    "type": "string",
                    "outputBinding": {
                        "outputEval": "${ return \"\\$(\" + 42 + \")\"; }"
                    }
                }
            },
            "baseCommand": [],
            "arguments": [
                "bash",
                "-c",
                "$(inputs.command)"
            ]
        }
    ]
}
