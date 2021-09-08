{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "int",
            "id": "#main/in1"
        },
        {
            "type": "int",
            "id": "#main/in2"
        },
        {
            "type": "int",
            "id": "#main/in3"
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
                "outputEval": "$(inputs.in1)$(inputs.in2)$(inputs.in3)"
            },
            "id": "#main/out1"
        }
    ],
    "cwlVersion": "v1.2"
}