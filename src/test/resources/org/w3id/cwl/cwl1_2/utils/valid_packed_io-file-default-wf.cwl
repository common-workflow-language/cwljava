class: Workflow
cwlVersion: v1.2
inputs:
- default: {class: File, path: whale.txt}
  id: file1
  type: File
outputs:
- {id: o, outputSource: step1/o, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: catfile1, source: file1}
  out: [o]
  run:
    arguments: [cat, $(inputs.catfile1.path)]
    class: CommandLineTool
    inputs:
    - {id: catfile1, type: File}
    outputs:
    - id: o
      outputBinding: {glob: output}
      type: File
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: output
