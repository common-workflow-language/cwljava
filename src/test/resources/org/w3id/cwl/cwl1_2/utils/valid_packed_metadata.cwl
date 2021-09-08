{
    "class": "CommandLineTool",
    "doc": "Print the contents of a file to stdout using 'cat' running in a docker container.",
    "hints": [
        {
            "dockerPull": "debian:stretch-slim",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [
        {
            "type": "File",
            "inputBinding": {
                "position": 1
            },
            "id": "#main/file1"
        },
        {
            "type": [
                "null",
                "boolean"
            ],
            "inputBinding": {
                "position": 0,
                "prefix": "-n"
            },
            "id": "#main/numbering"
        }
    ],
    "outputs": [],
    "baseCommand": "cat",
    "id": "#main",
    "http://purl.org/dc/terms/creator": {
        "id": "#0000-0003-3566-7705",
        "class": "http://xmlns.com/foaf/0.1/Person",
        "http://xmlns.com/foaf/0.1/name": "Peter Amstutz",
        "http://xmlns.com/foaf/0.1/mbox": "mailto:peter.amstutz@curoverse.com"
    },
    "cwlVersion": "v1.2",
    "$schemas": [
        "foaf.rdf",
        "dcterms.rdf"
    ],
    "$namespaces": {
        "dct": "http://purl.org/dc/terms/",
        "foaf": "http://xmlns.com/foaf/0.1/"
    }
}