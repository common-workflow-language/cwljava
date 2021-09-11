arguments:
- cd
- $(inputs.indir.path)
- {shellQuote: false, valueFrom: '&&'}
- find
- .
- {shellQuote: false, valueFrom: '|'}
- sort
class: CommandLineTool
cwlVersion: v1.2
hints:
  DockerRequirement: {dockerPull: 'debian:stretch-slim'}
inputs:
- {id: indir, type: Directory}
outputs:
- id: outlist
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stdout: output.txt
