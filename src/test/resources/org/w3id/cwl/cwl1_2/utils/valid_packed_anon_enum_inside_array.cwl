{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": {
                "type": "record",
                "fields": [
                    {
                        "type": [
                            {
                                "type": "enum",
                                "symbols": [
                                    "#main/first/species/homo_sapiens",
                                    "#main/first/species/mus_musculus"
                                ]
                            },
                            "null"
                        ],
                        "name": "#main/first/species"
                    }
                ]
            },
            "id": "#main/first"
        },
        {
            "type": [
                "null",
                {
                    "type": "enum",
                    "symbols": [
                        "#main/second/homo_sapiens",
                        "#main/second/mus_musculus"
                    ]
                }
            ],
            "id": "#main/second"
        }
    ],
    "baseCommand": "echo",
    "arguments": [
        {
            "prefix": "first",
            "valueFrom": "$(inputs.first.species)"
        },
        {
            "prefix": "second",
            "valueFrom": "$(inputs.second)"
        }
    ],
    "id": "#main",
    "stdout": "709b3206edab6b9163b81b4a767f8ecd6494e76a",
    "outputs": [
        {
            "type": "File",
            "id": "#main/result",
            "outputBinding": {
                "glob": "709b3206edab6b9163b81b4a767f8ecd6494e76a"
            }
        }
    ],
    "cwlVersion": "v1.2"
}