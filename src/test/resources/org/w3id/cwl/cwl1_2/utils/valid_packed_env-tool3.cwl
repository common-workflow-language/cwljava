baseCommand: [/bin/bash, -c, echo $TEST_ENV]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: in, type: string}
outputs:
- id: out
  outputBinding: {glob: out}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdout: out
