class: ExpressionTool
cwlVersion: v1.2
expression: '$({''output'': (inputs.i1 == ''the-default'' ? 1 : 2)})'
inputs:
- {default: the-default, id: i1, type: Any}
outputs:
- {id: output, type: int}
requirements:
- {class: InlineJavascriptRequirement}
