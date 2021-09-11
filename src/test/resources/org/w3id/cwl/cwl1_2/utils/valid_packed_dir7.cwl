class: ExpressionTool
cwlVersion: v1.2
expression: '${

  return {"dir": {"class": "Directory", "basename": "a_directory", "listing": inputs.files}};

  }'
inputs:
- id: files
  type: {items: File, type: array}
outputs:
- {id: dir, type: Directory}
requirements:
- {class: InlineJavascriptRequirement}
