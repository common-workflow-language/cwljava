baseCommand: [-c, echo 'moo' > cow]
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: cow
  outputBinding: {glob: cow}
  type: File
requirements:
- {class: DockerRequirement, dockerPull: 'bash:4.4.12'}
- {class: InlineJavascriptRequirement}
