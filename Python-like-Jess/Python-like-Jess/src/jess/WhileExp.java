/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.WhileExp#getHasDo <em>Has Do</em>}</li>
 *   <li>{@link jess.WhileExp#getBoolExp <em>Bool Exp</em>}</li>
 *   <li>{@link jess.WhileExp#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getWhileExp()
 * @model
 * @generated
 */
public interface WhileExp extends UseFuncExp {
	/**
	 * Returns the value of the '<em><b>Has Do</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Do</em>' attribute.
	 * @see #setHasDo(Object)
	 * @see jess.JessPackage#getWhileExp_HasDo()
	 * @model unique="false" dataType="primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Object getHasDo();

	/**
	 * Sets the value of the '{@link jess.WhileExp#getHasDo <em>Has Do</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Do</em>' attribute.
	 * @see #getHasDo()
	 * @generated
	 */
	void setHasDo(Object value);

	/**
	 * Returns the value of the '<em><b>Bool Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Exp</em>' containment reference.
	 * @see #setBoolExp(Expression)
	 * @see jess.JessPackage#getWhileExp_BoolExp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBoolExp();

	/**
	 * Sets the value of the '{@link jess.WhileExp#getBoolExp <em>Bool Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Exp</em>' containment reference.
	 * @see #getBoolExp()
	 * @generated
	 */
	void setBoolExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see jess.JessPackage#getWhileExp_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActions();

} // WhileExp
