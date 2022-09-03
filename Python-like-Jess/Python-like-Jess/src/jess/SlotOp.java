/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.SlotOp#getSlotIdent <em>Slot Ident</em>}</li>
 *   <li>{@link jess.SlotOp#getOperator <em>Operator</em>}</li>
 *   <li>{@link jess.SlotOp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getSlotOp()
 * @model
 * @generated
 */
public interface SlotOp extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Slot Ident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Ident</em>' containment reference.
	 * @see #setSlotIdent(SlotName)
	 * @see jess.JessPackage#getSlotOp_SlotIdent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SlotName getSlotIdent();

	/**
	 * Sets the value of the '{@link jess.SlotOp#getSlotIdent <em>Slot Ident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Ident</em>' containment reference.
	 * @see #getSlotIdent()
	 * @generated
	 */
	void setSlotIdent(SlotName value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(ValidIdentifier)
	 * @see jess.JessPackage#getSlotOp_Operator()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getOperator();

	/**
	 * Sets the value of the '{@link jess.SlotOp#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see jess.JessPackage#getSlotOp_Exp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link jess.SlotOp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

} // SlotOp
