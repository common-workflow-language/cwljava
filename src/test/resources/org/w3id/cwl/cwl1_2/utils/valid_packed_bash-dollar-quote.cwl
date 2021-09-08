{
    "class": "CommandLineTool",
    "requirements": [
        {
            "listing": [
                {
                    "entryname": "script.sh",
                    "entry": "echo \\$(echo \\\n  \"My country, 'tis of thee,\" \\\n  \"Sweet land of liberty\" | rev)\necho '$(inputs.val)'     # produce val\necho '\\$(inputs.val)'    # produce $(inputs.val)\necho\necho '\\\\$(inputs.val)'   # produce \\val\necho '\\\\\\$(inputs.val)'  # produce \\$(inputs.val)\necho\necho '\\\\\\\\$(inputs.val)'  # produce \\\\val\necho '\\\\\\\\\\$(inputs.val)'  # produce \\\\$(inputs.val)\necho\necho '\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\val\necho '\\\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\$(inputs.val)\necho\necho '\\\\\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\\\val\necho '\\\\\\\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\\\$(inputs.val)\necho\necho '\\\\\\\\\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\\\\\val\necho '\\\\\\\\\\\\\\\\\\\\\\$(inputs.val)'  # produce \\\\\\\\\\$(inputs.val)\necho '\\'          # produce \\\necho '\\\\'         # produce \\\necho '\\\\\\'        # produce \\\\\necho '\\\\\\\\'       # produce \\\\\necho '\\\\\\\\\\'      # produce \\\\\\\necho '\\\\\\\\\\\\'     # produce \\\\\\\necho '\\\\\\\\\\\\\\'    # produce \\\\\\\\\necho '\\\\\\\\\\\\\\\\'   # produce \\\\\\\\\necho '\\\\\\\\\\\\\\\\\\'  # produce \\\\\\\\\\\necho '\\\\\\\\\\\\\\\\\\\\' # produce \\\\\\\\\\\necho '$'          # produce $\necho '\\$'         # produce \\$\necho '\\\\$'        # produce \\$\necho '$$'         # produce $$\necho '$$$'        # produce $$$\n"
                }
            ],
            "class": "InitialWorkDirRequirement"
        },
        {
            "class": "InlineJavascriptRequirement"
        }
    ],
    "baseCommand": [
        "bash",
        "script.sh"
    ],
    "inputs": [
        {
            "type": "string",
            "default": "val",
            "id": "#main/val"
        }
    ],
    "stdout": "out.txt",
    "id": "#main",
    "outputs": [
        {
            "type": "File",
            "id": "#main/out",
            "outputBinding": {
                "glob": "out.txt"
            }
        }
    ],
    "cwlVersion": "v1.2"
}