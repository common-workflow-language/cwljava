{
    "class": "CommandLineTool",
    "inputs": [
        {
            "id": "#main/file1",
            "type": "File",
            "default": {
                "class": "File",
                "path": "whale.txt"
            }
        }
    ],
    "outputs": [],
    "arguments": [
        "cat",
        "$(inputs.file1.path)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}