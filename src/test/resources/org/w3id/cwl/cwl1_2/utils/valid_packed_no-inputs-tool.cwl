baseCommand: [echo, cwl]
class: CommandLineTool
cwlVersion: v1.2
doc: CommandLineTool without inputs.
hints:
  DockerRequirement: {dockerPull: debian:stretch-slim}
inputs: []
outputs:
- id: output
  outputBinding: {glob: output}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdout: output
