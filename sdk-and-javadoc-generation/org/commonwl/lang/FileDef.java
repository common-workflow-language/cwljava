
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

package org.commonwl.lang;

/*****************************************************************************************************
*
*   Define a file that must be placed in the designated output directory prior to executing the command line tool.  May be the result of executing an expression, such as building a configuration file from a template.
*/
public class FileDef {

  /*****************************************************************************************************
  *
  *  The name of the file to create in the output directory.
  */
  Object filename = null;

  /*****************************************************************************************************
  *
  *   If the value is a string literal or an expression which evaluates to a string, a new file must be created with the string as the file contents.  If the value is an expression that evaluates to a File object, this indicates the referenced file should be added to the designated output directory prior to executing the tool.  Files added in this way may be read-only, and may be provided by bind mounts or file system links to avoid unnecessary copying of the input file.  
  */
  Object fileContent = null;


  public FileDef() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of filename.
  *
  *  @param   value will update filename, which is a String type.
  *
  */
  public void setfilename( String value ) {
    filename = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of filename.
  *
  *  @param   value will update filename, which is a Expression type.
  *
  */
  public void setfilename( Expression value ) {
    filename = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of filename.
  *
  *  @return   This method will return the value of filename, which is a Object type.
  *
  */
  public Object getfilename() {
    return filename;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of fileContent.
  *
  *  @param   value will update fileContent, which is a String type.
  *
  */
  public void setfileContent( String value ) {
    fileContent = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of fileContent.
  *
  *  @param   value will update fileContent, which is a Expression type.
  *
  */
  public void setfileContent( Expression value ) {
    fileContent = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of fileContent.
  *
  *  @return   This method will return the value of fileContent, which is a Object type.
  *
  */
  public Object getfileContent() {
    return fileContent;
  }

}