package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#Dirent</I><br>
 * This interface is implemented by {@link DirentImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Define a file or subdirectory that must be placed in the designated output directory prior to
 * executing the command line tool. May be the result of executing an expression, such as building a
 * configuration file from a template.
 *
 * </BLOCKQUOTE>
 */
public interface Dirent extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#entryname</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The name of the file or subdirectory to create in the output directory. If `entry` is a File or
   * Directory, the `entryname` field overrides the value of `basename` of the File or Directory
   * object. Optional. *
   *
   * </BLOCKQUOTE>
   */
  Object getEntryname();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#entry</I><br>
   *
   * <BLOCKQUOTE>
   *
   * If the value is a string literal or an expression which evaluates to a string, a new file must
   * be created with the string as the file contents.
   *
   * <p>If the value is an expression that evaluates to a `File` object, this indicates the
   * referenced file should be added to the designated output directory prior to executing the tool.
   *
   * <p>If the value is an expression that evaluates to a `Dirent` object, this indicates that the
   * File or Directory in `entry` should be added to the designated output directory with the name
   * in `entryname`.
   *
   * <p>If `writable` is false, the file may be made available using a bind mount or file system
   * link to avoid unnecessary copying of the input file. *
   *
   * </BLOCKQUOTE>
   */
  Object getEntry();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Dirent/writable</I><br>
   *
   * <BLOCKQUOTE>
   *
   * If true, the file or directory must be writable by the tool. Changes to the file or directory
   * must be isolated and not visible by any other CommandLineTool process. This may be implemented
   * by making a copy of the original file or directory. Default false (files and directories
   * read-only by default).
   *
   * <p>A directory marked as `writable: true` implies that all files and subdirectories are
   * recursively writable as well. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getWritable();
}
