
/*****************************************************************************************************
*
*  Authors:
*          
*          <b> Java SDK for CWL </b>
*          
*            @author Paul Grosu (pgrosu@gmail.com), Northeastern University
*            @version 0.20
*            @since April 28, 2016
*          
*          <p> Alternate SDK (via Avro): 
*          
*            Denis Yuen (denis.yuen@gmail.com)
*          
*          CWL Draft:
*          
*            Peter Amstutz (peter.amstutz@curoverse.com), Curoverse
*            Nebojsa Tijanic (nebojsa.tijanic@sbgenomics.com), Seven Bridges Genomics
*          
*            Contributors:
*          
*            Luka Stojanovic (luka.stojanovic@sbgenomics.com), Seven Bridges Genomics
*            John Chilton (jmchilton@gmail.com), Galaxy Project, Pennsylvania State University
*            Michael R. Crusoe (crusoe@ucdavis.edu), University of California, Davis
*            Herve Menager (herve.menager@gmail.com), Institut Pasteur
*            Maxim Mikheev (mikhmv@biodatomics.com), BioDatomics
*            Stian Soiland-Reyes (soiland-reyes@cs.manchester.ac.uk), University of Manchester
*
*****************************************************************************************************/

package org.commonwl.util;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

/*****************************************************************************************************
*
*  This is used reading and processing a JSON file.
*/
public class JSONReader {
	
  /*****************************************************************************************************
  *
  *   The String used for storing the JSON filename.  
  */
	String JSON_FILE;

  /*****************************************************************************************************
  *
  *   The String used for storing the key of the root of a JSON file's contents.  
  */  
	String ROOT_KEY;

  /*****************************************************************************************************
  *
  *   The key-value pairs in a JSON file that sit underneath the root key in a JSON file.  
  */  
  Map <String,String> jsonMap = new HashMap<String,String>();

	public JSONReader( String jsonFile ) {
		this.JSON_FILE = jsonFile;
	}

  /*****************************************************************************************************
  *
  *  This method will process a JSON file an store it's contents.
  *
  *  @throws   java.lang.Exception is thrown if there issues with reading the file.
  */
	public void processFile() throws Exception {

    FileReader reader = new FileReader( JSON_FILE );

    JSONParser parser = new JSONParser();

    JSONObject jsonObject = (JSONObject) parser.parse(reader);

     Set keys = jsonObject.keySet();

     for( Object root : keys ) {
     		ROOT_KEY = (String) root;
        Map <String,String> mapSubKeys = (Map <String,String>) jsonObject.get( root );

        for( Object subKey : mapSubKeys.keySet() ) {
        	jsonMap.put( new String( root + "." + (String) subKey ), mapSubKeys.get( subKey ) );
        }
     }

  }

  /*****************************************************************************************************
  *
  *  This method is used to request the value using a key in the processed JSON file.
  *
  *  @param    key is a particular key, which is a String.
  *
  *  @return   a String value for a particular key.
  *
  */
  public String getValue( String key ) {
  	return jsonMap.get(key);
  }
}
