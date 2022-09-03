/**
 */
package csm;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see csm.CsmFactory
 * @model kind="package"
 * @generated
 */
public interface CsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://python-like/csm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsmPackage eINSTANCE = csm.impl.CsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link csm.impl.CSMImpl <em>CSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.CSMImpl
	 * @see csm.impl.CsmPackageImpl#getCSM()
	 * @generated
	 */
	int CSM = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__STEP = 0;

	/**
	 * The feature id for the '<em><b>General Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__GENERAL_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Scenarion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__SCENARION = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>CSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>CSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.GeneralResourceImpl <em>General Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.GeneralResourceImpl
	 * @see csm.impl.CsmPackageImpl#getGeneralResource()
	 * @generated
	 */
	int GENERAL_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__RESOURCE_ACQUIRE = 1;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__RESOURCE_RELEASE = 2;

	/**
	 * The number of structural features of the '<em>General Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>General Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.StepImpl
	 * @see csm.impl.CsmPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Post Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POST_PATH = 1;

	/**
	 * The feature id for the '<em><b>Pre Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Active Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIVE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WORKLOAD = 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.ScenarionImpl <em>Scenarion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ScenarionImpl
	 * @see csm.impl.CsmPackageImpl#getScenarion()
	 * @generated
	 */
	int SCENARION = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARION__STEP = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARION__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Pathconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARION__PATHCONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Scenarion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenarion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.StartImpl
	 * @see csm.impl.CsmPackageImpl#getStart()
	 * @generated
	 */
	int START = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Post Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__POST_PATH = STEP__POST_PATH;

	/**
	 * The feature id for the '<em><b>Pre Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PRE_PATH = STEP__PRE_PATH;

	/**
	 * The feature id for the '<em><b>Active Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ACTIVE_RESOURCE = STEP__ACTIVE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__WORKLOAD = STEP__WORKLOAD;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.StopImpl
	 * @see csm.impl.CsmPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Post Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__POST_PATH = STEP__POST_PATH;

	/**
	 * The feature id for the '<em><b>Pre Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PRE_PATH = STEP__PRE_PATH;

	/**
	 * The feature id for the '<em><b>Active Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ACTIVE_RESOURCE = STEP__ACTIVE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__WORKLOAD = STEP__WORKLOAD;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ResourceAcquireImpl <em>Resource Acquire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ResourceAcquireImpl
	 * @see csm.impl.CsmPackageImpl#getResourceAcquire()
	 * @generated
	 */
	int RESOURCE_ACQUIRE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Post Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__POST_PATH = STEP__POST_PATH;

	/**
	 * The feature id for the '<em><b>Pre Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__PRE_PATH = STEP__PRE_PATH;

	/**
	 * The feature id for the '<em><b>Active Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__ACTIVE_RESOURCE = STEP__ACTIVE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__WORKLOAD = STEP__WORKLOAD;

	/**
	 * The feature id for the '<em><b>General Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE__GENERAL_RESOURCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Acquire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Acquire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ResourceReleaseImpl <em>Resource Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ResourceReleaseImpl
	 * @see csm.impl.CsmPackageImpl#getResourceRelease()
	 * @generated
	 */
	int RESOURCE_RELEASE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Post Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__POST_PATH = STEP__POST_PATH;

	/**
	 * The feature id for the '<em><b>Pre Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__PRE_PATH = STEP__PRE_PATH;

	/**
	 * The feature id for the '<em><b>Active Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__ACTIVE_RESOURCE = STEP__ACTIVE_RESOURCE;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__WORKLOAD = STEP__WORKLOAD;

	/**
	 * The feature id for the '<em><b>General Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE__GENERAL_RESOURCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.WorkloadImpl
	 * @see csm.impl.CsmPackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.PassiveResourceImpl
	 * @see csm.impl.CsmPackageImpl#getPassiveResource()
	 * @generated
	 */
	int PASSIVE_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__NAME = GENERAL_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__RESOURCE_ACQUIRE = GENERAL_RESOURCE__RESOURCE_ACQUIRE;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__RESOURCE_RELEASE = GENERAL_RESOURCE__RESOURCE_RELEASE;

	/**
	 * The number of structural features of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_FEATURE_COUNT = GENERAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_OPERATION_COUNT = GENERAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ComponentImpl
	 * @see csm.impl.CsmPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = PASSIVE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RESOURCE_ACQUIRE = PASSIVE_RESOURCE__RESOURCE_ACQUIRE;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RESOURCE_RELEASE = PASSIVE_RESOURCE__RESOURCE_RELEASE;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = PASSIVE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = PASSIVE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ActiveResourceImpl <em>Active Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ActiveResourceImpl
	 * @see csm.impl.CsmPackageImpl#getActiveResource()
	 * @generated
	 */
	int ACTIVE_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__NAME = GENERAL_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__RESOURCE_ACQUIRE = GENERAL_RESOURCE__RESOURCE_ACQUIRE;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__RESOURCE_RELEASE = GENERAL_RESOURCE__RESOURCE_RELEASE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__STEP = GENERAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_FEATURE_COUNT = GENERAL_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_OPERATION_COUNT = GENERAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ProcessingResourceImpl
	 * @see csm.impl.CsmPackageImpl#getProcessingResource()
	 * @generated
	 */
	int PROCESSING_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__NAME = ACTIVE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__RESOURCE_ACQUIRE = ACTIVE_RESOURCE__RESOURCE_ACQUIRE;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__RESOURCE_RELEASE = ACTIVE_RESOURCE__RESOURCE_RELEASE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__STEP = ACTIVE_RESOURCE__STEP;

	/**
	 * The number of structural features of the '<em>Processing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_FEATURE_COUNT = ACTIVE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_OPERATION_COUNT = ACTIVE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ExternalServiceImpl <em>External Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ExternalServiceImpl
	 * @see csm.impl.CsmPackageImpl#getExternalService()
	 * @generated
	 */
	int EXTERNAL_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__NAME = ACTIVE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Acquire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__RESOURCE_ACQUIRE = ACTIVE_RESOURCE__RESOURCE_ACQUIRE;

	/**
	 * The feature id for the '<em><b>Resource Release</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__RESOURCE_RELEASE = ACTIVE_RESOURCE__RESOURCE_RELEASE;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__STEP = ACTIVE_RESOURCE__STEP;

	/**
	 * The number of structural features of the '<em>External Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE_FEATURE_COUNT = ACTIVE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE_OPERATION_COUNT = ACTIVE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.MessageImpl
	 * @see csm.impl.CsmPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.PathConnectionImpl <em>Path Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.PathConnectionImpl
	 * @see csm.impl.CsmPackageImpl#getPathConnection()
	 * @generated
	 */
	int PATH_CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION__POST = 1;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION__PRE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Path Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Path Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csm.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.JoinImpl
	 * @see csm.impl.CsmPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 16;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MESSAGE = PATH_CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__POST = PATH_CONNECTION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PRE = PATH_CONNECTION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = PATH_CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = PATH_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = PATH_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.ForkImpl
	 * @see csm.impl.CsmPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 17;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__MESSAGE = PATH_CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__POST = PATH_CONNECTION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__PRE = PATH_CONNECTION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = PATH_CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = PATH_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = PATH_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.MergeImpl
	 * @see csm.impl.CsmPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 18;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__MESSAGE = PATH_CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__POST = PATH_CONNECTION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__PRE = PATH_CONNECTION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NAME = PATH_CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = PATH_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = PATH_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.BranchImpl
	 * @see csm.impl.CsmPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 19;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MESSAGE = PATH_CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__POST = PATH_CONNECTION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PRE = PATH_CONNECTION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = PATH_CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = PATH_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = PATH_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csm.impl.SeqenceImpl <em>Seqence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csm.impl.SeqenceImpl
	 * @see csm.impl.CsmPackageImpl#getSeqence()
	 * @generated
	 */
	int SEQENCE = 20;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE__MESSAGE = PATH_CONNECTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE__POST = PATH_CONNECTION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE__PRE = PATH_CONNECTION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE__NAME = PATH_CONNECTION__NAME;

	/**
	 * The number of structural features of the '<em>Seqence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE_FEATURE_COUNT = PATH_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Seqence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQENCE_OPERATION_COUNT = PATH_CONNECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link csm.CSM <em>CSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM</em>'.
	 * @see csm.CSM
	 * @generated
	 */
	EClass getCSM();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.CSM#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see csm.CSM#getStep()
	 * @see #getCSM()
	 * @generated
	 */
	EReference getCSM_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.CSM#getGeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Resource</em>'.
	 * @see csm.CSM#getGeneralResource()
	 * @see #getCSM()
	 * @generated
	 */
	EReference getCSM_GeneralResource();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.CSM#getScenarion <em>Scenarion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarion</em>'.
	 * @see csm.CSM#getScenarion()
	 * @see #getCSM()
	 * @generated
	 */
	EReference getCSM_Scenarion();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.CSM#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see csm.CSM#getMessage()
	 * @see #getCSM()
	 * @generated
	 */
	EReference getCSM_Message();

	/**
	 * Returns the meta object for class '{@link csm.GeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Resource</em>'.
	 * @see csm.GeneralResource
	 * @generated
	 */
	EClass getGeneralResource();

	/**
	 * Returns the meta object for the attribute '{@link csm.GeneralResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csm.GeneralResource#getName()
	 * @see #getGeneralResource()
	 * @generated
	 */
	EAttribute getGeneralResource_Name();

	/**
	 * Returns the meta object for the reference list '{@link csm.GeneralResource#getResourceAcquire <em>Resource Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Acquire</em>'.
	 * @see csm.GeneralResource#getResourceAcquire()
	 * @see #getGeneralResource()
	 * @generated
	 */
	EReference getGeneralResource_ResourceAcquire();

	/**
	 * Returns the meta object for the reference list '{@link csm.GeneralResource#getResourceRelease <em>Resource Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Release</em>'.
	 * @see csm.GeneralResource#getResourceRelease()
	 * @see #getGeneralResource()
	 * @generated
	 */
	EReference getGeneralResource_ResourceRelease();

	/**
	 * Returns the meta object for class '{@link csm.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see csm.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link csm.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csm.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the reference '{@link csm.Step#getPostPath <em>Post Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Path</em>'.
	 * @see csm.Step#getPostPath()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_PostPath();

	/**
	 * Returns the meta object for the reference '{@link csm.Step#getPrePath <em>Pre Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Path</em>'.
	 * @see csm.Step#getPrePath()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_PrePath();

	/**
	 * Returns the meta object for the reference '{@link csm.Step#getActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Resource</em>'.
	 * @see csm.Step#getActiveResource()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ActiveResource();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.Step#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workload</em>'.
	 * @see csm.Step#getWorkload()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Workload();

	/**
	 * Returns the meta object for class '{@link csm.Scenarion <em>Scenarion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenarion</em>'.
	 * @see csm.Scenarion
	 * @generated
	 */
	EClass getScenarion();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.Scenarion#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see csm.Scenarion#getStep()
	 * @see #getScenarion()
	 * @generated
	 */
	EReference getScenarion_Step();

	/**
	 * Returns the meta object for the reference list '{@link csm.Scenarion#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root</em>'.
	 * @see csm.Scenarion#getRoot()
	 * @see #getScenarion()
	 * @generated
	 */
	EReference getScenarion_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link csm.Scenarion#getPathconnection <em>Pathconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pathconnection</em>'.
	 * @see csm.Scenarion#getPathconnection()
	 * @see #getScenarion()
	 * @generated
	 */
	EReference getScenarion_Pathconnection();

	/**
	 * Returns the meta object for class '{@link csm.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see csm.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link csm.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see csm.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link csm.ResourceAcquire <em>Resource Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Acquire</em>'.
	 * @see csm.ResourceAcquire
	 * @generated
	 */
	EClass getResourceAcquire();

	/**
	 * Returns the meta object for the reference '{@link csm.ResourceAcquire#getGeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General Resource</em>'.
	 * @see csm.ResourceAcquire#getGeneralResource()
	 * @see #getResourceAcquire()
	 * @generated
	 */
	EReference getResourceAcquire_GeneralResource();

	/**
	 * Returns the meta object for class '{@link csm.ResourceRelease <em>Resource Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Release</em>'.
	 * @see csm.ResourceRelease
	 * @generated
	 */
	EClass getResourceRelease();

	/**
	 * Returns the meta object for the reference '{@link csm.ResourceRelease#getGeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General Resource</em>'.
	 * @see csm.ResourceRelease#getGeneralResource()
	 * @see #getResourceRelease()
	 * @generated
	 */
	EReference getResourceRelease_GeneralResource();

	/**
	 * Returns the meta object for class '{@link csm.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see csm.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link csm.Workload#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see csm.Workload#getValue()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Value();

	/**
	 * Returns the meta object for class '{@link csm.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see csm.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link csm.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource</em>'.
	 * @see csm.ProcessingResource
	 * @generated
	 */
	EClass getProcessingResource();

	/**
	 * Returns the meta object for class '{@link csm.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Service</em>'.
	 * @see csm.ExternalService
	 * @generated
	 */
	EClass getExternalService();

	/**
	 * Returns the meta object for class '{@link csm.ActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Resource</em>'.
	 * @see csm.ActiveResource
	 * @generated
	 */
	EClass getActiveResource();

	/**
	 * Returns the meta object for the reference list '{@link csm.ActiveResource#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see csm.ActiveResource#getStep()
	 * @see #getActiveResource()
	 * @generated
	 */
	EReference getActiveResource_Step();

	/**
	 * Returns the meta object for class '{@link csm.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Resource</em>'.
	 * @see csm.PassiveResource
	 * @generated
	 */
	EClass getPassiveResource();

	/**
	 * Returns the meta object for class '{@link csm.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see csm.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link csm.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csm.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for class '{@link csm.PathConnection <em>Path Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Connection</em>'.
	 * @see csm.PathConnection
	 * @generated
	 */
	EClass getPathConnection();

	/**
	 * Returns the meta object for the reference '{@link csm.PathConnection#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see csm.PathConnection#getMessage()
	 * @see #getPathConnection()
	 * @generated
	 */
	EReference getPathConnection_Message();

	/**
	 * Returns the meta object for the reference list '{@link csm.PathConnection#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post</em>'.
	 * @see csm.PathConnection#getPost()
	 * @see #getPathConnection()
	 * @generated
	 */
	EReference getPathConnection_Post();

	/**
	 * Returns the meta object for the reference list '{@link csm.PathConnection#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre</em>'.
	 * @see csm.PathConnection#getPre()
	 * @see #getPathConnection()
	 * @generated
	 */
	EReference getPathConnection_Pre();

	/**
	 * Returns the meta object for the attribute '{@link csm.PathConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csm.PathConnection#getName()
	 * @see #getPathConnection()
	 * @generated
	 */
	EAttribute getPathConnection_Name();

	/**
	 * Returns the meta object for class '{@link csm.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see csm.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link csm.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see csm.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link csm.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see csm.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for class '{@link csm.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see csm.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link csm.Seqence <em>Seqence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seqence</em>'.
	 * @see csm.Seqence
	 * @generated
	 */
	EClass getSeqence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsmFactory getCsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link csm.impl.CSMImpl <em>CSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.CSMImpl
		 * @see csm.impl.CsmPackageImpl#getCSM()
		 * @generated
		 */
		EClass CSM = eINSTANCE.getCSM();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__STEP = eINSTANCE.getCSM_Step();

		/**
		 * The meta object literal for the '<em><b>General Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__GENERAL_RESOURCE = eINSTANCE.getCSM_GeneralResource();

		/**
		 * The meta object literal for the '<em><b>Scenarion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__SCENARION = eINSTANCE.getCSM_Scenarion();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM__MESSAGE = eINSTANCE.getCSM_Message();

		/**
		 * The meta object literal for the '{@link csm.impl.GeneralResourceImpl <em>General Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.GeneralResourceImpl
		 * @see csm.impl.CsmPackageImpl#getGeneralResource()
		 * @generated
		 */
		EClass GENERAL_RESOURCE = eINSTANCE.getGeneralResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_RESOURCE__NAME = eINSTANCE.getGeneralResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Acquire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_RESOURCE__RESOURCE_ACQUIRE = eINSTANCE.getGeneralResource_ResourceAcquire();

		/**
		 * The meta object literal for the '<em><b>Resource Release</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_RESOURCE__RESOURCE_RELEASE = eINSTANCE.getGeneralResource_ResourceRelease();

		/**
		 * The meta object literal for the '{@link csm.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.StepImpl
		 * @see csm.impl.CsmPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Post Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__POST_PATH = eINSTANCE.getStep_PostPath();

		/**
		 * The meta object literal for the '<em><b>Pre Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PRE_PATH = eINSTANCE.getStep_PrePath();

		/**
		 * The meta object literal for the '<em><b>Active Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ACTIVE_RESOURCE = eINSTANCE.getStep_ActiveResource();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WORKLOAD = eINSTANCE.getStep_Workload();

		/**
		 * The meta object literal for the '{@link csm.impl.ScenarionImpl <em>Scenarion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ScenarionImpl
		 * @see csm.impl.CsmPackageImpl#getScenarion()
		 * @generated
		 */
		EClass SCENARION = eINSTANCE.getScenarion();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARION__STEP = eINSTANCE.getScenarion_Step();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARION__ROOT = eINSTANCE.getScenarion_Root();

		/**
		 * The meta object literal for the '<em><b>Pathconnection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARION__PATHCONNECTION = eINSTANCE.getScenarion_Pathconnection();

		/**
		 * The meta object literal for the '{@link csm.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.StartImpl
		 * @see csm.impl.CsmPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link csm.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.StopImpl
		 * @see csm.impl.CsmPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link csm.impl.ResourceAcquireImpl <em>Resource Acquire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ResourceAcquireImpl
		 * @see csm.impl.CsmPackageImpl#getResourceAcquire()
		 * @generated
		 */
		EClass RESOURCE_ACQUIRE = eINSTANCE.getResourceAcquire();

		/**
		 * The meta object literal for the '<em><b>General Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACQUIRE__GENERAL_RESOURCE = eINSTANCE.getResourceAcquire_GeneralResource();

		/**
		 * The meta object literal for the '{@link csm.impl.ResourceReleaseImpl <em>Resource Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ResourceReleaseImpl
		 * @see csm.impl.CsmPackageImpl#getResourceRelease()
		 * @generated
		 */
		EClass RESOURCE_RELEASE = eINSTANCE.getResourceRelease();

		/**
		 * The meta object literal for the '<em><b>General Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELEASE__GENERAL_RESOURCE = eINSTANCE.getResourceRelease_GeneralResource();

		/**
		 * The meta object literal for the '{@link csm.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.WorkloadImpl
		 * @see csm.impl.CsmPackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__VALUE = eINSTANCE.getWorkload_Value();

		/**
		 * The meta object literal for the '{@link csm.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ComponentImpl
		 * @see csm.impl.CsmPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link csm.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ProcessingResourceImpl
		 * @see csm.impl.CsmPackageImpl#getProcessingResource()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE = eINSTANCE.getProcessingResource();

		/**
		 * The meta object literal for the '{@link csm.impl.ExternalServiceImpl <em>External Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ExternalServiceImpl
		 * @see csm.impl.CsmPackageImpl#getExternalService()
		 * @generated
		 */
		EClass EXTERNAL_SERVICE = eINSTANCE.getExternalService();

		/**
		 * The meta object literal for the '{@link csm.impl.ActiveResourceImpl <em>Active Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ActiveResourceImpl
		 * @see csm.impl.CsmPackageImpl#getActiveResource()
		 * @generated
		 */
		EClass ACTIVE_RESOURCE = eINSTANCE.getActiveResource();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_RESOURCE__STEP = eINSTANCE.getActiveResource_Step();

		/**
		 * The meta object literal for the '{@link csm.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.PassiveResourceImpl
		 * @see csm.impl.CsmPackageImpl#getPassiveResource()
		 * @generated
		 */
		EClass PASSIVE_RESOURCE = eINSTANCE.getPassiveResource();

		/**
		 * The meta object literal for the '{@link csm.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.MessageImpl
		 * @see csm.impl.CsmPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '{@link csm.impl.PathConnectionImpl <em>Path Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.PathConnectionImpl
		 * @see csm.impl.CsmPackageImpl#getPathConnection()
		 * @generated
		 */
		EClass PATH_CONNECTION = eINSTANCE.getPathConnection();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONNECTION__MESSAGE = eINSTANCE.getPathConnection_Message();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONNECTION__POST = eINSTANCE.getPathConnection_Post();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONNECTION__PRE = eINSTANCE.getPathConnection_Pre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_CONNECTION__NAME = eINSTANCE.getPathConnection_Name();

		/**
		 * The meta object literal for the '{@link csm.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.JoinImpl
		 * @see csm.impl.CsmPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link csm.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.ForkImpl
		 * @see csm.impl.CsmPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link csm.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.MergeImpl
		 * @see csm.impl.CsmPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '{@link csm.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.BranchImpl
		 * @see csm.impl.CsmPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link csm.impl.SeqenceImpl <em>Seqence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csm.impl.SeqenceImpl
		 * @see csm.impl.CsmPackageImpl#getSeqence()
		 * @generated
		 */
		EClass SEQENCE = eINSTANCE.getSeqence();

	}

} //CsmPackage
