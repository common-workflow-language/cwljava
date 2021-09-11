arguments:
- {position: 0, shellQuote: false, valueFrom: '|'}
- {position: 1, valueFrom: grep}
- {position: 2, valueFrom: secondary}
baseCommand: [ls]
class: CommandLineTool
cwlVersion: v1.2
doc: 'Simple test to confirm the implementation of expressions returning a File within
  a CommandInputParameter.secondaryFile field.


  Use GREP to filter the result from ls to ensure we only get the secondary files
  in there.


  Related links:

  - Issue: https://github.com/common-workflow-language/cwltool/issues/1232

  - PR: https://github.com/common-workflow-language/cwltool/pull/1233

  - Discourse: https://cwl.discourse.group/t/ask-cwl-to-rename-a-secondary-file/72

  '
id: InputSecondaryFileConformanceTest
inputs:
- doc: 'This input will with a secondary file `.accessory`. You could create these
    files (and its accessory) with:

    ```bash

    touch secondary_file_test.txt

    touch secondary_file_test.txt.accessory

    ```

    '
  id: inputWithSecondary
  secondaryFiles: [.accessory, "${\n  function resolveSecondary(base, secPattern)
      {\n    if (secPattern[0] == '^') {\n      var spl = base.split('.');\n      var
      endIndex = spl.length > 1 ? spl.length - 1 : 1;\n      return resolveSecondary(spl.slice(undefined,
      endIndex).join(\".\"), secPattern.slice(1));\n    }\n    return base + secPattern;\n
      \ }\n  return [{\n      \"class\": \"File\",\n      \"location\": self.secondaryFiles[0].location,\n
      \     \"basename\": resolveSecondary(self.basename, '^.accessory')\n  }];\n}\n"]
  type: File
outputs:
- {id: output_file, type: stdout}
requirements:
- {class: InlineJavascriptRequirement}
- {class: ShellCommandRequirement}
- class: InitialWorkDirRequirement
  listing: [$(inputs.inputWithSecondary)]
stdout: result
