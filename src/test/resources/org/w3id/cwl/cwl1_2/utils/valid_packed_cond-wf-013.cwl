class: Workflow
cwlVersion: v1.2
inputs:
- id: in1
  type: {items: int, type: array}
outputs:
- id: out1
  linkMerge: merge_flattened
  outputSource: [step1/out1, step2/out1]
  pickValue: all_non_null
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
- {class: ScatterFeatureRequirement}
- {class: MultipleInputFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: in1}
  out: [out1]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    inputs:
    - {id: in1, type: int}
    outputs:
    - id: out1
      outputBinding: {outputEval: foo $(inputs.in1)}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
  scatter: in1
  when: $(inputs.in1 % 2 == 0)
- id: step2
  in:
  - {id: in1, source: in1}
  out: [out1]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    inputs:
    - {id: in1, type: int}
    outputs:
    - id: out1
      outputBinding: {outputEval: bar $(inputs.in1)}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
  scatter: in1
  when: $(inputs.in1 % 2 == 1)
