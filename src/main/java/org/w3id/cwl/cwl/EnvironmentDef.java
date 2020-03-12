package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#EnvironmentDef</I><br>
 * This interface is implemented by {@link EnvironmentDefImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Define an environment variable that will be set in the runtime environment by the workflow
 * platform when executing the command line tool. May be the result of executing an expression, such
 * as getting a parameter from input.
 *
 * </BLOCKQUOTE>
 */
public interface EnvironmentDef extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvironmentDef/envName</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The environment variable name *
   *
   * </BLOCKQUOTE>
   */
  String getEnvName();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvironmentDef/envValue</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The environment variable value *
   *
   * </BLOCKQUOTE>
   */
  Object getEnvValue();
}
