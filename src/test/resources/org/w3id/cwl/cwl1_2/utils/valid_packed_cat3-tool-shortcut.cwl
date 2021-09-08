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
    "id": "#main",
    "stdout": "4dadd8df9a22de8527c43a8e0a65abea6555a74c",
    "outputs": [
        {
            "type": "File",
            "id": "#main/output_file",
            "outputBinding": {
                "glob": "4dadd8df9a22de8527c43a8e0a65abea6555a74c"
            }
        }
    ],
    "cwlVersion": "v1.2"
}