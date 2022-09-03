/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Def Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.UnDefAdvice#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getUnDefAdvice()
 * @model
 * @generated
 */
public interface UnDefAdvice extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(Expression)
	 * @see jess.JessPackage#getUnDefAdvice_Op()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getOp();

	/**
	 * Sets the value of the '{@link jess.UnDefAdvice#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Expression value);

} // UnDefAdvice
