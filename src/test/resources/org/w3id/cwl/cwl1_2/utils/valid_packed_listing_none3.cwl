baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: d, loadListing: no_listing, type: Directory}
outputs:
- id: out
  outputBinding: {outputEval: $(inputs.d.listing === undefined)}
  type: boolean
requirements:
- {class: InlineJavascriptRequirement}
