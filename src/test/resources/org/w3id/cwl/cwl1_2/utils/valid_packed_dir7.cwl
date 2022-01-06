class: ExpressionTool
cwlVersion: v1.2
expression: "${\nreturn {\"dir\": {\"class\": \"Directory\", \"basename\": \"a_directory\"\
  , \"listing\": inputs.files}};\n}"
inputs:
- id: files
  type: {items: File, type: array}
outputs:
- {id: dir, type: Directory}
requirements:
- {class: InlineJavascriptRequirement}
