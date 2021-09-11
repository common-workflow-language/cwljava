arguments:
- {shellQuote: false, valueFrom: '&&'}
- find
- .
- {shellQuote: false, valueFrom: '|'}
- sort
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: indir
  inputBinding: {position: -1, prefix: cd}
  type: Directory
outputs:
- id: outlist
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stdout: output.txt
