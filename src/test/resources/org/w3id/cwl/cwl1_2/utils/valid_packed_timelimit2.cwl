baseCommand: [sleep, '15']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs: []
requirements:
- {class: ToolTimeLimit, timelimit: -1}
- {class: InlineJavascriptRequirement}
