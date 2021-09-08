{
    "class": "CommandLineTool",
    "requirements": [
        {
            "dockerPull": "python:3-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "default": {
                "class": "File",
                "location": "mkfilelist.py"
            },
            "id": "#main/script"
        }
    ],
    "outputs": [
        {
            "type": {
                "type": "array",
                "items": "string"
            },
            "id": "#main/filelist"
        }
    ],
    "arguments": [
        "python",
        "$(inputs.script)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}