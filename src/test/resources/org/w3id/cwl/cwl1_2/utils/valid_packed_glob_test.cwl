baseCommand: [touch, z, y, x, w, c, b, a]
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: letters
  outputBinding: {glob: '*'}
  type: {items: File, type: array}
requirements:
- {class: InlineJavascriptRequirement}
