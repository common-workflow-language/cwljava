class: Workflow
cwlVersion: v1.2
inputs:
- {id: i, type: File}
outputs:
- id: o
  outputSource: step2/o
  type: {items: File, type: array}
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
    expression: '${return {''o'': inputs.i.contents.split(" ")};}

      '
    inputs:
    - {id: i, loadContents: true, type: File}
    outputs:
    - id: o
      type: {items: string, type: array}
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step2
  in:
  - {id: i, source: step1/o}
  out: [o]
  run:
    baseCommand: touch
    class: CommandLineTool
    inputs:
    - id: i
      inputBinding: {position: 1}
      type: {items: string, type: array}
    outputs:
    - id: o
      outputBinding: {glob: $(inputs.i)}
      type: {items: File, type: array}
    requirements:
    - {class: InlineJavascriptRequirement}
