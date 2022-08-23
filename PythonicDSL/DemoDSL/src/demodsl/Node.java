/**
 */
package demodsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.Node#getSoftwarecomponent <em>Softwarecomponent</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends HardwareComponent {
	/**
	 * Returns the value of the '<em><b>Softwarecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.SoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softwarecomponent</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getNode_Softwarecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareComponent> getSoftwarecomponent();

} // Node
