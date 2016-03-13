package io.cwl;

import org.apache.commons.cli.*;

import java.util.HashMap;
import java.util.logging.Logger;
import com.google.gson.Gson;

/**
 * Created by ellrott on 3/12/16.
 */
public class CWLRunner {
    private static final Logger log= Logger.getLogger( CWLRunner.class.getName() );

    public static void main(String [] args) {
        Options options = new Options();

        options.addOption("v", "version", false, "Get CWL version" );
        options.addOption( Option.builder().longOpt("no-container").build() );
        options.addOption( Option.builder().longOpt("quiet").build() );
        options.addOption( Option.builder().longOpt("conformance-test").build() );
        options.addOption( Option.builder().longOpt( "basedir" )
                .desc( "base working dir" )
                .hasArg()
                .build() );

        CommandLine cmd;
        try {
            CommandLineParser parser = new DefaultParser();
            cmd = parser.parse(options, args);
        } catch ( ParseException exp ) {
            // oops, something went wrong
            System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
            return;
        }

        if (cmd.hasOption("version") ) {
            System.out.println("cwl-javatool 1.0");
            return;
        }

        if (cmd.hasOption("conformance-test")) {
            Gson g = new Gson();
            HashMap out = new HashMap<String,Object>();
            out.put("args", new String[0] );
            System.out.println( g.toJson( out ) );
            return;
        }

    }

}
