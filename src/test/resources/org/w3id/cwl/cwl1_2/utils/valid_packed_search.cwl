{
    "$graph": [
        {
            "id": "#index",
            "class": "CommandLineTool",
            "baseCommand": "python",
            "arguments": [
                {
                    "valueFrom": "input.txt",
                    "position": 1
                }
            ],
            "requirements": [
                {
                    "class": "InitialWorkDirRequirement",
                    "listing": [
                        {
                            "entryname": "input.txt",
                            "entry": "$(inputs.file)"
                        }
                    ]
                },
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "hints": [
                {
                    "class": "DockerRequirement",
                    "dockerPull": "python:2-slim"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "id": "#index/file"
                },
                {
                    "type": "File",
                    "default": {
                        "class": "File",
                        "location": "index.py"
                    },
                    "inputBinding": {
                        "position": 0
                    },
                    "id": "#index/index.py"
                },
                {
                    "type": "File",
                    "id": "#index/secondfile"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "input.txt"
                    },
                    "secondaryFiles": [
                        {
                            "pattern": ".idx1",
                            "required": null
                        },
                        {
                            "pattern": "^.idx2",
                            "required": null
                        },
                        {
                            "pattern": "$(self.basename).idx3",
                            "required": null
                        },
                        {
                            "pattern": "${ return self.basename+\".idx4\"; }",
                            "required": null
                        },
                        {
                            "pattern": "$({\"path\": self.path+\".idx5\", \"class\": \"File\"})",
                            "required": null
                        },
                        {
                            "pattern": "$(self.nameroot).idx6$(self.nameext)",
                            "required": null
                        },
                        {
                            "pattern": "${ return [self.basename+\".idx7\", inputs.secondfile]; }",
                            "required": null
                        },
                        {
                            "pattern": "_idx8",
                            "required": null
                        }
                    ],
                    "id": "#index/result"
                }
            ]
        },
        {
            "id": "#main",
            "class": "Workflow",
            "inputs": [
                {
                    "type": "File",
                    "id": "#main/infile"
                },
                {
                    "type": "File",
                    "id": "#main/secondfile"
                },
                {
                    "type": "string",
                    "id": "#main/term"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputSource": "#main/index/result",
                    "id": "#main/indexedfile"
                },
                {
                    "type": "File",
                    "outputSource": "#main/search/result",
                    "id": "#main/outfile"
                }
            ],
            "steps": [
                {
                    "run": "#index",
                    "in": [
                        {
                            "source": "#main/infile",
                            "id": "#main/index/file"
                        },
                        {
                            "source": "#main/secondfile",
                            "id": "#main/index/secondfile"
                        }
                    ],
                    "out": [
                        "#main/index/result"
                    ],
                    "id": "#main/index"
                },
                {
                    "run": "#search",
                    "in": [
                        {
                            "source": "#main/index/result",
                            "id": "#main/search/file"
                        },
                        {
                            "source": "#main/term",
                            "id": "#main/search/term"
                        }
                    ],
                    "out": [
                        "#main/search/result"
                    ],
                    "id": "#main/search"
                }
            ]
        },
        {
            "id": "#search",
            "class": "CommandLineTool",
            "baseCommand": "python",
            "requirements": [
                {
                    "class": "InlineJavascriptRequirement"
                }
            ],
            "hints": [
                {
                    "class": "DockerRequirement",
                    "dockerPull": "python:2-slim"
                }
            ],
            "inputs": [
                {
                    "type": "File",
                    "inputBinding": {
                        "position": 1
                    },
                    "secondaryFiles": [
                        {
                            "pattern": ".idx1",
                            "required": null
                        },
                        {
                            "pattern": "^.idx2",
                            "required": null
                        },
                        {
                            "pattern": "$(self.basename).idx3",
                            "required": null
                        },
                        {
                            "pattern": "${ return self.basename+\".idx4\"; }",
                            "required": null
                        },
                        {
                            "pattern": "$(self.nameroot).idx6$(self.nameext)",
                            "required": null
                        },
                        {
                            "pattern": "${ return [self.basename+\".idx7\"]; }",
                            "required": null
                        },
                        {
                            "pattern": "_idx8",
                            "required": null
                        }
                    ],
                    "id": "#search/file"
                },
                {
                    "type": "File",
                    "default": {
                        "class": "File",
                        "location": "search.py"
                    },
                    "inputBinding": {
                        "position": 0
                    },
                    "id": "#search/search.py"
                },
                {
                    "type": "string",
                    "inputBinding": {
                        "position": 2
                    },
                    "id": "#search/term"
                }
            ],
            "outputs": [
                {
                    "type": "File",
                    "outputBinding": {
                        "glob": "result.txt"
                    },
                    "id": "#search/result"
                }
            ],
            "stdout": "result.txt"
        }
    ],
    "cwlVersion": "v1.2"
}