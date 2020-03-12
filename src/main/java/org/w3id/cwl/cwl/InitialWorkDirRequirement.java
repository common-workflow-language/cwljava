package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#InitialWorkDirRequirement</I><br>
 * This interface is implemented by {@link InitialWorkDirRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Define a list of files and subdirectories that must be created by the workflow platform in the
 * designated output directory prior to executing the command line tool.
 *
 * </BLOCKQUOTE>
 */
public interface InitialWorkDirRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InitialWorkDirRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * InitialWorkDirRequirement *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#listing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of files or subdirectories that must be placed in the designated output directory
   * prior to executing the command line tool.
   *
   * <p>May be an expression. If so, the expression return value must validate as `{type: array,
   * items: ["null", File, File[], Directory, Directory[], Dirent]}`.
   *
   * <p>Files or Directories which are listed in the input parameters and appear in the
   * `InitialWorkDirRequirement` listing must have their `path` set to their staged location in the
   * designated output directory. If the same File or Directory appears more than once in the
   * `InitialWorkDirRequirement` listing, the implementation must choose exactly one value for
   * `path`; how this value is chosen is undefined. *
   *
   * </BLOCKQUOTE>
   */
  Object getListing();
}
