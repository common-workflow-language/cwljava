baseCommand: wc
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: file1
  inputBinding: {}
  type: File
outputs:
- id: output
  outputBinding: {glob: output.txt, loadContents: true, outputEval: '$(parseInt(self[0].contents))'}
  type: int
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
