arguments:
- bwa
- mem
- {position: 1, prefix: -t, valueFrom: $(runtime.cores)}
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: ResourceRequirement, coresMin: 2}
- {class: DockerRequirement, dockerPull: python:2-slim}
inputs:
- id: reference
  inputBinding: {position: 2}
  type: File
- id: reads
  inputBinding: {position: 3}
  type: {items: File, type: array}
- id: minimum_seed_length
  inputBinding: {position: 1, prefix: -m}
  type: int
- id: min_std_max_min
  inputBinding: {itemSeparator: ',', position: 1, prefix: -I}
  type: {items: int, type: array}
- default: {class: File, location: args.py}
  id: args.py
  inputBinding: {position: -1}
  type: File
outputs:
- id: sam
  outputBinding: {glob: output.sam}
  type: ['null', File]
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.sam
