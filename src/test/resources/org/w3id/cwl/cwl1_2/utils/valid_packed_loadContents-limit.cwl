baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: filelist, loadContents: true, type: File}
outputs: []
requirements:
- {class: InlineJavascriptRequirement}
