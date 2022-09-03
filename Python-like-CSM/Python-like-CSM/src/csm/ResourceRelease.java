/**
 */
package csm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.ResourceRelease#getGeneralResource <em>General Resource</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getResourceRelease()
 * @model
 * @generated
 */
public interface ResourceRelease extends Step {
	/**
	 * Returns the value of the '<em><b>General Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link csm.GeneralResource#getResourceRelease <em>Resource Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Resource</em>' reference.
	 * @see #setGeneralResource(GeneralResource)
	 * @see csm.CsmPackage#getResourceRelease_GeneralResource()
	 * @see csm.GeneralResource#getResourceRelease
	 * @model opposite="resourceRelease" ordered="false"
	 * @generated
	 */
	GeneralResource getGeneralResource();

	/**
	 * Sets the value of the '{@link csm.ResourceRelease#getGeneralResource <em>General Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Resource</em>' reference.
	 * @see #getGeneralResource()
	 * @generated
	 */
	void setGeneralResource(GeneralResource value);

} // ResourceRelease
