package org.w3id.cwl.cwl1_2_0_dev1;

import org.w3id.cwl.cwl1_2_0_dev1.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#InplaceUpdateRequirement</I><br>
 * This interface is implemented by {@link InplaceUpdateRequirementImpl}<br>
 *
 * <BLOCKQUOTE>
 *
 * If `inplaceUpdate` is true, then an implementation supporting this feature may permit tools to
 * directly update files with `writable: true` in InitialWorkDirRequirement. That is, as an
 * optimization, files may be destructively modified in place as opposed to copied and updated.
 *
 * <p>An implementation must ensure that only one workflow step may access a writable file at a
 * time. It is an error if a file which is writable by one workflow step file is accessed (for
 * reading or writing) by any other workflow step running independently. However, a file which has
 * been updated in a previous completed step may be used as input to multiple steps, provided it is
 * read-only in every step.
 *
 * <p>Workflow steps which modify a file must produce the modified file as output. Downstream steps
 * which futher process the file must use the output of previous steps, and not refer to a common
 * input (this is necessary for both ordering and correctness).
 *
 * <p>Workflow authors should provide this in the `hints` section. The intent of this feature is
 * that workflows produce the same results whether or not InplaceUpdateRequirement is supported by
 * the implementation, and this feature is primarily available as an optimization for particular
 * environments.
 *
 * <p>Users and implementers should be aware that workflows that destructively modify inputs may not
 * be repeatable or reproducible. In particular, enabling this feature implies that WorkReuse should
 * not be enabled.
 *
 * </BLOCKQUOTE>
 */
public interface InplaceUpdateRequirement extends ProcessRequirement, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InplaceUpdateRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'InplaceUpdateRequirement' *
   *
   * </BLOCKQUOTE>
   */
  String getClass_();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#InplaceUpdateRequirement/inplaceUpdate</I><br>
   */
  Boolean getInplaceUpdate();
}
