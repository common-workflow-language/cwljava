arguments:
- {prefix: species, valueFrom: $(inputs.first.species)}
- {prefix: ncbi_build, valueFrom: $(inputs.first.ncbi_build)}
baseCommand: echo
class: CommandLineTool
cwlVersion: v1.2
inputs:
- id: first
  type:
    fields:
    - name: species
      type:
      - 'null'
      - symbols: [homo_sapiens, mus_musculus]
        type: enum
    - name: ncbi_build
      type:
      - 'null'
      - symbols: [GRCh37, GRCh38, GRCm38]
        type: enum
    name: user_type_2
    type: record
outputs:
- {id: result, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
