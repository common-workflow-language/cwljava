baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
doc: Can have a file declared directly in InitialWorkDir
inputs: []
outputs:
- id: filelist
  outputBinding: {glob: inp-filelist.txt}
  type: File
- id: testdir
  outputBinding: {glob: testdir}
  type: Directory
requirements:
- class: InitialWorkDirRequirement
  listing:
  - - {class: File, location: ../loadContents/inp-filelist.txt}
    - {class: Directory, location: ../testdir}
- {class: InlineJavascriptRequirement}
