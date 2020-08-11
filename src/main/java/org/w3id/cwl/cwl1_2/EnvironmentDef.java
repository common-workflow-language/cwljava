package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#EnvironmentDef</I><BR>This interface is implemented by {@link EnvironmentDefImpl}<BR> <BLOCKQUOTE>
 Define an environment variable that will be set in the runtime environment
 by the workflow platform when executing the command line tool.  May be the
 result of executing an expression, such as getting a parameter from input.
  </BLOCKQUOTE>
 */
public interface EnvironmentDef extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvironmentDef/envName</I><BR>
   * <BLOCKQUOTE>
   * The environment variable name   * </BLOCKQUOTE>
   */

  String getEnvName();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvironmentDef/envValue</I><BR>
   * <BLOCKQUOTE>
   * The environment variable value   * </BLOCKQUOTE>
   */

  Object getEnvValue();
}
