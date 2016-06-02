Dynamic Graph Workflows
=======================

The program was generated using Node.js to demonstrate how one can have a dynamic collection of interactive nodes – created ad hoc – in order to interact and run processes.  The program has a broker (`cwl_node.js`) and a node program (`cwl_node.js`).  One first launches the broker and then an interactive node program on two separate terminal windows, as follows:

```  
node cwl_broker.js

node cwl_node.js 127.0.0.1 4000 interactive
```

The node program is launched with the local IP address and port of the broker, including name of this node (`interactive`).  It is recommended that the node name is kept as ‘interactive’ since it is used by the broker to broadcast information.

Sending Commands on the Interactive node
========================================

Please read the **Dynamic Graph Workflows.pdf** manual for a full description of commands, but below is a example of commands one can run - as this program is still alpha, please wait a second between sending commands:

```
make_node 1
make_node 2
on 1 command="wc"
on 2 input="whale.txt"
from 1 command
from 2 input
run 1 with 2 using input store_as wc_result
from 1 wc_result
on 1 command="ls -l"
on 2 input="*.js"
run 1 with 2 using input store_as ls_result
from 1 ls_result
```

All comments and recommendations are welcome, and please feel free to contribute.

Thank you,

Paul