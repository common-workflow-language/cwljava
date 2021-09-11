class: ExpressionTool
cwlVersion: v1.2
expression: '${

  return {"lit": {"class": "File", "basename": "a_file", "contents": "Hello file literal."}};

  }'
inputs: []
outputs:
- {id: lit, type: File}
requirements:
- {class: InlineJavascriptRequirement}
