arguments: [python3, $(inputs.script), renamed-filelist.txt]
class: CommandLineTool
cwlVersion: v1.2
doc: "YAML | syntax adds a trailing newline, so in the listing entry\nbelow, it becomes\
  \ a string interpolation -- it evaluates to a string\nconsisting of $(inputs.filelist)\
  \ serialized to JSON and then adding\na newline.  Compare to iwd-passthrough1.cwl\n"
inputs:
- {id: filelist, type: File}
- default: {class: File, location: loadit.py}
  id: script
  type: File
outputs:
- {id: out, type: stdout}
requirements:
- {class: DockerRequirement, dockerPull: python:3-slim}
- class: InitialWorkDirRequirement
  listing:
  - {entry: "$(inputs.filelist)\n", entryname: renamed-filelist.txt}
- {class: InlineJavascriptRequirement}
stdout: out.txt
