baseCommand: [echo, '0']
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs:
- id: out
  outputBinding: {glob: a.txt, loadContents: true, outputEval: "${\n    return parseFloat(self[0].contents);\n\
      }"}
  type: ['null', float]
requirements:
- {class: InlineJavascriptRequirement}
stdout: a.txt
