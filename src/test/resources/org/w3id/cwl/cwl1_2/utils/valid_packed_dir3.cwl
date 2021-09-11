baseCommand: [tar, xvf]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: inf
  inputBinding: {position: 1}
  type: File
outputs:
- id: outdir
  outputBinding: {glob: .}
  type: Directory
requirements:
- {class: InlineJavascriptRequirement}
