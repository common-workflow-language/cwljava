class: Workflow
cwlVersion: v1.2
inputs:
- id: irec
  type:
    fields:
    - {name: ifoo, type: File}
    - {name: ibar, type: File}
    name: irec
    type: record
outputs:
- id: orec
  outputSource: step1/orec
  type:
    fields:
    - {name: ofoo, type: File}
    - {name: obar, type: File}
    name: orec
    type: record
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: irec, source: irec}
  out: [orec]
  run:
    arguments:
    - {position: 1, valueFrom: cat}
    - {position: 3, shellQuote: false, valueFrom: '> foo'}
    - {position: 4, shellQuote: false, valueFrom: '&&'}
    - {position: 5, valueFrom: cat}
    - {position: 7, shellQuote: false, valueFrom: '> bar'}
    class: CommandLineTool
    inputs:
    - id: irec
      type:
        fields:
        - inputBinding: {position: 2}
          name: ifoo
          type: File
        - inputBinding: {position: 6}
          name: ibar
          type: File
        name: irec
        type: record
    outputs:
    - id: orec
      type:
        fields:
        - name: ofoo
          outputBinding: {glob: foo}
          type: File
        - name: obar
          outputBinding: {glob: bar}
          type: File
        name: orec
        type: record
    requirements:
    - {class: ShellCommandRequirement}
    - {class: InlineJavascriptRequirement}
