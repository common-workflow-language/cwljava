
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
*  Represents a directory to present to a command line tool.
*/
public class Directory {

  /*****************************************************************************************************
  *
  *  The local path where the Directory is made available prior to executing a CommandLineTool.  This must be set by the implementation.  This field must not be used in any other context.  The command line tool being executed must be able to to access the directory at `path` using the POSIX `opendir(2)` syscall. If the `path` contains [POSIX shell metacharacters](http://pubs.opengroup.org/onlinepubs/9699919799/utilities/V3_chap02.html#tag_18_02) (`|`,`{@literal &}`, `;`, `(`, `)`, `(`,`)`, `$`,`` ` ``, `\`, ``, `'`, `(space)`, `(tab)`, and `(newline)`) or characters [not allowed](http://www.iana.org/assignments/idna-tables-6.3.0/idna-tables-6.3.0.xhtml) for [Internationalized Domain Names for Applications](https://tools.ietf.org/html/rfc6452) then implementations may terminate the process with a `permanentFailure`.
  */
  String path = null;

  /*****************************************************************************************************
  *
  *  The base name of the directory, that is, the name of the file without any leading directory path.  The base name must not contain a slash `/`. If not provided, the implementation must set this field based on the `location` field by taking the final path component after parsing `location` as an IRI.  If `basename` is provided, it is not required to match the value from `location`. When this file is made available to a CommandLineTool, it must be named with `basename`, i.e. the final component of the `path` field must match `basename`.
  */
  String basename = null;

  /*****************************************************************************************************
  *
  *  An IRI that identifies the directory resource.  This may be a relative reference, in which case it must be resolved using the base IRI of the document.  The location may refer to a local or remote resource.  If the `listing` field is not set, the implementation must use the location IRI to retrieve directory listing.  If an implementation is unable to retrieve the directory listing stored at a remote resource (due to unsupported protocol, access denied, or other issue) it must signal an error. If the `location` field is not provided, the `listing` field must be provided.  The implementation must assign a unique identifier for the `location` field. If the `path` field is provided but the `location` field is not, an implementation may assign the value of the `path` field to `location`, then follow the rules above.
  */
  String location = null;

  /*****************************************************************************************************
  *
  *  List of files or subdirectories contained in this directory.  The name of each file or subdirectory is determined by the `basename` field of each `File` or `Directory` object.  It is an error if a `File` shares a `basename` with any other entry in `listing`.  If two or more `Directory` object share the same `basename`, this must be treated as equivalent to a single subdirectory with the listings recursively merged.
  */
  Object listing = null;

  /*****************************************************************************************************
  *
  *  Must be `Directory` to indicate this object describes a Directory.
  */
  Directory class_value = null;


  public Directory() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of path.
  *
  *  @param   value will update path, which is a String type.
  *
  */
  public void setpath( String value ) {
    path = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of path.
  *
  *  @return   This method will return the value of path, which is a String type.
  *
  */
  public String getpath() {
    return path;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of basename.
  *
  *  @param   value will update basename, which is a String type.
  *
  */
  public void setbasename( String value ) {
    basename = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of basename.
  *
  *  @return   This method will return the value of basename, which is a String type.
  *
  */
  public String getbasename() {
    return basename;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of location.
  *
  *  @param   value will update location, which is a String type.
  *
  */
  public void setlocation( String value ) {
    location = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of location.
  *
  *  @return   This method will return the value of location, which is a String type.
  *
  */
  public String getlocation() {
    return location;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of listing.
  *
  *  @param   value will update listing, which is a File array.
  *
  */
  public void setlisting( File [] value ) {
    listing = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of listing.
  *
  *  @param   value will update listing, which is a Directory array.
  *
  */
  public void setlisting( Directory [] value ) {
    listing = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of listing.
  *
  *  @return   This method will return the value of listing, which is a Object type.
  *
  */
  public Object getlisting() {
    return listing;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of class_value.
  *
  *  @param   value will update class_value, which is a Directory type.
  *
  */
  public void setclass( Directory value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a Directory type.
  *
  */
  public Directory getclass() {
    return class_value;
  }

}