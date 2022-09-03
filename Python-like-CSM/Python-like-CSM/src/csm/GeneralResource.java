/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.GeneralResource#getName <em>Name</em>}</li>
 *   <li>{@link csm.GeneralResource#getResourceAcquire <em>Resource Acquire</em>}</li>
 *   <li>{@link csm.GeneralResource#getResourceRelease <em>Resource Release</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getGeneralResource()
 * @model abstract="true"
 * @generated
 */
public interface GeneralResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see csm.CsmPackage#getGeneralResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link csm.GeneralResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Acquire</b></em>' reference list.
	 * The list contents are of type {@link csm.ResourceAcquire}.
	 * It is bidirectional and its opposite is '{@link csm.ResourceAcquire#getGeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Acquire</em>' reference list.
	 * @see csm.CsmPackage#getGeneralResource_ResourceAcquire()
	 * @see csm.ResourceAcquire#getGeneralResource
	 * @model opposite="generalResource" ordered="false"
	 * @generated
	 */
	EList<ResourceAcquire> getResourceAcquire();

	/**
	 * Returns the value of the '<em><b>Resource Release</b></em>' reference list.
	 * The list contents are of type {@link csm.ResourceRelease}.
	 * It is bidirectional and its opposite is '{@link csm.ResourceRelease#getGeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Release</em>' reference list.
	 * @see csm.CsmPackage#getGeneralResource_ResourceRelease()
	 * @see csm.ResourceRelease#getGeneralResource
	 * @model opposite="generalResource" ordered="false"
	 * @generated
	 */
	EList<ResourceRelease> getResourceRelease();

} // GeneralResource
