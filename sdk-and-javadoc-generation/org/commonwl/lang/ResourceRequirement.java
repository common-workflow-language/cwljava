
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
*  Specify basic hardware resource requirements.
*/
public class ResourceRequirement implements ProcessRequirement {

  /*****************************************************************************************************
  *
  *  Minimum reserved filesystem based storage for the designated temporary directory, in mebibytes (2**20)
  */
  Object tmpdirMin = null;

  /*****************************************************************************************************
  *
  *  Maximum reserved filesystem based storage for the designated temporary directory, in mebibytes (2**20)
  */
  Object tmpdirMax = null;

  /*****************************************************************************************************
  *
  *  Maximum reserved RAM in mebibytes (2**20)
  */
  Object ramMax = null;

  /*****************************************************************************************************
  *
  *  Maximum reserved number of CPU cores
  */
  Object coresMax = null;

  /*****************************************************************************************************
  *
  *  Minimum reserved RAM in mebibytes (2**20)
  */
  Object ramMin = null;

  /*****************************************************************************************************
  *
  *  Minimum reserved filesystem based storage for the designated output directory, in mebibytes (2**20)
  */
  Object outdirMin = null;

  /*****************************************************************************************************
  *
  *  Minimum reserved number of CPU cores
  */
  Object coresMin = null;

  /*****************************************************************************************************
  *
  *  Maximum reserved filesystem based storage for the designated output directory, in mebibytes (2**20)
  */
  Object outdirMax = null;

  /*****************************************************************************************************
  *
  *  Always 'ResourceRequirement'
  */
  String class_value = null;


  public ResourceRequirement() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMin.
  *
  *  @param   value will update tmpdirMin, which is a Expression type.
  *
  */
  public void settmpdirMin( Expression value ) {
    tmpdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMin.
  *
  *  @param   value will update tmpdirMin, which is a String type.
  *
  */
  public void settmpdirMin( String value ) {
    tmpdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMin.
  *
  *  @param   value will update tmpdirMin, which is a Long type.
  *
  */
  public void settmpdirMin( Long value ) {
    tmpdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of tmpdirMin.
  *
  *  @return   This method will return the value of tmpdirMin, which is a Object type.
  *
  */
  public Object gettmpdirMin() {
    return tmpdirMin;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMax.
  *
  *  @param   value will update tmpdirMax, which is a Expression type.
  *
  */
  public void settmpdirMax( Expression value ) {
    tmpdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMax.
  *
  *  @param   value will update tmpdirMax, which is a String type.
  *
  */
  public void settmpdirMax( String value ) {
    tmpdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of tmpdirMax.
  *
  *  @param   value will update tmpdirMax, which is a Long type.
  *
  */
  public void settmpdirMax( Long value ) {
    tmpdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of tmpdirMax.
  *
  *  @return   This method will return the value of tmpdirMax, which is a Object type.
  *
  */
  public Object gettmpdirMax() {
    return tmpdirMax;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMax.
  *
  *  @param   value will update ramMax, which is a Expression type.
  *
  */
  public void setramMax( Expression value ) {
    ramMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMax.
  *
  *  @param   value will update ramMax, which is a String type.
  *
  */
  public void setramMax( String value ) {
    ramMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMax.
  *
  *  @param   value will update ramMax, which is a Long type.
  *
  */
  public void setramMax( Long value ) {
    ramMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of ramMax.
  *
  *  @return   This method will return the value of ramMax, which is a Object type.
  *
  */
  public Object getramMax() {
    return ramMax;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMax.
  *
  *  @param   value will update coresMax, which is a Expression type.
  *
  */
  public void setcoresMax( Expression value ) {
    coresMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMax.
  *
  *  @param   value will update coresMax, which is a String type.
  *
  */
  public void setcoresMax( String value ) {
    coresMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMax.
  *
  *  @param   value will update coresMax, which is a Integer type.
  *
  */
  public void setcoresMax( Integer value ) {
    coresMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of coresMax.
  *
  *  @return   This method will return the value of coresMax, which is a Object type.
  *
  */
  public Object getcoresMax() {
    return coresMax;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMin.
  *
  *  @param   value will update ramMin, which is a Expression type.
  *
  */
  public void setramMin( Expression value ) {
    ramMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMin.
  *
  *  @param   value will update ramMin, which is a String type.
  *
  */
  public void setramMin( String value ) {
    ramMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of ramMin.
  *
  *  @param   value will update ramMin, which is a Long type.
  *
  */
  public void setramMin( Long value ) {
    ramMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of ramMin.
  *
  *  @return   This method will return the value of ramMin, which is a Object type.
  *
  */
  public Object getramMin() {
    return ramMin;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMin.
  *
  *  @param   value will update outdirMin, which is a Expression type.
  *
  */
  public void setoutdirMin( Expression value ) {
    outdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMin.
  *
  *  @param   value will update outdirMin, which is a String type.
  *
  */
  public void setoutdirMin( String value ) {
    outdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMin.
  *
  *  @param   value will update outdirMin, which is a Long type.
  *
  */
  public void setoutdirMin( Long value ) {
    outdirMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outdirMin.
  *
  *  @return   This method will return the value of outdirMin, which is a Object type.
  *
  */
  public Object getoutdirMin() {
    return outdirMin;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMin.
  *
  *  @param   value will update coresMin, which is a Expression type.
  *
  */
  public void setcoresMin( Expression value ) {
    coresMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMin.
  *
  *  @param   value will update coresMin, which is a String type.
  *
  */
  public void setcoresMin( String value ) {
    coresMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of coresMin.
  *
  *  @param   value will update coresMin, which is a Long type.
  *
  */
  public void setcoresMin( Long value ) {
    coresMin = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of coresMin.
  *
  *  @return   This method will return the value of coresMin, which is a Object type.
  *
  */
  public Object getcoresMin() {
    return coresMin;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMax.
  *
  *  @param   value will update outdirMax, which is a Expression type.
  *
  */
  public void setoutdirMax( Expression value ) {
    outdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMax.
  *
  *  @param   value will update outdirMax, which is a String type.
  *
  */
  public void setoutdirMax( String value ) {
    outdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outdirMax.
  *
  *  @param   value will update outdirMax, which is a Long type.
  *
  */
  public void setoutdirMax( Long value ) {
    outdirMax = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outdirMax.
  *
  *  @return   This method will return the value of outdirMax, which is a Object type.
  *
  */
  public Object getoutdirMax() {
    return outdirMax;
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