class: Workflow
cwlVersion: v1.2
inputs:
- id: inp1
  type:
    items:
      fields:
      - {name: instr, type: string}
      name: instr
      type: record
    type: array
- id: inp2
  type: {items: string, type: array}
outputs:
- id: out
  outputSource: step1/echo_out
  type:
    items: {items: string, type: array}
    type: array
requirements:
- {class: ScatterFeatureRequirement}
- {class: StepInputExpressionRequirement}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: echo_in1, source: inp1, valueFrom: $(self.instr)}
  - {id: echo_in2, source: inp2}
  - {id: first, source: inp1, valueFrom: '$(self[0].instr)'}
  out: [echo_out]
  run:
    arguments: [-n, foo]
    baseCommand: echo
    class: CommandLineTool
    id: step1command
    inputs:
    - id: first
      inputBinding: {position: 1}
      type: string
    - id: echo_in1
      inputBinding: {position: 2}
      type: string
    - id: echo_in2
      inputBinding: {position: 3}
      type: string
    outputs:
    - id: echo_out
      outputBinding: {glob: step1_out, loadContents: true, outputEval: '$(self[0].contents)'}
      type: string
    requirements:
    - {class: InlineJavascriptRequirement}
    stdout: step1_out
  scatter: [echo_in1, echo_in2]
  scatterMethod: nested_crossproduct
