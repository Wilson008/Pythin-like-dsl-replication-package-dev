/**
 */
package demodsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link demodsl.Root#getHardwarecomponent <em>Hardwarecomponent</em>}</li>
 *   <li>{@link demodsl.Root#getSoftwarecomponent <em>Softwarecomponent</em>}</li>
 * </ul>
 *
 * @see demodsl.DemodslPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Softwarecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.SoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softwarecomponent</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getRoot_Softwarecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareComponent> getSoftwarecomponent();

	/**
	 * Returns the value of the '<em><b>Hardwarecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link demodsl.HardwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardwarecomponent</em>' containment reference list.
	 * @see demodsl.DemodslPackage#getRoot_Hardwarecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareComponent> getHardwarecomponent();

} // Root
