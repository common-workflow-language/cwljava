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
            "format": "http://galaxyproject.org/formats/fasta",
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
        "EDAM.owl",
        "gx_edam.ttl"
    ],
    "$namespaces": {
        "edam": "http://edamontology.org/",
        "gx": "http://galaxyproject.org/formats/"
    }
}