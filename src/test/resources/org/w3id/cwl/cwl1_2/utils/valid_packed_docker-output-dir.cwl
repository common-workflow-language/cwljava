baseCommand: [touch, /other/thing]
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: thing
  outputBinding: {glob: thing}
  type: File
requirements:
- {class: DockerRequirement, dockerOutputDirectory: /other, dockerPull: debian:stretch-slim}
- {class: InlineJavascriptRequirement}
