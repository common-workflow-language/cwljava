baseCommand: [mkdir, a_dir, b_dir, c_dir]
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: directories
  outputBinding: {glob: '[a,b,c]_dir'}
  type: {items: Directory, type: array}
requirements:
- {class: InlineJavascriptRequirement}
