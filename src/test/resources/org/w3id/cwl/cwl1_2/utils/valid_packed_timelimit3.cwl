baseCommand: [sleep, '15']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs: []
requirements:
- {class: ToolTimeLimit, timelimit: 0}
- {class: WorkReuse, enableReuse: false}
- {class: InlineJavascriptRequirement}
