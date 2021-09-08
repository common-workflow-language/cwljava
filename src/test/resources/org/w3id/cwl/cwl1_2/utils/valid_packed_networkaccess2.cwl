{
    "class": "CommandLineTool",
    "requirements": [
        {
            "dockerPull": "python:3",
            "class": "DockerRequirement"
        }
    ],
    "inputs": [],
    "outputs": [],
    "baseCommand": "python",
    "arguments": [
        "-c",
        {
            "valueFrom": "import urllib.request\nassert(urllib.request.urlopen(\"http://commonwl.org\").code == 200)"
        }
    ],
    "id": "#main",
    "cwlVersion": "v1.2"
}