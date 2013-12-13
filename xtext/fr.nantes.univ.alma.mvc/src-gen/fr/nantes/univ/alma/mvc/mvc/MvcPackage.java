/**
 */
package fr.nantes.univ.alma.mvc.mvc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.nantes.univ.alma.mvc.mvc.MvcFactory
 * @model kind="package"
 * @generated
 */
public interface MvcPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mvc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://mvc/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mvc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MvcPackage eINSTANCE = fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl <em>Main Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getMainPackage()
   * @generated
   */
  int MAIN_PACKAGE = 0;

  /**
   * The feature id for the '<em><b>All Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PACKAGE__ALL_MODELS = 0;

  /**
   * The feature id for the '<em><b>All Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PACKAGE__ALL_VIEWS = 1;

  /**
   * The feature id for the '<em><b>App</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PACKAGE__APP = 2;

  /**
   * The number of structural features of the '<em>Main Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl <em>UI Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getUIApplication()
   * @generated
   */
  int UI_APPLICATION = 1;

  /**
   * The feature id for the '<em><b>Models</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_APPLICATION__MODELS = 0;

  /**
   * The feature id for the '<em><b>Pages</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_APPLICATION__PAGES = 1;

  /**
   * The number of structural features of the '<em>UI Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.ViewImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getView()
   * @generated
   */
  int VIEW = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__MODEL = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__ACTIONS = 3;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getModel()
   * @generated
   */
  int MODEL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Owned Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.ActionImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getAction()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Next Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NEXT_PAGE = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelPropertyImpl <em>Model Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.ModelPropertyImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getModelProperty()
   * @generated
   */
  int MODEL_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROPERTY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.MainPackage <em>Main Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Package</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.MainPackage
   * @generated
   */
  EClass getMainPackage();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllModels <em>All Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>All Models</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllModels()
   * @see #getMainPackage()
   * @generated
   */
  EReference getMainPackage_AllModels();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllViews <em>All Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>All Views</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.MainPackage#getAllViews()
   * @see #getMainPackage()
   * @generated
   */
  EReference getMainPackage_AllViews();

  /**
   * Returns the meta object for the containment reference '{@link fr.nantes.univ.alma.mvc.mvc.MainPackage#getApp <em>App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>App</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.MainPackage#getApp()
   * @see #getMainPackage()
   * @generated
   */
  EReference getMainPackage_App();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.UIApplication <em>UI Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Application</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.UIApplication
   * @generated
   */
  EClass getUIApplication();

  /**
   * Returns the meta object for the reference list '{@link fr.nantes.univ.alma.mvc.mvc.UIApplication#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Models</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.UIApplication#getModels()
   * @see #getUIApplication()
   * @generated
   */
  EReference getUIApplication_Models();

  /**
   * Returns the meta object for the reference list '{@link fr.nantes.univ.alma.mvc.mvc.UIApplication#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pages</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.UIApplication#getPages()
   * @see #getUIApplication()
   * @generated
   */
  EReference getUIApplication_Pages();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mvc.mvc.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mvc.mvc.View#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.View#getDescription()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Description();

  /**
   * Returns the meta object for the reference '{@link fr.nantes.univ.alma.mvc.mvc.View#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.View#getModel()
   * @see #getView()
   * @generated
   */
  EReference getView_Model();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.View#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.View#getActions()
   * @see #getView()
   * @generated
   */
  EReference getView_Actions();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mvc.mvc.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Model#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Model#getProperties()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Properties();

  /**
   * Returns the meta object for the reference list '{@link fr.nantes.univ.alma.mvc.mvc.Model#getOwnedElements <em>Owned Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Owned Elements</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Model#getOwnedElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_OwnedElements();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mvc.mvc.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the reference '{@link fr.nantes.univ.alma.mvc.mvc.Action#getNextPage <em>Next Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next Page</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Action#getNextPage()
   * @see #getAction()
   * @generated
   */
  EReference getAction_NextPage();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.ModelProperty <em>Model Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Property</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.ModelProperty
   * @generated
   */
  EClass getModelProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mvc.mvc.ModelProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.ModelProperty#getName()
   * @see #getModelProperty()
   * @generated
   */
  EAttribute getModelProperty_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MvcFactory getMvcFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl <em>Main Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MainPackageImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getMainPackage()
     * @generated
     */
    EClass MAIN_PACKAGE = eINSTANCE.getMainPackage();

    /**
     * The meta object literal for the '<em><b>All Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_PACKAGE__ALL_MODELS = eINSTANCE.getMainPackage_AllModels();

    /**
     * The meta object literal for the '<em><b>All Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_PACKAGE__ALL_VIEWS = eINSTANCE.getMainPackage_AllViews();

    /**
     * The meta object literal for the '<em><b>App</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_PACKAGE__APP = eINSTANCE.getMainPackage_App();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl <em>UI Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.UIApplicationImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getUIApplication()
     * @generated
     */
    EClass UI_APPLICATION = eINSTANCE.getUIApplication();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_APPLICATION__MODELS = eINSTANCE.getUIApplication_Models();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_APPLICATION__PAGES = eINSTANCE.getUIApplication_Pages();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.ViewImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__DESCRIPTION = eINSTANCE.getView_Description();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__MODEL = eINSTANCE.getView_Model();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__ACTIONS = eINSTANCE.getView_Actions();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.ModelImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROPERTIES = eINSTANCE.getModel_Properties();

    /**
     * The meta object literal for the '<em><b>Owned Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OWNED_ELEMENTS = eINSTANCE.getModel_OwnedElements();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.ActionImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__NEXT_PAGE = eINSTANCE.getAction_NextPage();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.ModelPropertyImpl <em>Model Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.ModelPropertyImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getModelProperty()
     * @generated
     */
    EClass MODEL_PROPERTY = eINSTANCE.getModelProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_PROPERTY__NAME = eINSTANCE.getModelProperty_Name();

  }

} //MvcPackage
