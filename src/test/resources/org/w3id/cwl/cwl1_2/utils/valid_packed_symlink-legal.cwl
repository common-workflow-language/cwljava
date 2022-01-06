arguments:
- mkdir
- adir
- {shellQuote: false, valueFrom: ' && '}
- echo
- Who's gonna drive you home
- {shellQuote: false, valueFrom: '> adir/original.txt'}
- {shellQuote: false, valueFrom: ' && '}
- ln
- -s
- adir/original.txt
- symlink.txt
class: CommandLineTool
cwlVersion: v1.2
doc: Create a file under adir/, symlink it to working directory (./) and glob symlink.
  The executor should resolve this symlink
hints:
  DockerRequirement: {dockerPull: alpine}
inputs: []
outputs:
- id: output_file
  outputBinding: {glob: symlink.txt}
  type: File
requirements:
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
