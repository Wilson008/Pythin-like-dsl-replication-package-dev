/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.QueryDefinition#getQueryName <em>Query Name</em>}</li>
 *   <li>{@link jess.QueryDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.QueryDefinition#getDeclare <em>Declare</em>}</li>
 *   <li>{@link jess.QueryDefinition#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getQueryDefinition()
 * @model
 * @generated
 */
public interface QueryDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Query Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Name</em>' containment reference.
	 * @see #setQueryName(ValidIdentifier)
	 * @see jess.JessPackage#getQueryDefinition_QueryName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getQueryName();

	/**
	 * Sets the value of the '{@link jess.QueryDefinition#getQueryName <em>Query Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Name</em>' containment reference.
	 * @see #getQueryName()
	 * @generated
	 */
	void setQueryName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Str)
	 * @see jess.JessPackage#getQueryDefinition_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Str getDocumentation();

	/**
	 * Sets the value of the '{@link jess.QueryDefinition#getDocumentation <em>Documentation</em>}' containment reference.
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
	 * @see #setDeclare(DeclareVar)
	 * @see jess.JessPackage#getQueryDefinition_Declare()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DeclareVar getDeclare();

	/**
	 * Sets the value of the '{@link jess.QueryDefinition#getDeclare <em>Declare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare</em>' containment reference.
	 * @see #getDeclare()
	 * @generated
	 */
	void setDeclare(DeclareVar value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see jess.JessPackage#getQueryDefinition_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // QueryDefinition
