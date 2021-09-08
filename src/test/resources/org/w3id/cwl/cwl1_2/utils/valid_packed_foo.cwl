{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "int",
            "id": "#main/in1"
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
            "id": "#main/out1"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}