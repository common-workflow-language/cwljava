arguments:
- {shellQuote: false, valueFrom: "echo \"cow\" > \"$(runtime.outdir)/foo\" &&\necho\
    \ \"moo\" > \"$(runtime.tmpdir)/foo\" &&\necho '{\"foo\": {\"path\": \"$(runtime.outdir)/foo\"\
    , \"class\": \"File\"} }' > cwl.output.json\n"}
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- {id: foo, type: File}
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
