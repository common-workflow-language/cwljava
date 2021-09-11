class: Workflow
cwlVersion: v1.2
inputs:
- id: in
  type:
    fields:
    - {name: file1, type: File}
    name: in
    type: record
outputs:
- {id: count_output, outputSource: step2/output, type: int}
requirements:
- {class: StepInputExpressionRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: file1, source: in, valueFrom: $(self.file1)}
  out: [output]
  run:
    baseCommand: [wc, -l]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: file1, type: File}
    outputs:
    - id: output
      outputBinding: {glob: output}
      type: File
    requirements:
    - {class: InlineJavascriptRequirement}
    stdin: $(inputs.file1.path)
    stdout: output
- id: step2
  in:
  - {id: file1, source: step1/output}
  out: [output]
  run:
    class: ExpressionTool
    cwlVersion: v1.2
    expression: '$({''output'': parseInt(inputs.file1.contents)})'
    inputs:
    - {id: file1, loadContents: true, type: File}
    outputs:
    - {id: output, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
