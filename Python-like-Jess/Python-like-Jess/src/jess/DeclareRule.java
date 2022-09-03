/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.DeclareRule#getSalience <em>Salience</em>}</li>
 *   <li>{@link jess.DeclareRule#getNodeIndexHash <em>Node Index Hash</em>}</li>
 *   <li>{@link jess.DeclareRule#getAutoFocus <em>Auto Focus</em>}</li>
 *   <li>{@link jess.DeclareRule#getNoLoop <em>No Loop</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getDeclareRule()
 * @model
 * @generated
 */
public interface DeclareRule extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Salience</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salience</em>' containment reference.
	 * @see #setSalience(Expression)
	 * @see jess.JessPackage#getDeclareRule_Salience()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getSalience();

	/**
	 * Sets the value of the '{@link jess.DeclareRule#getSalience <em>Salience</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salience</em>' containment reference.
	 * @see #getSalience()
	 * @generated
	 */
	void setSalience(Expression value);

	/**
	 * Returns the value of the '<em><b>Node Index Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Index Hash</em>' containment reference.
	 * @see #setNodeIndexHash(Expression)
	 * @see jess.JessPackage#getDeclareRule_NodeIndexHash()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getNodeIndexHash();

	/**
	 * Sets the value of the '{@link jess.DeclareRule#getNodeIndexHash <em>Node Index Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Index Hash</em>' containment reference.
	 * @see #getNodeIndexHash()
	 * @generated
	 */
	void setNodeIndexHash(Expression value);

	/**
	 * Returns the value of the '<em><b>Auto Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Focus</em>' containment reference.
	 * @see #setAutoFocus(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareRule_AutoFocus()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getAutoFocus();

	/**
	 * Sets the value of the '{@link jess.DeclareRule#getAutoFocus <em>Auto Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Focus</em>' containment reference.
	 * @see #getAutoFocus()
	 * @generated
	 */
	void setAutoFocus(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>No Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Loop</em>' containment reference.
	 * @see #setNoLoop(ValidIdentifier)
	 * @see jess.JessPackage#getDeclareRule_NoLoop()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getNoLoop();

	/**
	 * Sets the value of the '{@link jess.DeclareRule#getNoLoop <em>No Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Loop</em>' containment reference.
	 * @see #getNoLoop()
	 * @generated
	 */
	void setNoLoop(ValidIdentifier value);

} // DeclareRule
