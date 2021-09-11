arguments:
- {position: '${return 2;}', valueFrom: singular}
- {position: '${return null;}', valueFrom: "\U0001F57A"}
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: one
  inputBinding: {position: $(self)}
  type: int
- id: two
  inputBinding: {position: '${return self+1;}', valueFrom: sensation!}
  type: int
outputs:
- id: out
  outputBinding: {glob: out.txt, loadContents: true, outputEval: '$(self[0].contents)'}
  type: string
requirements:
- {class: InlineJavascriptRequirement}
stdout: out.txt
