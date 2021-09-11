class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- {id: ya_empty, outputSource: second/ya, type: File}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: first
  in: []
  out: [deep_dir]
  run:
    baseCommand: [mkdir, -p, deeply/nested/dir/structure]
    class: CommandLineTool
    inputs: []
    outputs:
    - id: deep_dir
      outputBinding: {glob: deeply}
      type: Directory
    requirements:
    - {class: InlineJavascriptRequirement}
- id: second
  in:
  - {id: dir, source: first/deep_dir}
  out: [ya]
  run:
    baseCommand: [touch, deeply/nested/dir/structure/ya]
    class: CommandLineTool
    inputs:
    - {id: dir, type: Directory}
    outputs:
    - id: ya
      outputBinding: {glob: deeply/nested/dir/structure/ya}
      type: File
    requirements:
    - class: InitialWorkDirRequirement
      listing:
      - {entry: $(inputs.dir), writable: true}
    - {class: InlineJavascriptRequirement}
