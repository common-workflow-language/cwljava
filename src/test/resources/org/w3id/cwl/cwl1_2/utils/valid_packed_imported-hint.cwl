baseCommand: [/bin/sh, -c, echo $TEST_ENV]
class: CommandLineTool
cwlVersion: v1.2
hints:
- class: EnvVarRequirement
  envDef:
  - {envName: TEST_ENV, envValue: hello test env}
inputs: []
outputs:
- {id: out, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
stdout: out
