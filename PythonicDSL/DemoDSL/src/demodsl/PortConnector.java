/**
 */
package demodsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.PortConnector#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getPortConnector()
 * @model
 * @generated
 */
public interface PortConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getPortConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPort();

} // PortConnector
