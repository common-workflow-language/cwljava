package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#InputRecordField</I><br>
 * This interface is implemented by {@link InputRecordFieldImpl}<br>
 */
public interface InputRecordField
    extends RecordField, FieldBase, InputFormat, LoadContents, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#RecordField/name</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The name of the field *
   *
   * </BLOCKQUOTE>
   */
  String getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A documentation string for this object, or an array of strings which should be concatenated. *
   *
   * </BLOCKQUOTE>
   */
  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The field type *
   *
   * </BLOCKQUOTE>
   */
  Object getType();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A short, human-readable label of this object. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#secondaryFiles</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Provides a pattern or expression specifying files or directories that should be included
   * alongside the primary file. Secondary files may be required or optional. When not explicitly
   * specified, secondary files specified for `inputs` are required and `outputs` are optional. An
   * implementation must include matching Files and Directories in the `secondaryFiles` property of
   * the primary file. These Files and Directories must be transferred and staged alongside the
   * primary file. An implementation may fail workflow execution if a required secondary file does
   * not exist.
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
  Object getSecondaryFiles();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#FieldBase/streamable</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>A value of `true` indicates that the file is read or written sequentially without seeking.
   * An implementation may use this flag to indicate whether it is valid to stream file contents
   * using a named pipe. Default: `false`. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getStreamable();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>This must be one or more IRIs of concept nodes that represents file formats which are
   * allowed as input to this parameter, preferrably defined within an ontology. If no ontology is
   * available, file formats may be tested by exact match. *
   *
   * </BLOCKQUOTE>
   */
  Object getFormat();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadContents</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: File` or is an array of `items: File`.
   *
   * <p>Read up to the first 64 KiB of text from the file and place it in the "contents" field of
   * the file object for use by expressions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<Boolean> getLoadContents();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadListing</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Only valid when `type: Directory` or is an array of `items: Directory`.
   *
   * <p>Specify the desired behavior for loading the `listing` field of a Directory object for use
   * by expressions.
   *
   * <p>The order of precedence for loadListing is:
   *
   * <p>1. `loadListing` on an individual parameter 2. Inherited from `LoadListingRequirement` 3. By
   * default: `no_listing` *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<LoadListingEnum> getLoadListing();
}
