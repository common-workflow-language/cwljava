{
    "class": "CommandLineTool",
    "doc": "Create a file under /tmp, symlink it to working directory and glob symlink. The executor should NOT resolve this symlink",
    "hints": [
        {
            "dockerPull": "alpine",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "symlink.txt"
            },
            "id": "#main/output_file"
        }
    ],
    "requirements": [
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "arguments": [
        "echo",
        "Who's gonna drive you home",
        {
            "valueFrom": "> /tmp/original.txt",
            "shellQuote": false
        },
        {
            "valueFrom": " && ",
            "shellQuote": false
        },
        "ln",
        "-s",
        "/tmp/original.txt",
        "symlink.txt"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}