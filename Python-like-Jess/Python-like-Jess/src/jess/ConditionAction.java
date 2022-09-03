/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ConditionAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link jess.ConditionAction#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getConditionAction()
 * @model
 * @generated
 */
public interface ConditionAction extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see jess.JessPackage#getConditionAction_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link jess.ConditionAction#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see jess.JessPackage#getConditionAction_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActions();

} // ConditionAction
