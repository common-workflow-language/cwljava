{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "File",
            "id": "#main/initial_file"
        },
        {
            "type": "string",
            "id": "#main/out_file_name"
        }
    ],
    "stdout": "$(inputs.out_file_name)",
    "arguments": [
        "echo",
        "$(inputs.initial_file.basename)"
    ],
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "id": "#main/processed_file",
            "outputBinding": {
                "glob": "$(inputs.out_file_name)"
            }
        }
    ],
    "cwlVersion": "v1.2"
}