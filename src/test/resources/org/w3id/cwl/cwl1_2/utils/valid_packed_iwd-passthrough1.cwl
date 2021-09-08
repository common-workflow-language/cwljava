{
    "class": "CommandLineTool",
    "doc": "YAML |- syntax does not add trailing newline so in the listing entry\nbelow there is no whitespace surrounding the value\n$(inputs.filelist), so it is evaluated as a File object.  Compare to\niwd-passthrough2.cwl\n",
    "requirements": [
        {
            "listing": [
                {
                    "entryname": "renamed-filelist.txt",
                    "entry": "$(inputs.filelist)"
                }
            ],
            "class": "InitialWorkDirRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "id": "#main/filelist"
        }
    ],
    "outputs": [
        {
            "$import": "#main/filelist"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}