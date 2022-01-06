baseCommand: touch
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: ids
  inputBinding: {position: 1}
  type: {items: string, type: array}
outputs:
- id: files
  outputBinding: {glob: $(inputs.ids)}
  type: {items: File, type: array}
requirements:
- {class: InlineJavascriptRequirement}
