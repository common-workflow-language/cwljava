class: Workflow
cwlVersion: v1.2
inputs: []
outputs:
- id: a
  outputSource: step3/d1out
  type: {items: File, type: array}
- id: b
  outputSource: step3/d2out
  type: {items: File, type: array}
requirements:
- {class: InlineJavascriptRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: step1
  in:
  - {default: step1dir, id: dirname}
  out: [out]
  run:
    arguments: [mkdir, $(inputs.dirname)]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: dirname, type: string}
    outputs:
    - id: out
      outputBinding: {glob: $(inputs.dirname)}
      type: Directory
    requirements:
    - {class: InlineJavascriptRequirement}
- id: step2
  in:
  - {id: r, source: step1/out}
  out: [out]
  run:
    arguments: [touch, inp/blurb]
    class: CommandLineTool
    cwlVersion: v1.2
    inputs:
    - {id: r, type: Directory}
    outputs:
    - id: out
      outputBinding: {glob: inp}
      type: Directory
    requirements:
    - class: InitialWorkDirRequirement
      listing:
      - {entry: $(inputs.r), entryname: inp, writable: true}
    - {class: InplaceUpdateRequirement, inplaceUpdate: true}
    - {class: InlineJavascriptRequirement}
- id: step3
  in:
  - {id: d1, source: step1/out}
  - {id: d2, source: step2/out}
  out: [d1out, d2out]
  run:
    class: ExpressionTool
    expression: '$({d1out: inputs.d1.listing, d2out: inputs.d2.listing})'
    inputs:
    - {id: d1, loadListing: shallow_listing, type: Directory}
    - {id: d2, loadListing: shallow_listing, type: Directory}
    outputs:
    - id: d1out
      type: {items: File, type: array}
    - id: d2out
      type: {items: File, type: array}
    requirements:
    - {class: InlineJavascriptRequirement}
