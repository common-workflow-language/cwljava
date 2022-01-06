class: Workflow
cwlVersion: v1.2
inputs:
- {id: in, type: string}
outputs:
- {id: out, outputSource: step1/out, type: File}
requirements:
- class: EnvVarRequirement
  envDef: {TEST_ENV: override}
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps:
- id: step1
  in:
  - {id: in, source: in}
  out: [out]
  run:
    baseCommand: [/bin/sh, -c, echo $TEST_ENV]
    class: CommandLineTool
    inputs:
    - {id: in, type: string}
    outputs:
    - id: out
      outputBinding: {glob: out}
      type: File
    requirements:
    - class: EnvVarRequirement
      envDef: {TEST_ENV: $(inputs.in)}
    - {class: InlineJavascriptRequirement}
    stdout: out
