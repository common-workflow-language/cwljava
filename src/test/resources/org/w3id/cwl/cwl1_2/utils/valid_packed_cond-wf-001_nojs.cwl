class: Workflow
cwlVersion: v1.2
inputs:
- {id: test, type: boolean}
outputs:
- id: out1
  outputSource: step1/out1
  type: ['null', string]
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {default: 23, id: in1}
  - {id: extra, source: test}
  out: [out1]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: in1, type: int}
    outputs:
    - id: out1
      outputBinding: {outputEval: foo $(inputs.in1)}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
  when: $(inputs.extra)
