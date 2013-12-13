/**
 */
package fr.nantes.univ.alma.mvc.mvc.impl;

import fr.nantes.univ.alma.mvc.mvc.MainPackage;
import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;
import fr.nantes.univ.alma.mvc.mvc.UIApplication;
import fr.nantes.univ.alma.mvc.mvc.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl#getAllModels <em>All Models</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl#getAllViews <em>All Views</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainPackageImpl extends MinimalEObjectImpl.Container implements MainPackage
{
  /**
   * The cached value of the '{@link #getAllModels() <em>All Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllModels()
   * @generated
   * @ordered
   */
  protected EList<Model> allModels;

  /**
   * The cached value of the '{@link #getAllViews() <em>All Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllViews()
   * @generated
   * @ordered
   */
  protected EList<View> allViews;

  /**
   * The cached value of the '{@link #getApp() <em>App</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApp()
   * @generated
   * @ordered
   */
  protected UIApplication app;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainPackageImpl()
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
    return MvcPackage.Literals.MAIN_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Model> getAllModels()
  {
    if (allModels == null)
    {
      allModels = new EObjectContainmentEList<Model>(Model.class, this, MvcPackage.MAIN_PACKAGE__ALL_MODELS);
    }
    return allModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<View> getAllViews()
  {
    if (allViews == null)
    {
      allViews = new EObjectContainmentEList<View>(View.class, this, MvcPackage.MAIN_PACKAGE__ALL_VIEWS);
    }
    return allViews;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIApplication getApp()
  {
    return app;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApp(UIApplication newApp, NotificationChain msgs)
  {
    UIApplication oldApp = app;
    app = newApp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcPackage.MAIN_PACKAGE__APP, oldApp, newApp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApp(UIApplication newApp)
  {
    if (newApp != app)
    {
      NotificationChain msgs = null;
      if (app != null)
        msgs = ((InternalEObject)app).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcPackage.MAIN_PACKAGE__APP, null, msgs);
      if (newApp != null)
        msgs = ((InternalEObject)newApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcPackage.MAIN_PACKAGE__APP, null, msgs);
      msgs = basicSetApp(newApp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MAIN_PACKAGE__APP, newApp, newApp));
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
      case MvcPackage.MAIN_PACKAGE__ALL_MODELS:
        return ((InternalEList<?>)getAllModels()).basicRemove(otherEnd, msgs);
      case MvcPackage.MAIN_PACKAGE__ALL_VIEWS:
        return ((InternalEList<?>)getAllViews()).basicRemove(otherEnd, msgs);
      case MvcPackage.MAIN_PACKAGE__APP:
        return basicSetApp(null, msgs);
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
      case MvcPackage.MAIN_PACKAGE__ALL_MODELS:
        return getAllModels();
      case MvcPackage.MAIN_PACKAGE__ALL_VIEWS:
        return getAllViews();
      case MvcPackage.MAIN_PACKAGE__APP:
        return getApp();
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
      case MvcPackage.MAIN_PACKAGE__ALL_MODELS:
        getAllModels().clear();
        getAllModels().addAll((Collection<? extends Model>)newValue);
        return;
      case MvcPackage.MAIN_PACKAGE__ALL_VIEWS:
        getAllViews().clear();
        getAllViews().addAll((Collection<? extends View>)newValue);
        return;
      case MvcPackage.MAIN_PACKAGE__APP:
        setApp((UIApplication)newValue);
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
      case MvcPackage.MAIN_PACKAGE__ALL_MODELS:
        getAllModels().clear();
        return;
      case MvcPackage.MAIN_PACKAGE__ALL_VIEWS:
        getAllViews().clear();
        return;
      case MvcPackage.MAIN_PACKAGE__APP:
        setApp((UIApplication)null);
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
      case MvcPackage.MAIN_PACKAGE__ALL_MODELS:
        return allModels != null && !allModels.isEmpty();
      case MvcPackage.MAIN_PACKAGE__ALL_VIEWS:
        return allViews != null && !allViews.isEmpty();
      case MvcPackage.MAIN_PACKAGE__APP:
        return app != null;
    }
    return super.eIsSet(featureID);
  }

} //MainPackageImpl
