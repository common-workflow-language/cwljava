baseCommand: [cat, example.conf]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: message, type: string}
outputs:
- id: out
  outputBinding: {glob: example.conf}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: "CONFIGVAR=$(inputs.message)\n", entryname: example.conf}
- {class: InlineJavascriptRequirement}
