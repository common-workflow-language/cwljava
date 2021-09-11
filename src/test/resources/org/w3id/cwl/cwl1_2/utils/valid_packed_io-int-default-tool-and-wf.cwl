class: Workflow
cwlVersion: v1.2
inputs:
- {default: 4, id: i, type: int}
outputs:
- {id: o, outputSource: step2/o, type: int}
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
    expression: '${return {''o'': (inputs.i || 2)};}

      '
    inputs:
    - {id: i, type: int}
    outputs:
    - {id: o, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step2
  in:
  - {id: i, source: step1/o}
  out: [o]
  run:
    class: ExpressionTool
    expression: '${return {''o'': inputs.i * 2 + inputs.i2};}

      '
    inputs:
    - {id: i, type: int}
    - {default: 5, id: i2, type: int}
    outputs:
    - {id: o, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
