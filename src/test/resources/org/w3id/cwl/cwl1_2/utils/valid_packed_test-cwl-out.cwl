arguments:
- {shellQuote: false, valueFrom: "echo foo > foo && echo '{\"foo\": {\"path\": \"\
    $(runtime.outdir)/foo\", \"class\": \"File\"} }' > cwl.output.json\n"}
class: CommandLineTool
cwlVersion: v1.2
hints:
  DockerRequirement: {dockerPull: debian:stretch-slim}
inputs: []
outputs:
- {id: foo, type: File}
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
