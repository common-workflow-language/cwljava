class: Workflow
cwlVersion: v1.2
doc: Workflow without outputs.
inputs:
- {id: file1, type: File}
outputs: []
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step0
  in:
  - {id: file1, source: file1}
  out: []
  run:
    baseCommand: echo
    class: CommandLineTool
    doc: CommandLineTool without outputs.
    hints:
      DockerRequirement: {dockerPull: debian:stretch-slim}
    inputs:
    - id: file1
      inputBinding: {position: 1}
      label: Input File
      type: File
    outputs: []
    requirements:
    - {class: InlineJavascriptRequirement}
