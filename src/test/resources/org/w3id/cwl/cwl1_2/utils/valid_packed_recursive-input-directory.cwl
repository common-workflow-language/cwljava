arguments:
- {shellQuote: false, valueFrom: 'touch work_dir/e;

    if [ ! -w work_dir ]; then echo work_dir not writable; fi;

    if [ -L work_dir ]; then echo work_dir is a symlink; fi;

    if [ ! -w work_dir/a ]; then echo work_dir/a not writable; fi;

    if [ -L work_dir/a ]; then echo work_dir/a is a symlink; fi;

    if [ ! -w work_dir/c ]; then echo work_dir/c not writable; fi;

    if [ -L work_dir/c ]; then echo work_dir/c is a symlink; fi;

    if [ ! -w work_dir/c/d ]; then echo work_dir/c/d not writable; fi;

    if [ -L work_dir/c/d ]; then echo work_dir/c/d is a symlink; fi;

    if [ ! -w work_dir/e ]; then echo work_dir/e not writable; fi;

    if [ -L work_dir/e ]; then echo work_dir/e is a symlink ; fi;

    '}
class: CommandLineTool
cwlVersion: v1.2
inputs:
- {id: input_dir, type: Directory}
outputs:
- id: output_dir
  outputBinding: {glob: work_dir}
  type: Directory
- {id: test_result, type: stdout}
requirements:
- class: InitialWorkDirRequirement
  listing:
  - {entry: $(inputs.input_dir), entryname: work_dir, writable: true}
- {class: ShellCommandRequirement}
- {class: InlineJavascriptRequirement}
stdout: output.txt
