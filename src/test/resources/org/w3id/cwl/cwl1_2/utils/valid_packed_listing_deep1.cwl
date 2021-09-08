{
    "class": "CommandLineTool",
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        },
        {
            "loadListing": "deep_listing",
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
                "outputEval": "$(inputs.d.listing.length === 1 && inputs.d.listing[0].listing.length === 1)"
            },
            "id": "#main/out"
        }
    ],
    "baseCommand": "true",
    "id": "#main",
    "cwlVersion": "v1.2"
}