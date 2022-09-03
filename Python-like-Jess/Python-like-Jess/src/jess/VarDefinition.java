/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.VarDefinition#getJessVar <em>Jess Var</em>}</li>
 *   <li>{@link jess.VarDefinition#getEq <em>Eq</em>}</li>
 *   <li>{@link jess.VarDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getVarDefinition()
 * @model
 * @generated
 */
public interface VarDefinition extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Jess Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jess Var</em>' containment reference.
	 * @see #setJessVar(JessVariable)
	 * @see jess.JessPackage#getVarDefinition_JessVar()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	JessVariable getJessVar();

	/**
	 * Sets the value of the '{@link jess.VarDefinition#getJessVar <em>Jess Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jess Var</em>' containment reference.
	 * @see #getJessVar()
	 * @generated
	 */
	void setJessVar(JessVariable value);

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' containment reference.
	 * @see #setEq(ValidIdentifier)
	 * @see jess.JessPackage#getVarDefinition_Eq()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getEq();

	/**
	 * Sets the value of the '{@link jess.VarDefinition#getEq <em>Eq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq</em>' containment reference.
	 * @see #getEq()
	 * @generated
	 */
	void setEq(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see jess.JessPackage#getVarDefinition_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link jess.VarDefinition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // VarDefinition
