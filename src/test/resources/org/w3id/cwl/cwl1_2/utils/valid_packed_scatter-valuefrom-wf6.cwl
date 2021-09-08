{
    "$graph": [
        {
            "class": "CommandLineTool",
            "inputs": [
                {
                    "type": "string",
                    "inputBinding": {
                        "position": 1
                    },
                    "id": "#scatter-valueFrom-tool.cwl/message"
                },
                {
                    "type": "string",
                    "inputBinding": {
                        "position": 2
                    },
                    "id": "#scatter-valueFrom-tool.cwl/scattered_message"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "id": "#scatter-valueFrom-tool.cwl/out_message",
                    "outputBinding": {
                        "glob": "3340cc7a567db1458bf3abd86f34f5e89c399aea"
                    }
                }
            ],
            "baseCommand": "echo",
            "id": "#scatter-valueFrom-tool.cwl",
            "stdout": "3340cc7a567db1458bf3abd86f34f5e89c399aea"
        },
        {
            "class": "Workflow",
            "requirements": [
                {
                    "class": "ScatterFeatureRequirement"
                },
                {
                    "class": "StepInputExpressionRequirement"
                }
            ],
            "inputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "string"
                    },
                    "id": "#main/scattered_messages"
                }
            ],
            "outputs": [
                {
                    "type": {
                        "type": "array",
                        "items": "File"
                    },
                    "outputSource": "#main/step1/out_message",
                    "id": "#main/out_message"
                }
            ],
            "steps": [
                {
                    "run": "#scatter-valueFrom-tool.cwl",
                    "scatter": [
                        "#main/step1/scattered_message"
                    ],
                    "scatterMethod": "dotproduct",
                    "in": [
                        {
                            "valueFrom": "Hello",
                            "id": "#main/step1/message"
                        },
                        {
                            "source": "#main/scattered_messages",
                            "id": "#main/step1/scattered_message"
                        }
                    ],
                    "out": [
                        "#main/step1/out_message"
                    ],
                    "id": "#main/step1"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}