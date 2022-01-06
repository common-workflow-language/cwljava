class: Workflow
cwlVersion: v1.2
inputs:
- id: record_input
  type:
    fields:
    - {name: f1, secondaryFiles: .s2, type: File}
    - name: f2
      secondaryFiles: .s3
      type: {items: File, type: array}
    type: record
outputs: []
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: record_input, source: record_input}
  out: []
  run:
    arguments: [-f, $(inputs.record_input.f1.path).s2, -a, -f, '$(inputs.record_input.f2[0].path).s3',
      -a, -f, '$(inputs.record_input.f2[1].path).s3']
    baseCommand: test
    class: CommandLineTool
    inputs:
    - id: record_input
      type:
        fields:
        - {name: f1, secondaryFiles: .s2, type: File}
        - name: f2
          secondaryFiles: .s3
          type: {items: File, type: array}
        type: record
    outputs: []
    requirements:
    - {class: InlineJavascriptRequirement}
