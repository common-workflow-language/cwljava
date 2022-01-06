arguments: [-c, "f = open(\"bob.txt\", \"r+\")\nf.seek(8)\nf.write(\"Bob.    \")\n\
    f.close()\n"]
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: python:2-slim}
inputs:
- {id: infile, type: File}
outputs:
- id: outfile
  outputBinding: {glob: bob.txt}
  type: File
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: $(inputs.infile), entryname: bob.txt, writable: true}
- {class: InlineJavascriptRequirement}
