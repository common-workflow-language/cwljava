baseCommand: [sleep, '15']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs: []
requirements:
- {class: InlineJavascriptRequirement}
- {class: ToolTimeLimit, timelimit: $(1+2)}
- {class: WorkReuse, enableReuse: false}
