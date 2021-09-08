{
    "class": "CommandLineTool",
    "hints": [
        {
            "class": "ResourceRequirement",
            "coresMin": 2
        },
        {
            "class": "DockerRequirement",
            "dockerPull": "python:2-slim"
        }
    ],
    "inputs": [
        {
            "id": "#main/reference",
            "type": "File",
            "inputBinding": {
                "position": 2
            }
        },
        {
            "id": "#main/reads",
            "type": {
                "type": "array",
                "items": "File"
            },
            "inputBinding": {
                "position": 3
            }
        },
        {
            "id": "#main/minimum_seed_length",
            "type": "int",
            "inputBinding": {
                "position": 1,
                "prefix": "-m"
            }
        },
        {
            "id": "#main/min_std_max_min",
            "type": {
                "type": "array",
                "items": "int"
            },
            "inputBinding": {
                "position": 1,
                "prefix": "-I",
                "itemSeparator": ","
            }
        },
        {
            "id": "#main/args.py",
            "type": "File",
            "default": {
                "class": "File",
                "location": "args.py"
            },
            "inputBinding": {
                "position": -1
            }
        }
    ],
    "baseCommand": "python",
    "arguments": [
        "bwa",
        "mem",
        {
            "valueFrom": "$(runtime.cores)",
            "position": 1,
            "prefix": "-t"
        }
    ],
    "stdout": "output.sam",
    "id": "#main",
    "outputs": [
        {
            "id": "#main/sam",
            "type": [
                "null",
                "File"
            ],
            "outputBinding": {
                "glob": "output.sam"
            }
        },
        {
            "id": "#main/args",
            "type": {
                "type": "array",
                "items": "string"
            }
        }
    ],
    "cwlVersion": "v1.2"
}