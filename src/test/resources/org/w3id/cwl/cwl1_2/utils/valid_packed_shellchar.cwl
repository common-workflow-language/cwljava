{
    "class": "CommandLineTool",
    "doc": "Ensure that arguments containing shell directives are not interpreted and\nthat `shellQuote: false` has no effect when ShellCommandRequirement is not in\neffect.\n",
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "id": "#main/stderr_file",
            "outputBinding": {
                "glob": "5f074896f51167c4a8c8dbcb6c49fe2c28fa2a13"
            }
        },
        {
            "type": "File",
            "id": "#main/stdout_file",
            "outputBinding": {
                "glob": "5c43c65ed3e94f2d6656574d064226db5997c080"
            }
        }
    ],
    "baseCommand": "echo",
    "arguments": [
        {
            "valueFrom": "foo 1>&2",
            "shellQuote": false
        }
    ],
    "id": "#main",
    "stderr": "5f074896f51167c4a8c8dbcb6c49fe2c28fa2a13",
    "stdout": "5c43c65ed3e94f2d6656574d064226db5997c080",
    "cwlVersion": "v1.2"
}