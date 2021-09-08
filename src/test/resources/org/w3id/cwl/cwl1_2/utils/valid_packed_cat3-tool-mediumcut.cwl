{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container.",
    "requirements": [
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
    "baseCommand": "cat",
    "stdout": "cat-out",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "id": "#main/output_file",
            "outputBinding": {
                "glob": "cat-out"
            }
        }
    ],
    "cwlVersion": "v1.2"
}