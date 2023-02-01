// Copyright Common Workflow Language project contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Saveable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#File</I><BR>This interface is implemented by {@link FileImpl}<BR> <BLOCKQUOTE>
 Represents a file (or group of files when `secondaryFiles` is provided) that
 will be accessible by tools using standard POSIX file system call API such as
 open(2) and read(2).
 
 Files are represented as objects with `class` of `File`.  File objects have
 a number of properties that provide metadata about the file.
 
 The `location` property of a File is a URI that uniquely identifies the
 file.  Implementations must support the `file://` URI scheme and may support
 other schemes such as `http://` and `https://`.  The value of `location` may also be a
 relative reference, in which case it must be resolved relative to the URI
 of the document it appears in.  Alternately to `location`, implementations
 must also accept the `path` property on File, which must be a filesystem
 path available on the same host as the CWL runner (for inputs) or the
 runtime environment of a command line tool execution (for command line tool
 outputs).
 
 If no `location` or `path` is specified, a file object must specify
 `contents` with the UTF-8 text content of the file.  This is a "file
 literal".  File literals do not correspond to external resources, but are
 created on disk with `contents` with when needed for executing a tool.
 Where appropriate, expressions can return file literals to define new files
 on a runtime.  The maximum size of `contents` is 64 kilobytes.
 
 The `basename` property defines the filename on disk where the file is
 staged.  This may differ from the resource name.  If not provided,
 `basename` must be computed from the last path part of `location` and made
 available to expressions.
 
 The `secondaryFiles` property is a list of File or Directory objects that
 must be staged in the same directory as the primary file.  It is an error
 for file names to be duplicated in `secondaryFiles`.
 
 The `size` property is the size in bytes of the File.  It must be computed
 from the resource and made available to expressions.  The `checksum` field
 contains a cryptographic hash of the file content for use it verifying file
 contents.  Implementations may, at user option, enable or disable
 computation of the `checksum` field for performance or other reasons.
 However, the ability to compute output checksums is required to pass the
 CWL conformance test suite.
 
 When executing a CommandLineTool, the files and secondary files may be
 staged to an arbitrary directory, but must use the value of `basename` for
 the filename.  The `path` property must be file path in the context of the
 tool execution runtime (local to the compute node, or within the executing
 container).  All computed properties should be available to expressions.
 File literals also must be staged and `path` must be set.
 
 When collecting CommandLineTool outputs, `glob` matching returns file paths
 (with the `path` property) and the derived properties. This can all be
 modified by `outputEval`.  Alternately, if the file `cwl.output.json` is
 present in the output, `outputBinding` is ignored.
 
 File objects in the output must provide either a `location` URI or a `path`
 property in the context of the tool execution runtime (local to the compute
 node, or within the executing container).
 
 When evaluating an ExpressionTool, file objects must be referenced via
 `location` (the expression tool does not have access to files on disk so
 `path` is meaningless) or as file literals.  It is legal to return a file
 object with an existing `location` but a different `basename`.  The
 `loadContents` field of ExpressionTool inputs behaves the same as on
 CommandLineTool inputs, however it is not meaningful on the outputs.
 
 An ExpressionTool may forward file references from input to output by using
 the same value for `location`.
  </BLOCKQUOTE>
 */
