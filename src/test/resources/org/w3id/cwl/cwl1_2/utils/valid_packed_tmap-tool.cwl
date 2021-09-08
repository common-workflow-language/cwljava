{
    "class": "CommandLineTool",
    "hints": [
        {
            "class": "DockerRequirement",
            "dockerPull": "python:2-slim"
        }
    ],
    "inputs": [
        {
            "id": "#main/reads",
            "type": "File"
        },
        {
            "id": "#main/stages",
            "inputBinding": {
                "position": 1
            },
            "type": {
                "type": "array",
                "items": "#main/Stage"
            }
        },
        {
            "id": "#main/args.py",
            "type": "File",
            "default": {
                "class": "File",
                "location": "args.py"
            },
            "inputBinding": {
                "position": -1
            }
        }
    ],
    "outputs": [
        {
            "id": "#main/sam",
            "outputBinding": {
                "glob": "output.sam"
            },
            "type": [
                "null",
                "File"
            ]
        },
        {
            "id": "#main/args",
            "type": {
                "type": "array",
                "items": "string"
            }
        }
    ],
    "requirements": [
        {
            "class": "SchemaDefRequirement",
            "types": [
                {
                    "fields": [
                        {
                            "inputBinding": {
                                "position": 0
                            },
                            "name": "#main/Map1/algo",
                            "type": {
                                "type": "enum",
                                "name": "#main/Map1/algo/JustMap1",
                                "symbols": [
                                    "#main/Map1/algo/JustMap1/map1"
                                ]
                            }
                        },
                        {
                            "name": "#main/Map1/maxSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--max-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "name": "#main/Map1/minSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--min-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "inputBinding": {
                                "position": 2,
                                "prefix": "--seed-length"
                            },
                            "name": "#main/Map1/seedLength",
                            "type": [
                                "null",
                                "int"
                            ]
                        }
                    ],
                    "name": "#main/Map1",
                    "type": "record"
                },
                {
                    "fields": [
                        {
                            "inputBinding": {
                                "position": 0
                            },
                            "name": "#main/Map2/algo",
                            "type": {
                                "type": "enum",
                                "name": "#main/Map2/algo/JustMap2",
                                "symbols": [
                                    "#main/Map2/algo/JustMap2/map2"
                                ]
                            }
                        },
                        {
                            "name": "#main/Map2/maxSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--max-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "name": "#main/Map2/minSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--min-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "inputBinding": {
                                "position": 2,
                                "prefix": "--max-seed-hits"
                            },
                            "name": "#main/Map2/maxSeedHits",
                            "type": [
                                "null",
                                "int"
                            ]
                        }
                    ],
                    "name": "#main/Map2",
                    "type": "record"
                },
                {
                    "fields": [
                        {
                            "inputBinding": {
                                "position": 0
                            },
                            "name": "#main/Map3/algo",
                            "type": {
                                "type": "enum",
                                "name": "#main/Map3/algo/JustMap3",
                                "symbols": [
                                    "#main/Map3/algo/JustMap3/map3"
                                ]
                            }
                        },
                        {
                            "name": "#main/Map3/maxSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--max-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "name": "#main/Map3/minSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--min-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "inputBinding": {
                                "position": 2,
                                "prefix": "--fwd-search"
                            },
                            "name": "#main/Map3/fwdSearch",
                            "type": [
                                "null",
                                "boolean"
                            ]
                        }
                    ],
                    "name": "#main/Map3",
                    "type": "record"
                },
                {
                    "fields": [
                        {
                            "inputBinding": {
                                "position": 0
                            },
                            "name": "#main/Map4/algo",
                            "type": {
                                "type": "enum",
                                "name": "#main/Map4/algo/JustMap4",
                                "symbols": [
                                    "#main/Map4/algo/JustMap4/map4"
                                ]
                            }
                        },
                        {
                            "name": "#main/Map4/maxSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--max-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "name": "#main/Map4/minSeqLen",
                            "type": [
                                "null",
                                "int"
                            ],
                            "inputBinding": {
                                "prefix": "--min-seq-length",
                                "position": 2
                            }
                        },
                        {
                            "inputBinding": {
                                "position": 2,
                                "prefix": "--seed-step"
                            },
                            "name": "#main/Map4/seedStep",
                            "type": [
                                "null",
                                "int"
                            ]
                        }
                    ],
                    "name": "#main/Map4",
                    "type": "record"
                },
                {
                    "type": "record",
                    "name": "#main/Stage",
                    "fields": [
                        {
                            "inputBinding": {
                                "position": 0,
                                "prefix": "stage",
                                "separate": false
                            },
                            "name": "#main/Stage/stageId",
                            "type": [
                                "null",
                                "int"
                            ]
                        },
                        {
                            "inputBinding": {
                                "position": 1,
                                "prefix": "-n"
                            },
                            "name": "#main/Stage/stageOption1",
                            "type": [
                                "null",
                                "boolean"
                            ]
                        },
                        {
                            "inputBinding": {
                                "position": 2
                            },
                            "name": "#main/Stage/algos",
                            "type": {
                                "type": "array",
                                "items": [
                                    "#main/Map1",
                                    "#main/Map2",
                                    "#main/Map3",
                                    "#main/Map4"
                                ]
                            }
                        }
                    ]
                }
            ]
        }
    ],
    "baseCommand": "python",
    "arguments": [
        "tmap",
        "mapall"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}