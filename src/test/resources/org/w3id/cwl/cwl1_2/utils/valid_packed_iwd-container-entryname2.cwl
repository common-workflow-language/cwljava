arguments:
- {shellQuote: false, valueFrom: head -n10 /tmp2j3y7rpb/input/stuff.txt > /output/head.txt}
class: CommandLineTool
cwlVersion: v1.2
doc: "Must fail if entryname is an absolute path and DockerRequirement is\nnot in\
  \ the 'requirements' section.\n"
inputs:
- {id: filelist, type: File}
outputs:
- id: head
  outputBinding: {glob: head.txt}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: $(inputs.filelist), entryname: /tmp2j3y7rpb/input/stuff.txt}
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
