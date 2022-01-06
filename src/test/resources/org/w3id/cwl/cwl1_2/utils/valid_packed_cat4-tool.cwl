baseCommand: cat
class: CommandLineTool
cwlVersion: v1.2
doc: Print the contents of a file to stdout using 'cat' running in a docker container
  if docker is available.
hints:
  DockerRequirement: {dockerPull: debian:stretch-slim}
inputs:
- {id: file1, type: File}
outputs:
- id: output_txt
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdin: $(inputs.file1.path)
stdout: output.txt
