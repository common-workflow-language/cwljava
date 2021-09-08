{
    "$graph": [
        {
            "class": "CommandLineTool",
            "doc": "Reverse each line using the `rev` command",
            "inputs": [
                {
                    "type": "File",
                    "inputBinding": {},
                    "id": "#revtool.cwl/input"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "output.txt"
                    },
                    "id": "#revtool.cwl/output"
                }
            ],
            "baseCommand": "rev",
            "stdout": "output.txt",
            "id": "#revtool.cwl"
        },
        {
            "class": "Workflow",
            "doc": "Reverse the lines in a document, then sort those lines.",
            "inputs": [
                {
                    "type": "File",
                    "doc": "The input file to be processed.",
                    "id": "#main/input"
                },
                {
                    "type": "boolean",
                    "default": true,
                    "doc": "If true, reverse (decending) sort",
                    "id": "#main/reverse_sort"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/sort/sorted",
                    "doc": "The output with the lines reversed and sorted.",
                    "id": "#main/output"
                }
            ],
            "steps": [
                {
                    "in": [
                        {
                            "source": "#main/input",
                            "id": "#main/rev/input"
                        }
                    ],
                    "out": [
                        "#main/rev/output"
                    ],
                    "run": "#revtool.cwl",
                    "id": "#main/rev"
                },
                {
                    "in": [
                        {
                            "source": "#main/rev/output",
                            "id": "#main/sort/input"
                        },
                        {
                            "source": "#main/reverse_sort",
                            "id": "#main/sort/reverse"
                        }
                    ],
                    "out": [
                        "#main/sort/sorted"
                    ],
                    "run": {
                        "class": "Operation",
                        "id": "#main/sort/run/sort",
                        "doc": "Sort the lines of the file",
                        "inputs": [
                            {
                                "type": "File",
                                "doc": "The input file to be sorted.",
                                "id": "#main/sort/run/sort/input"
                            },
                            {
                                "type": "boolean",
                                "default": true,
                                "doc": "If true, reverse (decending) sort",
                                "id": "#main/sort/run/sort/reverse"
                            }
                        ],
                        "outputs": [
                            {
                                "type": "File",
                                "doc": "The sorted file",
                                "id": "#main/sort/run/sort/sorted"
                            }
                        ]
                    },
                    "id": "#main/sort"
                }
            ],
            "id": "#main"
        }
    ],
    "cwlVersion": "v1.2"
}