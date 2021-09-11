baseCommand: [bash, script.sh]
class: CommandLineTool
cwlVersion: v1.2
inputs:
- default: liberty
  id: liberty
  type: ['null', string]
outputs:
- {id: out, type: stdout}
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: "echo \\\n  \"My country, 'tis of thee,\" \\\n  \"Sweet land of $(inputs.liberty)\"\n",
    entryname: script.sh}
- {class: InlineJavascriptRequirement}
stdout: out.txt
