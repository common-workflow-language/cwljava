class: Workflow
cwlVersion: v1.2
inputs:
- id: in1
  type: {items: int, type: array}
- id: in2
  type: {items: int, type: array}
- id: in3
  type: {items: int, type: array}
outputs:
- id: out1
  outputSource: step1/out1
  pickValue: all_non_null
  type:
    items:
      items: {items: string, type: array}
      type: array
    type: array
requirements:
- {class: InlineJavascriptRequirement}
- {class: ScatterFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: in1}
  - {id: in2, source: in2}
  - {id: in3, source: in3}
  out: [out1]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    inputs:
    - {id: in1, type: int}
    - {id: in2, type: int}
    - {id: in3, type: int}
    outputs:
    - id: out1
      outputBinding: {outputEval: $(inputs.in1)$(inputs.in2)$(inputs.in3)}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
  scatter: [in1, in2, in3]
  scatterMethod: nested_crossproduct
  when: $(inputs.in3 % 2 == 0)
