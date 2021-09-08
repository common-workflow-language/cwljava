{
    "class": "CommandLineTool",
    "doc": "Sort lines using the `sort` command",
    "inputs": [
        {
            "id": "#main/reverse",
            "type": "boolean",
            "inputBinding": {
                "position": 1,
                "prefix": "-r"
            }
        },
        {
            "id": "#main/input",
            "type": "File",
            "inputBinding": {
                "position": 2
            }
        }
    ],
    "outputs": [
        {
            "id": "#main/output",
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            }
        }
    ],
    "baseCommand": "sort",
    "stdout": "output.txt",
    "id": "#main",
    "cwlVersion": "v1.2"
}