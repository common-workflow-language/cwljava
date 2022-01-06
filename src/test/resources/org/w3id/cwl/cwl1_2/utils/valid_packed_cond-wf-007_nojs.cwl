class: Workflow
cwlVersion: v1.2
inputs:
- {default: 23, id: val, type: int}
- {id: test1, type: boolean}
- {id: test2, type: boolean}
outputs:
- id: out1
  outputSource: [step1/out1, step2/out1]
  pickValue: all_non_null
  type: {items: string, type: array}
requirements:
- {class: MultipleInputFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: val}
  - {id: a_new_var, source: test1}
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
  when: $(inputs.a_new_var)
- id: step2
  in:
  - {id: in1, source: val}
  - {id: a_new_var, source: test2}
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
  when: $(inputs.a_new_var)
