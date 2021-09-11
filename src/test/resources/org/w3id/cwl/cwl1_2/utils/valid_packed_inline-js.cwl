arguments:
- {prefix: -A, valueFrom: $(1+1)}
- {prefix: -B, valueFrom: '$("/foo/bar/baz".split(''/'').slice(-1)[0])'}
- {prefix: -C, valueFrom: "${\n  var r = [];\n  for (var i = 10; i >= 1; i--) {\n
    \   r.push(i);\n  }\n  return r;\n}\n"}
- {prefix: -D, valueFrom: $(true)}
- {prefix: -E, valueFrom: $(false)}
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: 'python:2-slim'}
inputs:
- default: {class: File, location: args.py}
  id: args.py
  inputBinding: {position: -1}
  type: File
outputs:
- id: args
  type: {items: string, type: array}
requirements:
- {class: InlineJavascriptRequirement}
