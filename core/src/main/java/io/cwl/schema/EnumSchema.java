
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public interface EnumSchema {

 Enum type = null;
 String [] symbols = null;

 public void settype( Enum value );

 public Enum gettype();

 public void setsymbols( String [] value );

 public String [] getsymbols();

}