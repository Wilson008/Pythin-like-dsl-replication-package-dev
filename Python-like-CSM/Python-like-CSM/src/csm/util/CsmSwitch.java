/**
 */
package csm.util;

import csm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see csm.CsmPackage
 * @generated
 */
public class CsmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsmSwitch() {
		if (modelPackage == null) {
			modelPackage = CsmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CsmPackage.CSM: {
				CSM csm = (CSM)theEObject;
				T result = caseCSM(csm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.GENERAL_RESOURCE: {
				GeneralResource generalResource = (GeneralResource)theEObject;
				T result = caseGeneralResource(generalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.SCENARION: {
				Scenarion scenarion = (Scenarion)theEObject;
				T result = caseScenarion(scenarion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseStep(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseStep(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.RESOURCE_ACQUIRE: {
				ResourceAcquire resourceAcquire = (ResourceAcquire)theEObject;
				T result = caseResourceAcquire(resourceAcquire);
				if (result == null) result = caseStep(resourceAcquire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.RESOURCE_RELEASE: {
				ResourceRelease resourceRelease = (ResourceRelease)theEObject;
				T result = caseResourceRelease(resourceRelease);
				if (result == null) result = caseStep(resourceRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.WORKLOAD: {
				Workload workload = (Workload)theEObject;
				T result = caseWorkload(workload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = casePassiveResource(component);
				if (result == null) result = caseGeneralResource(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.PROCESSING_RESOURCE: {
				ProcessingResource processingResource = (ProcessingResource)theEObject;
				T result = caseProcessingResource(processingResource);
				if (result == null) result = caseActiveResource(processingResource);
				if (result == null) result = caseGeneralResource(processingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.EXTERNAL_SERVICE: {
				ExternalService externalService = (ExternalService)theEObject;
				T result = caseExternalService(externalService);
				if (result == null) result = caseActiveResource(externalService);
				if (result == null) result = caseGeneralResource(externalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.ACTIVE_RESOURCE: {
				ActiveResource activeResource = (ActiveResource)theEObject;
				T result = caseActiveResource(activeResource);
				if (result == null) result = caseGeneralResource(activeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.PASSIVE_RESOURCE: {
				PassiveResource passiveResource = (PassiveResource)theEObject;
				T result = casePassiveResource(passiveResource);
				if (result == null) result = caseGeneralResource(passiveResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.PATH_CONNECTION: {
				PathConnection pathConnection = (PathConnection)theEObject;
				T result = casePathConnection(pathConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = casePathConnection(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = casePathConnection(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = casePathConnection(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = casePathConnection(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsmPackage.SEQENCE: {
				Seqence seqence = (Seqence)theEObject;
				T result = caseSeqence(seqence);
				if (result == null) result = casePathConnection(seqence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSM(CSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResource(GeneralResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenarion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenarion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarion(Scenarion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Acquire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Acquire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAcquire(ResourceAcquire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRelease(ResourceRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkload(Workload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalService(ExternalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveResource(ActiveResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveResource(PassiveResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConnection(PathConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seqence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seqence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqence(Seqence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CsmSwitch
