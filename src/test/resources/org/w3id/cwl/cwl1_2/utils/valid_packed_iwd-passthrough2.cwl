{
    "class": "CommandLineTool",
    "doc": "YAML | syntax adds a trailing newline, so in the listing entry\nbelow, it becomes a string interpolation -- it evaluates to a string\nconsisting of $(inputs.filelist) serialized to JSON and then adding\na newline.  Compare to iwd-passthrough1.cwl\n",
    "requirements": [
        {
            "dockerPull": "python:3-slim",
            "class": "DockerRequirement"
        },
        {
            "listing": [
                {
                    "entryname": "renamed-filelist.txt",
                    "entry": "$(inputs.filelist)\n"
                }
            ],
            "class": "InitialWorkDirRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/filelist"
        },
        {
            "type": "File",
            "default": {
                "class": "File",
                "location": "loadit.py"
            },
            "id": "#main/script"
        }
    ],
    "stdout": "out.txt",
    "outputs": [
        {
            "type": "File",
            "id": "#main/out",
            "outputBinding": {
                "glob": "out.txt"
            }
        }
    ],
    "arguments": [
        "python3",
        "$(inputs.script)",
        "renamed-filelist.txt"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}