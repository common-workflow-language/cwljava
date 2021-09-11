baseCommand: wc
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: file1
  inputBinding: {}
  type: {items: File, type: array}
outputs:
- id: output
  outputBinding: {glob: output.txt, loadContents: true, outputEval: "${\n  var s =
      self[0].contents.split(/\\r?\\n/);\n  return parseInt(s[s.length-2]);\n}\n"}
  type: int
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
