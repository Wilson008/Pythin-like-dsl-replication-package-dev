/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ForExp#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link jess.ForExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link jess.ForExp#getIncrement <em>Increment</em>}</li>
 *   <li>{@link jess.ForExp#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getForExp()
 * @model
 * @generated
 */
public interface ForExp extends UseFuncExp {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Expression)
	 * @see jess.JessPackage#getForExp_Initializer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getInitializer();

	/**
	 * Sets the value of the '{@link jess.ForExp#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see jess.JessPackage#getForExp_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link jess.ForExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' containment reference.
	 * @see #setIncrement(Expression)
	 * @see jess.JessPackage#getForExp_Increment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getIncrement();

	/**
	 * Sets the value of the '{@link jess.ForExp#getIncrement <em>Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' containment reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Expression value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see jess.JessPackage#getForExp_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ForExp
