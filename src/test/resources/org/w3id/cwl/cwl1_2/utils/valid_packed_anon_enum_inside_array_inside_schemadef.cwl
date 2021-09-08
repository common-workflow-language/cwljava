{
    "class": "CommandLineTool",
    "requirements": [
        {
            "types": [
                {
                    "name": "#main/vcf2maf_params",
                    "type": "record",
                    "fields": [
                        {
                            "type": [
                                "null",
                                {
                                    "type": "enum",
                                    "symbols": [
                                        "#main/vcf2maf_params/ncbi_build/GRCh37",
                                        "#main/vcf2maf_params/ncbi_build/GRCh38",
                                        "#main/vcf2maf_params/ncbi_build/GRCm38"
                                    ]
                                }
                            ],
                            "name": "#main/vcf2maf_params/ncbi_build"
                        },
                        {
                            "type": [
                                "null",
                                {
                                    "type": "enum",
                                    "symbols": [
                                        "#main/vcf2maf_params/species/homo_sapiens",
                                        "#main/vcf2maf_params/species/mus_musculus"
                                    ]
                                }
                            ],
                            "name": "#main/vcf2maf_params/species"
                        }
                    ]
                }
            ],
            "class": "SchemaDefRequirement"
        }
    ],
    "inputs": [
        {
            "type": "#main/vcf2maf_params",
            "id": "#main/first"
        }
    ],
    "baseCommand": "echo",
    "arguments": [
        {
            "prefix": "species",
            "valueFrom": "$(inputs.first.species)"
        },
        {
            "prefix": "ncbi_build",
            "valueFrom": "$(inputs.first.ncbi_build)"
        }
    ],
    "id": "#main",
    "stdout": "71df1f60fb50b612846b19a37ccc0ccec190f843",
    "outputs": [
        {
            "type": "File",
            "id": "#main/result",
            "outputBinding": {
                "glob": "71df1f60fb50b612846b19a37ccc0ccec190f843"
            }
        }
    ],
    "cwlVersion": "v1.2"
}