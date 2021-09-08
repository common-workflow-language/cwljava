{
    "class": "CommandLineTool",
    "doc": "Can have a file declared directly in InitialWorkDir",
    "requirements": [
        {
            "listing": [
                {
                    "class": "File",
                    "location": "inp-filelist.txt"
                },
                {
                    "class": "Directory",
                    "location": "testdir"
                }
            ],
            "class": "InitialWorkDirRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "outputBinding": {
                "glob": "inp-filelist.txt"
            },
            "id": "#main/filelist"
        },
        {
            "type": "Directory",
            "outputBinding": {
                "glob": "testdir"
            },
            "id": "#main/testdir"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}