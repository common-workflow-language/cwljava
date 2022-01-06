arguments: [$(runtime.cores)]
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- default: {class: File, location: special_file}
  id: special_file
  type: File
outputs:
- {id: output, type: stdout}
requirements:
- {class: ResourceRequirement, coresMax: $(inputs.special_file.size), coresMin: $(inputs.special_file.size)}
- {class: InlineJavascriptRequirement}
stdout: cores.txt
