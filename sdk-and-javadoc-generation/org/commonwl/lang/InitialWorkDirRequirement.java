
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
*  Define a list of files and subdirectories that must be created by the workflow platform in the designated output directory prior to executing the command line tool.
*/
public class InitialWorkDirRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  The list of files or subdirectories that must be placed in the designated output directory prior to executing the command line tool. May be an expression.  If so, the expression return value must validate as `{type: array, items: [File, Directory]}`.
  */
  Object listing = null;

  /*****************************************************************************************************
  *
  *  InitialWorkDirRequirement
  */
  String class_value = null;


  public InitialWorkDirRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of listing.
  *
  *  @param   value will update listing, which is a Dirent array.
  *
  */
  public void setlisting( Dirent [] value ) {
    listing = value;
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
  *  This method sets the value of listing.
  *
  *  @param   value will update listing, which is a Expression array.
  *
  */
  public void setlisting( Expression [] value ) {
    listing = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of listing.
  *
  *  @param   value will update listing, which is a String array.
  *
  */
  public void setlisting( String [] value ) {
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
  *  @param   value will update class_value, which is a String type.
  *
  */
  public void setclass( String value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a String type.
  *
  */
  public String getclass() {
    return class_value;
  }

}