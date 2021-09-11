arguments:
- {position: 0, valueFrom: $(inputs.INPUT.basename).fai}
baseCommand: [touch]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: INPUT, type: File}
outputs:
- id: OUTPUT
  outputBinding: {glob: $(inputs.INPUT.basename)}
  secondaryFiles: [.fai]
  type: File
requirements:
- {class: DockerRequirement, dockerPull: 'debian:stretch-slim'}
- class: InitialWorkDirRequirement
  listing: [$(inputs.INPUT)]
- {class: InlineJavascriptRequirement}
