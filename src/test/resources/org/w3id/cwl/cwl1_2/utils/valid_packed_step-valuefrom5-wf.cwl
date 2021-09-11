class: Workflow
cwlVersion: v1.2
inputs:
- {id: file1, type: File}
outputs:
- {id: val1, outputSource: step1/echo_out, type: string}
- {id: val2, outputSource: step2/echo_out, type: string}
requirements:
- {class: StepInputExpressionRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: name, source: file1, valueFrom: $(self.basename)}
  out: [echo_out, echo_out_file]
  run:
    baseCommand: echo
    class: CommandLineTool
    inputs:
    - id: name
      inputBinding: {}
      type: string
    outputs:
    - id: echo_out
      outputBinding: {glob: step1_out, loadContents: true, outputEval: '$(self[0].contents)'}
      type: string
    - id: echo_out_file
      outputBinding: {glob: step1_out}
      type: File
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: step1_out
- id: step2
  in:
  - {id: name, source: step1/echo_out_file, valueFrom: $(self.basename)}
  out: [echo_out]
  run:
    baseCommand: echo
    class: CommandLineTool
    inputs:
    - id: name
      inputBinding: {}
      type: string
    outputs:
    - id: echo_out
      outputBinding: {glob: step1_out, loadContents: true, outputEval: '$(self[0].contents)'}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: step1_out
