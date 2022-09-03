/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.SlotOptions#getType <em>Type</em>}</li>
 *   <li>{@link jess.SlotOptions#getDef <em>Def</em>}</li>
 *   <li>{@link jess.SlotOptions#getDefaultDyn <em>Default Dyn</em>}</li>
 *   <li>{@link jess.SlotOptions#getAllowedValues <em>Allowed Values</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getSlotOptions()
 * @model
 * @generated
 */
public interface SlotOptions extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ValidIdentifier)
	 * @see jess.JessPackage#getSlotOptions_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getType();

	/**
	 * Sets the value of the '{@link jess.SlotOptions#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(Expression)
	 * @see jess.JessPackage#getSlotOptions_Def()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getDef();

	/**
	 * Sets the value of the '{@link jess.SlotOptions#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Expression value);

	/**
	 * Returns the value of the '<em><b>Default Dyn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dyn</em>' containment reference.
	 * @see #setDefaultDyn(Expression)
	 * @see jess.JessPackage#getSlotOptions_DefaultDyn()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getDefaultDyn();

	/**
	 * Sets the value of the '{@link jess.SlotOptions#getDefaultDyn <em>Default Dyn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dyn</em>' containment reference.
	 * @see #getDefaultDyn()
	 * @generated
	 */
	void setDefaultDyn(Expression value);

	/**
	 * Returns the value of the '<em><b>Allowed Values</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Values</em>' containment reference list.
	 * @see jess.JessPackage#getSlotOptions_AllowedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getAllowedValues();

} // SlotOptions
