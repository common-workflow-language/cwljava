arguments:
- {shellQuote: false, valueFrom: echo foo 1>&2}
class: CommandLineTool
cwlVersion: v1.2
doc: Test of capturing stderr output in a docker container.
inputs: []
outputs:
- {id: output_file, type: stderr}
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stderr: std.err
