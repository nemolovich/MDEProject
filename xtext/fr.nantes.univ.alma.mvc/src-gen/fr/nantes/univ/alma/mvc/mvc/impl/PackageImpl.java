/**
 */
package fr.nantes.univ.alma.mvc.mvc.impl;

import fr.nantes.univ.alma.mvc.mvc.Action;
import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.ModelProperty;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;
import fr.nantes.univ.alma.mvc.mvc.UIApplication;
import fr.nantes.univ.alma.mvc.mvc.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl#getViews <em>Views</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl#getModels <em>Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl#getMainApp <em>Main App</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements fr.nantes.univ.alma.mvc.mvc.Package
{
  /**
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
  protected EList<View> views;

  /**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
  protected EList<Model> models;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ModelProperty> properties;

  /**
   * The cached value of the '{@link #getMainApp() <em>Main App</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainApp()
   * @generated
   * @ordered
   */
  protected EList<UIApplication> mainApp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return MvcPackage.Literals.PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getViews()
  {
    if (views == null)
    {
      views = new EObjectContainmentEList<View>(View.class, this, MvcPackage.PACKAGE__VIEWS);
    }
    return views;
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
      models = new EObjectContainmentEList<Model>(Model.class, this, MvcPackage.PACKAGE__MODELS);
    }
    return models;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, MvcPackage.PACKAGE__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ModelProperty>(ModelProperty.class, this, MvcPackage.PACKAGE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UIApplication> getMainApp()
  {
    if (mainApp == null)
    {
      mainApp = new EObjectContainmentEList<UIApplication>(UIApplication.class, this, MvcPackage.PACKAGE__MAIN_APP);
    }
    return mainApp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MvcPackage.PACKAGE__VIEWS:
        return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
      case MvcPackage.PACKAGE__MODELS:
        return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
      case MvcPackage.PACKAGE__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case MvcPackage.PACKAGE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case MvcPackage.PACKAGE__MAIN_APP:
        return ((InternalEList<?>)getMainApp()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MvcPackage.PACKAGE__VIEWS:
        return getViews();
      case MvcPackage.PACKAGE__MODELS:
        return getModels();
      case MvcPackage.PACKAGE__ACTIONS:
        return getActions();
      case MvcPackage.PACKAGE__PROPERTIES:
        return getProperties();
      case MvcPackage.PACKAGE__MAIN_APP:
        return getMainApp();
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
      case MvcPackage.PACKAGE__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends View>)newValue);
        return;
      case MvcPackage.PACKAGE__MODELS:
        getModels().clear();
        getModels().addAll((Collection<? extends Model>)newValue);
        return;
      case MvcPackage.PACKAGE__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case MvcPackage.PACKAGE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ModelProperty>)newValue);
        return;
      case MvcPackage.PACKAGE__MAIN_APP:
        getMainApp().clear();
        getMainApp().addAll((Collection<? extends UIApplication>)newValue);
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
      case MvcPackage.PACKAGE__VIEWS:
        getViews().clear();
        return;
      case MvcPackage.PACKAGE__MODELS:
        getModels().clear();
        return;
      case MvcPackage.PACKAGE__ACTIONS:
        getActions().clear();
        return;
      case MvcPackage.PACKAGE__PROPERTIES:
        getProperties().clear();
        return;
      case MvcPackage.PACKAGE__MAIN_APP:
        getMainApp().clear();
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
      case MvcPackage.PACKAGE__VIEWS:
        return views != null && !views.isEmpty();
      case MvcPackage.PACKAGE__MODELS:
        return models != null && !models.isEmpty();
      case MvcPackage.PACKAGE__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MvcPackage.PACKAGE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case MvcPackage.PACKAGE__MAIN_APP:
        return mainApp != null && !mainApp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageImpl
