baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: filelist, type: File}
outputs:
- id: same
  outputBinding: {glob: subdir/$(inputs.filelist.basename)}
  type: File
requirements:
- {class: DockerRequirement, dockerPull: debian:stable-slim}
- {class: InlineJavascriptRequirement}
- {class: InitialWorkDirRequirement, listing: "${\n   return [{\"class\": \"Directory\"\
    ,\n            \"basename\": \"subdir\",\n            \"listing\": [ inputs.filelist\
    \ ]\n            }]}\n"}
