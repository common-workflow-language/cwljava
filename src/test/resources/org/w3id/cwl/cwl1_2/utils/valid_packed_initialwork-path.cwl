arguments:
- {shellQuote: false, valueFrom: 'test "$(inputs.file1.path)" = "$(runtime.outdir)/bob.txt"

    '}
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: file1, type: File}
outputs: []
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: $(inputs.file1), entryname: bob.txt}
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
