{
    "class": "CommandLineTool",
    "doc": "Ensure that `shellQuote: true` is the default behavior when\nShellCommandRequirement is in effect.\n",
    "requirements": [
        {
            "class": "ShellCommandRequirement"
        }
    ],
    "inputs": [],
    "outputs": [
        {
            "type": "File",
            "id": "#main/stderr_file",
            "outputBinding": {
                "glob": "ce3007cb0b6dfa315c57b36d452904fe6695f03a"
            }
        },
        {
            "type": "File",
            "id": "#main/stdout_file",
            "outputBinding": {
                "glob": "978be2f27a5ef56e12721f0f261d1fdbc16bed65"
            }
        }
    ],
    "baseCommand": "echo",
    "arguments": [
        "foo 1>&2"
    ],
    "id": "#main",
    "stderr": "ce3007cb0b6dfa315c57b36d452904fe6695f03a",
    "stdout": "978be2f27a5ef56e12721f0f261d1fdbc16bed65",
    "cwlVersion": "v1.2"
}