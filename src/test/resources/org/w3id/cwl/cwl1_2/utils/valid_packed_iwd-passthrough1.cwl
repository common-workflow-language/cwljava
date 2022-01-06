baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
doc: "YAML |- syntax does not add trailing newline so in the listing entry\nbelow\
  \ there is no whitespace surrounding the value\n$(inputs.filelist), so it is evaluated\
  \ as a File object.  Compare to\niwd-passthrough2.cwl\n"
inputs:
- {id: filelist, type: File}
outputs:
- id: filelist
  outputBinding: {glob: renamed-filelist.txt}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: $(inputs.filelist), entryname: renamed-filelist.txt}
- {class: InlineJavascriptRequirement}
