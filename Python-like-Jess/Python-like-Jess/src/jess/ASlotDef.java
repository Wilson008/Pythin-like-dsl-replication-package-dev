/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASlot Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ASlotDef#getSlotName <em>Slot Name</em>}</li>
 *   <li>{@link jess.ASlotDef#getOptionals <em>Optionals</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getASlotDef()
 * @model
 * @generated
 */
public interface ASlotDef extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Slot Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Name</em>' containment reference.
	 * @see #setSlotName(SlotName)
	 * @see jess.JessPackage#getASlotDef_SlotName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SlotName getSlotName();

	/**
	 * Sets the value of the '{@link jess.ASlotDef#getSlotName <em>Slot Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Name</em>' containment reference.
	 * @see #getSlotName()
	 * @generated
	 */
	void setSlotName(SlotName value);

	/**
	 * Returns the value of the '<em><b>Optionals</b></em>' containment reference list.
	 * The list contents are of type {@link jess.SlotOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionals</em>' containment reference list.
	 * @see jess.JessPackage#getASlotDef_Optionals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlotOptions> getOptionals();

} // ASlotDef
