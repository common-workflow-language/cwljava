import org.commonwl.lang.*;
import org.commonwl.util.*;

  public class wc-tool() {

  public wc-tool() { }

  public Object build() {

    CommandLineTool CWL = new CWL();

    CommandInputParameter [] inputs = new CommandInputParameter[1];
    inputs[0] = new CommandInputParameter();
    inputs[0].setid( "file1" );
    inputs[0].settype( "File" );
    CWL.setinputs( inputs );

    CommandOutputParameter [] outputs = new CommandOutputParameter[1];
    outputs[0] = new CommandInputParameter();
    outputs[0].setid( "output" );
    outputs[0].settype( "File" );
    CWL.setoutputs( outputs );

    CWL.setbaseCommand( "[wc]" );

    CWL.setstdin( "$(inputs.file1.path)" );

    CWL.setstdout( "output" );

    return CWL;
  }

}
