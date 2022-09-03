/**
 */
package csm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Acquire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.ResourceAcquire#getGeneralResource <em>General Resource</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getResourceAcquire()
 * @model
 * @generated
 */
public interface ResourceAcquire extends Step {
	/**
	 * Returns the value of the '<em><b>General Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link csm.GeneralResource#getResourceAcquire <em>Resource Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Resource</em>' reference.
	 * @see #setGeneralResource(GeneralResource)
	 * @see csm.CsmPackage#getResourceAcquire_GeneralResource()
	 * @see csm.GeneralResource#getResourceAcquire
	 * @model opposite="resourceAcquire" ordered="false"
	 * @generated
	 */
	GeneralResource getGeneralResource();

	/**
	 * Sets the value of the '{@link csm.ResourceAcquire#getGeneralResource <em>General Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Resource</em>' reference.
	 * @see #getGeneralResource()
	 * @generated
	 */
	void setGeneralResource(GeneralResource value);

} // ResourceAcquire
