baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: 'python:2-slim'}
inputs:
- id: infile
  inputBinding: {prefix: -cfg, valueFrom: $(self.basename)}
  type: ['null', File]
- default: {class: File, location: args.py}
  id: args.py
  inputBinding: {position: -1}
  type: File
outputs:
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
