arguments:
- {shellQuote: false, valueFrom: 'echo "cow" > "$(runtime.outdir)/foo" &&

    echo "moo" > "$(runtime.tmpdir)/foo" &&

    echo ''{"foo": {"path": "$(runtime.outdir)/foo", "class": "File"} }'' > cwl.output.json

    '}
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- {id: foo, type: File}
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
