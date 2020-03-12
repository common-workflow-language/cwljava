package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#SecondaryFileSchema</I><br>
 * This interface is implemented by {@link SecondaryFileSchemaImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * Secondary files are specified using the following micro-DSL for secondary files:
 *
 * <p>If the value is a string, it is transformed to an object with two fields `pattern` and
 * `required` By default, the value of `required` is `null` (this indicates default behavior, which
 * may be based on the context) If the value ends with a question mark `?` the question mark is
 * stripped off and the value of the field `required` is set to `False` The remaining value is
 * assigned to the field `pattern`
 *
 * <p>For implementation details and examples, please see [this
 * section](SchemaSalad.html#Domain_Specific_Language_for_secondary_files) in the Schema Salad
 * specification.
 *
 * </BLOCKQUOTE>
 */
public interface SecondaryFileSchema extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SecondaryFileSchema/pattern</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Provides a pattern or expression specifying files or directories that should be included
   * alongside the primary file.
   *
   * <p>If the value is an expression, the value of `self` in the expression must be the primary
   * input or output File object to which this binding applies. The `basename`, `nameroot` and
   * `nameext` fields must be present in `self`. For `CommandLineTool` outputs the `path` field must
   * also be present. The expression must return a filename string relative to the path to the
   * primary File, a File or Directory object with either `path` or `location` and `basename` fields
   * set, or an array consisting of strings or File or Directory objects. It is legal to reference
   * an unchanged File or Directory object taken from input as a secondaryFile. The expression may
   * return "null" in which case there is no secondaryFile from that expression.
   *
   * <p>To work on non-filename-preserving storage systems, portable tool descriptions should avoid
   * constructing new values from `location`, but should construct relative references using
   * `basename` or `nameroot` instead.
   *
   * <p>If a value in `secondaryFiles` is a string that is not an expression, it specifies that the
   * following pattern should be applied to the path of the primary file to yield a filename
   * relative to the primary File:
   *
   * <p>1. If string ends with `?` character, remove the last `?` and mark the resulting secondary
   * file as optional. 2. If string begins with one or more caret `^` characters, for each caret,
   * remove the last file extension from the path (the last period `.` and all following
   * characters). If there are no file extensions, the path is unchanged. 3. Append the remainder of
   * the string to the end of the file path. *
   *
   * </BLOCKQUOTE>
   */
  Object getPattern();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SecondaryFileSchema/required</I><br>
   *
   * <BLOCKQUOTE>
   *
   * An implementation must not fail workflow execution if `required` is set to `false` and the
   * expected secondary file does not exist. Default value for `required` field is `true` for
   * secondary files on input and `false` for secondary files on output. *
   *
   * </BLOCKQUOTE>
   */
  Object getRequired();
}
