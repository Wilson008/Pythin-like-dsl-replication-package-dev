/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.IfExpression#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link jess.IfExpression#getElifthen <em>Elifthen</em>}</li>
 *   <li>{@link jess.IfExpression#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends UseFuncExp {
	/**
	 * Returns the value of the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifthen</em>' containment reference.
	 * @see #setIfthen(ConditionAction)
	 * @see jess.JessPackage#getIfExpression_Ifthen()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ConditionAction getIfthen();

	/**
	 * Sets the value of the '{@link jess.IfExpression#getIfthen <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifthen</em>' containment reference.
	 * @see #getIfthen()
	 * @generated
	 */
	void setIfthen(ConditionAction value);

	/**
	 * Returns the value of the '<em><b>Elifthen</b></em>' containment reference list.
	 * The list contents are of type {@link jess.ElifConditionAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elifthen</em>' containment reference list.
	 * @see jess.JessPackage#getIfExpression_Elifthen()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElifConditionAction> getElifthen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see jess.JessPackage#getIfExpression_Else()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getElse();

} // IfExpression
