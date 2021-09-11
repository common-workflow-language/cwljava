arguments: [foo 1>&2]
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
doc: 'Ensure that `shellQuote: true` is the default behavior when

  ShellCommandRequirement is in effect.

  '
inputs: []
outputs:
- {id: stdout_file, type: stdout}
- {id: stderr_file, type: stderr}
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
