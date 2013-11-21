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
   * The meta object id for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl
   * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__VIEWS = 0;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__MODELS = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ACTIONS = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Main App</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__MAIN_APP = 4;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 5;

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
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mvc.mvc.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Package#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package#getViews()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Views();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Package#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package#getModels()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Models();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Package#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package#getActions()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Package#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package#getProperties()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mvc.mvc.Package#getMainApp <em>Main App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main App</em>'.
   * @see fr.nantes.univ.alma.mvc.mvc.Package#getMainApp()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_MainApp();

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
     * The meta object literal for the '{@link fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mvc.mvc.impl.PackageImpl
     * @see fr.nantes.univ.alma.mvc.mvc.impl.MvcPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__VIEWS = eINSTANCE.getPackage_Views();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__MODELS = eINSTANCE.getPackage_Models();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ACTIONS = eINSTANCE.getPackage_Actions();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PROPERTIES = eINSTANCE.getPackage_Properties();

    /**
     * The meta object literal for the '<em><b>Main App</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__MAIN_APP = eINSTANCE.getPackage_MainApp();

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
