arguments: [exit, '7']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: code
  outputBinding: {outputEval: $(runtime.exitCode)}
  type: int
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
successCodes: [7]
