arguments: ['true']
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {format: http://example.com/format1, id: regular_input, type: File}
- id: record_input
  type:
    fields:
    - {format: http://example.com/format1, name: f1, type: File}
    - format: http://example.com/format2
      name: f2
      type: {items: File, type: array}
    type: record
outputs: []
requirements:
- {class: InlineJavascriptRequirement}
