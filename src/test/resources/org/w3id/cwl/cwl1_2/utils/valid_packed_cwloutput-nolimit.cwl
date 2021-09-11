arguments: [python, $(inputs.script)]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- default: {class: File, location: mkfilelist.py}
  id: script
  type: File
outputs:
- id: filelist
  type: {items: string, type: array}
requirements:
- {class: DockerRequirement, dockerPull: 'python:3-slim'}
- {class: InlineJavascriptRequirement}
