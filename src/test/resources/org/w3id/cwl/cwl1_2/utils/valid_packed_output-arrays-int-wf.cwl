class: Workflow
cwlVersion: v1.2
inputs:
- {id: i, type: int}
outputs:
- {id: o, outputSource: step3/o, type: int}
requirements:
- {class: InlineJavascriptRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {id: i, source: i}
  out: [o]
  run:
    class: ExpressionTool
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
- id: step2
  in:
  - {id: i, source: step1/o}
  out: [o]
  run:
    class: ExpressionTool
    expression: '${return {''o'': inputs.i.map(function(x) { return (x + 1) * 2; })};}

      '
    inputs:
    - id: i
      type: {items: int, type: array}
    outputs:
    - id: o
      type: {items: int, type: array}
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step3
  in:
  - {id: i, source: step2/o}
  out: [o]
  run:
    class: ExpressionTool
    expression: '${return {''o'': inputs.i.reduce(function(a, b) { return a + b; })};}

      '
    inputs:
    - id: i
      type: {items: int, type: array}
    outputs:
    - {id: o, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
