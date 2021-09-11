arguments: [-c, 'f = open("bob.txt", "r+")

    f.seek(8)

    f.write("Bob.    ")

    f.close()

    ']
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
hints:
- {class: DockerRequirement, dockerPull: 'python:2-slim'}
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
