/**
 */
package jess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jess.ModuleDefinition#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link jess.ModuleDefinition#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see jess.JessPackage#getModuleDefinition()
 * @model
 * @generated
 */
public interface ModuleDefinition extends DefinitionExp {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' containment reference.
	 * @see #setModuleName(ValidIdentifier)
	 * @see jess.JessPackage#getModuleDefinition_ModuleName()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValidIdentifier getModuleName();

	/**
	 * Sets the value of the '{@link jess.ModuleDefinition#getModuleName <em>Module Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' containment reference.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(ValidIdentifier value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Str)
	 * @see jess.JessPackage#getModuleDefinition_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Str getDocumentation();

	/**
	 * Sets the value of the '{@link jess.ModuleDefinition#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Str value);

} // ModuleDefinition
