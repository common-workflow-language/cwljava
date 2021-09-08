{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container if docker is available.",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/file1"
        }
    ],
    "baseCommand": "cat",
    "stdout": "output.txt",
    "stdin": "$(inputs.file1.path)",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "id": "#main/output_txt"
        }
    ],
    "cwlVersion": "v1.2"
}