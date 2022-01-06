class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: val, outputSource: step1/echo_out, type: string}
requirements:
- {class: StepInputExpressionRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: a, valueFrom: moocow}
  out: [echo_out]
  run:
    baseCommand: echo
    class: CommandLineTool
    id: echo
    inputs:
    - id: a
      inputBinding: {}
      type: string
    outputs:
    - id: echo_out
      outputBinding: {glob: step1_out, loadContents: true, outputEval: '$(self[0].contents)'}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: step1_out
