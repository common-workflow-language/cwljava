arguments:
- {prefix: first, valueFrom: $(inputs.first.species)}
- {prefix: second, valueFrom: $(inputs.second)}
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: first
  type:
    fields:
    - name: species
      type:
      - symbols: [homo_sapiens, mus_musculus]
        type: enum
      - 'null'
    type: record
- id: second
  type:
  - 'null'
  - symbols: [homo_sapiens, mus_musculus]
    type: enum
outputs:
- {id: result, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
