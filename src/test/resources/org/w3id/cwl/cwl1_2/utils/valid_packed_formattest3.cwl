$namespaces: {edam: http://edamontology.org/, gx: http://galaxyproject.org/formats/}
$schemas: [EDAM.owl, gx_edam.ttl]
baseCommand: rev
class: CommandLineTool
cwlVersion: v1.2
doc: Reverse each line using the `rev` command
hints:
  DockerRequirement: {dockerPull: debian:stretch-slim}
inputs:
- format: gx:fasta
  id: input
  inputBinding: {}
  type: File
outputs:
- format: $(inputs.input.format)
  id: output
  outputBinding: {glob: output.txt}
  type: File
requirements:
- {class: InlineJavascriptRequirement}
stdout: output.txt
