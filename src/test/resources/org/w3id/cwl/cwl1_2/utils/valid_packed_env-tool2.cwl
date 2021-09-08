{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "string",
            "id": "#main/in"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "out"
            },
            "id": "#main/out"
        }
    ],
    "hints": [
        {
            "envDef": [
                {
                    "envValue": "$(inputs.in)",
                    "envName": "TEST_ENV"
                }
            ],
            "class": "EnvVarRequirement"
        }
    ],
    "baseCommand": [
        "/bin/sh",
        "-c",
        "echo $TEST_ENV"
    ],
    "stdout": "out",
    "id": "#main",
    "cwlVersion": "v1.2"
}