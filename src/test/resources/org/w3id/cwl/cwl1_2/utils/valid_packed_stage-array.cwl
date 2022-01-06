arguments:
- {shellQuote: false, valueFrom: ls | grep -v lsout}
class: CommandLineTool
cwlVersion: v1.2
id: stage_array
inputs:
- {id: input_file, type: File}
- id: optional_file
  type: ['null', File]
- id: input_list
  secondaryFiles: [^.tar]
  type: {items: File, type: array}
label: stage-array.cwl
outputs:
- id: output
  outputBinding: {glob: lsout}
  type: ['null', File]
requirements:
- class: InitialWorkDirRequirement
  listing:
  - $(inputs.input_file)
  - $(inputs.optional_file)
  - {entry: $(inputs.input_list)}
  - {entry: $(null)}
  - {entry: b, entryname: a}
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stdout: lsout
