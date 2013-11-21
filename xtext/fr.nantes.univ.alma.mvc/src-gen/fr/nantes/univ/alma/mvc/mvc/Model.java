/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Model#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Model#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Model#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.ModelProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getModel_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ModelProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Owned Elements</b></em>' reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Elements</em>' reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getModel_OwnedElements()
   * @model
   * @generated
   */
  EList<Model> getOwnedElements();

} // Model
