baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: filelist, type: File}
outputs:
- id: filelist
  outputBinding: {glob: $(inputs.filelist.basename)}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing: [$(inputs.filelist)]
- {class: InlineJavascriptRequirement}
