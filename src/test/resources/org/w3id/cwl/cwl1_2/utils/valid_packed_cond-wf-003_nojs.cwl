class: Workflow
cwlVersion: v1.2
inputs:
- {default: 23, id: val, type: int}
- {id: test, type: boolean}
- {default: Direct, id: def, type: string}
outputs:
- id: out1
  outputSource: [step1/out1, def]
  pickValue: first_non_null
  type: string
requirements:
- {class: MultipleInputFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: in1, source: val}
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
  when: $(inputs.a_new_var)
