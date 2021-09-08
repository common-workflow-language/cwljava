{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "Directory",
            "inputBinding": {
                "valueFrom": "$(self.listing[0].path)"
            },
            "id": "#main/dir1"
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
    "cwlVersion": "v1.2"
}