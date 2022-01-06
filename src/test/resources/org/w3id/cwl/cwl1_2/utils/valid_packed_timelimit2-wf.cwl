class: Workflow
cwlVersion: v1.2
inputs:
- id: i
  type: ['null', string]
outputs:
- id: o
  outputSource: step2/o
  type: ['null', string]
requirements:
- {class: ToolTimeLimit, timelimit: 5}
- {class: InlineJavascriptRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {id: i, source: i}
  out: [o]
  run:
    baseCommand: [sleep, '3']
    class: CommandLineTool
    inputs:
    - id: i
      type: ['null', string]
    outputs:
    - id: o
      outputBinding: {outputEval: $("time passed")}
      type: ['null', string]
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step2
  in:
  - {id: i, source: step1/o}
  out: [o]
  run:
    baseCommand: [sleep, '3']
    class: CommandLineTool
    inputs:
    - id: i
      type: ['null', string]
    outputs:
    - id: o
      outputBinding: {outputEval: $("time passed")}
      type: ['null', string]
    requirements:
    - {class: InlineJavascriptRequirement}
