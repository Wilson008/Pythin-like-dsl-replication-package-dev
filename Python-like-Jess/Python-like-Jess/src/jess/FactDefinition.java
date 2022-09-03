/**
 */
package jess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.FactDefinition#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link jess.FactDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link jess.FactDefinition#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getFactDefinition()
 * @model
 * @generated
 */
public interface FactDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Fact Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Name</em>' containment reference.
	 * @see #setFactName(ValidIdentifier)
	 * @see jess.JessPackage#getFactDefinition_FactName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getFactName();

	/**
	 * Sets the value of the '{@link jess.FactDefinition#getFactName <em>Fact Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Name</em>' containment reference.
	 * @see #getFactName()
	 * @generated
	 */
	void setFactName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Str)
	 * @see jess.JessPackage#getFactDefinition_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Str getDocumentation();

	/**
	 * Sets the value of the '{@link jess.FactDefinition#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Str value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference list.
	 * The list contents are of type {@link jess.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference list.
	 * @see jess.JessPackage#getFactDefinition_Fact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getFact();

} // FactDefinition
