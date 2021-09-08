{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        },
        {
            "loadListing": "shallow_listing",
            "class": "LoadListingRequirement"
        }
    ],
    "inputs": [
        {
            "type": "Directory",
            "id": "#main/d"
        }
    ],
    "outputs": [
        {
            "type": "boolean",
            "outputBinding": {
                "outputEval": "$(inputs.d.listing.length === 1 && inputs.d.listing[0].listing === undefined)"
            },
            "id": "#main/out"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}