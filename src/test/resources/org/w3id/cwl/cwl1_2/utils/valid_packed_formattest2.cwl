{
    "class": "CommandLineTool",
    "doc": "Reverse each line using the `rev` command",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "inputBinding": {},
            "format": "http://edamontology.org/format_2330",
            "id": "#main/input"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "format": "$(inputs.input.format)",
            "id": "#main/output"
        }
    ],
    "baseCommand": "rev",
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2",
    "$schemas": [
        "EDAM.owl"
    ],
    "$namespaces": {
        "edam": "http://edamontology.org/"
    }
}