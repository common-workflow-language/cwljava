class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: wc_output, outputSource: step1/output, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - default: {class: File, location: whale.txt}
    id: file1
  out: [output]
  run:
    baseCommand: [wc, -l]
    class: CommandLineTool
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
