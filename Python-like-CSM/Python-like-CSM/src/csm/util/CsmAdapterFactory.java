/**
 */
package csm.util;

import csm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see csm.CsmPackage
 * @generated
 */
public class CsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsmSwitch<Adapter> modelSwitch =
		new CsmSwitch<Adapter>() {
			@Override
			public Adapter caseCSM(CSM object) {
				return createCSMAdapter();
			}
			@Override
			public Adapter caseGeneralResource(GeneralResource object) {
				return createGeneralResourceAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseScenarion(Scenarion object) {
				return createScenarionAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseResourceAcquire(ResourceAcquire object) {
				return createResourceAcquireAdapter();
			}
			@Override
			public Adapter caseResourceRelease(ResourceRelease object) {
				return createResourceReleaseAdapter();
			}
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			@Override
			public Adapter caseExternalService(ExternalService object) {
				return createExternalServiceAdapter();
			}
			@Override
			public Adapter caseActiveResource(ActiveResource object) {
				return createActiveResourceAdapter();
			}
			@Override
			public Adapter casePassiveResource(PassiveResource object) {
				return createPassiveResourceAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter casePathConnection(PathConnection object) {
				return createPathConnectionAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseMerge(Merge object) {
				return createMergeAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter caseSeqence(Seqence object) {
				return createSeqenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link csm.CSM <em>CSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.CSM
	 * @generated
	 */
	public Adapter createCSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.GeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.GeneralResource
	 * @generated
	 */
	public Adapter createGeneralResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Scenarion <em>Scenarion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Scenarion
	 * @generated
	 */
	public Adapter createScenarionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.ResourceAcquire <em>Resource Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.ResourceAcquire
	 * @generated
	 */
	public Adapter createResourceAcquireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.ResourceRelease <em>Resource Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.ResourceRelease
	 * @generated
	 */
	public Adapter createResourceReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.ExternalService
	 * @generated
	 */
	public Adapter createExternalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.ActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.ActiveResource
	 * @generated
	 */
	public Adapter createActiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.PassiveResource
	 * @generated
	 */
	public Adapter createPassiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.PathConnection <em>Path Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.PathConnection
	 * @generated
	 */
	public Adapter createPathConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link csm.Seqence <em>Seqence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see csm.Seqence
	 * @generated
	 */
	public Adapter createSeqenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CsmAdapterFactory
