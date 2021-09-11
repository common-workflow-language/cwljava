class: Workflow
cwlVersion: v1.2
inputs:
- {id: input1, type: Any}
- id: input2
  type: {items: Any, type: array}
- {id: input3, type: Any}
outputs:
- id: output1
  outputSource: input1
  type: {items: string, type: array}
- id: output2
  outputSource: input2
  type: {items: string, type: array}
- {id: output3, outputSource: input3, type: string}
requirements:
- {class: SubworkflowFeatureRequirement}
- {class: InlineJavascriptRequirement}
steps: []
