/**
 */
package csm.impl;

import csm.*;

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
public class CsmFactoryImpl extends EFactoryImpl implements CsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsmFactory init() {
		try {
			CsmFactory theCsmFactory = (CsmFactory)EPackage.Registry.INSTANCE.getEFactory(CsmPackage.eNS_URI);
			if (theCsmFactory != null) {
				return theCsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CsmPackage.CSM: return createCSM();
			case CsmPackage.SCENARION: return createScenarion();
			case CsmPackage.START: return createStart();
			case CsmPackage.STOP: return createStop();
			case CsmPackage.RESOURCE_ACQUIRE: return createResourceAcquire();
			case CsmPackage.RESOURCE_RELEASE: return createResourceRelease();
			case CsmPackage.WORKLOAD: return createWorkload();
			case CsmPackage.COMPONENT: return createComponent();
			case CsmPackage.PROCESSING_RESOURCE: return createProcessingResource();
			case CsmPackage.EXTERNAL_SERVICE: return createExternalService();
			case CsmPackage.MESSAGE: return createMessage();
			case CsmPackage.JOIN: return createJoin();
			case CsmPackage.FORK: return createFork();
			case CsmPackage.MERGE: return createMerge();
			case CsmPackage.BRANCH: return createBranch();
			case CsmPackage.SEQENCE: return createSeqence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSM createCSM() {
		CSMImpl csm = new CSMImpl();
		return csm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenarion createScenarion() {
		ScenarionImpl scenarion = new ScenarionImpl();
		return scenarion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAcquire createResourceAcquire() {
		ResourceAcquireImpl resourceAcquire = new ResourceAcquireImpl();
		return resourceAcquire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRelease createResourceRelease() {
		ResourceReleaseImpl resourceRelease = new ResourceReleaseImpl();
		return resourceRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResource createProcessingResource() {
		ProcessingResourceImpl processingResource = new ProcessingResourceImpl();
		return processingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalService createExternalService() {
		ExternalServiceImpl externalService = new ExternalServiceImpl();
		return externalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seqence createSeqence() {
		SeqenceImpl seqence = new SeqenceImpl();
		return seqence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsmPackage getCsmPackage() {
		return (CsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsmPackage getPackage() {
		return CsmPackage.eINSTANCE;
	}

} //CsmFactoryImpl
