arguments: ['true']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: filelist
  outputBinding: {glob: out-number.json}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
- class: InitialWorkDirRequirement
  listing:
  - {entry: "${\n  return 44.4;\n}", entryname: out-number.json}
