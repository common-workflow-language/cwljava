
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
*   Represents a file (or group of files if `secondaryFiles` is specified) that must be accessible by tools using standard POSIX file system call API such as open(2) and read(2).
*/
public class File {

  /*****************************************************************************************************
  *
  *  The path to the file.
  */
  String path = null;

  /*****************************************************************************************************
  *
  *  Optional file size.
  */
  Long size = null;

  /*****************************************************************************************************
  *
  *   Optional hash code for validating file integrity.  Currently must be in the form sha1$ + hexidecimal string using the SHA-1 algorithm.
  */
  String checksum = null;

  /*****************************************************************************************************
  *
  *   The format of the file.  This must be a URI of a concept node that represents the file format, preferrably defined within an ontology. If no ontology is available, file formats may be tested by exact match.  Reasoning about format compatability must be done by checking that an input file format is the same, `owl:equivalentClass` or `rdfs:subClassOf` the format required by the input parameter. `owl:equivalentClass` is transitive with `rdfs:subClassOf`, e.g. if `(B) owl:equivalentClass (C)` and `(B) owl:subclassOf (A)` then infer `(C) owl:subclassOf (A)`.  File format ontologies may be provided in the $schema metadata at the root of the document.  If no ontologies are specified in `$schema`, the runtime may perform exact file format matches.  
  */
  String format = null;

  /*****************************************************************************************************
  *
  *   A list of additional files that are associated with the primary file and must be transferred alongside the primary file.  Examples include indexes of the primary file, or external references which must be included when loading primary document.  A file object listed in `secondaryFiles` may itself include `secondaryFiles` for which the same rules apply.
  */
  File [] secondaryFiles = null;

  /*****************************************************************************************************
  *
  *  Must be `File` to indicate this object describes a file.
  */
  File class_value = null;


  public File() { super(); }

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
  *  This method sets the value of size.
  *
  *  @param   value will update size, which is a Long type.
  *
  */
  public void setsize( Long value ) {
    size = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of size.
  *
  *  @return   This method will return the value of size, which is a Long type.
  *
  */
  public Long getsize() {
    return size;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of checksum.
  *
  *  @param   value will update checksum, which is a String type.
  *
  */
  public void setchecksum( String value ) {
    checksum = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of checksum.
  *
  *  @return   This method will return the value of checksum, which is a String type.
  *
  */
  public String getchecksum() {
    return checksum;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of format.
  *
  *  @param   value will update format, which is a String type.
  *
  */
  public void setformat( String value ) {
    format = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of format.
  *
  *  @return   This method will return the value of format, which is a String type.
  *
  */
  public String getformat() {
    return format;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of secondaryFiles.
  *
  *  @param   value will update secondaryFiles, which is a File array.
  *
  */
  public void setsecondaryFiles( File [] value ) {
    secondaryFiles = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of secondaryFiles.
  *
  *  @return   This method will return the value of secondaryFiles, which is a File array.
  *
  */
  public File [] getsecondaryFiles() {
    return secondaryFiles;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of class_value.
  *
  *  @param   value will update class_value, which is a File type.
  *
  */
  public void setclass( File value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a File type.
  *
  */
  public File getclass() {
    return class_value;
  }

}