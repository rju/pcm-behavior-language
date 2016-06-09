/**
 */
package org.spp.cocome.behavior.behavior;

import org.spp.cocome.types.types.NamedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.spp.cocome.behavior.behavior.TypeReference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends DeclarationTypeReference
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(NamedType)
   * @see org.spp.cocome.behavior.behavior.BehaviorPackage#getTypeReference_Reference()
   * @model
   * @generated
   */
  NamedType getReference();

  /**
   * Sets the value of the '{@link org.spp.cocome.behavior.behavior.TypeReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(NamedType value);

} // TypeReference
