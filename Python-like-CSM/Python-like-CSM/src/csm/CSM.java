/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.CSM#getStep <em>Step</em>}</li>
 *   <li>{@link csm.CSM#getGeneralResource <em>General Resource</em>}</li>
 *   <li>{@link csm.CSM#getScenarion <em>Scenarion</em>}</li>
 *   <li>{@link csm.CSM#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getCSM()
 * @model
 * @generated
 */
public interface CSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link csm.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see csm.CsmPackage#getCSM_Step()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>General Resource</b></em>' containment reference list.
	 * The list contents are of type {@link csm.GeneralResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Resource</em>' containment reference list.
	 * @see csm.CsmPackage#getCSM_GeneralResource()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<GeneralResource> getGeneralResource();

	/**
	 * Returns the value of the '<em><b>Scenarion</b></em>' containment reference list.
	 * The list contents are of type {@link csm.Scenarion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarion</em>' containment reference list.
	 * @see csm.CsmPackage#getCSM_Scenarion()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Scenarion> getScenarion();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link csm.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see csm.CsmPackage#getCSM_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

} // CSM
