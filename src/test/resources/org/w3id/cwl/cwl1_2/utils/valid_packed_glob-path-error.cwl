baseCommand: [echo]
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: OUTPUT
  outputBinding: {glob: /etc/passwd}
  type: File
requirements:
- {class: DockerRequirement, dockerPull: debian:stretch-slim}
- {class: InlineJavascriptRequirement}
