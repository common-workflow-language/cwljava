class: ExpressionTool
cwlVersion: v1.2
expression: '${return {''o'': Array.apply(null, {length: inputs.i}).map(Number.call,
  Number)};}

  '
inputs:
- {id: i, type: int}
outputs:
- id: o
  type: {items: int, type: array}
requirements:
- {class: InlineJavascriptRequirement}
