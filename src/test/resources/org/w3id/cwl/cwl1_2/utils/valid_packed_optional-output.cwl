{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container.",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "label": "Input File",
            "doc": "The file that will be copied using 'cat'",
            "inputBinding": {
                "position": 1
            },
            "id": "#main/file1"
        }
    ],
    "outputs": [
        {
            "type": [
                "null",
                "File"
            ],
            "outputBinding": {
                "glob": "bumble.txt"
            },
            "id": "#main/optional_file"
        },
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "secondaryFiles": [
                {
                    "pattern": ".idx",
                    "required": null
                }
            ],
            "id": "#main/output_file"
        }
    ],
    "baseCommand": "cat",
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}