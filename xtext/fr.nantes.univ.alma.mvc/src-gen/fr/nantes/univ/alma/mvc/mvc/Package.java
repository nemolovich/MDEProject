/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Package#getViews <em>Views</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Package#getModels <em>Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Package#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Package#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.Package#getMainApp <em>Main App</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Views</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.View}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage_Views()
   * @model containment="true"
   * @generated
   */
  EList<View> getViews();

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage_Models()
   * @model containment="true"
   * @generated
   */
  EList<Model> getModels();

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
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

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
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ModelProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Main App</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.UIApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main App</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main App</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getPackage_MainApp()
   * @model containment="true"
   * @generated
   */
  EList<UIApplication> getMainApp();

} // Package
