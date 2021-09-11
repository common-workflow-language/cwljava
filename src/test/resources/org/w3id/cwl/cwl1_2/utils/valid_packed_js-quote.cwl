arguments: []
baseCommand: [echo]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {default: Hello, id: quote, type: string}
label: Check for a JS quoting bug
outputs:
- id: out
  outputBinding: {glob: file.txt}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: '${return ''quote "'' + inputs.quote + ''"''}

      ', entryname: file.txt}
  - {entry: 'set -xe

      cat file.txt

      ', entryname: script.sh}
- {class: InlineJavascriptRequirement}
- {class: ResourceRequirement, coresMin: 2, ramMin: 1000}
