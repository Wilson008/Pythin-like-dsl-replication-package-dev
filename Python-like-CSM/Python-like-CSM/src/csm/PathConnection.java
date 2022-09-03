/**
 */
package csm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csm.PathConnection#getMessage <em>Message</em>}</li>
 *   <li>{@link csm.PathConnection#getPost <em>Post</em>}</li>
 *   <li>{@link csm.PathConnection#getPre <em>Pre</em>}</li>
 *   <li>{@link csm.PathConnection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see csm.CsmPackage#getPathConnection()
 * @model abstract="true"
 * @generated
 */
public interface PathConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see csm.CsmPackage#getPathConnection_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link csm.PathConnection#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' reference list.
	 * The list contents are of type {@link csm.Step}.
	 * It is bidirectional and its opposite is '{@link csm.Step#getPostPath <em>Post Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' reference list.
	 * @see csm.CsmPackage#getPathConnection_Post()
	 * @see csm.Step#getPostPath
	 * @model opposite="postPath" ordered="false"
	 * @generated
	 */
	EList<Step> getPost();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' reference list.
	 * The list contents are of type {@link csm.Step}.
	 * It is bidirectional and its opposite is '{@link csm.Step#getPrePath <em>Pre Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' reference list.
	 * @see csm.CsmPackage#getPathConnection_Pre()
	 * @see csm.Step#getPrePath
	 * @model opposite="prePath" ordered="false"
	 * @generated
	 */
	EList<Step> getPre();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see csm.CsmPackage#getPathConnection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link csm.PathConnection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PathConnection
