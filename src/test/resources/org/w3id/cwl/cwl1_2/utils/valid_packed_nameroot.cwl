arguments: [echo, $(inputs.file1.basename), $(inputs.file1.nameroot), $(inputs.file1.nameext)]
baseCommand: []
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: file1, type: File}
outputs:
- {id: b, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
stdout: $(inputs.file1.nameroot).xtx
