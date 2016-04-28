
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

public class CommandInputArraySchema extends InputArraySchema {

  CommandLineBinding inputBinding = null;


  public CommandInputArraySchema() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of inputBinding.
  *
  *  @param   value will update inputBinding, which is a CommandLineBinding type.
  *
  */
  public void setinputBinding( CommandLineBinding value ) {
    inputBinding = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of inputBinding.
  *
  *  @return   This method will return the value of inputBinding, which is a CommandLineBinding type.
  *
  */
  public CommandLineBinding getinputBinding() {
    return inputBinding;
  }

}