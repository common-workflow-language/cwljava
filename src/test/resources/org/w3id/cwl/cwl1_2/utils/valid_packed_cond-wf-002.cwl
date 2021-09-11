class: Workflow
cwlVersion: v1.2
inputs:
- {id: val, type: int}
outputs:
- {id: out1, outputSource: step1/out1, type: string}
requirements:
- {class: InlineJavascriptRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: val}
  - {id: a_new_var, source: val}
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
  when: $(inputs.a_new_var > 2)
