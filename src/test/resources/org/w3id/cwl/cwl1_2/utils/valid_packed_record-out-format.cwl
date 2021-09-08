{
    "class": "CommandLineTool",
    "inputs": [
        {
            "type": {
                "type": "record",
                "fields": [
                    {
                        "type": "File",
                        "name": "#main/record_input/f1"
                    },
                    {
                        "type": {
                            "type": "array",
                            "items": "File"
                        },
                        "name": "#main/record_input/f2"
                    }
                ]
            },
            "id": "#main/record_input"
        }
    ],
    "outputs": [
        {
            "type": "File",
            "format": "http://example.com/format1",
            "outputBinding": {
                "outputEval": "$(inputs.record_input.f1)"
            },
            "id": "#main/f1out"
        },
        {
            "type": {
                "type": "record",
                "fields": [
                    {
                        "type": "File",
                        "format": "http://example.com/format2",
                        "outputBinding": {
                            "outputEval": "$(inputs.record_input.f2[0])"
                        },
                        "name": "#main/record_output/f2out"
                    }
                ]
            },
            "id": "#main/record_output"
        }
    ],
    "arguments": [
        "true"
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}