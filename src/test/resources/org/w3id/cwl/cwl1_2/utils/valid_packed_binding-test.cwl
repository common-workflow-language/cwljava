arguments: [bwa, mem]
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: 'python:2-slim'}
inputs:
- id: reference
  inputBinding: {position: 2}
  type: File
- id: reads
  inputBinding: {position: 3, prefix: -XXX}
  type:
    inputBinding: {prefix: -YYY}
    items: File
    type: array
- default: {class: File, location: args.py}
  id: '#args.py'
  inputBinding: {position: -1}
  type: File
outputs:
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
