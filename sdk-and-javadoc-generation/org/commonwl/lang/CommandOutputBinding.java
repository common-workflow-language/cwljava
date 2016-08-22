
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
*  Describes how to generate an output parameter based on the files produced by a CommandLineTool.
*/
public class CommandOutputBinding implements OutputBinding {

  /*****************************************************************************************************
  *
  *  For each file matched in `glob`, read up to the first 64 KiB of text from the file and place it in the `contents` field of the file object for manipulation by `outputEval`.
  */
  Boolean loadContents = null;

  /*****************************************************************************************************
  *
  *  Evaluate an expression to generate the output value.  If `glob` was specified, the value of `self` must be an array containing file objects that were matched.  If no files were matched, `self` must be a zero length array; if a single file was matched, the value of `self` is an array of a single element.  Additionally, if `loadContents` is `true`, the File objects must include up to the first 64 KiB of file contents in the `contents` field.
  */
  Object outputEval = null;

  /*****************************************************************************************************
  *
  *  Find files relative to the output directory, using POSIX glob(3) pathname matching.  If an array is provided, find files that match any pattern in the array.  If an expression is provided, the expression must return a string or an array of strings, which will then be evaluated as one or more glob patterns.  Must only match and return files which actually exist.
  */
  Object glob = null;


  public CommandOutputBinding() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of loadContents.
  *
  *  @param   value will update loadContents, which is a Boolean type.
  *
  */
  public void setloadContents( Boolean value ) {
    loadContents = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of loadContents.
  *
  *  @return   This method will return the value of loadContents, which is a Boolean type.
  *
  */
  public Boolean getloadContents() {
    return loadContents;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outputEval.
  *
  *  @param   value will update outputEval, which is a String type.
  *
  */
  public void setoutputEval( String value ) {
    outputEval = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outputEval.
  *
  *  @param   value will update outputEval, which is a Expression type.
  *
  */
  public void setoutputEval( Expression value ) {
    outputEval = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outputEval.
  *
  *  @return   This method will return the value of outputEval, which is a Object type.
  *
  */
  public Object getoutputEval() {
    return outputEval;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of glob.
  *
  *  @param   value will update glob, which is a String type.
  *
  */
  public void setglob( String value ) {
    glob = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of glob.
  *
  *  @param   value will update glob, which is a String array.
  *
  */
  public void setglob( String [] value ) {
    glob = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of glob.
  *
  *  @param   value will update glob, which is a Expression type.
  *
  */
  public void setglob( Expression value ) {
    glob = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of glob.
  *
  *  @return   This method will return the value of glob, which is a Object type.
  *
  */
  public Object getglob() {
    return glob;
  }

}