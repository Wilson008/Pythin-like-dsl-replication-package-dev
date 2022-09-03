/**
 */
package csm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see csm.CsmPackage
 * @generated
 */
public interface CsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsmFactory eINSTANCE = csm.impl.CsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM</em>'.
	 * @generated
	 */
	CSM createCSM();

	/**
	 * Returns a new object of class '<em>Scenarion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenarion</em>'.
	 * @generated
	 */
	Scenarion createScenarion();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Resource Acquire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Acquire</em>'.
	 * @generated
	 */
	ResourceAcquire createResourceAcquire();

	/**
	 * Returns a new object of class '<em>Resource Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Release</em>'.
	 * @generated
	 */
	ResourceRelease createResourceRelease();

	/**
	 * Returns a new object of class '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload</em>'.
	 * @generated
	 */
	Workload createWorkload();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource</em>'.
	 * @generated
	 */
	ProcessingResource createProcessingResource();

	/**
	 * Returns a new object of class '<em>External Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Service</em>'.
	 * @generated
	 */
	ExternalService createExternalService();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork</em>'.
	 * @generated
	 */
	Fork createFork();

	/**
	 * Returns a new object of class '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge</em>'.
	 * @generated
	 */
	Merge createMerge();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Seqence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seqence</em>'.
	 * @generated
	 */
	Seqence createSeqence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsmPackage getCsmPackage();

} //CsmFactory
