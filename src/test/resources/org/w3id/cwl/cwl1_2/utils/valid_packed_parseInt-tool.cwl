class: ExpressionTool
cwlVersion: v1.2
expression: '$({''output'': parseInt(inputs.file1.contents)})'
inputs:
- {id: file1, loadContents: true, type: File}
outputs:
- {id: output, type: int}
requirements:
- {class: InlineJavascriptRequirement}
