package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#EnvVarRequirement</I><br>
 * This interface is implemented by {@link EnvVarRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Define a list of environment variables which will be set in the execution environment of the
 * tool. See `EnvironmentDef` for details.
 *
 * </BLOCKQUOTE>
 */
public interface EnvVarRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'EnvVarRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/envDef</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of environment variables. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getEnvDef();
}
