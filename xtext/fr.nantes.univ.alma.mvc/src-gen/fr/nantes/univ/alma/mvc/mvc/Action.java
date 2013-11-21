/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Action#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Action#getNextPage <em>Next Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
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
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Next Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Page</em>' reference.
   * @see #setNextPage(View)
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getAction_NextPage()
   * @model
   * @generated
   */
  View getNextPage();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.Action#getNextPage <em>Next Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Page</em>' reference.
   * @see #getNextPage()
   * @generated
   */
  void setNextPage(View value);

} // Action
