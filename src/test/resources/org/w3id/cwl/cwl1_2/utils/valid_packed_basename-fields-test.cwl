class: Workflow
cwlVersion: v1.2
inputs:
- {id: tool, type: File}
outputs:
- {id: rootFile, outputSource: root/out, type: File}
- {id: extFile, outputSource: ext/out, type: File}
requirements:
- {class: StepInputExpressionRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: root
  in:
  - {id: tool, source: tool}
  - {id: in, valueFrom: $(inputs.tool.nameroot)}
  out: [out]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - id: in
      inputBinding: {position: 1}
      type: string
    - id: name
      type: ['null', string]
    outputs:
    - {id: out, type: stdout}
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: out.txt
- id: ext
  in:
  - {id: tool, source: tool}
  - {id: in, valueFrom: $(inputs.tool.nameext)}
  out: [out]
  run:
    baseCommand: [echo]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - id: in
      inputBinding: {position: 1}
      type: string
    - id: name
      type: ['null', string]
    outputs:
    - {id: out, type: stdout}
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: out.txt
