arguments: [ls]
class: CommandLineTool
cwlVersion: v1.2
id: stage_file_array_basename
inputs:
- id: input_list
  secondaryFiles: [.sec]
  type: {items: File, type: array}
label: Stage File Array (with Directory Basename)
outputs:
- id: output
  outputBinding: {glob: input_dir/*}
  type: {items: File, type: array}
requirements:
- {class: InlineJavascriptRequirement}
- class: InitialWorkDirRequirement
  listing:
  - {entry: "${ return {class: 'Directory', basename: 'input_dir', listing: inputs.input_list}\
      \ }"}
