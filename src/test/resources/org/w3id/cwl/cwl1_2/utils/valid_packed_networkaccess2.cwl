arguments:
- -c
- {valueFrom: 'import urllib.request

    assert(urllib.request.urlopen("http://commonwl.org").code == 200)'}
baseCommand: python
class: CommandLineTool
cwlVersion: v1.2
inputs: []
outputs: []
requirements:
- {class: DockerRequirement, dockerPull: 'python:3'}
- {class: InlineJavascriptRequirement}
