baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: file1
  inputBinding: {valueFrom: $("a ")$("string")}
  type: ['null', File]
outputs:
- id: out
  outputBinding: {glob: output.txt, loadContents: true, outputEval: '$(self[0].contents)'}
  type: string
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
