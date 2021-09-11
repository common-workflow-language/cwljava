class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: wc_output, outputSource: step1/output, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step0
  in: []
  out: [output]
  run:
    class: ExpressionTool
    cwlVersion: v1.2
    expression: '$({''output'': null })'
    inputs: []
    outputs:
    - {id: output, type: Any}
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step1
  in:
  - default: {class: File, location: whale.txt}
    id: file1
    source: step0/output
  out: [output]
  run:
    baseCommand: [wc, -l]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: file1, type: File}
    outputs:
    - id: output
      outputBinding: {glob: output}
      type: File
    requirements:
    - {class: InlineJavascriptRequirement}
    stdin: $(inputs.file1.path)
    stdout: output
