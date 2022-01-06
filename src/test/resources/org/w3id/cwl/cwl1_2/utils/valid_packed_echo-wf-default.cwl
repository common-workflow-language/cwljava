class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: default_output, outputSource: step1/out, type: string}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {default: workflow_default, id: in}
  out: [out]
  run:
    baseCommand: [echo, -n]
    class: CommandLineTool
    inputs:
    - default: tool_default
      id: in
      inputBinding: {position: 1}
      type: string
    outputs:
    - id: out
      outputBinding: {glob: out.txt, loadContents: true, outputEval: '$(self[0].contents)'}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: out.txt
