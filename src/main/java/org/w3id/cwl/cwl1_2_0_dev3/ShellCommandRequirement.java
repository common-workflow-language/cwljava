package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#ShellCommandRequirement</I><br>
 * This interface is implemented by {@link ShellCommandRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Modify the behavior of CommandLineTool to generate a single string containing a shell command
 * line. Each item in the argument list must be joined into a string separated by single spaces and
 * quoted to prevent intepretation by the shell, unless `CommandLineBinding` for that argument
 * contains `shellQuote: false`. If `shellQuote: false` is specified, the argument is joined into
 * the command string without quoting, which allows the use of shell metacharacters such as `|` for
 * pipes.
 *
 * </BLOCKQUOTE>
 */
public interface ShellCommandRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#ShellCommandRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'ShellCommandRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
}
