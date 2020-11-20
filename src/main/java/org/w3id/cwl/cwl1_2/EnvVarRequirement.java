package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#EnvVarRequirement</I><BR>This interface is implemented by {@link EnvVarRequirementImpl}<BR> <BLOCKQUOTE>
 Define a list of environment variables which will be set in the
 execution environment of the tool.  See `EnvironmentDef` for details.
  </BLOCKQUOTE>
 */
public interface EnvVarRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/class</I><BR>
   * <BLOCKQUOTE>
   * Always 'EnvVarRequirement'   * </BLOCKQUOTE>
   */

  EnvVarRequirement_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#EnvVarRequirement/envDef</I><BR>
   * <BLOCKQUOTE>
   * The list of environment variables.   * </BLOCKQUOTE>
   */

  java.util.List<Object> getEnvDef();
}
