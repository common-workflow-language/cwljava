class: Workflow
cwlVersion: v1.2
inputs:
- {id: i, type: int}
outputs:
- {id: o, outputSource: step1/o, type: int}
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
    expression: '${return {''o'': inputs.i * 2};}

      '
    inputs:
    - {id: i, type: int}
    outputs:
    - {id: o, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
