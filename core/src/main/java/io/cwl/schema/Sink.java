
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public interface Sink {

 Object source = null;

 public void setsource( String value );

 public void setsource( String [] value );

 public Object getsource();

}