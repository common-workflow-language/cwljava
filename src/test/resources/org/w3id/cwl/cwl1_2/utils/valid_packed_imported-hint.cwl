{
    "class": "CommandLineTool",
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "id": "#main/out",
            "outputBinding": {
                "glob": "out"
            }
        }
    ],
    "hints": [
        {
            "class": "EnvVarRequirement",
            "envDef": [
                {
                    "envName": "TEST_ENV",
                    "envValue": "hello test env"
                }
            ],
            "id": "#envvar.yml",
            "name": "#envvar.yml"
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