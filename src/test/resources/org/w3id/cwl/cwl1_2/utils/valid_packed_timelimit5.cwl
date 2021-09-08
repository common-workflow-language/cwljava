{
    "class": "ExpressionTool",
    "inputs": [],
    "outputs": [
        {
            "type": "string",
            "id": "#main/status"
        }
    ],
    "requirements": [
        {
            "class": "InlineJavascriptRequirement"
        },
        {
            "timelimit": 3,
            "class": "ToolTimeLimit"
        }
    ],
    "expression": "${\n  function sleep(milliseconds) {\n    var start = new Date().getTime();\n    for (var i = 0; i < 1e7; i++) {\n      if ((new Date().getTime() - start) > milliseconds){\n        break;\n      }\n    }\n  };\n  sleep(5000);\n  return {\"status\": \"Done\"}\n}",
    "id": "#main",
    "cwlVersion": "v1.2"
}