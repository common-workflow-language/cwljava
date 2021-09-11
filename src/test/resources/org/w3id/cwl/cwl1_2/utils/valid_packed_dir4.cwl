arguments:
- cd
- $(inputs.inf.dirname)/xtestdir
- {shellQuote: false, valueFrom: '&&'}
- find
- .
- {shellQuote: false, valueFrom: '|'}
- sort
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: inf, type: File}
outputs:
- id: outlist
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stdout: output.txt
