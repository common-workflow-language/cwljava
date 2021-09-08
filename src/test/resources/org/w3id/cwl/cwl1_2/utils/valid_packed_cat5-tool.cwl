{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container.",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        },
        {
            "fakeField": "fraggleFroogle",
            "class": "http://example.com/BlibberBlubberFakeRequirement"
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
    "stdout": "output.txt",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            },
            "id": "#main/output_file"
        }
    ],
    "cwlVersion": "v1.2",
    "$namespaces": {
        "ex": "http://example.com/"
    }
}