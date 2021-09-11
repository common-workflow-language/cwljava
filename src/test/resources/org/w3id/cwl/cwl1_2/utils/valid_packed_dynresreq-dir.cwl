arguments: [$(runtime.cores)]
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: dir, type: Directory}
outputs:
- {id: output, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
- {class: ResourceRequirement, coresMax: '$(inputs.dir.listing[0].size)', coresMin: '$(inputs.dir.listing[0].size)'}
stdout: cores.txt
