baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: python:2-slim}
inputs:
- id: array_input
  inputBinding: {valueFrom: replacementValue}
  type:
  - {items: File, type: array}
- default: {class: File, location: args.py}
  id: args.py
  inputBinding: {position: -1}
  type: File
outputs:
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
