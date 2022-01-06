baseCommand: 'true'
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: d, loadListing: deep_listing, type: Directory}
outputs:
- id: out
  outputBinding: {outputEval: '$(inputs.d.listing.length === 1 && inputs.d.listing[0].listing.length
      === 1)'}
  type: boolean
requirements:
- {class: InlineJavascriptRequirement}
