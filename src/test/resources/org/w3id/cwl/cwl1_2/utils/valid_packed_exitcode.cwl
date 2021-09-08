{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "int",
            "outputBinding": {
                "outputEval": "$(runtime.exitCode)"
            },
            "id": "#main/code"
        }
    ],
    "successCodes": [
        7
    ],
    "arguments": [
        "exit",
        "7"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}