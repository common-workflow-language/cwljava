
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

public class CommandLineBinding implements InputBinding {

  /*****************************************************************************************************
  *
  *   If true (default), then the prefix and value must be added as separate command line arguments; if false, prefix and value must be concatenated into a single command line argument.
  */
  Boolean separate = null;

  /*****************************************************************************************************
  *
  *   Join the array elements into a single string with the elements separated by by `itemSeparator`.
  */
  String itemSeparator = null;

  /*****************************************************************************************************
  *
  *  Command line prefix to add before the value.
  */
  String prefix = null;

  /*****************************************************************************************************
  *
  *   If `ShellCommandRequirement` is in the requirements for the current command, this controls whether the value is quoted on the command line (default is true). Use `shellQuote: false` to inject metacharacters for operations such as pipes. 
  */
  Boolean shellQuote = null;

  /*****************************************************************************************************
  *
  *  The sorting key.  Default position is 0.
  */
  Integer position = null;

  /*****************************************************************************************************
  *
  *   If `valueFrom` is a constant string value, use this as the value and apply the binding rules above.  If `valueFrom` is an expression, evaluate the expression to yield the actual value to use to build the command line and apply the binding rules above.  If the inputBinding is associated with an input parameter, the value of `self` in the expression will be the value of the input parameter.  When a binding is part of the `CommandLineTool.arguments` field, the `valueFrom` field is required.
  */
  Object valueFrom = null;


  /*****************************************************************************************************
  *
  *   Only valid when `type: File` or is an array of `items: File`.  Read up to the first 64 KiB of text from the file and place it in the contents field of the file object for use by expressions.  
  */
  Boolean loadContents = null;


  public CommandLineBinding() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of separate.
  *
  *  @param   value will update separate, which is a Boolean type.
  *
  */
  public void setseparate( Boolean value ) {
    separate = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of separate.
  *
  *  @return   This method will return the value of separate, which is a Boolean type.
  *
  */
  public Boolean getseparate() {
    return separate;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of itemSeparator.
  *
  *  @param   value will update itemSeparator, which is a String type.
  *
  */
  public void setitemSeparator( String value ) {
    itemSeparator = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of itemSeparator.
  *
  *  @return   This method will return the value of itemSeparator, which is a String type.
  *
  */
  public String getitemSeparator() {
    return itemSeparator;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of prefix.
  *
  *  @param   value will update prefix, which is a String type.
  *
  */
  public void setprefix( String value ) {
    prefix = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of prefix.
  *
  *  @return   This method will return the value of prefix, which is a String type.
  *
  */
  public String getprefix() {
    return prefix;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of shellQuote.
  *
  *  @param   value will update shellQuote, which is a Boolean type.
  *
  */
  public void setshellQuote( Boolean value ) {
    shellQuote = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of shellQuote.
  *
  *  @return   This method will return the value of shellQuote, which is a Boolean type.
  *
  */
  public Boolean getshellQuote() {
    return shellQuote;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of position.
  *
  *  @param   value will update position, which is a Integer type.
  *
  */
  public void setposition( Integer value ) {
    position = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of position.
  *
  *  @return   This method will return the value of position, which is a Integer type.
  *
  */
  public Integer getposition() {
    return position;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of valueFrom.
  *
  *  @param   value will update valueFrom, which is a String type.
  *
  */
  public void setvalueFrom( String value ) {
    valueFrom = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of valueFrom.
  *
  *  @param   value will update valueFrom, which is a Expression type.
  *
  */
  public void setvalueFrom( Expression value ) {
    valueFrom = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of valueFrom.
  *
  *  @return   This method will return the value of valueFrom, which is a Object type.
  *
  */
  public Object getvalueFrom() {
    return valueFrom;
  }

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

}