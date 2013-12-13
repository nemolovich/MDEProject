/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllModels <em>All Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllViews <em>All Views</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getMainPackage()
 * @model
 * @generated
 */
public interface MainPackage extends EObject
{
  /**
   * Returns the value of the '<em><b>All Models</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Models</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getMainPackage_AllModels()
   * @model containment="true"
   * @generated
   */
  EList<Model> getAllModels();

  /**
   * Returns the value of the '<em><b>All Views</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.View}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Views</em>' containment reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getMainPackage_AllViews()
   * @model containment="true"
   * @generated
   */
  EList<View> getAllViews();

  /**
   * Returns the value of the '<em><b>App</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App</em>' containment reference.
   * @see #setApp(UIApplication)
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getMainPackage_App()
   * @model containment="true"
   * @generated
   */
  UIApplication getApp();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getApp <em>App</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App</em>' containment reference.
   * @see #getApp()
   * @generated
   */
  void setApp(UIApplication value);

} // MainPackage
