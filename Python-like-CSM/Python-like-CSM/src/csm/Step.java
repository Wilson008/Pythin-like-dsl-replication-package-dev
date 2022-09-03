/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.Step#getName <em>Name</em>}</li>
 *   <li>{@link csm.Step#getPostPath <em>Post Path</em>}</li>
 *   <li>{@link csm.Step#getPrePath <em>Pre Path</em>}</li>
 *   <li>{@link csm.Step#getActiveResource <em>Active Resource</em>}</li>
 *   <li>{@link csm.Step#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see csm.CsmPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link csm.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Post Path</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link csm.PathConnection#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Path</em>' reference.
	 * @see #setPostPath(PathConnection)
	 * @see csm.CsmPackage#getStep_PostPath()
	 * @see csm.PathConnection#getPost
	 * @model opposite="post" ordered="false"
	 * @generated
	 */
	PathConnection getPostPath();

	/**
	 * Sets the value of the '{@link csm.Step#getPostPath <em>Post Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Path</em>' reference.
	 * @see #getPostPath()
	 * @generated
	 */
	void setPostPath(PathConnection value);

	/**
	 * Returns the value of the '<em><b>Pre Path</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link csm.PathConnection#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Path</em>' reference.
	 * @see #setPrePath(PathConnection)
	 * @see csm.CsmPackage#getStep_PrePath()
	 * @see csm.PathConnection#getPre
	 * @model opposite="pre" ordered="false"
	 * @generated
	 */
	PathConnection getPrePath();

	/**
	 * Sets the value of the '{@link csm.Step#getPrePath <em>Pre Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Path</em>' reference.
	 * @see #getPrePath()
	 * @generated
	 */
	void setPrePath(PathConnection value);

	/**
	 * Returns the value of the '<em><b>Active Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link csm.ActiveResource#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Resource</em>' reference.
	 * @see #setActiveResource(ActiveResource)
	 * @see csm.CsmPackage#getStep_ActiveResource()
	 * @see csm.ActiveResource#getStep
	 * @model opposite="step" ordered="false"
	 * @generated
	 */
	ActiveResource getActiveResource();

	/**
	 * Sets the value of the '{@link csm.Step#getActiveResource <em>Active Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Resource</em>' reference.
	 * @see #getActiveResource()
	 * @generated
	 */
	void setActiveResource(ActiveResource value);

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' containment reference list.
	 * The list contents are of type {@link csm.Workload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' containment reference list.
	 * @see csm.CsmPackage#getStep_Workload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workload> getWorkload();

} // Step
