/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.ActiveResource#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getActiveResource()
 * @model abstract="true"
 * @generated
 */
public interface ActiveResource extends GeneralResource {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference list.
	 * The list contents are of type {@link csm.Step}.
	 * It is bidirectional and its opposite is '{@link csm.Step#getActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference list.
	 * @see csm.CsmPackage#getActiveResource_Step()
	 * @see csm.Step#getActiveResource
	 * @model opposite="activeResource" ordered="false"
	 * @generated
	 */
	EList<Step> getStep();

} // ActiveResource
