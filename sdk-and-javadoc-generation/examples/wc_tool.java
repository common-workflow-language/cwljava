import org.commonwl.lang.*;
import org.commonwl.util.*;

  public class wc_tool {

  public wc_tool() { }

  public Object build() {

    CommandLineTool CWL = new CommandLineTool();

    CommandInputParameter [] inputs = new CommandInputParameter[1];
    inputs[0] = new CommandInputParameter();
    inputs[0].setid( "file1" );
    inputs[0].settype( "File" );
    CWL.setinputs( inputs );

    CommandOutputParameter [] outputs = new CommandOutputParameter[1];
    outputs[0] = new CommandOutputParameter();
    outputs[0].setid( "output" );
    outputs[0].settype( "File" );
    CWL.setoutputs( outputs );

    CWL.setbaseCommand( "[wc]" );

    CWL.setstdin( "$(inputs.file1.path)" );

    CWL.setstdout( "output" );

    return CWL;
  }

}
