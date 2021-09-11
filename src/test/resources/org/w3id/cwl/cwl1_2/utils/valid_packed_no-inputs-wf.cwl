class: Workflow
cwlVersion: v1.2
doc: Workflow without inputs.
inputs: []
outputs:
- {id: output, outputSource: step0/output, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step0
  in: []
  out: [output]
  run:
    baseCommand: [echo, cwl]
    class: CommandLineTool
    cwlVersion: v1.2
    doc: CommandLineTool without inputs.
    hints:
      DockerRequirement: {dockerPull: 'debian:stretch-slim'}
    inputs: []
    outputs:
    - id: output
      outputBinding: {glob: output}
      type: File
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: output
