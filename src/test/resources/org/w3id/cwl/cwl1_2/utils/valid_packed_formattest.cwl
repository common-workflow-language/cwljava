$namespaces: {edam: 'http://edamontology.org/'}
baseCommand: rev
class: CommandLineTool
cwlVersion: v1.2
doc: Reverse each line using the `rev` command
inputs:
- format: edam:format_2330
  id: input
  inputBinding: {}
  type: File
outputs:
- format: edam:format_2330
  id: output
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
