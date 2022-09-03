/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elif Condition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ElifConditionAction#getCondAct <em>Cond Act</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getElifConditionAction()
 * @model
 * @generated
 */
public interface ElifConditionAction extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Cond Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Act</em>' containment reference.
	 * @see #setCondAct(ConditionAction)
	 * @see jess.JessPackage#getElifConditionAction_CondAct()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ConditionAction getCondAct();

	/**
	 * Sets the value of the '{@link jess.ElifConditionAction#getCondAct <em>Cond Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Act</em>' containment reference.
	 * @see #getCondAct()
	 * @generated
	 */
	void setCondAct(ConditionAction value);

} // ElifConditionAction
