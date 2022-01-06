baseCommand: cat
class: CommandLineTool
cwlVersion: v1.2
doc: Print the contents of a file to stdout using 'cat' running in a docker container.
hints:
  DockerRequirement: {dockerPull: debian:stretch-slim}
inputs:
- doc: The file that will be copied using 'cat'
  id: file1
  inputBinding: {position: 1}
  label: Input File
  type: File
outputs:
- id: output_file
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
