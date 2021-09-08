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
    "id": "#main",
    "outputs": [
        {
            "type": "string",
            "outputBinding": {
                "outputEval": "bar $(inputs.in1)"
            },
            "id": "#main/out1"
        }
    ],
    "cwlVersion": "v1.2"
}