class: Workflow
cwlVersion: v1.2
inputs:
- {id: bar, type: Any}
outputs:
- {id: t1, outputSource: step1/t1, type: Any}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: bar, source: bar}
  out: [t1]
  run:
    baseCommand: 'true'
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: bar, type: Any}
    outputs:
    - id: t1
      outputBinding: {outputEval: $(inputs.bar.class || inputs.bar)}
      type: Any
    requirements:
    - {class: InlineJavascriptRequirement}
