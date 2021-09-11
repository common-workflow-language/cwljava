baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
doc: CommandLineTool without outputs.
hints:
  DockerRequirement: {dockerPull: 'debian:stretch-slim'}
inputs:
- id: file1
  inputBinding: {position: 1}
  label: Input File
  type: File
outputs: []
requirements:
- {class: InlineJavascriptRequirement}
