{
    "class": "CommandLineTool",
    "doc": "Test of capturing stderr output.",
    "requirements": [
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "id": "#main/output_file",
            "outputBinding": {
                "glob": "ce9abbca6f172af7616b10db7c8f29456875eb87"
            }
        }
    ],
    "arguments": [
        {
            "valueFrom": "echo foo 1>&2",
            "shellQuote": false
        }
    ],
    "id": "#main",
    "stderr": "ce9abbca6f172af7616b10db7c8f29456875eb87",
    "cwlVersion": "v1.2"
}