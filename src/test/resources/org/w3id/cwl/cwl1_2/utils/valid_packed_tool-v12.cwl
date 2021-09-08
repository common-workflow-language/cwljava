{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": "File",
            "secondaryFiles": [
                {
                    "pattern": ".2",
                    "required": true
                }
            ],
            "id": "#main/inp1"
        }
    ],
    "requirements": [
        {
            "coresMin": 0.5,
            "class": "ResourceRequirement"
        }
    ],
    "outputs": [],
    "arguments": [
        "echo",
        "$(inputs.inp1)"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}