baseCommand: cat
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: dir1
  inputBinding: {valueFrom: '$(self.listing[0].listing[0].path)'}
  type: Directory
outputs:
- id: output_file
  outputBinding: {glob: output.txt}
  type: File
requirements: []
stdout: output.txt
