baseCommand: [ls]
class: CommandLineTool
cwlVersion: v1.2
doc: 'Simple test to confirm the implementation of expressions returning a File within
  a CommandOutputParameter.secondaryFile field.


  Related links:

  - Issue: https://github.com/common-workflow-language/cwltool/issues/1232

  - PR: https://github.com/common-workflow-language/cwltool/pull/1233

  - Discourse: https://cwl.discourse.group/t/ask-cwl-to-rename-a-secondary-file/72

  '
id: OutputSecondaryFileConformanceTest
inputs: []
outputs:
- id: output_file
  label: out
  outputBinding: {glob: '*.txt'}
  secondaryFiles: "${\n     function resolveSecondary(base, secPattern) {\n       if
    (secPattern[0] == \"^\") {\n         var spl = base.split(\".\");\n         var
    endIndex = spl.length > 1 ? spl.length - 1 : 1;\n         return resolveSecondary(spl.slice(undefined,
    endIndex).join(\".\"), secPattern.slice(1));\n       }\n       return base + secPattern;\n
    \    }\n     return [\n       {\n         \"class\": \"File\",\n         \"path\":
    resolveSecondary(self.path, \"^.accessory\"),\n         \"basename\": resolveSecondary(self.basename,
    \".accessory\")\n       }\n     ];\n}\n"
  type: File
requirements:
- {class: InlineJavascriptRequirement}
- class: InitialWorkDirRequirement
  listing:
  - {entry: '', entryname: secondary_file_test.txt, writable: true}
  - {entry: '', entryname: secondary_file_test.accessory, writable: true}
