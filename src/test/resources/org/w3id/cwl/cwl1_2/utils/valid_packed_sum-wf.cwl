class: Workflow
cwlVersion: v1.2
inputs:
- id: int_1
  type: [int, string]
- id: int_2
  type: [int, string]
outputs:
- {id: result, outputSource: sum/result, type: int}
requirements:
- {class: StepInputExpressionRequirement}
- {class: MultipleInputFeatureRequirement}
- {class: InlineJavascriptRequirement}
- {class: SubworkflowFeatureRequirement}
steps:
- id: sum
  in:
  - id: data
    source: [int_1, int_2]
    valueFrom: "${\n  var sum = 0;\n  for (var i = 0; i < self.length; i++){\n   \
      \ sum += self[i];\n  };\n  return sum;\n}\n"
  out: [result]
  run:
    class: ExpressionTool
    expression: "${\n  return {\"result\": inputs.data};\n}\n"
    inputs:
    - {id: data, type: int}
    outputs:
    - {id: result, type: int}
    requirements:
    - {class: InlineJavascriptRequirement}
