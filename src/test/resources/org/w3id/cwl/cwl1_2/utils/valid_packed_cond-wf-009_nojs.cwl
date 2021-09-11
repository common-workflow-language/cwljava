class: Workflow
cwlVersion: v1.2
inputs:
- default: [1, 2, 3, 4, 5, 6]
  id: data
  type: {items: int, type: array}
- {id: test, type: boolean}
outputs:
- id: out1
  outputSource: step1/out1
  pickValue: all_non_null
  type: {items: string, type: array}
requirements:
- {class: ScatterFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: data}
  - {id: a_new_var, source: test}
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
  scatter: in1
  when: $(inputs.a_new_var)
