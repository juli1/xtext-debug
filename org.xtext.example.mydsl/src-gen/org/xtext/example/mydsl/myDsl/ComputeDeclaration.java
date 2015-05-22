/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ComputeDeclaration#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ComputeDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComputeDeclaration()
 * @model
 * @generated
 */
public interface ComputeDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writeable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writeable</em>' attribute.
   * @see #setWriteable(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComputeDeclaration_Writeable()
   * @model
   * @generated
   */
  boolean isWriteable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ComputeDeclaration#isWriteable <em>Writeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Writeable</em>' attribute.
   * @see #isWriteable()
   * @generated
   */
  void setWriteable(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComputeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ComputeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ComputeDeclaration
