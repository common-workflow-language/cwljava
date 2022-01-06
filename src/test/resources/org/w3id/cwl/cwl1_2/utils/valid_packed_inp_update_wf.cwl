class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: a, outputSource: step3/output, type: int}
- {id: b, outputSource: step4/output, type: int}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {default: '3', id: in}
  out: [out]
  run:
    baseCommand: [echo]
    class: CommandLineTool
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
- id: step2
  in:
  - {id: r, source: step1/out}
  out: [out]
  run:
    arguments: [python, $(inputs.script), $(inputs.r.basename)]
    class: CommandLineTool
    hints:
      DockerRequirement: {dockerPull: python:2.7.15-alpine3.7}
    inputs:
    - {id: r, type: File}
    - default: {class: File, location: updateval.py}
      id: script
      type: File
    outputs:
    - id: out
      outputBinding: {glob: $(inputs.r.basename)}
      type: File
    requirements:
    - class: InitialWorkDirRequirement
      listing:
      - {entry: $(inputs.r), writable: true}
    - {class: InplaceUpdateRequirement, inplaceUpdate: true}
    - {class: InlineJavascriptRequirement}
- id: step3
  in:
  - {id: file1, source: step1/out}
  - {id: wait, source: step2/out}
  out: [output]
  run:
    class: ExpressionTool
    expression: "$({'output': parseInt(inputs.file1.contents)})"
    inputs:
    - {id: file1, loadContents: true, type: File}
    outputs:
    - {id: output, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step4
  in:
  - {id: file1, source: step2/out}
  out: [output]
  run:
    class: ExpressionTool
    expression: "$({'output': parseInt(inputs.file1.contents)})"
    inputs:
    - {id: file1, loadContents: true, type: File}
    outputs:
    - {id: output, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
