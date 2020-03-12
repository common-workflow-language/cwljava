package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#SchemaDefRequirement</I><br>
 * This interface is implemented by {@link SchemaDefRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * This field consists of an array of type definitions which must be used when interpreting the
 * `inputs` and `outputs` fields. When a `type` field contain a IRI, the implementation must check
 * if the type is defined in `schemaDefs` and use that definition. If the type is not found in
 * `schemaDefs`, it is an error. The entries in `schemaDefs` must be processed in the order listed
 * such that later schema definitions may refer to earlier schema definitions.
 *
 * </BLOCKQUOTE>
 */
public interface SchemaDefRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'SchemaDefRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#SchemaDefRequirement/types</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The list of type definitions. *
   *
   * </BLOCKQUOTE>
   */
  java.util.List<Object> getTypes();
}
