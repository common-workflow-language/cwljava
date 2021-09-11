baseCommand: [cat]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: file1, type: stdin}
outputs:
- id: output
  outputBinding: {glob: output}
  type: File
requirements:
- {class: DockerRequirement, dockerPull: 'debian:stretch-slim'}
- {class: InlineJavascriptRequirement}
stdout: output
