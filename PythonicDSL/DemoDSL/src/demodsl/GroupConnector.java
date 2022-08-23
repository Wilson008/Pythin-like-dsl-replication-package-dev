/**
 */
package demodsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.GroupConnector#getPortgroup <em>Portgroup</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getGroupConnector()
 * @model
 * @generated
 */
public interface GroupConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Portgroup</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portgroup</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getGroupConnector_Portgroup()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<PortGroup> getPortgroup();

} // GroupConnector
