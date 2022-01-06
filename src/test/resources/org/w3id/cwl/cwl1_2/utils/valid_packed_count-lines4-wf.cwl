class: Workflow
cwlVersion: v1.2
inputs:
- {id: file1, type: File}
- {id: file2, type: File}
outputs:
- id: count_output
  outputSource: step1/output
  type: {items: int, type: array}
requirements:
- {class: ScatterFeatureRequirement}
- {class: MultipleInputFeatureRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - id: file1
    source: [file1, file2]
  out: [output]
  run:
    baseCommand: wc
    class: CommandLineTool
    inputs:
    - id: file1
      inputBinding: {}
      type: File
    outputs:
    - id: output
      outputBinding: {glob: output.txt, loadContents: true, outputEval: '$(parseInt(self[0].contents))'}
      type: int
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: output.txt
  scatter: file1
