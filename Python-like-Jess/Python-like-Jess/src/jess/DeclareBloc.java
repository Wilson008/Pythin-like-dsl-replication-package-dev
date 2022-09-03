/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.DeclareBloc#getSlotSpecific <em>Slot Specific</em>}</li>
 *   <li>{@link jess.DeclareBloc#getBackchainReaction <em>Backchain Reaction</em>}</li>
 *   <li>{@link jess.DeclareBloc#getFromClass <em>From Class</em>}</li>
 *   <li>{@link jess.DeclareBloc#getIncludeVariable <em>Include Variable</em>}</li>
 *   <li>{@link jess.DeclareBloc#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getDeclareBloc()
 * @model
 * @generated
 */
public interface DeclareBloc extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Slot Specific</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Specific</em>' containment reference.
	 * @see #setSlotSpecific(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareBloc_SlotSpecific()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getSlotSpecific();

	/**
	 * Sets the value of the '{@link jess.DeclareBloc#getSlotSpecific <em>Slot Specific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Specific</em>' containment reference.
	 * @see #getSlotSpecific()
	 * @generated
	 */
	void setSlotSpecific(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Backchain Reaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backchain Reaction</em>' containment reference.
	 * @see #setBackchainReaction(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareBloc_BackchainReaction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getBackchainReaction();

	/**
	 * Sets the value of the '{@link jess.DeclareBloc#getBackchainReaction <em>Backchain Reaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backchain Reaction</em>' containment reference.
	 * @see #getBackchainReaction()
	 * @generated
	 */
	void setBackchainReaction(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>From Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Class</em>' containment reference.
	 * @see #setFromClass(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareBloc_FromClass()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getFromClass();

	/**
	 * Sets the value of the '{@link jess.DeclareBloc#getFromClass <em>From Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Class</em>' containment reference.
	 * @see #getFromClass()
	 * @generated
	 */
	void setFromClass(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Include Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Variable</em>' containment reference.
	 * @see #setIncludeVariable(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareBloc_IncludeVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getIncludeVariable();

	/**
	 * Sets the value of the '{@link jess.DeclareBloc#getIncludeVariable <em>Include Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Variable</em>' containment reference.
	 * @see #getIncludeVariable()
	 * @generated
	 */
	void setIncludeVariable(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareBloc_Order()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getOrder();

	/**
	 * Sets the value of the '{@link jess.DeclareBloc#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(ValidIdentifier value);

} // DeclareBloc
