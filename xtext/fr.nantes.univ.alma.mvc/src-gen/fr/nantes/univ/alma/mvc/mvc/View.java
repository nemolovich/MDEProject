/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.View#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.View#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.View#getModel <em>Model</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.View#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
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
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getView_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.View#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Model)
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getView_Model()
   * @model
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.View#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getView_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // View
