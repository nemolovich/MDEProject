/**
 */
package fr.nantes.univ.alma.mvc.mvc.impl;

import fr.nantes.univ.alma.mvc.mvc.Action;
import fr.nantes.univ.alma.mvc.mvc.Model;
import fr.nantes.univ.alma.mvc.mvc.ModelProperty;
import fr.nantes.univ.alma.mvc.mvc.MvcFactory;
import fr.nantes.univ.alma.mvc.mvc.MvcPackage;
import fr.nantes.univ.alma.mvc.mvc.UIApplication;
import fr.nantes.univ.alma.mvc.mvc.View;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MvcFactoryImpl extends EFactoryImpl implements MvcFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MvcFactory init()
  {
    try
    {
      MvcFactory theMvcFactory = (MvcFactory)EPackage.Registry.INSTANCE.getEFactory("http://mvc/1.0"); 
      if (theMvcFactory != null)
      {
        return theMvcFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MvcFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MvcFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MvcPackage.PACKAGE: return createPackage();
      case MvcPackage.UI_APPLICATION: return createUIApplication();
      case MvcPackage.VIEW: return createView();
      case MvcPackage.MODEL: return createModel();
      case MvcPackage.ACTION: return createAction();
      case MvcPackage.MODEL_PROPERTY: return createModelProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.nantes.univ.alma.mvc.mvc.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIApplication createUIApplication()
  {
    UIApplicationImpl uiApplication = new UIApplicationImpl();
    return uiApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelProperty createModelProperty()
  {
    ModelPropertyImpl modelProperty = new ModelPropertyImpl();
    return modelProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MvcPackage getMvcPackage()
  {
    return (MvcPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MvcPackage getPackage()
  {
    return MvcPackage.eINSTANCE;
  }

} //MvcFactoryImpl
