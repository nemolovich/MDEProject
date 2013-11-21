/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.UIApplication#getModels <em>Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.UIApplication#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getUIApplication()
 * @model
 * @generated
 */
public interface UIApplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Models</b></em>' reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getUIApplication_Models()
   * @model
   * @generated
   */
  EList<Model> getModels();

  /**
   * Returns the value of the '<em><b>Pages</b></em>' reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mvc.mvc.View}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' reference list.
   * @see fr.nantes.univ.alma.mvc.mvc.MvcPackage#getUIApplication_Pages()
   * @model
   * @generated
   */
  EList<View> getPages();

} // UIApplication
