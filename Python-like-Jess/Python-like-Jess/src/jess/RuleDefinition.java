/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.RuleDefinition#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link jess.RuleDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.RuleDefinition#getDeclare <em>Declare</em>}</li>
 *   <li>{@link jess.RuleDefinition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link jess.RuleDefinition#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getRuleDefinition()
 * @model
 * @generated
 */
public interface RuleDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' containment reference.
	 * @see #setRuleName(ValidIdentifier)
	 * @see jess.JessPackage#getRuleDefinition_RuleName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getRuleName();

	/**
	 * Sets the value of the '{@link jess.RuleDefinition#getRuleName <em>Rule Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' containment reference.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Str)
	 * @see jess.JessPackage#getRuleDefinition_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Str getDocumentation();

	/**
	 * Sets the value of the '{@link jess.RuleDefinition#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Str value);

	/**
	 * Returns the value of the '<em><b>Declare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare</em>' containment reference.
	 * @see #setDeclare(DeclareRule)
	 * @see jess.JessPackage#getRuleDefinition_Declare()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DeclareRule getDeclare();

	/**
	 * Sets the value of the '{@link jess.RuleDefinition#getDeclare <em>Declare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare</em>' containment reference.
	 * @see #getDeclare()
	 * @generated
	 */
	void setDeclare(DeclareRule value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see jess.JessPackage#getRuleDefinition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getConditions();

	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' containment reference list.
	 * The list contents are of type {@link jess.UseFuncExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call</em>' containment reference list.
	 * @see jess.JessPackage#getRuleDefinition_FunctionCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseFuncExp> getFunctionCall();

} // RuleDefinition
