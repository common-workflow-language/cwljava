{
    "class": "Workflow",
    "steps": [],
    "inputs": [
        {
            "type": "Any",
            "id": "#main/input1"
        },
        {
            "type": {
                "type": "array",
                "items": "Any"
            },
            "id": "#main/input2"
        },
        {
            "type": "Any",
            "id": "#main/input3"
        }
    ],
    "id": "#main",
    "outputs": [
        {
            "id": "#main/output1",
            "type": {
                "type": "array",
                "items": "string"
            },
            "outputSource": "#main/input1"
        },
        {
            "id": "#main/output2",
            "type": {
                "type": "array",
                "items": "string"
            },
            "outputSource": "#main/input2"
        },
        {
            "id": "#main/output3",
            "type": "string",
            "outputSource": "#main/input3"
        }
    ],
    "cwlVersion": "v1.2"
}