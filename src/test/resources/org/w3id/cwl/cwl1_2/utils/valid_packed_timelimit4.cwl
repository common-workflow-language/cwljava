{
    "class": "CommandLineTool",
    "inputs": [],
    "outputs": [],
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        },
        {
            "timelimit": "$(1+2)",
            "class": "ToolTimeLimit"
        },
        {
            "enableReuse": false,
            "class": "WorkReuse"
        }
    ],
    "baseCommand": [
        "sleep",
        "15"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}