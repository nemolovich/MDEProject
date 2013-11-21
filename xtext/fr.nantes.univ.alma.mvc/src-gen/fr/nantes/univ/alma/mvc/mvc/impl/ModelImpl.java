/**
 */
package fr.nantes.univ.alma.mvc.mvc.impl;

import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.ModelProperty;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedElements()
   * @generated
   * @ordered
   */
  protected EList<Model> ownedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MvcPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MODEL__NAME, oldName, name));
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
      properties = new EObjectContainmentEList<ModelProperty>(ModelProperty.class, this, MvcPackage.MODEL__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Model> getOwnedElements()
  {
    if (ownedElements == null)
    {
      ownedElements = new EObjectResolvingEList<Model>(Model.class, this, MvcPackage.MODEL__OWNED_ELEMENTS);
    }
    return ownedElements;
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
      case MvcPackage.MODEL__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case MvcPackage.MODEL__NAME:
        return getName();
      case MvcPackage.MODEL__PROPERTIES:
        return getProperties();
      case MvcPackage.MODEL__OWNED_ELEMENTS:
        return getOwnedElements();
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
      case MvcPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case MvcPackage.MODEL__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ModelProperty>)newValue);
        return;
      case MvcPackage.MODEL__OWNED_ELEMENTS:
        getOwnedElements().clear();
        getOwnedElements().addAll((Collection<? extends Model>)newValue);
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
      case MvcPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MvcPackage.MODEL__PROPERTIES:
        getProperties().clear();
        return;
      case MvcPackage.MODEL__OWNED_ELEMENTS:
        getOwnedElements().clear();
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
      case MvcPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MvcPackage.MODEL__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case MvcPackage.MODEL__OWNED_ELEMENTS:
        return ownedElements != null && !ownedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
