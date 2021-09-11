arguments: [cat]
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
doc: Print the contents of a file to stdout using 'cat' running in a docker container.
hints:
- {class: DockerRequirement, dockerPull: 'python:2-slim'}
inputs:
- id: file1
  inputBinding: {position: 1}
  type: File
- id: numbering
  inputBinding: {position: 0, prefix: -n}
  type: ['null', boolean]
- default: {class: File, location: args.py}
  id: args.py
  inputBinding: {position: -1}
  type: File
outputs:
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
