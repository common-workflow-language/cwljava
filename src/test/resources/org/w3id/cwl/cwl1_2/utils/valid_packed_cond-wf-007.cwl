class: Workflow
cwlVersion: v1.2
inputs:
- {id: val, type: int}
outputs:
- id: out1
  outputSource: [step1/out1, step2/out1]
  pickValue: all_non_null
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
- {class: MultipleInputFeatureRequirement}
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
- id: step2
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
      outputBinding: {outputEval: bar $(inputs.in1)}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
  when: $(inputs.a_new_var > 0)
