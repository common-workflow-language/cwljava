
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
*  Define a file or subdirectory that must be placed in the designated output directory prior to executing the command line tool.  May be the result of executing an expression, such as building a configuration file from a template.
*/
public class Dirent {

  /*****************************************************************************************************
  *
  *  If the value is a string literal or an expression which evaluates to a string, a new file must be created with the string as the file contents. If the value is an expression that evaluates to a `File` object, this indicates the referenced file should be added to the designated output directory prior to executing the tool. If the value is an expression that evaluates to a `Dirent` object, this indicates that the File or Directory in `entry` should be added to the designated output directory with the name in `entryname`. If `writable` is false, the file may be made available using a bind mount or file system link to avoid unnecessary copying of the input file.
  */
  Object entry = null;

  /*****************************************************************************************************
  *
  *  The name of the file or subdirectory to create in the output directory. If `entry` is a File or Directory, this overrides `basename`.  Optional.
  */
  Object entryname = null;

  /*****************************************************************************************************
  *
  *  If true, the file or directory must be writable by the tool.  Changes to the file or directory must be isolated and not visible by any other CommandLineTool process.  This may be implemented by making a copy of the original file or directory.  Default false (files and directories read-only by default).
  */
  Boolean writable = null;


  public Dirent() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of entry.
  *
  *  @param   value will update entry, which is a String type.
  *
  */
  public void setentry( String value ) {
    entry = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of entry.
  *
  *  @param   value will update entry, which is a Expression type.
  *
  */
  public void setentry( Expression value ) {
    entry = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of entry.
  *
  *  @return   This method will return the value of entry, which is a Object type.
  *
  */
  public Object getentry() {
    return entry;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of entryname.
  *
  *  @param   value will update entryname, which is a String type.
  *
  */
  public void setentryname( String value ) {
    entryname = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of entryname.
  *
  *  @param   value will update entryname, which is a Expression type.
  *
  */
  public void setentryname( Expression value ) {
    entryname = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of entryname.
  *
  *  @return   This method will return the value of entryname, which is a Object type.
  *
  */
  public Object getentryname() {
    return entryname;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of writable.
  *
  *  @param   value will update writable, which is a Boolean type.
  *
  */
  public void setwritable( Boolean value ) {
    writable = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of writable.
  *
  *  @return   This method will return the value of writable, which is a Boolean type.
  *
  */
  public Boolean getwritable() {
    return writable;
  }

}