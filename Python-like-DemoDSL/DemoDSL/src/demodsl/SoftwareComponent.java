/**
 */
package demodsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.SoftwareComponent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link demodsl.SoftwareComponent#getUUID <em>UUID</em>}</li>
 *   <li>{@link demodsl.SoftwareComponent#getPort <em>Port</em>}</li>
 *   <li>{@link demodsl.SoftwareComponent#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link demodsl.SoftwareComponent#getPortgroup <em>Portgroup</em>}</li>
 *   <li>{@link demodsl.SoftwareComponent#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getSoftwareComponent()
 * @model
 * @generated
 */
public interface SoftwareComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see demodsl.DemodslPackage#getSoftwareComponent_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link demodsl.SoftwareComponent#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see demodsl.DemodslPackage#getSoftwareComponent_UUID()
	 * @model
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link demodsl.SoftwareComponent#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getSoftwareComponent_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference.
	 * @see #setAllocatedTo(Node)
	 * @see demodsl.DemodslPackage#getSoftwareComponent_AllocatedTo()
	 * @model
	 * @generated
	 */
	Node getAllocatedTo();

	/**
	 * Sets the value of the '{@link demodsl.SoftwareComponent#getAllocatedTo <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated To</em>' reference.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	void setAllocatedTo(Node value);

	/**
	 * Returns the value of the '<em><b>Portgroup</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portgroup</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getSoftwareComponent_Portgroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortGroup> getPortgroup();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getSoftwareComponent_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

} // SoftwareComponent
