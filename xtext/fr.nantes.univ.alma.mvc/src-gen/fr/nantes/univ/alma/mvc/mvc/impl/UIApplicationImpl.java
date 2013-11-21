/**
 */
package fr.nantes.univ.alma.mvc.mvc.impl;

import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;
import fr.nantes.univ.alma.mvc.mvc.UIApplication;
import fr.nantes.univ.alma.mvc.mvc.View;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIApplicationImpl extends MinimalEObjectImpl.Container implements UIApplication
{
  /**
   * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
  protected EList<Model> models;

  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<View> pages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIApplicationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MvcPackage.Literals.UI_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Model> getModels()
  {
    if (models == null)
    {
      models = new EObjectResolvingEList<Model>(Model.class, this, MvcPackage.UI_APPLICATION__MODELS);
    }
    return models;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectResolvingEList<View>(View.class, this, MvcPackage.UI_APPLICATION__PAGES);
    }
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MvcPackage.UI_APPLICATION__MODELS:
        return getModels();
      case MvcPackage.UI_APPLICATION__PAGES:
        return getPages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MvcPackage.UI_APPLICATION__MODELS:
        getModels().clear();
        getModels().addAll((Collection<? extends Model>)newValue);
        return;
      case MvcPackage.UI_APPLICATION__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends View>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MvcPackage.UI_APPLICATION__MODELS:
        getModels().clear();
        return;
      case MvcPackage.UI_APPLICATION__PAGES:
        getPages().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MvcPackage.UI_APPLICATION__MODELS:
        return models != null && !models.isEmpty();
      case MvcPackage.UI_APPLICATION__PAGES:
        return pages != null && !pages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UIApplicationImpl
