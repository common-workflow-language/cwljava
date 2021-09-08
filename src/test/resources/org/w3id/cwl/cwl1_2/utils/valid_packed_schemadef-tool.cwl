{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "SchemaDefRequirement",
            "types": [
                {
                    "name": "#schemadef-type.yml/HelloType",
                    "type": "record",
                    "fields": [
                        {
                            "name": "#schemadef-type.yml/HelloType/a",
                            "type": "string"
                        },
                        {
                            "name": "#schemadef-type.yml/HelloType/b",
                            "type": "string"
                        }
                    ]
                }
            ],
            "id": "#schemadef-type.yml",
            "name": "#schemadef-type.yml"
        }
    ],
    "inputs": [
        {
            "id": "#main/hello",
            "type": "#schemadef-type.yml/HelloType",
            "inputBinding": {
                "valueFrom": "$(self.a)/$(self.b)"
            }
        }
    ],
    "outputs": [
        {
            "id": "#main/output",
            "type": "File",
            "outputBinding": {
                "glob": "output.txt"
            }
        }
    ],
    "stdout": "output.txt",
    "baseCommand": "echo",
    "id": "#main",
    "cwlVersion": "v1.2"
}