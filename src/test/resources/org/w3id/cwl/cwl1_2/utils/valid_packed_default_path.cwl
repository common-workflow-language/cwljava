arguments: [cat, $(inputs.file1.path)]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- default: {class: File, path: whale.txt}
  id: file1
  type: File
outputs: []
requirements:
- {class: InlineJavascriptRequirement}