public interface File extends Saveable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/class</I><BR>
   * <BLOCKQUOTE>
   * Must be `File` to indicate this object describes a file.   * </BLOCKQUOTE>
   */

  File_class getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/location</I><BR>
   * <BLOCKQUOTE>
   * An IRI that identifies the file resource.  This may be a relative
   * reference, in which case it must be resolved using the base IRI of the
   * document.  The location may refer to a local or remote resource; the
   * implementation must use the IRI to retrieve file content.  If an
   * implementation is unable to retrieve the file content stored at a
   * remote resource (due to unsupported protocol, access denied, or other
   * issue) it must signal an error.
   * 
   * If the `location` field is not provided, the `contents` field must be
   * provided.  The implementation must assign a unique identifier for
   * the `location` field.
   * 
   * If the `path` field is provided but the `location` field is not, an
   * implementation may assign the value of the `path` field to `location`,
   * then follow the rules above.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getLocation();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#path</I><BR>
   * <BLOCKQUOTE>
   * The local host path where the File is available when a CommandLineTool is
   * executed.  This field must be set by the implementation.  The final
   * path component must match the value of `basename`.  This field
   * must not be used in any other context.  The command line tool being
   * executed must be able to access the file at `path` using the POSIX
   * `open(2)` syscall.
   * 
   * As a special case, if the `path` field is provided but the `location`
   * field is not, an implementation may assign the value of the `path`
   * field to `location`, and remove the `path` field.
   * 
   * If the `path` contains [POSIX shell metacharacters](http://pubs.opengroup.org/onlinepubs/9699919799/utilities/V3_chap02.html#tag_18_02)
   * (`|`,`&`, `;`, `<`, `>`, `(`,`)`, `$`,`` ` ``, `\`, `"`, `'`,
   * `<space>`, `<tab>`, and `<newline>`) or characters
   * [not allowed](http://www.iana.org/assignments/idna-tables-6.3.0/idna-tables-6.3.0.xhtml)
   * for [Internationalized Domain Names for Applications](https://tools.ietf.org/html/rfc6452)
   * then implementations may terminate the process with a
   * `permanentFailure`.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getPath();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/basename</I><BR>
   * <BLOCKQUOTE>
   * The base name of the file, that is, the name of the file without any
   * leading directory path.  The base name must not contain a slash `/`.
   * 
   * If not provided, the implementation must set this field based on the
   * `location` field by taking the final path component after parsing
   * `location` as an IRI.  If `basename` is provided, it is not required to
   * match the value from `location`.
   * 
   * When this file is made available to a CommandLineTool, it must be named
   * with `basename`, i.e. the final component of the `path` field must match
   * `basename`.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getBasename();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/dirname</I><BR>
   * <BLOCKQUOTE>
   * The name of the directory containing file, that is, the path leading up
   * to the final slash in the path such that `dirname + '/' + basename ==
   * path`.
   * 
   * The implementation must set this field based on the value of `path`
   * prior to evaluating parameter references or expressions in a
   * CommandLineTool document.  This field must not be used in any other
   * context.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getDirname();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/nameroot</I><BR>
   * <BLOCKQUOTE>
   * The basename root such that `nameroot + nameext == basename`, and
   * `nameext` is empty or begins with a period and contains at most one
   * period.  For the purposes of path splitting leading periods on the
   * basename are ignored; a basename of `.cshrc` will have a nameroot of
   * `.cshrc`.
   * 
   * The implementation must set this field automatically based on the value
   * of `basename` prior to evaluating parameter references or expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getNameroot();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/nameext</I><BR>
   * <BLOCKQUOTE>
   * The basename extension such that `nameroot + nameext == basename`, and
   * `nameext` is empty or begins with a period and contains at most one
   * period.  Leading periods on the basename are ignored; a basename of
   * `.cshrc` will have an empty `nameext`.
   * 
   * The implementation must set this field automatically based on the value
   * of `basename` prior to evaluating parameter references or expressions.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getNameext();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/checksum</I><BR>
   * <BLOCKQUOTE>
   * Optional hash code for validating file integrity.  Currently, must be in the form
   * "sha1$ + hexadecimal string" using the SHA-1 algorithm.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getChecksum();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/size</I><BR>
   * <BLOCKQUOTE>
   * Optional file size (in bytes)   * </BLOCKQUOTE>
   */

  Object getSize();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#secondaryFiles</I><BR>
   * <BLOCKQUOTE>
   * A list of additional files or directories that are associated with the
   * primary file and must be transferred alongside the primary file.
   * Examples include indexes of the primary file, or external references
   * which must be included when loading primary document.  A file object
   * listed in `secondaryFiles` may itself include `secondaryFiles` for
   * which the same rules apply.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getSecondaryFiles();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><BR>
   * <BLOCKQUOTE>
   * The format of the file: this must be an IRI of a concept node that
   * represents the file format, preferably defined within an ontology.
   * If no ontology is available, file formats may be tested by exact match.
   * 
   * Reasoning about format compatibility must be done by checking that an
   * input file format is the same, `owl:equivalentClass` or
   * `rdfs:subClassOf` the format required by the input parameter.
   * `owl:equivalentClass` is transitive with `rdfs:subClassOf`, e.g. if
   * `<B> owl:equivalentClass <C>` and `<B> owl:subclassOf <A>` then infer
   * `<C> owl:subclassOf <A>`.
   * 
   * File format ontologies may be provided in the "$schemas" metadata at the
   * root of the document.  If no ontologies are specified in `$schemas`, the
   * runtime may perform exact file format matches.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getFormat();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#File/contents</I><BR>
   * <BLOCKQUOTE>
   * File contents literal.
   * 
   * If neither `location` nor `path` is provided, `contents` must be
   * non-null.  The implementation must assign a unique identifier for the
   * `location` field.  When the file is staged as input to CommandLineTool,
   * the value of `contents` must be written to a file.
   * 
   * If `contents` is set as a result of a Javascript expression,
   * an `entry` in `InitialWorkDirRequirement`, or read in from
   * `cwl.output.json`, there is no specified upper limit on the
   * size of `contents`.  Implementations may have practical limits
   * on the size of `contents` based on memory and storage
   * available to the workflow runner or other factors.
   * 
   * If the `loadContents` field of an `InputParameter` or
   * `OutputParameter` is true, and the input or output File object
   * `location` is valid, the file must be a UTF-8 text file 64 KiB
   * or smaller, and the implementation must read the entire
   * contents of the file and place it in the `contents` field.  If
   * the size of the file is greater than 64 KiB, the
   * implementation must raise a fatal error.
   *    * </BLOCKQUOTE>
   */

  java.util.Optional<String> getContents();
}
