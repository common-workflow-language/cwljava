arguments: [$(runtime.cores)]
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- {id: output, type: stdout}
requirements:
- {class: ResourceRequirement, coresMax: 1.75, coresMin: 1.25}
- {class: InlineJavascriptRequirement}
stdout: cores.txt
