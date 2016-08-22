
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

public interface Sink {

  /*****************************************************************************************************
  *
  *  The method to use to merge multiple inbound links into a single array. If not specified, the default method is merge_nested.
  */
  LinkMergeMethod linkMerge = null;

  /*****************************************************************************************************
  *
  *  Specifies one or more workflow parameters that will provide input to the underlying step parameter.
  */
  Object source = null;


  /*****************************************************************************************************
  *
  *  This method sets the value of linkMerge.
  *
  *  @param   value will update linkMerge, which is a LinkMergeMethod type.
  *
  */
  public void setlinkMerge( LinkMergeMethod value );

  /*****************************************************************************************************
  *
  *  This method returns the value of linkMerge.
  *
  *  @return   This method will return the value of linkMerge, which is a LinkMergeMethod type.
  *
  */
  public LinkMergeMethod getlinkMerge();
  /*****************************************************************************************************
  *
  *  This method sets the value of source.
  *
  *  @param   value will update source, which is a String type.
  *
  */
  public void setsource( String value );

  /*****************************************************************************************************
  *
  *  This method sets the value of source.
  *
  *  @param   value will update source, which is a String array.
  *
  */
  public void setsource( String [] value );

  /*****************************************************************************************************
  *
  *  This method returns the value of source.
  *
  *  @return   This method will return the value of source, which is a Object type.
  *
  */
  public Object getsource();
}