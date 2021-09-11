class: Workflow
cwlVersion: v1.2
inputs:
- id: special_file
  type: ['null', File]
outputs:
- {id: cores, outputSource: report/output, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: count
  in:
  - default: {class: File, location: special_file}
    id: special_file
    source: special_file
  out: [output]
  run:
    arguments: [$(runtime.cores)]
    baseCommand: echo
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: special_file, type: File}
    outputs:
    - {id: output, type: stdout}
    requirements:
    - {class: ResourceRequirement, coresMax: $(inputs.special_file.size), coresMin: $(inputs.special_file.size)}
    - {class: InlineJavascriptRequirement}
    stdout: cores.txt
- id: report
  in:
  - {id: file1, source: count/output}
  out: [output]
  run:
    baseCommand: [cat]
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
